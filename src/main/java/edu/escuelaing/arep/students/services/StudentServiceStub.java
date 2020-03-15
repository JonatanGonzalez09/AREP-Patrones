package edu.escuelaing.arep.students.services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.escuelaing.arep.students.model.Student;


@Component
public class StudentServiceStub implements StudentService{

	@Autowired
	private DataSource dataSource;

    public List<Student> encontrarTodos() throws StudentException {
       String query = "SELECT * FROM estudiantes;";
		List<Student> estudiantes = new ArrayList<Student>();
		Connection connection = null;
		try {
			connection = dataSource.getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				String nombre = rs.getString("nombre");
                int codigo = Integer.parseInt(rs.getString("codigo"));
                String carrera = rs.getString("carrera");
				Student estudiante = new Student(nombre,codigo,carrera);							
				estudiantes.add(estudiante);
			}
			connection.close();
			return estudiantes;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new RuntimeException(e);
		}
    }
}