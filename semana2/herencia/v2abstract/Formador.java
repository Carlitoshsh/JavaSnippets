package semana2.herencia.v2abstract;

public class Formador extends Empleado {

    public static final double PI = 3.141516;

    public Formador(String nombre, String apellido, long ID) {
        super(nombre, apellido, ID);
    }

    public static void main(String[] args) {
        Formador formador = new Formador("Carlos", "Gomez", 424);
        formador.indiceCumplimiento = "Sobresaliente";
        formador.Saludar();
        formador.Despertar();
        // PI = 43;
        Persona.CualquierCosa();
    }

}
