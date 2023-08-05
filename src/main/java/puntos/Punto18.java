package puntos;

public class Punto18 {
    public static String generarContrasenia(){

        String contraGenerada="";
        String caracteresPosibles="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int posicion;
        for(int i=0;i<8;i++){
            posicion=(int) (Math.random() * (caracteresPosibles.length()  + 1));
            contraGenerada=contraGenerada+caracteresPosibles.charAt(posicion);
        }
        return contraGenerada;

    }
}
