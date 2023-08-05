package puntos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Punto25 {

    public static List<String> separarPalabras(String frase){
        return Arrays.stream(frase.split(" "))
                .collect(Collectors.toList());
    }

}
