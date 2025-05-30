import java.util.Scanner;

public class GestionConductores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Pedir la cantidad de conductores
        System.out.print("Ingrese la cantidad de conductores: ");
        int numConductores = scanner.nextInt();

        // Consumir el salto de línea pendiente después de nextInt()
        scanner.nextLine(); 

        // 2. Declaración e inicialización de arreglos
        String[] nombres = new String[numConductores];
        // kms: filas = conductores, columnas = 7 días de la semana
        int[][] kms = new int[numConductores][7]; 
        int[] total_kms = new int[numConductores];

        System.out.println("\n--- Carga de Información de Conductores ---");
        // 3. Cargar nombres de conductores
        for (int i = 0; i < numConductores; i++) {
            System.out.print("Ingrese el nombre del conductor " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
        }

        // 4. Cargar kilómetros diarios por conductor
        System.out.println("\n--- Carga de Kilómetros Diarios ---");
        for (int i = 0; i < numConductores; i++) {
            System.out.println("Ingresando kilómetros para " + nombres[i] + ":");
            for (int j = 0; j < 7; j++) { // 7 días de la semana
                System.out.print("  Día " + (j + 1) + " (kms): ");
                kms[i][j] = scanner.nextInt();
            }
            // Consumir el salto de línea pendiente después de nextInt()
            scanner.nextLine(); 
        }

        // 5. Calcular kilómetros totales por conductor
        for (int i = 0; i < numConductores; i++) {
            int sumaDiaria = 0;
            for (int j = 0; j < 7; j++) {
                sumaDiaria += kms[i][j];
            }
            total_kms[i] = sumaDiaria;
        }

        // 6. Mostrar resultados
        System.out.println("\n--- Lista de Conductores y Kilómetros Totales ---");
        if (numConductores == 0) {
            System.out.println("No se ingresaron conductores.");
        } else {
            for (int i = 0; i < numConductores; i++) {
                System.out.println("Conductor: " + nombres[i] + " - Kilómetros Totales: " + total_kms[i] + " kms");
            }
        }

        scanner.close(); // Cerrar el Scanner
    }
}