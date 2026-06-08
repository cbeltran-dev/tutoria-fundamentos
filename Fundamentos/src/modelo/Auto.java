package modelo;

public class Auto  extends Vehiculo {
    private int nroPuertas;

    public Auto(String marca, String color, int velocidadMaxima, int nroPuertas) {
        super(marca, color, velocidadMaxima);
        this.nroPuertas = nroPuertas;
    }

    public int getNroPuertas() {
        return nroPuertas;
    }

    public void setNroPuertas(int nroPuertas) {
        this.nroPuertas = nroPuertas;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Nro. Puertas: " + nroPuertas);
    }
}
