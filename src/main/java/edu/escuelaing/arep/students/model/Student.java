package edu.escuelaing.arep.students.model;

public class Student{

    private int carnet;
    private String nombre;
    private String carrera;
    private int semestre;

    public Student(int carnet, String nombre, String carrera, int semestre){
        this.nombre = nombre;
        this.carnet = carnet;
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public int getCarnet(){
        return carnet;
    }

    public String getNombre(){
        return nombre;
    }

    public String getCarrera(){
        return carrera;
    }

    public int getSemestre(){
        return semestre;
    }
}