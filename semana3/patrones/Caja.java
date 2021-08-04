package semana3.patrones;

public class Caja {
    public Object object;

    public Caja(Object object) {
        this.object = object;
    }

    // public static decorar(int numero) Solucion alterna
    /**
     * for (int i = 0; i < 3; i ++){ if(i == 1) { System.out.print("*" + numEnCadena
     * + "*"); } else { for(int j = 0; j < tamanio_numero+2; j++){
     * System.out.print("*"); } } System.out.println(); }
     */

    public String decorar() {
        int tamanio_numero = this.object.toString().length();
        String barra = "";
        for (int j = 0; j < tamanio_numero + 2; j++) {
            barra += "*";
        }
        return "\n\t" + barra + "\n\t*" + this.object + "*\n\t" + barra + "\n";
    }

    public Object obtener() {
        return this.object;
    }

    public static void main(String[] args) {
        // System.out.println(decorar(101));
        Caja caja1 = new Caja(101);
        System.out.println(caja1.decorar());
        System.out.println(caja1.obtener() + " - " + caja1.obtener().getClass());
        Caja caja2 = new Caja(-3.1416);
        System.out.println(caja2.decorar());
        System.out.println(caja2.obtener() + " - " + caja2.obtener().getClass());
        Caja caja3 = new Caja("Hola, mundo!");
        System.out.println(caja3.decorar());
        System.out.println(caja3.obtener() + " - " + caja3.obtener().getClass());
        System.out.println(((String)caja3.obtener()).charAt(2));
    }
}
