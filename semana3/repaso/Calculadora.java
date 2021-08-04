package semana3.repaso;

public class Calculadora implements IConstantes, IOperaciones {

    @Override
    public double suma(double[] nums) {
        double suma = 0;
        for (double num: nums){
            suma += num;
        }
        return suma;
    }

    public double resta(double num1, double num2){
        return num1 - num2;
    }

    @Override
    public double resta(double[] nums){
        double resta = 0;
        for (double num: nums){
            resta -= num;
        }
        return resta;
    }

    @Override
    public double multiplicacion(double[] nums) {
        double multiplicacion = 1;
        for (double num: nums){
            multiplicacion *= num;
        }
        return multiplicacion;
    }

    @Override
    public double division(double num1, double num2) {
        try {
            return num1/num2;
        } catch (Exception e) {
            System.out.println("No se puede dividir por cero");
            return 0;
        }
    }

    public static void ImprimirResultado(double resultado){
        System.out.println("El resultado de la operación es "+resultado);
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        ImprimirResultado(calc.division(12, 4));
        double[] numeros = { 2, 3, 4, 7, 8};
        ImprimirResultado(calc.suma(numeros));
        ImprimirResultado(calc.resta(numeros));
        ImprimirResultado(calc.resta(12, 4));
        ImprimirResultado(calc.multiplicacion(numeros));
        ImprimirResultado(IConstantes.PI);
        ImprimirResultado(PI);
        ImprimirResultado(e);
        ImprimirResultado(Math.PI);
    }
}
