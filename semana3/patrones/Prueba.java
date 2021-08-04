package semana3.patrones;

public class Prueba<T> extends CajaGenerico<T> {
    public Prueba(T obj){
        super(obj);
    }

    public static void main(String[] args) {
        Prueba<Integer> prueba = new Prueba<>(12);
        System.out.println(prueba.decorar());
    }
}
