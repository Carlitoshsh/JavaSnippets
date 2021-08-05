package semana3.patrones;

public class CajaAlterna<T> implements ICaja<T> {
    public T object;

    public CajaAlterna(T object){
        this.object = object;
    }

    @Override
    public String decorar() {
        int tamanio_numero = this.object.toString().length();
        String barra = "";
        for (int j = 0; j < tamanio_numero + 2; j++) {
            barra += "=";
        }
        return "\n\t" + barra + "\n\t|" + this.object + "|\n\t" + barra + "\n";
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
}
