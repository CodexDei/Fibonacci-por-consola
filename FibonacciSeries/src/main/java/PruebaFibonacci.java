
import java.util.InputMismatchException;
import java.util.Scanner;

public class PruebaFibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FibonacciSeries fibo = new FibonacciSeries();

        boolean estado = false;

        while (!estado) {

            try {

                System.out.println();
                System.out.println("Ingrese la opcion que desee: ");
                System.out.println("1. Generar serie Fibonacci");
                System.out.println("2. Salir");
                System.out.print("Su opcion es:");
                int opcion = sc.nextInt();

                switch (opcion) {
                    case 1:

                        System.out.println("******************* GENERAR FIBONACCI ************************");
                        System.out.println("Este programa genera la serie Fibonacci tanto para numeros positivos como negativos");
                        System.out.println("Ingrese la posicion fibonacci que desea ver:");
                        int posicionFibo = sc.nextInt();
                        fibo.mostrarFibo(posicionFibo);
                        //limpiar scanner
                        sc.nextLine();

                        break;

                    case 2:

                        estado = true;
                        break;

                    default:
                        System.out.println("");
                        System.out.println("ERROR!!! INGRESE UN VALOR VALIDO, SOLO 1 ó 2");
                        break;
                }
                System.out.println();

            } catch (InputMismatchException e) {
                System.out.println("");
                System.out.println("ERROR!!! INGRESE UN VALOR VALIDO!!!");
                sc.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println("r");
                System.out.println(e.getMessage());
                sc.nextLine();
            }

        }

    }
}
