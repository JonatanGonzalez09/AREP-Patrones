package edu.escuelaing.arep.carros.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import edu.escuelaing.arep.carros.model.Carro;

@Repository
public class CarDAOImpl implements CarDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Carro> loadAll() {
        String sql = "SELECT * FROM Carros ";
        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
        List<Carro> lisCarros = new ArrayList<Carro>();
        for (Map<String, Object> row : rows) {
            Carro carro = new Carro(0, "", "", 0, "");
            carro.setID(Integer.parseInt((String) row.get("id")));
            carro.setMarca((String) row.get("marca"));
            carro.setNombre((String)row.get("nombre"));
            carro.setCilindraje(Integer.parseInt((String) row.get("cilindraje")));
            carro.setTransmision((String)row.get("transmision"));
            lisCarros.add(carro);
        }
        return lisCarros;
    }
}