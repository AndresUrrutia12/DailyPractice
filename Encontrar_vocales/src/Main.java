/*Escribe un programa que pida al usuario una frase y luego imprima las vocales que aparecen en esa frase.

Por ejemplo, si el usuario ingresa "Hola Mundo", el programa debe imprimir:

a o o u*/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la frase para determinar cuantos vocales tiene");
        String phrase = input.nextLine();
        String finalPharase = phrase.toLowerCase();
        char letter;

        for (int i = 0; i < finalPharase.length(); i++){
            letter = finalPharase.charAt(i);
            switch (letter) {
                case 'a', 'e', 'i', 'o', 'u' -> System.out.print(finalPharase.charAt(i) + " ");
            }
        }

    }
}