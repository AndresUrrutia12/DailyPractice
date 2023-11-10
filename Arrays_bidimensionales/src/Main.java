import java.util.Arrays;
import java.util.Scanner;
import java.util.random.RandomGenerator;

/*Proyecto: Juego de Batalla Naval
Descripción:
Crea un juego de Batalla Naval en el que un jugador intentará adivinar la ubicación de los barcos en un tablero utilizando coordenadas. Utilizarás un array bidimensional para representar el tablero y los barcos.

Requerimientos:

1. El programa debe generar un tablero de juego utilizando un array bidimensional. Puedes elegir el tamaño del tablero según tus preferencias.

2. Debes colocar aleatoriamente los barcos en el tablero. Puedes representar los barcos con un carácter específico en el tablero, por ejemplo, "B".

3. El jugador podrá ingresar las coordenadas (fila y columna) para intentar adivinar la ubicación de los barcos.

4. El programa debe verificar si el jugador ha acertado en un barco o ha fallado. Debes mostrar el resultado al jugador.

5. El juego continúa hasta que el jugador haya adivinado la ubicación de todos los barcos en el tablero.

6. Opcionalmente, puedes agregar un contador de intentos para registrar la cantidad de intentos que ha tomado al jugador para completar el juego.
*/
public class Main {
    public static void main(String[] args) {
        char option;
        int intentos = 0;
        do {
            int columnas = 0;
            int filas = 0;

            Scanner input = new Scanner(System.in);

            System.out.println("\nBienvenido al Juego de Batalla Naval.");
            System.out.println("\nElige el tamaño del tablero de juego.");
            System.out.print("\nFilas:");
            filas = input.nextInt();
            System.out.print("\nColumnas:");
            columnas = input.nextInt();


            char[][] naval = new char[filas][columnas];

            System.out.println("\nGenerando barcos en el tablero...\n");

            int numeroFilas = 0;
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    int randomFila = (int) (Math.random() * filas);
                    int randomColumna = (int) (Math.random() * columnas);
                    naval[i][j] = '*';
                    if (naval[i][j] == naval[randomFila][randomColumna]) {
                        naval[i][j] = 'B';
                    }
                }
                numeroFilas++;
            }

            char[][] naval1 = new char[filas][columnas];

            numeroFilas = 0;
            for (int i = 0; i < filas; i++) {
                System.out.print("  " + numeroFilas);
                for (int j = 0; j < columnas; j++) {
                    naval1[i][j] = '*';
                }
                numeroFilas++;
            }

            int numeroColumna = 0;
            for (char[] fila : naval1) {
                int condicional = 1;
                System.out.println();
                for (char z : fila) {
                    if (condicional == 1) {
                        System.out.print(numeroColumna + " ");
                    }
                    System.out.print(z + "  ");
                    condicional--;
                }
                numeroColumna++;
            }

            System.out.println("\n\nIntenta adivinar la ubicación de los barcos.");

            int coordenadaFila;
            int coordenadaColumna;

            boolean iguales;
            do {

                System.out.print("\nIngresa la coordenada de la fila:");
                coordenadaFila = input.nextInt();
                System.out.print("\nIngresa la coordnada de la columna:");
                coordenadaColumna = input.nextInt();

                try {
                    
                    if (naval[coordenadaFila][coordenadaColumna] == 'B') {
                        naval1[coordenadaFila][coordenadaColumna] = 'B';

                        System.out.println("\n¡Felicitaciones! ¡Has hundido un barco!\n");

                        numeroFilas=0;
                        for (int i = 0; i < filas; i++){
                            System.out.print("  "+numeroFilas);
                            numeroFilas++;
                        }

                        numeroColumna = 0;
                        for (char[] fila : naval1) {
                            int condicional = 1;
                            System.out.println();
                            for (char z : fila) {
                                if (condicional == 1) {
                                    System.out.print(numeroColumna + " ");
                                }
                                System.out.print(z + "  ");
                                condicional--;
                            }
                            numeroFilas++;
                            numeroColumna++;
                        }

                    } else {
                        System.out.println("\n¡Has fallado! No hay ningún barco en esa ubicación");
                    }
                } catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("\nCoordenadas fuera del tablero no aceptadas. " +
                            "Porfavor ingrese coordenadas dentro del tablero creado.");
                }
                intentos++;

                iguales = Arrays.deepEquals(naval,naval1);


            } while (iguales != true);

            System.out.println("\n¡Felicitaciones! ¡Has hundido los barcos en el tablero!");
            System.out.println("\n¡Juego completado! Has ganado en " + intentos + " intentos.");
            System.out.println("\n¿Deseas jugar de nuevo? (S/N)");

            option = input.next().charAt(0);

        } while (option == 'S' || option == 's');

        System.out.println("\n¡Gracias por jugar ¡Hasta Luego!");
        

    }
}