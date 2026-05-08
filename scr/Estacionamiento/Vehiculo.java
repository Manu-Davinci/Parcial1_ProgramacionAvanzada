package scr.Estacionamiento;

public abstract class Vehiculo {

    //Atributos 
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

    
    public abstract double calcularCosto();

    public abstract void mostrarDatos();

    public abstract int espacioOcupado();
}