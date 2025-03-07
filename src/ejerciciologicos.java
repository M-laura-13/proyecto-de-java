import java.util.Scanner;

public class ejerciciologicos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer numero:");
        byte num1 = scanner.nextByte();
        System.out.print("Ingrese el segundo numero:");
        byte num2 = scanner.nextByte();
        System.out.print("Ingresa el tercer numero:");
        byte num3 = scanner.nextByte();

        System.out.println("¿num1>num2 && num1<num3?:"+ (num1>num2 && num1<num3));
        
        scanner.close();


}
}
