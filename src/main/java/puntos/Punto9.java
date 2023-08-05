package puntos;

public class Punto9 {

    public static double factorial(int numero){
        if(numero>1){
            return numero*factorial(--numero);
        }
        return 1;
    }
}
