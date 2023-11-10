import java.util.Scanner;

public class GeneradorDeTablasDeMultiplicar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa un numero para mostrar la tabla de multiplicar:");
        int number = input.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(number + " * " + i + " = " +(number*i));
        }
    }
}
