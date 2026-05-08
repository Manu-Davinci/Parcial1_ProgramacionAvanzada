package scr.Estacionamiento;

public class PatenteDuplicadaException extends Exception {

    public PatenteDuplicadaException(String mensaje) {
        super(mensaje);
    }
}