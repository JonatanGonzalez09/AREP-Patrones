package edu.escuelaing.arep.carros.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.escuelaing.arep.carros.model.Carro;
import edu.escuelaing.arep.carros.services.CarException;
import edu.escuelaing.arep.carros.services.CarServices;

@RestController
@RequestMapping(value = "/webPage")
public class APIController{
    @Autowired
    CarServices carServices;

    @RequestMapping(value = "/carros", method = RequestMethod.GET)
    public ResponseEntity<List<Carro>> recursoConsultarUsuarios() throws CarException {
        try {
            List<Carro> carros = carServices.consultarCarros();
            return new ResponseEntity<>(carros, HttpStatus.OK);
        } catch (Exception ex) {
            throw new CarException(ex.getMessage());
        }
    }

}