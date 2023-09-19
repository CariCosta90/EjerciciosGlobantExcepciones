package adivinanzadenumero_ej5;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class AdivinanzaDeNumero_Ej5 {

    public static void main(String[] args) {
        /*
        Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
        debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
        ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
        número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
        consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
        ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
        controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
        carácter fallido como un intento.
         */

        //importar Scanner
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        //generar y asignar numero aleatorio
        Random random = new Random();

        int numeroSecreto = random.nextInt(500) + 1;
        int numeroIngresado = 0;

        //bucle do while para seguir pidiendo un numero y evaluando con try-catch
        do {
            //pedir el valor y asignarlo a una variable --> aca hacemos el try catch (InputMismatchException?)
            System.out.println("Ingresa un nuemero para adivinar");
            try {
                numeroIngresado = leer.nextInt();
                //informar al usuario si el valor es mayor o menor (if)
                if (numeroIngresado != 0) {
                    if (numeroIngresado < numeroSecreto) {
                        System.out.println("El valor secreto es un numero mas grande!");
                    } else {
                        System.out.println("El valor secreto es un numero mas  pequeno!");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Se ha encontrado un error; " + e.getMessage());
                System.out.println(e.toString());
                leer.next();
            }

        } while (numeroSecreto != numeroIngresado);//aca va numeroSecreto != numeroIngresado

    }

}
