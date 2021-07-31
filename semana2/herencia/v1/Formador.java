package semana2.herencia.v1;

public class Formador extends Persona {
    public int aniosExperiencia;

    public Formador(String nombre, String apellido, long ID) {
        super(nombre, apellido, ID);
    }

    public Formador(String nombre, String apellido, long ID, int anios){
        super(nombre, apellido, ID);
        this.aniosExperiencia = anios;
    }

    public void LevantarLosTacos() {
        System.out.println("Ya tengo electricidad! Ya puedo dar clases!");
    }
}
