public class Main {
    public static void main(String[] args) {
        // Definir el arreglo con algunos valores numéricos
        int[] numeros = {10, 5, 8, 12, 4};

        // Realizar operaciones de resta entre los elementos del arreglo
        for (int i = 0; i < numeros.length; i++) {
            if (i < numeros.length - 1) {
                int resta = numeros[i] - numeros[i + 1];
                System.out.println(numeros[i] + " - " + numeros[i + 1] + " = " + resta);
            }
        }
    }
}
