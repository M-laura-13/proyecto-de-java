import java.util.Scanner;

public class Ej1IfElse {
    //Determinar el mayor de tres numeros//
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer numero:");
        byte num1 = scanner.nextByte();
        System.out.print("Ingrese el segundo numero:");
        byte num2 = scanner.nextByte();
        System.out.print("Ingrese el tercer numero:");
        byte num3 = scanner.nextByte();

        if (num1>num2 && num1>num3) {
            System.out.println("El numero mayor es:" +num1);
        } else if (num2>num1 && num2>num3) {
            System.out.println("El numero mayor es:"+ num2);
        } else {
            System.out.println("El numero mayor es:"+ num3);
        }

      scanner.close();
    }
    
}
