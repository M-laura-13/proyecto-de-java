import java.util.ArrayList;
import java.util.Scanner;

public class AlumnosCurso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Listas para almacenar nombres y edades
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Integer> edades = new ArrayList<>();

        // Lectura de datos
        while (true) {
            System.out.print("Ingrese el nombre del alumno (o * para terminar): ");
            String nombre = scanner.nextLine();

            if (nombre.equals("*")) {
                break;
            }

            System.out.print("Ingrese la edad de " + nombre + ": ");
            int edad = Integer.parseInt(scanner.nextLine());

            nombres.add(nombre);
            edades.add(edad);
        }

        // Mostrar alumnos mayores de edad
        System.out.println("\nAlumnos mayores de edad (18 o más):");
        boolean hayMayores = false;
        for (int i = 0; i < nombres.size(); i++) {
            if (edades.get(i) >= 18) {
                System.out.println(nombres.get(i) + " - " + edades.get(i) + " años");
                hayMayores = true;
            }
        }
        if (!hayMayores) {
            System.out.println("Ninguno.");
        }

        // Buscar la edad mayor
        if (!edades.isEmpty()) {
            int edadMayor = edades.get(0);
            for (int edad : edades) {
                if (edad > edadMayor) {
                    edadMayor = edad;
                }
            }

            // Mostrar alumnos con la edad mayor
            System.out.println("\nAlumno(s) con mayor edad (" + edadMayor + " años):");
            for (int i = 0; i < nombres.size(); i++) {
                if (edades.get(i) == edadMayor) {
                    System.out.println(nombres.get(i));
                }
            }
        } else {
            System.out.println("\nNo se ingresaron datos.");
        }

        scanner.close();
    }
}
