package puntos;

public class Punto35 {
    public static void tablaMultiplicar(){
        int[][] tablaMultiplicar = new int[10][10];

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                tablaMultiplicar[i - 1][j - 1] = i * j;
            }
        }

        System.out.println("Tablas de multiplicar del 1 al 10:");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", tablaMultiplicar[i - 1][j - 1]);
            }
            System.out.println();
        }
    }
}
