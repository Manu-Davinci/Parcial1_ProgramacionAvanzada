package scr.Estacionamiento;

import java.util.ArrayList;

public class Garage {

    //Atributos  
    private int capacidadMaxima;
    private ArrayList<Vehiculo> vehiculos;

    //Constructor
    public Garage(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        vehiculos = new ArrayList<>();
    }

    //Metodos
     public int espacioOcupadoTotal() {

        int total = 0;

        for (Vehiculo v : vehiculos) {
            total += v.espacioOcupado();
        }

        return total;
    }

    public int espacioDisponible() {
        return capacidadMaxima - espacioOcupadoTotal();
    }

     public void registrarIngreso(Vehiculo vehiculo)
            throws GarageLlenoException, PatenteDuplicadaException, VehiculoNoEncontradoException {
}
