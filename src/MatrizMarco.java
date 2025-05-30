public class MatrizMarco {

    public static void main(String[] args) {

        // 1. Declaración de variables y dimensiones de la matriz
        final int NUM_FILAS = 5;
        final int NUM_COLUMNAS = 15;
        int[][] marco = new int[NUM_FILAS][NUM_COLUMNAS];

        // 2. Cargar la tabla con 1s en el marco y 0s en el interior
        for (int fila = 0; fila < NUM_FILAS; fila++) {
            for (int columna = 0; columna < NUM_COLUMNAS; columna++) {
                // Condición para el marco:
                // Si está en la primera fila (fila == 0)
                // O en la última fila (fila == NUM_FILAS - 1)
                // O en la primera columna (columna == 0)
                // O en la última columna (columna == NUM_COLUMNAS - 1)
                if (fila == 0 || fila == NUM_FILAS - 1 || columna == 0 || columna == NUM_COLUMNAS - 1) {
                    marco[fila][columna] = 1;
                } else {
                    marco[fila][columna] = 0;
                }
            }
        }

        System.out.println("--- Contenido de la Matriz Marco ---");
        // 3. Muestra el contenido de la tabla en pantalla
        for (int fila = 0; fila < NUM_FILAS; fila++) {
            for (int columna = 0; columna < NUM_COLUMNAS; columna++) {
                System.out.print(marco[fila][columna] + " "); // Imprime el valor seguido de un espacio
            }
            System.out.println(); // Salto de línea al finalizar cada fila
        }
    }
}
