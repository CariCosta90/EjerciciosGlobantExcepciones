package arrayindex_ej2;


public class ArrayIndex_Ej2 {

    public static void main(String[] args) {
        /*
        Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
        generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
        de rango).
        */
        
        //creo un array
        
        int[] myArray = new int[3];
        
        myArray[0]=1;
        myArray[1]=1;
        myArray[2]=1;
        try {
            myArray[3]=1;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of boundries of the array");
            System.out.println(e.toString());
        }
        
       
    }

}
