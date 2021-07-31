package semana2.herencia.v1;

public class Tutor extends Persona {

    public Tutor(String nombre, String apellido, long ID) {
        super(nombre, apellido, ID);
    }
    
    public static void main(String[] args) {
        Tutor tutor = new Tutor("Andres", "Salas", 23123);
        tutor.horario = "12:30";
    }
}
