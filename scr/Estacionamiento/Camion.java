package scr.Estacionamiento;

public class Camion extends Vehiculo {

    public Camion(String patente, String marca, String modelo, int horas) {
        super(patente, marca, modelo, horas);
    }

    @Override
    public double calcularCosto() {
        return horas * 1500;
    }

    @Override
    public int espacioOcupado() {
        return 4;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("CAMION");
        System.out.println("Patente: " + patente);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Horas: " + horas);
    }
}
