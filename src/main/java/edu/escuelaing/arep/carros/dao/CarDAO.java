package edu.escuelaing.arep.carros.dao;

import java.util.List;

import edu.escuelaing.arep.carros.model.Carro;

public interface CarDAO {
    public List<Carro> loadAll();
}
