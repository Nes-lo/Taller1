package puntos;

import java.util.Random;

public class Punto8 {
    public static int numeroAleatorio(){
        Random random=new Random();
        return random.nextInt(100)+1;
    }

    public static String adivinador(int numeroGenerado, int numeroUsuario){

        if(numeroUsuario>numeroGenerado){
            return "El numero ingresado es mayor al generado";
        }
        if(numeroUsuario<numeroGenerado){
            return "El numero ingresado es menor al generado";
        }
        return "Felicitaciones Adivinaste";


    }

}
