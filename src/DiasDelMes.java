import java.util.Scanner;

public class DiasDelMes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Vectores con nombres de meses y días correspondientes
        String[] nombresMeses = {
            "Enero", "Febrero", "Marzo", "Abril",
            "Mayo", "Junio", "Julio", "Agosto",
            "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        int[] diasMeses = {
            31, 28, 31, 30,
            31, 30, 31, 31,
            30, 31, 30, 31
        };

        // Pedir al usuario un número de mes
        System.out.print("Ingrese el número de mes (1 al 12): ");
        int numeroMes = scanner.nextInt();

        // Validar el número de mes
        if (numeroMes >= 1 && numeroMes <= 12) {
            String nombreMes = nombresMeses[numeroMes - 1];
            int dias = diasMeses[numeroMes - 1];
            System.out.println("El mes es " + nombreMes + " y tiene " + dias + " días.");
        } else {
            System.out.println("Número de mes inválido. Debe ser entre 1 y 12.");
        }

        scanner.close();
    }
}
