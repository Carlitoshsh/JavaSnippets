package semana2.herencia.v2interface;

public class Animal {
    // atributos
    public String nombre;
    public String familia;
    private int maxAnios;

    public int getMaxAnios(){
        return this.maxAnios;
    }

    public void setMaxAnios(int aniosMaximo){
        this.maxAnios = aniosMaximo;
    }

    // metodo
    public void Vivir(){
        System.out.println("Protege el planeta!");
    }
}
