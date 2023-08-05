package puntos;

import java.util.Arrays;

public class Punto30 {
    public static int [] eliminarElementosDuplicados(int [] arreglo){
        return Arrays.stream(arreglo).distinct().toArray();
    }
}
