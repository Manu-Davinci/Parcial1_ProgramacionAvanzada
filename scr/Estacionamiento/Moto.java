package scr.Estacionamiento;

public class Moto extends Vehiculo {

    //Constructor
    public Moto(String patente, String marca, String modelo, int horas) {
        super(patente, marca, modelo, horas);
    }
    
    @Override 
    public double calcularCosto() {
        return horas * 700;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Tipo: Moto");
        System.out.println("Patente: " + patente);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Horas: " + horas);
        System.out.println("Costo Total: $" + calcularCosto());
    }

    // Espacio que ocupa la moto 
    @Override
    public int espacioOcupado() {
        return 1;
    }
}
