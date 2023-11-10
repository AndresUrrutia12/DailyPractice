/* Escribe un programa en Java que tome una cadena de texto ingresada por el usuario y determine si es un palíndromo.
Un palíndromo es una palabra, frase o secuencia que se lee igual de izquierda a derecha que de derecha a izquierda, ignorando los espacios y la capitalización.
Por ejemplo, "Anilina" o "La sal lava la sal".*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escribe tu frase");
        String phrase = input.nextLine();
        phrase = phrase.toLowerCase().replaceAll("\\s+","");
        int total = 0;
        int position = phrase.length() -1;
        for (int i = 0; i <= phrase.length() -1;i++){
            char c1 = phrase.charAt(i);
            char c2 = phrase.charAt(position);
            if ( c1 == c2){
                total++;
            }
            position--;
        }
        if (total == phrase.length()){
            System.out.println("Es polindroma");
        }else {
            System.out.println("No es polindroma");
        }
    }
}