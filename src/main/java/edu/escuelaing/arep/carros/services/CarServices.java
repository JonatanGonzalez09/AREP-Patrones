package edu.escuelaing.arep.carros.services;

import edu.escuelaing.arep.carros.model.Carro;

import java.util.List;

public interface CarServices {
    public List<Carro> consultarCarros() throws CarException ;
}