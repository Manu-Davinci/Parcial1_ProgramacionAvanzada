package scr.Estacionamiento;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Garage garage = null;

        // 1. Inicializar el garage
        System.out.println("=== SISTEMA DE GARAGE ===");
        System.out.print("Ingrese la capacidad máxima del garage: ");
        int capacidadMaxima = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea después de nextInt()
        garage = new Garage(capacidadMaxima);

        // Menu interactivo
        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Registrar ingreso");
            System.out.println("2. Registrar salida");
            System.out.println("3. Listar vehículos");
            System.out.println("4. Estado del garage");
            System.out.println("5. Reportes");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea después de nextInt()

            switch (opcion) {
                case 1:
                    registrarIngreso(scanner, garage);
                    break;
                case 2:
                    registrarSalida(scanner, garage);
                    break;
                case 3:
                    listarVehiculos(garage);
                    break;
                case 4:
                    mostrarEstado(garage);
                    break;
                case 5:
                    generarReportes(garage);
                    break;
                case 6:
                    System.out.println("Saliendo del sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }

    // Métodos para cada opción del menú
    private static void registrarIngreso(Scanner scanner, Garage garage) {
        try {
            System.out.println("\n=== REGISTRAR INGRESO ===");
            System.out.print("Tipo de vehículo (Moto, Auto, Camion): ");
            String tipoVehiculo = scanner.nextLine();

            System.out.print("Patente: ");
            String patente = scanner.nextLine();

            System.out.print("Marca: ");
            String marca = scanner.nextLine();

            System.out.print("Modelo: ");
            String modelo = scanner.nextLine();

            System.out.print("Horas estimadas de permanencia: ");
            int horas = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea después de nextInt()

            Vehiculo vehiculo = null;
            switch (tipoVehiculo.toLowerCase()) {
                case "moto":
                    vehiculo = new Moto(patente, marca, modelo, horas);
                    break;
                case "auto":
                    vehiculo = new Auto(patente, marca, modelo, horas);
                    break;
                case "camion":
                    vehiculo = new Camion(patente, marca, modelo, horas);
                    break;
                default:
                    System.out.println("Tipo de vehículo inválido.");
                    return;
            }

            garage.registrarIngreso(vehiculo);
            System.out.println("Vehículo registrado con éxito.");

        } catch (GarageLlenoException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (PatenteDuplicadaException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (HorasInvalidasException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error inesperado: " + e.getMessage());
        }
    }

    private static void registrarSalida(Scanner scanner, Garage garage) {
        try {
            System.out.println("\n=== REGISTRAR SALIDA ===");
            System.out.print("Ingrese la patente del vehículo: ");
            String patente = scanner.nextLine();

            double costo = garage.registrarSalida(patente);
            System.out.println("Salida de vehículo registrada con éxito.");
            System.out.println("Costo de la estadía: $" + costo);

        } catch (VehiculoNoEncontradoException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error inesperado: " + e.getMessage());
        }
    }

    private static void listarVehiculos(Garage garage) {
        System.out.println("\n=== LISTAR VEHÍCULOS ===");
        garage.listarVehiculosEstacionados();
    }

    private static void mostrarEstado(Garage garage) {
        System.out.println("\n=== ESTADO DEL GARAGE ===");
        garage.mostrarEstadoDelGarage();
    }

    private static void generarReportes(Garage garage) {
        System.out.println("\n=== REPORTES ===");
        // Implementar la lógica para generar reportes (cantidad total de vehículos,
        // cantidad por tipo, espacio ocupado, espacio libre, recaudación total estimada)
        System.out.println("Reportes no implementados aún.");
    }
}

