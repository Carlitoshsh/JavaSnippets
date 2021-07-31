package semana2.herencia.v2interface;

public interface InterfazDos {
    public String CualquierCosa();

    default void CualquierCosaDos() {
        System.out.println("Esta es la interfaz dos");
    }
}
