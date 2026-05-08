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

    //Metodo Registrar Ingreso
    public void registrarIngreso(Vehiculo vehiculo) throws GarageLlenoException, PatenteDuplicadaException {  
        if(vehiculosEstacionados.size() >= capacidadMaxima) {
            throw new GarageLlenoException("El garage está lleno!");
        }

        if (buscarVehiculoPorPatente(vehiculo.getPatente()) != null) {  
            throw new PatenteDuplicadaException("La patente ya está registrada.");
        }  
        vehiculosEstacionados.add(vehiculo);
    }
    


