package puntos;

public class Punto31 {
    public static int[] ordenarBurbuja(int[] arreglo) {
        int numeroElementos = arreglo.length;
        boolean intercambio;

        for (int i = 0; i < numeroElementos - 1; i++) {
            intercambio = false;

            for (int j = 0; j < numeroElementos - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {

                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    intercambio = true;
                }
            }
            if (!intercambio) {
                break;
            }
        }
        return arreglo;
    }
}






