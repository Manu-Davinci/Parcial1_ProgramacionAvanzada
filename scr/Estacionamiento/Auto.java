package scr.Estacionamiento;

public class Auto extends Vehiculo {

    public Auto(String patente, String marca, String modelo, int horas) {
        super(patente, marca, modelo, horas);
    }

    @Override
    public double calcularCosto() {
        return horas * 1000;
    }

    @Override
    public int espacioOcupado() {
        return 2;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("AUTO");
        System.out.println("Patente: " + patente);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Horas: " + horas);
    }
}
