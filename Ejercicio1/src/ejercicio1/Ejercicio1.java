package ejercicio1;

import entities.Persona;
import services.PersonaServicios;


public class Ejercicio1 {

    public static void main(String[] args) {
        PersonaServicios ps = new PersonaServicios();
        
        /*
        Inicializar un objeto de la clase Persona ejercicio 3 de la guía 8 Servicios, a null y tratar
de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el código
con una cláusula try-catch para probar la nueva excepción que debe ser controlada.
        
        */
        
        Persona p1 = null;
        
        try {
            ps.esMayorDeEdad(p1);
        } catch (NullPointerException e) {
            System.out.println("El objeto creado es " + e.getMessage());
            System.out.println(e.fillInStackTrace());
            System.out.println(e.toString());
        }
       
    }

}
