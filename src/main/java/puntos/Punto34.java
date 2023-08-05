package puntos;

import java.util.Arrays;

public class Punto34 {

    public static void rotar(int[] arreglo,int posiciones){

        int[] resultadoIzquierda = rotarIzquierda(arreglo, posiciones);
        System.out.println("Arreglo rotado hacia la izquierda: " + Arrays.toString(resultadoIzquierda));


        int[] resultadoDerecha = rotarDerecha(arreglo, posiciones);
        System.out.println("Arreglo rotado hacia la derecha: " + Arrays.toString(resultadoDerecha));
    }



    private static int[] rotarIzquierda(int[] arreglo, int posiciones) {
        int tamaño = arreglo.length;
        int[] resultado = new int[tamaño];

        for (int i = 0; i < tamaño; i++) {
            int nuevaPosicion = (i - posiciones + tamaño) % tamaño;
            resultado[nuevaPosicion] = arreglo[i];
        }

        return resultado;
    }

    private static int[] rotarDerecha(int[] arreglo, int posiciones) {
        int tamaño = arreglo.length;
        int[] resultado = new int[tamaño];

        for (int i = 0; i < tamaño; i++) {
            int nuevaPosicion = (i + posiciones) % tamaño;
            resultado[nuevaPosicion] = arreglo[i];
        }

        return resultado;
    }
}
