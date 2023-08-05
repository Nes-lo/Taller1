package puntos;

public class Punto5 {

    public static String numeroMayor(int a, int b){

        if(a>b){
            return "El "+ a +" es mayor que "+ b;
        } else if (a<b) {
            return "El "+ a +" es menor que "+ b;
        }
        return "Ambos numeros son iguales";
    }
}
