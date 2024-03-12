import java.util.ArrayDeque;
import java.util.Queue;

public class ProgramaColas {
    public static void main(String[] args) {
        // Crear una cola de números enteros
        Queue<Integer> cola = new ArrayDeque<>();

        // Agregar elementos a la cola
        cola.add(10);
        cola.add(20);
        cola.add(30);
        cola.add(40);
        cola.add(50);
        while (!cola.isEmpty()) {
            int elemento = cola.remove();
            System.out.println("Se eliminó de la cola: " + elemento);
        }
    }
}
