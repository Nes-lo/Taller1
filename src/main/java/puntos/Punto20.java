package puntos;

public class Punto20 {
    public static String invertirCadena(String cadena){

        String cadenaInvertida="";

        for(int i=cadena.length()-1;i>=0;i--){
            cadenaInvertida=cadenaInvertida+cadena.charAt(i);
        }

   return cadenaInvertida;
    }
}
