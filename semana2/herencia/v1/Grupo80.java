package semana2.herencia.v1;

public class Grupo80 {

    public static void QuienEsMayor(Tripulante[] tripulantes) {
        String nombre = tripulantes[0].nombre;
        short edad = tripulantes[0].edad;
        for (int i = 1; i < tripulantes.length; i++) {
            if (edad < tripulantes[i].edad) {
                edad = tripulantes[i].edad;
                nombre = tripulantes[i].nombre;
            }
        }
        System.out.println(nombre + " es el mayor, tiene " + edad);
    }

    public static void main(String[] args) {
        Tripulante tripulante = new Tripulante("Jonathan", "Gomez", 78123456);
        tripulante.ciudad = "Bogota";
        tripulante.estaEnProyecto = true;
        tripulante.Saludar();
        tripulante.edad = 25;
        // System.out.println(tripulante.toString());

        Tripulante tripulante2 = new Tripulante("Andres", "Pedraza", 3456789);
        tripulante2.estaEnProyecto = false;
        tripulante2.edad = 19;
        // System.out.println(tripulante2.toString());

        Tripulante tripulante3 = new Tripulante("Laura", "Diaz", 999999);
        tripulante3.estaEnProyecto = true;
        tripulante3.ciudad = "Floridablanca";
        tripulante3.ValidarAsistencia();
        tripulante3.edad = 26;
        // System.out.println(tripulante3.toString());

        Tripulante tripulante4 = new Tripulante("Luis", "Velasco", 999999);
        tripulante4.estaEnProyecto = true;
        tripulante4.ciudad = "Bogota";
        tripulante4.ValidarAsistencia();
        tripulante4.edad = 21;
        System.out.println(tripulante4.toString());
        tripulante.Despedir();

        // tripulante3.QuienEsMayor(tripulante4);

        Tripulante[] tripulantes = { tripulante, tripulante2, tripulante3, tripulante4 };
        QuienEsMayor(tripulantes);

        Formador formador = new Formador("Carlos", "Gomez", 23458);
        formador.estaEnProyecto = true;
        formador.ciudad = "Bogota";
        // System.out.println(formador.toString());
        // formador.PedirTickets();
        // formador.LevantarLosTacos();

        Formador formador2 = new Formador("Manuel", "Zambrano", 23458, 3);
        formador2.estaEnProyecto = true;
        formador2.ciudad = "Bogota";
        System.out.println(formador2.toString());
        formador2.Despedir();
    }
}
