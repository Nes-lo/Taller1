import java.util.Scanner;

public class Taller_1_Softlond {

    public static void main(String[] args) {

        int opcion;
        do{
            Scanner scan=new Scanner(System.in);
            Titulos.getTitulos();
            opcion=scan.nextInt();
            Casos.getCasos(opcion);
            System.out.println("Seleccione numero diferente de 0 para listar de nuevo o 0 para terminar");
            opcion= scan.nextInt();

        }while (opcion!=0);








    }
}
