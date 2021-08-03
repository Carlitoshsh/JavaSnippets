package semana2.herencia.v2interface;

import semana2.herencia.v1.Formador;

// Una clase solo puede heredar de otra, pero puede implementar multiples
// Inerfaces
public class Gato extends Animal implements InterfazAnimal, InterfazDos {
    public String Dormir(){
        return "Dormir en la cama del duenio";
    }

    public void CualquierCosaDos(){
        // TODO Auto-generated method stub
    }

    @Override
    public String SonidoAnimal() {
        System.out.println(InterfazAnimal.ID);
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String Comer() {
        return "Estoy maullando y comiendo";
    }

    @Override
    public String IrAlBanio(int tipoNecesidad) {
        return "Voy al arenero " + tipoNecesidad;
    }

    @Override
    public Formador CrearFormador() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String CualquierCosa() {
        // TODO Auto-generated method stub
        return null;
    }

    public static void main(String[] args) {
        Gato cat = new Gato();
        cat.setMaxAnios(16);
        cat.nombre = "Carlos";
    }
    
}
