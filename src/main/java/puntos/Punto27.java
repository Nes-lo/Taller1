package puntos;


import java.util.Collections;
import java.util.List;

public class Punto27 extends Punto25{

    public static List<String> ordenarAlfabeticamente(String frase){
        List cadena=Punto25.separarPalabras(frase);
        Collections.sort(cadena,String.CASE_INSENSITIVE_ORDER);
        return cadena;
    }

}
