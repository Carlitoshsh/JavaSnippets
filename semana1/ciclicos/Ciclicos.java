package semana1.ciclicos;

import java.util.Scanner;

/**
 * Ciclicos
 */
public class Ciclicos {

    /*
     * Codigo Python print("Este es un bloque previo de instrucciones")
     * 
     * i = 2 # inicializa a i en 2 j = 25 # inicializa a j en 25
     * 
     * while i < j: # mientras i sea menor a j print(i, j, sep = ", ") # imprime los
     * valores de i y j j += 10 # j = j + 10; se incrementa de 10 en 10 i *= 2 # i =
     * i * 2; i se multplica por 2 en cada paso
     * 
     * print("the end.") # se ejecuta al terminar el ciclo # print(i, j, sep = ", ")
     * # valores finales de i y j print(f"{i}, {j:.2f}")
     * 
     * print("Este es un bloque siguiente de instrucciones")
     */

    public static void EjemploWhile() {
        System.out.println("WHILE Este es un bloque previo de instrucciones");
        int i = 2;
        int j = 25;

        while (i < j) {
            System.out.println("i: " + i + ", j: " + j);
            j += 10;
            i *= 2;
        }

        System.out.println("Fin del while");
        System.out.println("i: " + i + ", j: " + j);

        System.out.println("Este es un bloque siguiente de instrucciones");
    }

    /* 
    Codigo Python

    def min_maquina():
        Xi = 1.0 # Valor inicial
        bandera = True

        while (bandera or Xi > 0.0):
            bandera = False
            Xo = Xi
            Xi = Xo / 2.0

        return Xo
    */

    public static void EjemploDoWhile() {
        double Xi = 1.0;
        double Xo = 0.0;

        do {
            Xo = Xi;
            Xi = Xo / 2.0;
        } while (Xi > 0.0);

        System.out.print("El minimo numero positivo ");
        System.out.println("de esta maquina es "+Xo);

        System.out.println("Este es un bloque siguiente de instrucciones");
    }

    public static void main(String[] args) {
        System.out.println("Es momento de ciclicos...");
        // Scanner sc = new Scanner(System.in);

        // sc.close();
        EjemploWhile();
        EjemploDoWhile();
    }
}