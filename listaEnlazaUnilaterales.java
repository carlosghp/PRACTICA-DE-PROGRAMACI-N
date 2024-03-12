import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
     
        Deque<Integer> resultados = new ArrayDeque<>();

        // Valores de los dados
        int[] dados = {1, 4, 5, 3, 6, 1, 3, 2, 1, 4, 5, 6, 6, 2, 6, 1, 3, 2, 5, 4, 5, 1, 6, 4, 3};

      
        for (int resultado : dados) {
            // Si el resultado es par, agregar al principio de la cola
            if (resultado % 2 == 0) {
                resultados.offerFirst(resultado);
            } else { // Si el resultado es impar, agregar al final de la cola
                resultados.offerLast(resultado);
            }
        }

       
        System.out.println("Orden de los resultados de los dados:");
        for (int resultado : resultados) {
            System.out.print(resultado + " ");
        }
    }
}
