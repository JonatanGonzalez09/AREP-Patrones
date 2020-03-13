package edu.escuelaing.arep.carros.model;

public class Carro{

    private int id;
    private String marca; 
    private String nombre;
    private int cilindraje;
    private String transmision;

    public Carro(int id, String marca, String nombre, int cilindraje, String transmision){
        this.id = id;
        this.marca = marca;
        this.nombre = nombre;
        this.cilindraje = cilindraje;
        this.transmision = transmision;
    }

    public int getID(){
        return id;
    }

    public String getMarca(){
        return marca;
    }

    public String getNombre(){
        return nombre;
    }

    public int getCilindraje(){
        return cilindraje;
    }

    public String getTransmision(){
        return transmision;
    }

    public void setID(int id){
        this.id = id;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setCilindraje(int cilindraje){
        this.cilindraje = cilindraje;
    }

    public void setTransmision(String transmision){
        this.transmision = transmision;
    }

}