import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa número de elementos de la serie que deseas generar");
        int number = input.nextInt();
        int primero = 1;
        int segundo = 1;
        for (int i = 1; i < number; i++){
            segundo = primero + segundo ;
            primero = segundo - primero;

        }
        System.out.println("La serie Fibonacci del numero " + number + " es: " + segundo);
    }
}
