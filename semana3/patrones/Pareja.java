package semana3.patrones;

public class Pareja<T, A, B> {
    public T cosa1;
    public A llave;
    public B valor;

    public Pareja(T cosa1, A llave, B valor){
        this.cosa1 = cosa1;
        this.llave = llave;
        this.valor = valor;
    }

    public String toString(){
        String valorAImprimir = "";
        if(this.valor instanceof String[]){
            for (String elemento : (String[])this.valor) {
                valorAImprimir += elemento + " ";
            }
        }
        if (valorAImprimir.equals("")) {
            return this.cosa1 + ", "+ this.valor + ", " + this.llave;
        } else {
            return this.cosa1 + ", "+ valorAImprimir + ", " + this.llave;
        }
    }

    public static void main(String[] args) {
        String[] frutas = {"Manzana", "Pera", "Mango", "Banano"};
        Pareja<String, Double, String[]> pareja = new Pareja<>("Carlos", 23.12, frutas);
        int longitudArreglo = pareja.valor.length;
        System.out.println(pareja.toString() + " " + longitudArreglo);
        Pareja<String, Double, Double> pareja2 = new Pareja<>("Carlos", 23.12, Math.PI);
        int longitudArreglo2 = pareja2.valor.intValue();
        System.out.println(pareja2.toString() + " " + longitudArreglo2);
    }
}
