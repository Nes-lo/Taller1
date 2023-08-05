package puntos;

public class Punto22 extends Punto20{

    public static String esPalindromo(String frase){

        if(invertirCadena(frase).equals(frase))
        {
            return "La frase es palindromo";
        }


        return "La frase no es palindromo";
    }

}
