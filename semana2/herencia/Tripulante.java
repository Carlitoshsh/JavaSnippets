package semana2.herencia;

public class Tripulante extends Persona {

    public Tripulante(String nombre, String apellido, long ID) {
        super(nombre, apellido, ID);
    }

    // metodos
    public void ValidarAsistencia() {
        System.out.println("Reporto mi asistencia");
    }

    public void QuienEsMayor(Tripulante tripulante) {
        if (tripulante.edad > this.edad) {
            System.out.println(tripulante.nombre + " es mayor");
        } else {
            System.out.println(this.nombre + " es mayor");
        }
    }

}
