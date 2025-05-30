public class MatrizDiagonal {

    public static void main(String[] args) {

        // 1. Declaración de variables: Matriz 5x5
        int[][] diagonal = new int[5][5];

        // 2. Cargar la tabla de forma que los componentes de la diagonal tomen el valor 1 y el resto el valor 0
        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 5; columna++) {
                if (fila == columna) { // Si el índice de fila es igual al índice de columna, es un elemento de la diagonal
                    diagonal[fila][columna] = 1;
                } else { // Si no, es un elemento fuera de la diagonal
                    diagonal[fila][columna] = 0;
                }
            }
        }

        System.out.println("--- Contenido de la Matriz Diagonal ---");
        // 3. Muestra el contenido de la tabla en pantalla
        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 5; columna++) {
                System.out.print(diagonal[fila][columna] + " "); // Imprime el valor seguido de un espacio
            }
            System.out.println(); // Salto de línea al finalizar cada fila
        }
    }
}