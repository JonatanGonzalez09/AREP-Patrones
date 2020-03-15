package edu.escuelaing.arep.students.model;

public class Student{

    private String nombre;
    private int codigo;
    private String carrera;

    public Student(String nombre, int codigo, String carrera){
        this.nombre = nombre;
        this.codigo = codigo;
        this.carrera = carrera;
    }

    public int getCodigo(){
        return codigo;
    }

    public String getNombre(){
        return nombre;
    }

    public String getCarrera(){
        return carrera;
    }
}