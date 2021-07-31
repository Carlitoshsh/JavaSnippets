package semana2.clasejuevesdos;

public class Formador {
    // atributos
    public String nombre;
    public String apellido;
    public long ID;
    public String horario;
    public short edad;
    public String ciudad;
    public boolean estaEnProyecto;

    public Formador(String nombre, String apellido, long ID) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ID = ID;
    }

    // metodos
    public void Saludar() {
        System.out.println("Buenas noches!");
    }

    public void PedirTickets() {
        System.out.println("Este es un mensaje a Mesa de ayuda!");
    }

    public void LevantarLosTacos() {
        System.out.println("Ya tengo electricidad! Ya puedo dar clases!");
    }

    public String toString() {
        return this.nombre + " " + this.apellido + ", de la ciudad de " + this.ciudad + " con numero de identificacion "
                + this.ID + (this.estaEnProyecto ? " y esta en el proyecto" : " el cual se retiro del proyecto");
    }
}
