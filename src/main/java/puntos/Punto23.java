package puntos;

public class Punto23 {

    public static int cantidadPalabras(String oracion){
        int contador=0;
        for(int i=1;i<oracion.length();i++){
            if(oracion.charAt(i-1)!=' ' && oracion.charAt(i)==' '){
             contador++;
            }
            if(oracion.length()-1==i && oracion.charAt(i-1)!=' '){
                contador++;
            }
        }
        return contador;
    }

}
