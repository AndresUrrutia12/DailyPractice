/*Escribe un programa en Java que calcule la suma de los dígitos de un número entero ingresado por el usuario.
Por ejemplo, si el usuario ingresa el número 12345, el programa debe calcular y mostrar la suma de los dígitos: 1 + 2 + 3 + 4 + 5 = 15.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa un numero con mas de dos digitos");
        int number = input.nextInt();
        int sum = 0;
        int reminder;
        do {
            reminder = number % 10;
            number /= 10;
            sum += reminder;
        }while (number > 0);
        System.out.println("El resultados de todos los numeros es: " + sum);
    }
}