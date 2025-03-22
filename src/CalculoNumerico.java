//Realizar un programa que solicite la carga por teclado de dos números,
//si el primero es mayor al segundo informar su suma y diferencia,
//en caso contrario informar el producto y la división
//del primero respecto al segundo.

import java.util.Scanner;

public class CalculoNumerico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer numero:");
        float num1 = scanner.nextFloat();
        System.out.print("Ingrese el segundo numero:");
        float num2 = scanner.nextFloat();

        if (num1>num2) {
            
            System.out.println("La suma de los dos numeros es:"+(int)+(num1+num2));
            System.out.println("La resta entre los dos numeros es:"+(int)+(num1-num2));
        } else  {
            
            System.out.println("La multiplicacion entre los dos numeros es:"+(int)+(num1*num2));
            System.out.println("La division entre los dos numeros es:"+(float)+(num1/num2));

        }
        scanner.close();
    }
}
