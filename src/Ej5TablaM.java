import java.util.Scanner;

public class Ej5TablaM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero:");
        int numero = scanner.nextInt();

        for(int i=1;i<=10;i++){
          System.out.println(i+"*"+ numero + "="+ (numero* i));

        }
        scanner.close();
      }
}
     

