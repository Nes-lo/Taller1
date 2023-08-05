package puntos;

public class Punto11 {
    public static double areaTriangulo(int a, int b, int c){

        if(a+b>c){
            //se aplica la formula de Heron.
            int semiPerimetro=(a+b+c)/2;
            return Math.sqrt(semiPerimetro*(semiPerimetro-a)
                    *(semiPerimetro-b)*(semiPerimetro-c));
        }
        return 0.0;

    }
}
