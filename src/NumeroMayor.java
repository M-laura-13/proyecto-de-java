//Realizar un programa que solicite ingresar
//dos números distintos y muestre por pantalla el mayor de ellos.

import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese el primer numero:");
        int num1 = scanner.nextInt();
        System.out.print("ingrese el segundo numero");
        int num2 = scanner.nextInt();

        if (num1>num2) {
            System.out.println("el numero mayor es:"+num1);
        } else if (num2>num1) {
            System.out.println("el numero mayor es:"+num2);
        }else {
            System.out.println("Error los numeros son iguales");
        }
        scanner.close();
    }
}
