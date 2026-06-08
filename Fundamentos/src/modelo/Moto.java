package modelo;

public class Moto extends Vehiculo{
    private String tipoManubrio;

    public Moto(String marca, String color, int velocidadMaxima, String tipoManubrio) {
        super(marca, color, velocidadMaxima);
        this.tipoManubrio = tipoManubrio;
    }

    public String getTipoManubrio() {
        return tipoManubrio;
    }

    public void setTipoManubrio(String tipoManubrio) {
        this.tipoManubrio = tipoManubrio;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Tipo Manubrio: " + tipoManubrio);
    }
}
