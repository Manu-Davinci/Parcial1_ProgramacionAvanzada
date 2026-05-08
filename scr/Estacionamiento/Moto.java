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

    //Eclipse me recomendó implementar esto para que deje de dar error con la clase pero no se implementa ni se usa.
    @Override
    public int espacioOcupado() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'espacioOcupado'");
    }
}
