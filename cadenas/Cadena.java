package cadenas;

import java.util.Scanner;

/*
    Clase: Cadena
*/
public class Cadena {

    public static void SplitDeCaracteres() {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        sc.close();

        String[] arreglo = entrada.split(" ");
        for (String string : arreglo) {
            System.out.println(string);
        }
    }

    /**
     * Prueba de documentación en función.
     */
    public static void ExtraccionDeCaracteres(String cadena) {
        // En Python: cadena[2]
        char consulta = cadena.charAt(2);
        System.out.println(consulta);

        // En Python: cadena[2:4]
        String subcadena = cadena.substring(2, 4);
        System.out.println(subcadena);
    }

    private static void FuncionesConCadenas() {
        Scanner sc = new Scanner(System.in);
        String cadena1 = sc.nextLine();
        String cadena2 = sc.nextLine();
        sc.close();
        // char caracter = 'a';
        // System.out.println(cadena.charAt(5));
        // Comparacion
        System.out.println(cadena1.equals(cadena2));
        System.out.println(cadena1.equalsIgnoreCase(cadena2));
        // Contenencia
        System.out.println(cadena1.contains(cadena2));
        // Concatenacion
        System.out.println(cadena1 + " " + cadena2);
        // Longitud (en Python es len(cadena1))
        System.out.println(cadena1.length());
        // Extraer o consultar caracteres
        ExtraccionDeCaracteres(cadena1);
    }

    public static void main(String[] args) {
        // FuncionesConCadenas();
        SplitDeCaracteres();
    }
}
