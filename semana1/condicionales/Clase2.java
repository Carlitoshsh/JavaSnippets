package semana1.condicionales;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Clase2
 */
public class Clase2 {

    static void conIfNumero(int numero) {
        if (numero == 1) {
            System.out.println("Numero es 1");
        } else if (numero == 2) {
            System.out.println("Numero es 2");
        } else if (numero == 3) {
            System.out.println("Numero es 3");
        } else {
            System.out.println("No contiene 1, 2 o 3");
        }
    }

    static void conSwitchNumero(int numero) {
        switch (numero) {
            case 1:
                System.out.println("Contiene 1");
                break;
            case 2:
                System.out.println("Contiene 2");
                break;
            case 3:
                System.out.println("Contiene 3");
                break;
            default:
                System.out.println("No contiene 1, 2 o 3");
                break;
        }

    }

    static void conIf(String nombre) {
        if (nombre.contains("S")) {
            System.out.println("Contiene S");
        } else if (nombre.contains("C")) {
            System.out.println("Contiene C");
        } else if (nombre.contains("L")) {
            System.out.println("Contiene L");
        } else {
            System.out.println("No contiene S, C o L");
        }
    }

    static void conSwitch(String nombre) {
        final Matcher m = Pattern.compile("[SCL]").matcher(nombre);
        if (m.find()) {
            switch (m.group().charAt(0)) {
                case 'S':
                    System.out.println("Contiene S");
                    break;
                case 'C':
                    System.out.println("Contiene C");
                    break;
                case 'L':
                    System.out.println("Contiene L");
                    break;
                default:
                    System.out.println("No contiene S, C");
                    break;
            }
        }

    }

    static void esVocal(char character) {
        switch (character) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Es vocal");
                break;
            default:
                System.out.println("No es vocal");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String nombre = sc.nextLine();
        int numero = sc.nextInt();
        sc.close();
        System.out.println("Con if:");
        // conIf(nombre);
        conIfNumero(numero);
        System.out.println("Con switch:");
        conSwitchNumero(numero);
        // conSwitch(nombre);
        esVocal('c');
    }
}