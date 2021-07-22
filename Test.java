import java.util.Scanner;

class Test {

    /*
    def area_circulo(radio, potencia):
        area = pi*(radio ** potencia)
        return area
    */

    static double area_circulo(double radio, double potencia){
        double area = Math.PI*(Math.pow(radio, potencia));
        return area;
    }


    static double area_rectangulo(double largo, double ancho){
        return largo*ancho;
    }

    static double Cuadrado(double num, double exponente){
        double resultado = Math.pow(num, exponente);
        return resultado;
    }

    public static void Saludar(){
        System.out.println("Hola a grupo 80!");
    }

    public static void DemostracionFunciones() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba largo?");
        double largo = sc.nextDouble();
        System.out.println("Escriba ancho?");
        double ancho = sc.nextDouble();
        sc.close();
        System.out.println(area_rectangulo(largo, ancho));
        // print(area_circulo(radio = 4, potencia = 3))
        double circulo = area_circulo(4, 3);
        System.out.println(String.format("Area Circulo %.3f", circulo));
    }

    /*
    def precio_total(n, precio):
        if 5 <= n < 10 :
            total = n*precio * 0.95
        elif n >= 10 and n < 20:
            total = n*precio * 0.9
        elif n >= 20:
            total = n*precio * 0.8
        else:
            total = n*precio
        return total
    */

    public static double precio_total(int n, double precio){
        double total = 0.0;
        if (5 <= n && n < 10) {
            total = n*precio * 0.95;
        } else if (n >= 10 && n < 20)
            total = n*precio * 0.9;
        else if (n >= 20)
            total = n*precio * 0.8;
        else
            total = n*precio;
        return total;
    }

    public static void DemostracionCondicionales() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un nombre");
        String nombre = sc.nextLine();
        if (nombre.contains("S") || nombre.contains("s")) {
            System.out.println("El nombre contiene la S");
            System.out.println("Es otro mensaje");
        } else if(nombre.contains("e")){
            System.out.println("nombre contiene la e");
        } else {
            System.out.println("El nombre no contiene la S");
        }

        String mensaje = nombre.contains("a") ? "Nombre contiene a" : "Nombre no contiene a";
        System.out.println(mensaje);
        System.out.println(precio_total(4, 1000));
        sc.close();
    }

    public static void main(String[] args){
        Saludar();
        // DemostracionFunciones();
        DemostracionCondicionales();
    }
}