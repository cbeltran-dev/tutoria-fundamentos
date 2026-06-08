package modelo;

import javax.lang.model.UnknownEntityException;

public class Vehiculo {

    private String marca;
    private String color;
    private int velocidadMaxima;

    public Vehiculo(String marca, String color, int velocidadMaxima) {
        this.marca = marca;
        this.color = color;
        this.velocidadMaxima = velocidadMaxima;
    }

    public Vehiculo(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }

    public Vehiculo(){

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public void mostrarInfo(){
        System.out.println("Marca:" + marca);
        System.out.println("Color: " + color);
        System.out.println("Vel. Maxima: " + velocidadMaxima + "km/h");
    }
}
