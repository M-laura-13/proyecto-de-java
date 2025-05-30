import java.util.Scanner;

public class AnalisisTemperaturas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arreglo para almacenar temperaturas: 5 días x [min, max]
        double[][] temperaturas = new double[5][2]; 

        // 1. Lectura de temperaturas
        System.out.println("Por favor, introduce las temperaturas mínimas y máximas para 5 días:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Día " + (i + 1) + ":");
            System.out.print("Temperatura mínima: ");
            temperaturas[i][0] = scanner.nextDouble();
            System.out.print("Temperatura máxima: ");
            temperaturas[i][1] = scanner.nextDouble();
        }

        // 2. Temperatura media de cada día
        System.out.println("\n--- Temperatura Media de Cada Día ---");
        for (int i = 0; i < 5; i++) {
            double media = (temperaturas[i][0] + temperaturas[i][1]) / 2;
            System.out.printf("Día %d: %.2f°C\n", (i + 1), media);
        }

        // 3. Días con menos temperatura (mínima global)
        double minGlobal = temperaturas[0][0]; // Inicializar con la primera temp mínima
        for (int i = 1; i < 5; i++) {
            if (temperaturas[i][0] < minGlobal) {
                minGlobal = temperaturas[i][0];
            }
        }

        System.out.println("\n--- Días con Menos Temperatura ---");
        boolean primerDiaMenor = true;
        for (int i = 0; i < 5; i++) {
            if (temperaturas[i][0] == minGlobal) {
                if (primerDiaMenor) {
                    System.out.print("El día(s) con la temperatura mínima más baja es/son: Día " + (i + 1));
                    primerDiaMenor = false;
                } else {
                    System.out.print(", Día " + (i + 1));
                }
            }
        }
        if (primerDiaMenor) { // Si no se encontró ningún día (esto no debería pasar si hay al menos 1 día)
            System.out.println("No se pudieron determinar los días con la temperatura mínima.");
        } else {
            System.out.println(); // Salto de línea después de listar los días
        }


        // 4. Buscar días por temperatura máxima
        System.out.print("\nIntroduce una temperatura para buscar días con esa temperatura máxima: ");
        double tempBusqueda = scanner.nextDouble();

        boolean encontrada = false;
        System.out.println("\n--- Días con Temperatura Máxima Coincidente ---");
        for (int i = 0; i < 5; i++) {
            if (temperaturas[i][1] == tempBusqueda) {
                System.out.println("Día " + (i + 1) + " tiene una temperatura máxima de " + tempBusqueda + "°C.");
                encontrada = true;
            }
        }

        if (!encontrada) {
            System.out.println("No existe ningún día cuya temperatura máxima coincida con " + tempBusqueda + "°C.");
        }

        scanner.close();
    }
}