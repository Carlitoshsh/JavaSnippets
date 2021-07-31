package semana2.herencia.v2abstract;

public abstract class Persona {
    // atributos
    public String nombre;
    public String apellido;
    public long ID;
    public String horario;
    public short edad;
    public String ciudad;
    public boolean estaEnProyecto;

    public Persona(String nombre, String apellido, long ID) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ID = ID;
    }

    // Metodo abstracto
    public abstract void Saludar();

    public abstract void Despedir(String mensaje);

    // metodo concreto
    public final void Despertar() {
        System.out.println("Despertar!!!");
    }

    public static void CualquierCosa(){
        System.out.println("Cualquier cosa!");
    }
}
