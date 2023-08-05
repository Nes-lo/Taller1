package puntos;
import java.util.Arrays;

import java.util.OptionalInt;


public class Punto29 {
    public static String numeroMayor(int [] arreglo){

        OptionalInt max= Arrays.stream(arreglo).max();

        if(max.isPresent())
        {
            return "El numero mayor del arreglo es: " +max.getAsInt();
        }
        return "El arreglo esta vacio";
    }
}
