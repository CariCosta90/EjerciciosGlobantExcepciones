package divisionnumero_ej3;

import java.util.Scanner;

public class DivisionNumero_Ej3 {

    public static void main(String[] args) {
        /*
        Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
        números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
        para convertir las cadenas al tipo int y guardarlas en dos variables
         */

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresa el primer num");
        String str1 = leer.next();
        System.out.println("Ingresa el segundo num");
        String str2 = leer.next();

        try {
            int num1 = Integer.parseInt(str1);
            int num2 = Integer.parseInt(str2);
            int division = num1 / num2;
            System.out.println(division);
        } catch (NumberFormatException e) {
            System.out.println("Formato invalido");
            System.out.println(e.getMessage());
            System.out.println(e.fillInStackTrace());
        } catch (ArithmeticException a) {
            System.out.println("no se puede dividir entre 0 por favor ingresa valores validos");
            System.out.println(a.getMessage());
            System.out.println(a.toString());
        }

    }

}
