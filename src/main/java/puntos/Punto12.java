package puntos;

public class Punto12 {

    public static boolean numeroPrimo(int numero){

        if(numero<=1){
            return false;
              }
        if(numero<=3){
            return true;
        }
        if (numero % 2 == 0 || numero % 3 == 0) {
            return false;
        }
        // Verificar divisibilidad por otros números desde 5 hasta la raíz cuadrada del número
        for (int i = 5; i * i <= numero; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false;
            }
        }
       return true;
    }
}
