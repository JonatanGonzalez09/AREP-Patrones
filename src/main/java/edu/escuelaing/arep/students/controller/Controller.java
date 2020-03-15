package edu.escuelaing.arep.students.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.escuelaing.arep.students.services.StudentService;

@RestController
@RequestMapping(value = "/students")
public class Controller {

	@Autowired
	StudentService studentService;
	
	@GetMapping()
	public ResponseEntity<?> allStudents(){
	    try {
	        return new ResponseEntity<>(studentService.getAllStudents(),HttpStatus.ACCEPTED);
	    } catch (Exception ex) {
	        return new ResponseEntity<>("Hubo un fallo",HttpStatus.NOT_FOUND);
	    }
    }
}