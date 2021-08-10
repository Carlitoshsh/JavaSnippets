package semana4.repaso;

import java.util.ArrayList;

public class TipoFuego extends Pokemon{
    
    public TipoFuego(String nombre, long id, String region){
        super(nombre, id, region);
        this.tipo = "fuego";
    }

    @Override
    public ArrayList<String> obtenerAtaques() {
        ataques.add("Lanzallamas");
        ataques.add("Llamarada Moe");
        return ataques;
    }

    @Override
    public String evolucionar() {
        return null;
    }

    @Override
    public String imprimir() {
        return "[" + this.nombre + "]\n\t"+this.region + " - 🔥 " + this.tipo.toUpperCase();
    }
    
}
