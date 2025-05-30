import java.util.Scanner;

public class GestionVentasEmpresa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int NUM_ARTICULOS = 5;
        final int NUM_SUCURSALES = 4;

        double[] precios = new double[NUM_ARTICULOS];
        int[][] cantidadesVendidas = new int[NUM_SUCURSALES][NUM_ARTICULOS];
        int[] totalCantArticulo = new int[NUM_ARTICULOS]; // Cantidades totales de cada artículo
        double[] recaudacionSucursal = new double[NUM_SUCURSALES]; // Recaudación total de cada sucursal
        double recaudacionTotalEmpresa = 0; // Recaudación total de la empresa
        int sucursalMayorRecaudacion = -1; // Índice de la sucursal de mayor recaudación
        double maxRecaudacion = -1.0; // Valor de la mayor recaudación

        // --- 1. Cargar precios de los artículos ---
        System.out.println("--- Carga de Precios de Artículos ---");
        for (int i = 0; i < NUM_ARTICULOS; i++) {
            System.out.print("Ingrese el precio del artículo " + (i + 1) + ": ");
            precios[i] = scanner.nextDouble();
        }

        // --- 2. Cargar cantidades vendidas por sucursal ---
        System.out.println("\n--- Carga de Cantidades Vendidas por Sucursal ---");
        for (int i = 0; i < NUM_SUCURSALES; i++) {
            System.out.println("Sucursal " + (i + 1) + ":");
            for (int j = 0; j < NUM_ARTICULOS; j++) {
                System.out.print("  Cantidad vendida del artículo " + (j + 1) + ": ");
                cantidadesVendidas[i][j] = scanner.nextInt();
            }
        }

        // Consumir el salto de línea pendiente después de nextInt() o nextDouble()
        scanner.nextLine(); 

        // --- 3. Calcular las cantidades totales de cada artículo ---
        System.out.println("\n--- Cantidades Totales por Artículo ---");
        for (int j = 0; j < NUM_ARTICULOS; j++) { // Iterar por artículos
            totalCantArticulo[j] = 0; // Reiniciar la suma para cada artículo
            for (int i = 0; i < NUM_SUCURSALES; i++) { // Sumar las cantidades de todas las sucursales para este artículo
                totalCantArticulo[j] += cantidadesVendidas[i][j];
            }
            System.out.println("Cantidad total del artículo " + (j + 1) + ": " + totalCantArticulo[j]);
        }

        // --- 4. Cantidad de artículos en la sucursal 2 ---
        int cantArticulosSucursal2 = 0;
        // El índice para la sucursal 2 es 1 (Sucursal 1 -> índice 0, Sucursal 2 -> índice 1)
        for (int j = 0; j < NUM_ARTICULOS; j++) {
            cantArticulosSucursal2 += cantidadesVendidas[1][j]; 
        }
        System.out.println("\n--- Información Específica ---");
        System.out.println("Cantidad total de artículos en la sucursal 2: " + cantArticulosSucursal2);

        // --- 5. Cantidad del artículo 3 en la sucursal 1 ---
        // Sucursal 1 -> índice 0, Artículo 3 -> índice 2
        System.out.println("Cantidad del artículo 3 en la sucursal 1: " + cantidadesVendidas[0][2]);

        // --- 6. Calcular recaudación total de cada sucursal, recaudación total de la empresa y la sucursal de mayor recaudación ---
        System.out.println("\n--- Recaudación por Sucursal y Total ---");
        for (int i = 0; i < NUM_SUCURSALES; i++) {
            recaudacionSucursal[i] = 0; // Reiniciar la recaudación para cada sucursal
            for (int j = 0; j < NUM_ARTICULOS; j++) {
                recaudacionSucursal[i] += cantidadesVendidas[i][j] * precios[j];
            }
            recaudacionTotalEmpresa += recaudacionSucursal[i]; // Sumar a la recaudación total de la empresa
            System.out.printf("Recaudación total de la sucursal %d: %.2f%n", (i + 1), recaudacionSucursal[i]);

            // Determinar la sucursal de mayor recaudación
            if (recaudacionSucursal[i] > maxRecaudacion) {
                maxRecaudacion = recaudacionSucursal[i];
                sucursalMayorRecaudacion = i + 1; // Guardar el número de sucursal (1-based)
            }
        }

        System.out.printf("\nRecaudación total de la empresa: %.2f%n", recaudacionTotalEmpresa);

        // --- 7. La sucursal de mayor recaudación ---
        if (sucursalMayorRecaudacion != -1) {
            System.out.printf("La sucursal de mayor recaudación es la sucursal %d con un total de: %.2f%n",
                              sucursalMayorRecaudacion, maxRecaudacion);
        } else {
            System.out.println("No se pudo determinar la sucursal de mayor recaudación."); // En caso de que no se carguen datos
        }

        scanner.close(); // Cerrar el Scanner
    }
}