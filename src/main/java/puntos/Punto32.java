package puntos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Punto32 {

    public static String buscarElemento(int[] arreglo, int numeroBuscado){

        boolean encontrado = IntStream.range(0, arreglo.length)
                .anyMatch(i -> arreglo[i] == numeroBuscado);
        if (encontrado) {
            List<Integer> indicesEncontrados=new ArrayList<>();
            IntStream.range(0, arreglo.length)
                    .filter(i -> arreglo[i] == numeroBuscado)
                    .forEach(indicesEncontrados::add);
            return indicesEncontrados.stream()
                    .map(i -> "El número " + numeroBuscado + " se encuentra en el índice: " + i)
                    .collect(Collectors.joining("\n"));
        } else {
          return   "El número " + numeroBuscado + " no se encuentra en el arreglo.";
        }

    }

}
