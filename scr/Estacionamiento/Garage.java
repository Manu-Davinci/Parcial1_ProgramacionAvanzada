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
            throws GarageLlenoException, PatenteDuplicadaException, 
            VehiculoNoEncontradoException,
            HorasInvalidasException {  
                if (vehiculo.getHoras() <= 0) {
            throw new HorasInvalidasException("Las horas deben ser mayores a 0");
        }
       
        if (espacioDisponible() < vehiculo.espacioOcupado()) {
            throw new GarageLlenoException("No hay espacio suficiente para este vehículo");
        }

        vehiculos.add(vehiculo);

        System.out.println("Vehiculo ingresado correctamente");
    }

    public void registrarSalida(String patente)
            throws VehiculoNoEncontradoException {

        Vehiculo encontrado = null;
        
}

