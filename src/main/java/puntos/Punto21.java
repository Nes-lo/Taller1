package puntos;

public class Punto21 {
    public static int contarLetra(String cadena, char letra){
        int contador=0;
        for(int i=0;i<cadena.length();i++){
            if(letra==cadena.charAt(i)){
                contador++;
            }
        }
        return contador;
    }
}
