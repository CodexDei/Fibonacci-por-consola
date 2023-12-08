
import java.util.InputMismatchException;
import java.util.Scanner;

public class PruebaFibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FibonacciSeries Fibonacci = new FibonacciSeries();

        boolean estado = false;

        while (!estado) {

            try {

                System.out.println();
                System.out.println("Ingrese la opcion que desee: ");
                System.out.println("1. Para continuar con el programa");
                System.out.println("2. Salir");
                System.out.print("Su opcion es:");
                int opcion = sc.nextInt();

                switch (opcion) {
                    case 1:

                        System.out.println("");
                        System.out.print("Ingrese la posicion hasta donde desea ver la serie Fibonacci: ");
                        int posicionFibonacci = sc.nextInt();

                        System.out.println("La serie Fibonacci hasta la posicion " + posicionFibonacci + " es:");

                        for (int i = 0; i < posicionFibonacci; i++) {

                            if (posicionFibonacci <= 26) {

                                System.out.print(Fibonacci.GenerarFibonacci(i) + "   ");

                            } else {

                                System.out.println(Fibonacci.GenerarFibonacci(i) + "   ");

                            }

                        }

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
