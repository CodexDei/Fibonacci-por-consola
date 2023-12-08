public class FibonacciSeries {

   public int GenerarFibonacci(int valorFibonacci){
    
        if (valorFibonacci <= 0) {
            return valorFibonacci;            
        }
        
        int a = 0;
        int b = 1;
        
        for (int i = 2; i <= valorFibonacci; i++) {
            
            int aux = a + b;
            a = b;
            b = aux;
        }
        return b;    
    }

    
}
