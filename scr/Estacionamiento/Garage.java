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

    //Metodo que busca el vehiculo por patente
    private Vehiculo buscarVehiculoPorPatente(String patente) {
        for (Vehiculo v : vehiculosEstacionados) {
            if (v.getPatente().equals(patente)) {
                return v;
            }
        }
        return null;
    }

    //Metodo que calcula el espacio ocupado 
    private int calcularEspacioOcupado() {
        int total = 0;
        for (Vehiculo v : vehiculosEstacionados) {
            total += v.espacioOcupado();
        }
        return total;
    }

    //Metodo que calcula el costo de la estadia
    private double calcularCostoEstadia(Vehiculo vehiculo) {
        return vehiculo.getHoras() * 10000.0; // Asumo que seran $10000 la hora 
    }

    //Metodo Registrar Ingreso
     public void registrarIngreso(Vehiculo vehiculo) throws GarageLlenoException, PatenteDuplicadaException, HorasInvalidasException {  
        if (vehiculo.getHoras() <= 0) {  
            throw new HorasInvalidasException("Las horas estimadas deben ser mayores que cero.");  
        }  

        int espacioRequerido = vehiculo.espacioOcupado();  
        if (calcularEspacioOcupado() + espacioRequerido > capacidadMaxima) {  
            throw new GarageLlenoException("No hay suficiente espacio en el garage.");  
        }  

        if (buscarVehiculoPorPatente(vehiculo.getPatente()) != null) {  
            throw new PatenteDuplicadaException("La patente ya está registrada.");  
        }  
        vehiculosEstacionados.add(vehiculo);  
    }

    //Metodo Registrar Salida  
    public double registrarSalida(String patente) throws VehiculoNoEncontradoException {  
        Vehiculo vehiculo = buscarVehiculoPorPatente(patente);  
        if (vehiculo == null) {  
            throw new VehiculoNoEncontradoException("No se encontró el vehículo con la patente: " + patente);  
        }  
        vehiculosEstacionados.remove(vehiculo);  
        return calcularCostoEstadia(vehiculo); // Calcular el costo antes de removerlo  
    }

    
}
    


