package scr.Estacionamiento;

public class Vehiculo {

    
	protected String patente;
    protected String marca;
    protected String modelo;
    protected int horas;
    
    //Constructor
    public Vehiculo(String patente, String marca, String modelo, int horas) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.horas = horas;
    }

    //getters
    public String getPatente() {
        return patente;
    }

    public int getHoras() {
        return horas;
    }
}