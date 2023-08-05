package puntos;

public class Punto15 {
    public static boolean numeroCapicua(int numero) {
        int numeroReverso = 0;
        int numeroOriginal = numero;

        while (numero != 0) {
            int digito = numero % 10;
            numeroReverso = numeroReverso * 10 + digito;
            numero /= 10;
        }

        return numeroOriginal == numeroReverso;
    }
}
