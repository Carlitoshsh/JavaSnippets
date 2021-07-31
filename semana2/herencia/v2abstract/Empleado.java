package semana2.herencia.v2abstract;

public class Empleado extends Persona {
    public String indiceCumplimiento;

    public Empleado(String nombre, String apellido, long ID) {
        super(nombre, apellido, ID);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void Saludar() {
        System.out.println("Hola estudiantes!");
    }

    // No se puede crear metodo Despertar
    // porque es un metodo final (esta sellado) en Persona
    // public void Despertar(){
    //     NO ES POSIBLE
    // }

    // Polimorfismo dinamico del metodo Despedir
    // Sobreescribe la implementacion del metodo que esta en Padre
    @Override
    public void Despedir(String mensaje){
        System.out.println("Ole, echamos billar? "+mensaje);
    }
}
