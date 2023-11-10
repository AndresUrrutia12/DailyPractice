/*Escribe un programa que simule el lanzamiento de dos dados y muestre la suma de los valores obtenidos.

Requisitos:

Generar dos números aleatorios entre 1 y 6 para simular el lanzamiento de los dados.
Sumar los dos valores y mostrar el resultado.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int dice1;
        int dice2;
        char word;
        do {
            dice1 = (int) (Math.random()* 6 +1);
            dice2 = (int) (Math.random()* 6 + 1);
            System.out.println("La suma del lanzamiento de dados es: " + (dice2+dice1));
            System.out.println("Desea continuar? Escriba s si es afirmativo");
            word = input.next().charAt(0);
        }while (word == 's' || word == 'S');
        System.out.println("Gracias por participar");

    }
}