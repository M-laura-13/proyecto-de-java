import java.util.Scanner;
public class PracticaArray {
    public static void main(String[] args) {
        int[] numeros = new int[5];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 5 números enteros:");
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            suma += numeros[i];
        }
        float promedio = (int) suma / numeros.length;
            System.out.println("el promedio de los numeros es: "+ promedio);

    scanner.close();
    }    
}
