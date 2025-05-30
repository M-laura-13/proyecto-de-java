import java.util.Scanner;

public class NotasAlumno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];

        // Leer 5 notas y validarlas
        for (int i = 0; i < notas.length; i++) {
            double nota;
            do {
                System.out.print("Ingrese la nota " + (i + 1) + " (entre 0 y 10): ");
                nota = scanner.nextDouble();
                if (nota < 0 || nota > 10) {
                    System.out.println("Nota inválida. Debe estar entre 0 y 10.");
                }
            } while (nota < 0 || nota > 10);
            notas[i] = nota;
        }

        // Mostrar todas las notas
        System.out.println("\nNotas ingresadas:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }

        // Calcular media, nota mayor y menor
        double suma = 0;
        double mayor = notas[0];
        double menor = notas[0];

        for (double nota : notas) {
            suma += nota;
            if (nota > mayor) {
                mayor = nota;
            }
            if (nota < menor) {
                menor = nota;
            }
        }

        double media = suma / notas.length;

        // Mostrar resultados
        System.out.printf("\nNota media: %.2f\n", media);
        System.out.println("Nota más alta: " + mayor);
        System.out.println("Nota más baja: " + menor);

        scanner.close();
    }
}
