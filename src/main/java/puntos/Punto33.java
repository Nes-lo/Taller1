package puntos;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Punto33 {
    public static void frecuencia(int[] arreglo){
        Map<Integer, Integer> frecuenciaElementos = new HashMap<>();
        for (int num : arreglo) {
            frecuenciaElementos.put(num, frecuenciaElementos.getOrDefault(num, 0) + 1);
        }
        System.out.println("Arreglo original: " + Arrays.toString(arreglo));
        System.out.println("Frecuencia de cada elemento:");
        for (Map.Entry<Integer, Integer> entry : frecuenciaElementos.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
