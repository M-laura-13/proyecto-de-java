import java.util.Scanner;

public class Ej4While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero: " );
        byte num = scanner.nextByte();

        int k = 1;
        int factorial = 1;

        while (k<=num) {
            factorial*=k;
            k++;
            
        }
        System.out.print("El factorial de "+ num + " es: "+ factorial);
        scanner.close();
    }
}
