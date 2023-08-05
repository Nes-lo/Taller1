package puntos;

public class Punto14 {
    public static boolean numeroPerfecto(int numero){
        int suma=0;
        if(numero<=0){
            return false;
        }
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }

        return suma == numero;

    }
}
