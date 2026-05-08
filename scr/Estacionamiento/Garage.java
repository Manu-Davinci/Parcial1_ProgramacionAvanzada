package scr.Estacionamiento;

import java.util.ArrayList;
import java.util.List;

public class Garage {

    //Atributos  
    private int capacidadMaxima;  
    private List<Vehiculo> vehiculosEstacionados;  

    //Constructor
    public Garage(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;  
        this.vehiculosEstacionados = new ArrayList<>();
    }

    //Metodos
    public void registrarIngreso(Vehiculo vehiculo) throws GarageLlenoException, PatenteDuplicadaException {  
        if(vehiculosEstacionados.size() >= capacidadMaxima) {
            throw new GarageLlenoException("El garage está lleno!");
        }
        
}


