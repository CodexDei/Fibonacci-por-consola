public class FibonacciSeries {

    public void mostrarFibo(int numPosicion){

        System.out.println("La serie Fibonacci positiva en la posicion '" +
                numPosicion + "' es: ");

        for(int i = 0; i < numPosicion; i++){

            System.out.print(serieFiboPositiva(i) + " ");
        }

        System.out.println();

        System.out.println("La serie Fibonacci negativa en la posicion '" +
                numPosicion + "' es: ");

        for (int j = 0; j > -numPosicion; j--){

            System.out.print(serieFiboNegativa(j) + " ");
        }
        System.out.println("\n");
    }

    private int serieFiboPositiva(int num) {

        if (num <= 1){
            return num;
        }

        return serieFiboPositiva(num - 1) + serieFiboPositiva(num -2);
    }

    private int serieFiboNegativa(int num) {

        if (num == 0){return 0;}
        if (num == -1){return 1;}

        return serieFiboNegativa(num + 2) - serieFiboNegativa(num + 1);
    }
    
}
