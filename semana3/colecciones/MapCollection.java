package semana3.colecciones;

import java.util.ArrayList;
import java.util.HashMap;

public class MapCollection<T> {
    static HashMap<Integer, String> tripulantesP80 = new HashMap<>();
    HashMap<HashMap<T, T>, ArrayList<T>> tripulantesP80lista = new HashMap<HashMap<T, T>, ArrayList<T>>();

    public static void main(String[] args) {
        // Comprobar si un diccionario esta vacio
        System.out.println(tripulantesP80.isEmpty());
        tripulantesP80.put(12, "Carlos");
        tripulantesP80.put(12, "David");
        tripulantesP80.put(21, "Andres");
        tripulantesP80.put(213, "Andres");
        System.out.println(tripulantesP80);
    }

}
