package clases;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        // Instancia de una clase
        Perro perro1 = new Perro("Milu", "Negro");
        System.out.println(perro1.nombre);
        System.out.println(perro1.color);
        // Llamar metodos
        perro1.ladrar();

        Perro perro2 = new Perro("Toby", "blanco");
        System.out.println(perro2.nombre);
        System.out.println(perro2.color);
        // Llamar metodos de la clase
        perro1.ladrar();
        perro1.saludar();

        // Pruebas con constructores
        Perro[] perros = new Perro[] { new Perro(null, "cian", 6, false), new Perro("Sol"),
                new Perro("Ayudante de Santa", "cafe"), new Perro("Sol", "rojo", 0, true),
                new Perro("Sacha", "azul", 5, false), new Perro("Tony", "blanco", 4, true) };

        perros[0].ladrar();
        perros[0].correr();
        perros[5].saludar();

        for (Perro perro : perros) {
            System.out.println("***");
            System.out.println(perro.color);
            if (perro.estado > 3) {
                System.out.println(perro.nombre + " es mas urgente de atencion, Estado: " + perro.estado);
            } else {
                System.out.println(perro.nombre + " esta en buen estado, Estado: " + perro.estado);
            }
        }

    }
}
