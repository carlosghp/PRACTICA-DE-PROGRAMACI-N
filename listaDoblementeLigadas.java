class Nodo {
    int valor;
    Nodo anterior;
    Nodo siguiente;

    public Nodo(int valor) {
        this.valor = valor;
        this.anterior = null;
        this.siguiente = null;
    }
}

class ListaDoblementeLigada {
    Nodo inicio;
    Nodo fin;
    int tamaño;

    public ListaDoblementeLigada() {
        inicio = null;
        fin = null;
        tamaño = 0;
    }

    public void insertarAlFinal(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (inicio == null) {
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else {
            fin.siguiente = nuevoNodo;
            nuevoNodo.anterior = fin;
            fin = nuevoNodo;
        }
        tamaño++;
    }

    public double calcularPromedio() {
        if (tamaño == 0) {
            return 0;
        }
        Nodo actual = inicio;
        double suma = 0;
        while (actual != null) {
            suma += actual.valor;
            actual = actual.siguiente;
        }
        return suma / tamaño;
    }

    public void contarNodosAlrededor(int valorBuscado) {
        Nodo actual = inicio;
        int nodosIzquierda = 0;
        int nodosDerecha = 0;
        while (actual != null && actual.valor != valorBuscado) {
            actual = actual.siguiente;
        }
        if (actual != null) {
            Nodo temp = actual.anterior;
            while (temp != null) {
                nodosIzquierda++;
                temp = temp.anterior;
            }
            temp = actual.siguiente;
            while (temp != null) {
                nodosDerecha++;
                temp = temp.siguiente;
            }
        }
        System.out.println("Nodos a la izquierda de " + valorBuscado + ": " + nodosIzquierda);
        System.out.println("Nodos a la derecha de " + valorBuscado + ": " + nodosDerecha);
    }
}

public class Main {
    public static void main(String[] args) {
        // Crear lista doblemente ligada
        ListaDoblementeLigada lista = new ListaDoblementeLigada();
        lista.insertarAlFinal(3);
        lista.insertarAlFinal(5);
        lista.insertarAlFinal(7);
        lista.insertarAlFinal(9);
        lista.insertarAlFinal(11);

       
        System.out.println("Promedio de los elementos en la lista: " + lista.calcularPromedio());

        // Contar nodos alrededor de un valor seleccionado por el usuario
        lista.contarNodosAlrededor(7);
    }
}
