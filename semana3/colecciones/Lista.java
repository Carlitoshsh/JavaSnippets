package semana3.colecciones;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Lista {
    static LinkedList<String> tripulantesP80 = new LinkedList<>();

    // static ArrayList<ArrayList<String>> tripulantesP80Array = new ArrayList<>();
    public static void imprimirLista(LinkedList<String> lista) {
        String listaPrincipal = "";
        for (String elemento : lista) {
            listaPrincipal += elemento + " - ";
        }
        System.out.println(listaPrincipal);
    }

    private static void ejemploLinkedList() {
        // Comprobar si una lista esta vacia
        System.out.println(tripulantesP80.isEmpty());
        // Agregar elementos a la lista
        // 1. Agregar al final
        tripulantesP80.add("David");
        tripulantesP80.add("Daniel");
        // 2. Agregar en una posicion deseada
        imprimirLista(tripulantesP80);
        tripulantesP80.add("Felipe");
        tripulantesP80.add("Felipe");
        tripulantesP80.add(1, "Andres");
        tripulantesP80.add("Laura");
        tripulantesP80.add("Laura");
        imprimirLista(tripulantesP80);
        // Consultar elemento por indice
        System.out.println(tripulantesP80.get(1));
        // Consultar indice por elemento
        System.out.println(tripulantesP80.indexOf("Laura"));
        // Reemplazar por indice
        tripulantesP80.set(1, "Andrés");
        imprimirLista(tripulantesP80);
        // Remover por el elemento
        tripulantesP80.remove("Laura");
        // Remover por indice
        tripulantesP80.remove(3);
        imprimirLista(tripulantesP80);
        // Consulta si un elemento existe en lista
        System.out.println("Consulta Carlos: " + tripulantesP80.contains("Carlos"));
        // Consulta la cantidad de elementos en lista
        System.out.println(tripulantesP80.size());
        System.out.println(tripulantesP80);
        // Eliimina todos los elementos de la lista
        tripulantesP80.clear();
        System.out.println(tripulantesP80.size());

        // Metodos solo de LinkedList
        tripulantesP80.addFirst("Daniel");
        tripulantesP80.addLast("Laura");
    }

    private static void ejemploVector() {
        Vector vector = new Vector();
        vector.add(1);
        vector.add("Carlos");
        vector.add(true);
        System.out.println(vector);
        vector.set(2, 12.23);
        System.out.println(vector);
    }

    public static void main(String[] args) {
        ejemploLinkedList();
        System.out.println("\n---------------\n");
        ejemploVector();

    }

}
