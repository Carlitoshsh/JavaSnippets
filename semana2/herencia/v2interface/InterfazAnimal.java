package semana2.herencia.v2interface;

import semana2.herencia.v1.Formador;

public interface InterfazAnimal {
    public final long ID = 32443;

    public String SonidoAnimal();
    public String Dormir();
    public String Comer();
    public String IrAlBanio(int tipoNecesidad);
    public Formador CrearFormador();
}
