package semana4.repaso;

import java.util.ArrayList;

public class TipoAgua extends Pokemon {

    public TipoAgua(String nombre, long id, String region){
        super(nombre, id, region);
        this.tipo = "agua";
    }

    public ArrayList<String> obtenerAtaques(){
        ataques.add("Chorro de agua");
        ataques.add("Hidrobomba");
        ataques.add("Burbujas");
        return ataques;
    }

    public String evolucionar(){
        return null;
    }

    // toString
    public String imprimir(){
        return "[" + this.nombre + "]\n\t"+this.region + " - 💧 " + this.tipo.toUpperCase();
    }
}
