package semana4.repaso;

import java.util.ArrayList;

public abstract class Pokemon {
    // atributos
    public String nombre;
    public String tipo;
    public long id;
    public String region;
    public String evolucion;
    public ArrayList<String> ataques = new ArrayList<>();

    public Pokemon(String nombre, long id, String region){
        this.nombre = nombre;
        this.id = id;
        this.region = region;
    }

    // metodos
    public abstract ArrayList<String> obtenerAtaques();

    public String salirPokebola(){
        return "Sal de tu pokebola, " + this.nombre + "!";
    }

    public abstract String evolucionar();
    public abstract String imprimir();
}
