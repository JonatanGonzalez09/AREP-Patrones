package edu.escuelaing.arep.carros.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.escuelaing.arep.carros.dao.CarDAO;
import edu.escuelaing.arep.carros.model.Carro;
import edu.escuelaing.arep.carros.services.CarServices;

@Service
public class CarServiceStub implements CarServices {

	@Autowired
    private CarDAO carDAO;

    @Override
    public List<Carro> consultarCarros() throws CarException {
        return carDAO.loadAll();
    }
}