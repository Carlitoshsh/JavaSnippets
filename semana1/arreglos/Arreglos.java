package semana1.arreglos;

import java.util.Scanner;

/**
 * Arreglos
 */
public class Arreglos {

    public static void imprimirMatrizUnidimensional(String[] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Componente: " + i + ", Valor: " + matrix[i]);
        }
    }

    public static void imprimirMatrizUnidimensional(int[] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Componente: " + i + ", Valor: " + matrix[i]);
        }
    }

    public static void guardarDiagonales(int[][] matriz) {
        int[] unidimensional = new int[matriz.length];
        for(int i = 0; i < matriz.length; i++){
            unidimensional[i] = matriz[i][i];
        }
        imprimirMatrizUnidimensional(unidimensional);
    }

    public static void imprimirMatriz2D(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void Arreglos2D() {
        int[][] array2d = new int[4][4];
        // array2d.lenght recupera las filas, en este caso, 4
        // Ver arregloExplicacion.pdf
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                array2d[i][j] = (i + j)*(i + j);
            }
        }
        imprimirMatriz2D(array2d);
        guardarDiagonales(array2d);
    }

    public static void PromedioEnJava() {
        double[] valores = new double[4];
        double promedio = 0;
        double suma = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < valores.length; i++) {
            valores[i] = sc.nextDouble();
            suma += valores[i];
        }
        promedio = suma / valores.length;
        sc.close();
        System.out.println("Suma total: " + promedio);
    }

    private static void EjemploString() {
        String[] frutas = new String[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < frutas.length; i++) {
            frutas[i] = sc.nextLine();
        }
        sc.close();
        imprimirMatrizUnidimensional(frutas);
    }

    public static void main(String[] args) {
        // EjemploString();
        // PromedioEnJava();
        Arreglos2D();
    }

}
