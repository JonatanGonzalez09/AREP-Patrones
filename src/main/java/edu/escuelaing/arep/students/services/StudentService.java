package edu.escuelaing.arep.students.services;

import java.util.*;

import org.springframework.stereotype.Service;

import edu.escuelaing.arep.students.model.Student;

@Service
public interface StudentService{
    public List<Student> encontrarTodos() throws StudentException ;  
}