package semana3.colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapCollection<T> {
    HashMap<HashMap<T, T>, ArrayList<T>> tripulantesP80lista = new HashMap<HashMap<T, T>, ArrayList<T>>();

    private static void ejemploHashMap() {
        HashMap<Integer, String> tripulantesP80 = new HashMap<>();
        // Comprobar si un diccionario esta vacio
        System.out.println(tripulantesP80.isEmpty());
        tripulantesP80.put(12, "Carlos");
        tripulantesP80.put(12, "David");
        tripulantesP80.put(213, "Andres");
        tripulantesP80.put(21, "Andres");
        tripulantesP80.put(2122, "Laura");
        tripulantesP80.put(232, "Daniel");
        System.out.println(tripulantesP80);
        System.out.println(tripulantesP80.size());
        if(tripulantesP80.containsKey(12)){
            System.out.println(tripulantesP80.get(12));
        }
        System.out.println(tripulantesP80.containsValue("Andres"));
        
        for (Map.Entry<Integer,String> tripulante : tripulantesP80.entrySet()) {
            System.out.println(tripulante.getKey() + " -> " + tripulante.getValue());
        }

        // Solucion recomendada (investigar Arrow functions) 
        tripulantesP80.entrySet().forEach((tripulante) -> {
            System.out.println(tripulante.getKey() + " -> " + tripulante.getValue());
        });
    }

    private static void ejemploTreeMap() {
        TreeMap<Integer, String> tripulantesP80 = new TreeMap<>();
        // Comprobar si un diccionario esta vacio
        System.out.println(tripulantesP80.isEmpty());
        tripulantesP80.put(12, "Carlos");
        tripulantesP80.put(12, "David");
        tripulantesP80.put(213, "Andres");
        tripulantesP80.put(21, "Andres");
        tripulantesP80.put(2122, "Laura");
        tripulantesP80.put(232, "Daniel");
        System.out.println(tripulantesP80);
        System.out.println(tripulantesP80.size());
        tripulantesP80.entrySet().forEach((tripulante) -> {
            System.out.println(tripulante.getKey() + " -> " + tripulante.getValue());
        });
    }

    public static void main(String[] args) {
        ejemploHashMap();
        ejemploTreeMap();
    }

}