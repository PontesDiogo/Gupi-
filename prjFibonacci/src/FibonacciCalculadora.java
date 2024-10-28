
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author doggo
 */
public class FibonacciCalculadora {
    private List<Integer> sequencia;
     public FibonacciCalculadora() {
        sequencia = new ArrayList<>();
    }
       public List<Integer> generateSequence(int n) {
        sequencia.clear(); 
        int a = 0, b = 1;
        sequencia.add(a); 
        sequencia.add(b); 

        while (b <= n) {
            int next = a + b;
            a = b;
            b = next;
            sequencia.add(b);
        }
        return sequencia;
    }

        public boolean checkIfBelongs(int num) {
      
        if (sequencia.isEmpty() || sequencia.get(sequencia.size() - 1) < num) {
            generateSequence(num);
        }
        return sequencia.contains(num);
    }

   
    public void printMessage(int num) {
        if (checkIfBelongs(num)) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + num + " não pertence à sequência de Fibonacci.");
        }
    }

   
}
