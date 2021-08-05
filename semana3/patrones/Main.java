package semana3.patrones;

public class Main<T> {

    void pruebaConInterfaz(ICaja<T> caja, T[] matriz){
        System.out.println(caja.decorar());
        System.out.println(caja.imprimirMatriz(matriz));
    }

    public static void main(String[] args) {
        String[] vocales = {"a", "e", "i", "o", "u"};
        Main<String> main = new Main<>();
        CajaGenerico<String> cajaGenerica = new CajaGenerico<>("Hola mundo!");
        main.pruebaConInterfaz(cajaGenerica, vocales);

        Integer[] numeros = {1, 2, 3, 4, 5};
        Main<Integer> main2 = new Main<>();
        CajaAlterna<Integer> cajaAlterna = new CajaAlterna<>(1230);
        main2.pruebaConInterfaz(cajaAlterna, numeros);
    }
}
