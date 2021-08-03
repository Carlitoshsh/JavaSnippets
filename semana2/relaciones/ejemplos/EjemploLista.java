package semana2.relaciones.ejemplos;

import java.util.ArrayList;

public class EjemploLista {
    static int[] arregloEnteros = new int[5];
    static ArrayList<Integer> listaEnteros = new ArrayList<Integer>();

    public static void imprimirArreglo(int[] arreglo) {
        for (int elemento : arreglo) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        for (int i = 0; i < arregloEnteros.length; i++) {
            arregloEnteros[i] = i + i;
        }
        imprimirArreglo(arregloEnteros);
    }
}
