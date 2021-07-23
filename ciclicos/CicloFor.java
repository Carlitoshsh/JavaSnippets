package ciclicos;

import java.util.Scanner;

/**
 * CicloFor
 */
public class CicloFor {

    static void EjemploCicloFor(){
        String[] frutas = {"Manzana", "Pera", "Banano", "Piña"};

        /*
            Codigo Python

            for i in range(0, len(frutas)):
                print(frutas[i]) 
        */
        System.out.println("*** FOR normal");

        for (int i = 0; i < frutas.length; i++){
            System.out.println(frutas[i]);
        }

        /*
            Codigo Python

            for fruta in frutas:
                print(fruta, end= " - ") 
        */
        System.out.println("*** FOR each");

        for (String fruta : frutas) {
            System.out.println(fruta);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EjemploCicloFor();
        sc.close();
    }
    
}