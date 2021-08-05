package semana3.patrones;

public class CajaGenerico<T> implements ICaja<T> {
    public T object;

    public CajaGenerico(T object){
        this.object = object;
    }

    @Override
    public String decorar() {
        int tamanio_numero = this.object.toString().length();
        String barra = "";
        for (int j = 0; j < tamanio_numero + 2; j++) {
            barra += "*";
        }
        return "\n\t" + barra + "\n\t*" + this.object + "*\n\t" + barra + "\n";
    }

    public T obtener() {
        return this.object;
    }

    @Override
    public String imprimirMatriz(T[] matriz) {
        String impresion = "";
        for (T t : matriz) {
            impresion += t + "\n";
        }
        return impresion;
    }

    public static void main(String[] args) {
        CajaGenerico<Integer> caja1 = new CajaGenerico<>(101);
        System.out.println(caja1.decorar());
        System.out.println(caja1.obtener() + " - " + caja1.obtener().getClass());
        CajaGenerico<Double> caja2 = new CajaGenerico<>(-3.1416);
        System.out.println(caja2.decorar());
        System.out.println(caja2.obtener() + " - " + caja2.obtener().getClass());
        Double[] numeros = { 3.14, Math.E, Math.PI};
        System.out.println(caja2.imprimirMatriz(numeros));
        CajaGenerico<String> caja3 = new CajaGenerico<>("Hola, mundo!");
        System.out.println(caja3.decorar());
        System.out.println(caja3.obtener() + " - " + caja3.obtener().getClass());
        System.out.println(caja3.obtener().charAt(2));
        String[] prueba = {"Manzana", "Pera", "banano"};
        System.out.println(caja3.imprimirMatriz(prueba));
    }
}
