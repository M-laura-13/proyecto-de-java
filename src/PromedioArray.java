import java.util.Scanner;

public class PromedioArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa un número: ");
            numeros[i] = scanner.nextInt();
            suma += numeros[i]; 
        }

        float promedio = suma / (float) numeros.length;
        System.out.println("El promedio es: " + promedio);
        scanner.close();
    }

}
