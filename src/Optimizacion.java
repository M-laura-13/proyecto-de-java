import java.util.Scanner;

public class Optimizacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre del vendedor: ");
        String nombre = scanner.nextLine();

        final int numProductos = 7;
        float[] productos = new float[numProductos];

        for (int i = 0; i < numProductos; i++) {
            System.out.print("Ingrese valor del producto " + (i + 1) + ": ");
            productos[i] = scanner.nextFloat();
        }

        float comision = 0;
        float totalVentas = 0;
        final float comisionAlta = 100000;
        final float tasaComisionAlta = 0.10f;
        final float tasaComisionBaja = 0.05f;

        for (float producto : productos) {
            totalVentas += producto;
            comision += producto * (producto >= comisionAlta ? tasaComisionAlta : tasaComisionBaja);
        }

        float salarioTotal = comision + 1000000;

        System.out.println("Vendedor: " + nombre);
        System.out.println("Total ventas: " + (int) totalVentas);
        System.out.println("Comisiones: " + (int) comision);
        System.out.println("Salario total: " + (int) salarioTotal);

        scanner.close();
    }
}