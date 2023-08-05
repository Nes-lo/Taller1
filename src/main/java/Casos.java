import puntos.*;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Casos {
    public static void getCasos(int opcion){
        Scanner scan=new Scanner(System.in);

        switch (opcion){

            case 1:
                System.out.println("Ingrese Primer Numero");
                int a= scan.nextInt();
                System.out.println("Ingresa Segundo Numero");
                int b= scan.nextInt();
                System.out.println("La suma de los numeros es: "+ Punto1.suma(a,b));
                System.out.println("La resta de los numeros es: "+Punto1.resta(a,b));
                System.out.println("La multiplicacion de los numeros es: "+Punto1.multiplicacion(a,b));
                System.out.println("La division de los numeros es: "+Punto1.division(a,b));
                break;
            case 2:
                System.out.println("Ingrese Un Numero");
                System.out.println(Punto2.parImpar(scan.nextInt()));
                break;
            case 3:
                System.out.println("Ingrese el radio del circulo");
                int radio= scan.nextInt();
                System.out.println("El Perimetro del Circulo es: "+ Punto3.perimetro(radio) +"Unidades");
                System.out.println("El area del circulo es: "+Punto3.area(radio)+ "Unidades Cuadradas");
                break;
            case 4:
                System.out.println("Ingrese Edad");
                System.out.println(Punto4.mayorEdad(scan.nextInt()));
                break;
            case 5:
                System.out.println("Ingrese Primer Numero");
                a= scan.nextInt();
                System.out.println("Ingresa Segundo Numero");
                b= scan.nextInt();
                System.out.println(Punto5.numeroMayor(a,b));
                break;
            case 6:
                System.out.println("Ingrese el numero");
                System.out.println(Punto6.numeroPositivoNegativoCero(scan.nextInt()));
                break;
            case 7:
                System.out.println("Ingrese el numero");
                Punto7.tablaMultiplicar(scan.nextInt());
                break;
            case 8:
                System.out.println("Adivina el numero que genero entre 1 y 100");
                int numero=Punto8.numeroAleatorio();
                String mensaje;
                do{
                    System.out.println("Ingresa el numero");
                    mensaje=Punto8.adivinador(numero,scan.nextInt());
                    System.out.println(mensaje);
                }while(!mensaje.equals("Felicitaciones Adivinaste"));
                break;
            case 9:
                System.out.println("Ingrese el numero para el factorial");
                System.out.println("El factorial es: "+Punto9.factorial(scan.nextInt()));
                break;
            case 10:
                for(int i=0; i<20;i++){
                    System.out.print(Punto10.fibonacci(i) + ", ");
                }
                System.out.print("...");
                System.out.println();
                break;
            case 11:
                System.out.println("Ingrese la longitud del cateto a");
                a= scan.nextInt();
                System.out.println("Ingrese la longitud del cateto b");
                b= scan.nextInt();
                System.out.println("Ingrese la longitud de la hipotenusa");
                int c=scan.nextInt();

                System.out.println("El Area del triangulo es: "+ Punto11.areaTriangulo(a,b,c));
                break;
            case 12:
                System.out.println("Ingrese Numero Entero");

                boolean primo=Punto12.numeroPrimo(scan.nextInt());
                if (primo)
                    System.out.println("El numero es primo");
                else
                    System.out.println("El numero no es primo");
                break;
            case 13:
                System.out.println("Ingrese numero decimal");
                double numeroDecimal= scan.nextDouble();
                System.out.println("Ingrese el numero decimales a reducir");
                int numeroDecimas= scan.nextInt();
                System.out.println("El numero reducido a la cantidad de decimales es: "
                        +Punto13.redondearDecimal(numeroDecimal,numeroDecimas));
            case 14:
                System.out.println("Ingrese numero entero positivo");
                if(Punto14.numeroPerfecto(scan.nextInt())){
                    System.out.println( "El numero ingresado es un número perfecto.");
                }
                else {
                    System.out.println( "El numero ingresado no es un número perfecto.");
                }
                break;
            case 15:
                System.out.print("Ingrese un número entero: ");
                numero = scan.nextInt();

                if (Punto15.numeroCapicua(numero)) {
                    System.out.println("El numero es un número capicúa.");
                } else {
                    System.out.println(" No es un número capicúa.");
                }
                break;
            case 16:
                System.out.println("Ingrese posicion deseada");
                numero= scan.nextInt();
                for(int i=0; i<numero;i++){
                    System.out.print(Punto16.fibonacci(i) + ", ");
                }
                System.out.print("...");
                System.out.println();
                break;
            case 17:
                System.out.println("Ingrese Primer Numero");
                a= scan.nextInt();
                System.out.println("Ingrese Segundo Numero");
                b= scan.nextInt();
                if(a<=b){
                    System.out.println("Los numeros primos entre el rango ingresado son: "
                            +Punto17.imprimirRango(a,b));
                }
                else {
                    System.out.println("El rango no es correcto17");
                }
                break;
            case 18:
                System.out.println(Punto18.generarContrasenia());
                break;
            case 19:
                System.out.println("Ingrese su nombre");
                String nombre=scan.next();
                System.out.println("Nombre Mayuscula: "+Punto19.mayuscula(nombre));
                System.out.println("Nombre Minuscula "+Punto19.minusculas(nombre));
                break;
            case 20:
                System.out.println("Ingrese Cadena");
                System.out.println(Punto20.invertirCadena(scan.nextLine()));
                break;
            case 21:
                System.out.println("Ingrese Cadena");
                String cadena=scan.nextLine();
                System.out.println("Ingrese Letra");
                char letra=scan.next().charAt(0);
                System.out.println("La letra buscada aparece: "
                        +Punto21.contarLetra(cadena,letra)+" veces");
                break;
            case 22:
                System.out.println("Ingrese Frase");
                String frase=scan.nextLine();
                System.out.println(Punto22.esPalindromo(frase));
                break;
            case 23:
                System.out.println("Ingrese Oracion");
                String oracion= scan.nextLine();
                System.out.println("La oracion tiene "+Punto23.cantidadPalabras(oracion)+" palabras");
                break;
            case 24:
                System.out.println("Ingrese una cadena");
                cadena=scan.nextLine();
                System.out.println("Ingrese letra a reemplazar");
                char letraOut=scan.next().charAt(0);
                System.out.println("Ingrese letra a que reemplazara");
                char letraIn=scan.next().charAt(0);
                System.out.println(Punto24.reemplazarLetra(cadena,letraOut,letraIn));
                break;
            case 25:
                System.out.println("Ingrese Frase");
                frase=scan.nextLine();
                Punto25.separarPalabras(frase).forEach(System.out::println);
                break;
            case 26:
                System.out.println("Ingrese una cadena");
                cadena=scan.nextLine();
                System.out.println("La cantidad de caracteres sin contar los espacios en blanco son: "
                        + Punto26.contarCaracteresNoNull(cadena));
                break;
            case 27:
                System.out.println("Ingrese Frase");
                frase=scan.nextLine();
                Punto27.ordenarAlfabeticamente(frase).forEach(System.out::println);
                break;

            case 28:
                System.out.println("Ingrese el tamaño del arreglo que desea sumar");
                int[] arregloEnteros=new int[scan.nextInt()];
                IntStream.range(0, arregloEnteros.length)
                        .forEach(i -> {
                            System.out.print("Ingrese número para la posición " + (i+1) + ": ");
                            arregloEnteros[i] = scan.nextInt();
                        });

                System.out.println("Los numeros del arreglo "+
                        Arrays.toString(arregloEnteros) +" suman "+Punto28.sumarArreglo(arregloEnteros));
                break;
            case 29:
                System.out.println("Ingrese el tamaño del arreglo");
                int[] arregloEnteros1=new int[scan.nextInt()];
                IntStream.range(0, arregloEnteros1.length)
                        .forEach(i -> {
                            System.out.print("Ingrese número para la posición " + (i+1) + ": ");
                            arregloEnteros1[i] = scan.nextInt();
                        });
                System.out.println(Punto29.numeroMayor(arregloEnteros1));
                break;
            case 30:
                System.out.println("Ingrese el tamaño del arreglo");
                int[] arregloEnteros2=new int[scan.nextInt()];
                IntStream.range(0, arregloEnteros2.length)
                        .forEach(i -> {
                            System.out.print("Ingrese número para la posición " + (i+1) + ": ");
                            arregloEnteros2[i] = scan.nextInt();
                        });
                System.out.println("El array inicial es: "+Arrays.toString(arregloEnteros2));
                System.out.println("El array con elementos unicos es: "
                        +Arrays.toString(Punto30.eliminarElementosDuplicados(arregloEnteros2)));
                break;
            case 31:
                System.out.println("Ingrese el tamaño del arreglo");
                int[] arregloEnteros3=new int[scan.nextInt()];
                IntStream.range(0, arregloEnteros3.length)
                        .forEach(i -> {
                            System.out.print("Ingrese número para la posición " + (i+1) + ": ");
                            arregloEnteros3[i] = scan.nextInt();
                        });
                System.out.println("El array inicial es: "+Arrays.toString(arregloEnteros3));
                System.out.println("El array ordenado es: "
                        +Arrays.toString(Punto31.ordenarBurbuja(arregloEnteros3)));
                break;
            case 32:
                System.out.println("Ingrese el tamaño del arreglo");
                int[] arregloEnteros4=new int[scan.nextInt()];
                IntStream.range(0, arregloEnteros4.length)
                        .forEach(i -> {
                            System.out.print("Ingrese número para la posición " + (i+1) + ": ");
                            arregloEnteros4[i] = scan.nextInt();
                        });
                System.out.println("Ingrese el numero a buscar");
                numero= scan.nextInt();
                System.out.println("El array es: "+Arrays.toString(arregloEnteros4));
                System.out.println(Punto32.buscarElemento(arregloEnteros4,numero));
                break;
            case 33:
                System.out.println("Ingrese el tamaño del arreglo");
                int[] arregloEnteros5=new int[scan.nextInt()];
                IntStream.range(0, arregloEnteros5.length)
                        .forEach(i -> {
                            System.out.print("Ingrese número para la posición " + (i+1) + ": ");
                            arregloEnteros5[i] = scan.nextInt();
                        });
                Punto33.frecuencia(arregloEnteros5);
                break;

            case 34:
                System.out.println("Ingrese el tamaño del arreglo");
                int[] arregloEnteros6=new int[scan.nextInt()];
                IntStream.range(0, arregloEnteros6.length)
                        .forEach(i -> {
                            System.out.print("Ingrese número para la posición " + (i+1) + ": ");
                            arregloEnteros6[i] = scan.nextInt();
                        });
                System.out.println("Ingrese numero de posiciones");
                int posiciones=scan.nextInt();
                System.out.println("El array original es: "+Arrays.toString(arregloEnteros6));
                Punto34.rotar(arregloEnteros6,posiciones);
                break;
            case 35:
                Punto35.tablaMultiplicar();
                break;
            default:
                System.out.println("El numero ingresado no esta en el rango");
        }
    }
}
