package puntos;

public class Punto17 extends Punto12 {

    public static String imprimirRango(int inicio, int fin){
        String cadenaPrimos="";
        while(inicio<=fin){
            if(numeroPrimo(inicio)){
                cadenaPrimos=cadenaPrimos+" "+inicio;
            }
            inicio++;
        }

        return cadenaPrimos;
    }

}
