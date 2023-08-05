package puntos;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Punto13 {
    public static BigDecimal redondearDecimal(double numero, int numeroDecimales){
        BigDecimal bigDecimal=new BigDecimal(numero);
        return bigDecimal.setScale(numeroDecimales, RoundingMode.HALF_UP);
    }
}
