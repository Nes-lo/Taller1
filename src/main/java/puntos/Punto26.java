package puntos;

public class Punto26 {

    public static int contarCaracteresNoNull(String cadena){

        return (int) cadena.chars()
                .filter(p->p!=' ')
                .count();
    }

}
