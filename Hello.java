/**
 * Hello
 */
public class Hello {

    // public alt = (int e1, int e2) -> e1 + e2;

    public static int MultiplicarDosNumeros(int ent1, int ent2) {
        return ent1*ent2;
    }

    public static int MultiplicarDosNumeros() {
        return 0;
    }

    public static void main(String[] args) {
        // int a = alt(3, 4);
        int b = MultiplicarDosNumeros(3, 4);
        System.out.println("I love Programming! " + " " + b);
    }
}