import java.util.Scanner;

public class MatrizSuma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Declaración de variables: Matriz 5x5
        int[][] matriz = new int[5][5];

        System.out.println("--- Carga de la Matriz ---");
        // 2. Cargar la tabla 'matriz' con valores numéricos enteros
        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 5; columna++) {
                System.out.print("Introduce el valor para la posición [" + (fila + 1) + "][" + (columna + 1) + "]: ");
                matriz[fila][columna] = scanner.nextInt();
            }
        }

        System.out.println("\n--- Suma de elementos por fila ---");
        // 3. Calcular y mostrar la suma de cada fila
        for (int fila = 0; fila < 5; fila++) {
            int sumaFila = 0; // Inicializar la suma de la fila actual
            for (int columna = 0; columna < 5; columna++) {
                sumaFila += matriz[fila][columna]; // Sumar el elemento a la suma de la fila
            }
            System.out.println("La suma de la fila " + (fila + 1) + " es: " + sumaFila);
        }

        System.out.println("\n--- Suma de elementos por columna ---");
        // 4. Calcular y mostrar la suma de cada columna
        for (int columna = 0; columna < 5; columna++) {
            int sumaColumna = 0; // Inicializar la suma de la columna actual
            for (int fila = 0; fila < 5; fila++) { // Notar que los bucles están invertidos respecto a la suma de filas
                sumaColumna += matriz[fila][columna]; // Sumar el elemento a la suma de la columna
            }
            System.out.println("La suma de la columna " + (columna + 1) + " es: " + sumaColumna);
        }

        scanner.close(); // Cerrar el Scanner al finalizar
    }
}