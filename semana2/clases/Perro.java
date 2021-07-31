package semana2.clases;

public class Perro {
    // atributos (Caracteristicas)
    public String nombre;
    public String color = "No disponible";
    public int estado = 1;
    public boolean rescatado;

    // constructor
    public Perro() {

    }

    public Perro(String nombre) {
        this.nombre = nombre;
    }

    public Perro(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public Perro(String nombre, String color, int estado, boolean rescatado) {
        this.nombre = nombre;
        this.color = color;
        this.estado = estado;
        this.rescatado = rescatado;
    }

    // metodos (Comportamiento)

    // metodos privados
    private void conectarConBaseDeDatos() {
        System.out.println("Estoy guardando en base...");
    }

    // metodos publicos
    public void ladrar() {
        System.out.println("Guau!");
        conectarConBaseDeDatos();
    }

    public void correr() {
        System.out.println("Estoy corriendo");
        conectarConBaseDeDatos();
    }

    public void morder() {
        System.out.println("Estoy mordiendo");
        conectarConBaseDeDatos();
    }

    public void saludar() {
        System.out.println("Hola, mi nombre es " + this.nombre);
    }
}
