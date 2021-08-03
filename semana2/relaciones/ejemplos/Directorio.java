package semana2.relaciones.ejemplos;

import java.util.ArrayList;

public class Directorio {
    ArrayList<Archivo> archivos = new ArrayList<Archivo>();
    ArrayList<Directorio> directorios = new ArrayList<Directorio>();
    static String[] generos = {
        "Reggaeton", "Vallenato", "Salsa", "Merengue", "Trap",
        "Rock", "Pop", "Indie", "Anime", "Folk"
    };
    String nombre;

    public Directorio(String nombre) {
        this.nombre = nombre;
    }

    public void ListarDirectorios() {
        for (Directorio directorio : this.directorios) {
            System.out.println(directorio.nombre);
        }
    }

    public static void main(String[] args) {
        Directorio dir = new Directorio("Musica");

        for (String genero : generos) {
            dir.directorios.add(new Directorio(genero));
        }

        dir.archivos.add(new Archivo("desktop", "ini"));
        
        dir.ListarDirectorios();
    }
}
