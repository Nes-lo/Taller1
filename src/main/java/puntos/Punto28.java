package puntos;

import java.util.Arrays;

public class Punto28 {
    public static int sumarArreglo(int[] arregloEnteros){
        return Arrays.stream(arregloEnteros).sum();
    }
}
