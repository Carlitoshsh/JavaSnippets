package semana2.herencia.v2abstract;

public final class Tripulante extends Persona {
    
    public Tripulante(String nombre, String apellido, long ID){
        super(nombre, apellido, ID);
    }

    public void Saludar(){
        System.out.println("Buenas noches a todos!");
    }

    // Polimorfismo estatico del metodo Despedir
    // Misma funcion, pero diferente implementacion y cantidad de parametros
    public void Despedir() {
        System.out.println("Hasta luego, por defecto!");
        System.out.println(3);
    }

    public void Despedir(String mensaje){
        System.out.println("Hasta luego que descansen. "+mensaje);
    }
}

/**
 * Tripulante es final y no puede tener subclases
 */
// public class Hija extends Tripulante {
    // NO ES POSIBLE
// }



