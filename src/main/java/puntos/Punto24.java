package puntos;

import java.util.Arrays;

public class Punto24 {

    public static String reemplazarLetra(String cadena, char letraOut, char letraIn){

      return cadena.chars()
              .mapToObj(c->(char)(c==letraOut ? letraIn:c))
              .collect(StringBuilder::new, StringBuilder::append,StringBuilder::append)
              .toString();

    }
}
