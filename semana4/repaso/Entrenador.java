package semana4.repaso;

import java.util.ArrayList;

public class Entrenador {

    public static void describirAtaques(Pokemon pokemon){
        pokemon.obtenerAtaques();
        System.out.println("\t"+pokemon.ataques);
    }

    public static void imprimirPokemon(ArrayList<Pokemon> pokemon){
        for (Pokemon poke : pokemon) {
            System.out.println(poke.imprimir());
            describirAtaques(poke);
        }
    }

    public static void main(String[] args) {
        ArrayList<Pokemon> pokemon = new ArrayList<>();
        TipoAgua Squirtle = new TipoAgua("Vamo' a calmarnos",9,"Kanto");
        pokemon.add(Squirtle);
        TipoFuego Charmander = new TipoFuego("Charmander", 4, "Kanto");
        TipoFuego Charmeleon = new TipoFuego("Charmeleon", 5, "Kanto");
        pokemon.add(Charmander);
        pokemon.add(Charmeleon);
        imprimirPokemon(pokemon);
    }
}
