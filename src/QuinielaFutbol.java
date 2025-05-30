import java.util.Scanner;

public class QuinielaFutbol {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int NUM_PARTIDOS = 15; // En la quiniela se indican 15 partidos

        // Tabla 'equipos': Guarda en cada columna el nombre de los equipos de cada partido.
        // Dimensiones: 15 filas (partidos) x 2 columnas (Equipo 1, Equipo 2)
        String[][] equipos = new String[NUM_PARTIDOS][2];

        // Tabla 'resultados': Guarda el número de goles.
        // Dim. 1: goles del equipo de la primera columna de 'equipos'.
        // Dim. 2: goles del otro equipo.
        // Dimensiones: 15 filas (partidos) x 2 columnas (Goles Equipo 1, Goles Equipo 2)
        int[][] resultados = new int[NUM_PARTIDOS][2];

        // Nuevo vector para guardar el pronóstico (1, X, 2)
        String[] pronosticosQuiniela = new String[NUM_PARTIDOS];

        System.out.println("--- Carga de Partidos de la Quiniela ---");

        // 1. Cargar nombres de los equipos
        for (int i = 0; i < NUM_PARTIDOS; i++) {
            System.out.println("\nPartido " + (i + 1) + ":");
            System.out.print("  Nombre del Equipo Local (Equipo 1): ");
            equipos[i][0] = scanner.nextLine();
            System.out.print("  Nombre del Equipo Visitante (Equipo 2): ");
            equipos[i][1] = scanner.nextLine();
        }

        System.out.println("\n--- Carga de Resultados de los Partidos ---");

        // 2. Cargar resultados de los partidos y generar pronósticos
        for (int i = 0; i < NUM_PARTIDOS; i++) {
            System.out.println("\nResultados para el partido " + (i + 1) + ": " + equipos[i][0] + " vs " + equipos[i][1]);
            System.out.print("  Goles de " + equipos[i][0] + ": ");
            resultados[i][0] = scanner.nextInt();
            System.out.print("  Goles de " + equipos[i][1] + ": ");
            resultados[i][1] = scanner.nextInt();

            // Consumir el salto de línea pendiente después de nextInt()
            scanner.nextLine(); 

            // Generar pronóstico (1, X, 2)
            if (resultados[i][0] > resultados[i][1]) {
                pronosticosQuiniela[i] = "1"; // Gana el equipo local
            } else if (resultados[i][0] < resultados[i][1]) {
                pronosticosQuiniela[i] = "2"; // Gana el equipo visitante
            } else {
                pronosticosQuiniela[i] = "X"; // Empate
            }
        }

        // 3. Mostrar resumen de la quiniela
        System.out.println("\n--- Resumen de la Quiniela de Fútbol ---");
        System.out.printf("%-10s %-30s %-15s %-10s%n", "Partido", "Equipos", "Resultado", "Pronóstico");
        System.out.println("----------------------------------------------------------------------");

        for (int i = 0; i < NUM_PARTIDOS; i++) {
            String equiposStr = equipos[i][0] + " vs " + equipos[i][1];
            String resultadoStr = resultados[i][0] + " - " + resultados[i][1];
            
            System.out.printf("%-10d %-30s %-15s %-10s%n", 
                              (i + 1), equiposStr, resultadoStr, pronosticosQuiniela[i]);
        }
        System.out.println("----------------------------------------------------------------------");


        scanner.close(); // Cerrar el Scanner
    }
}
