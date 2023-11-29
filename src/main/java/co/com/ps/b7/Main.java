package co.com.ps.b7;

public class Main {
    public static void main(String[] args) {
        try {
            double resultado = dividir(10, 2);  // Error: Se debe utilizar la notación estándar de Java para pasar argumentos.
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            System.err.println("Error aritmético: " + e.getMessage());  // Error: Paréntesis incorrectos y error tipográfico en "aritmético".
        }
        System.out.println("Finalizado");
    }

    public static double dividir(int numerador, int denominador) {  // Error: Falta un paréntesis en la declaración del método.
        if (denominador == 0) {
            throw new ArithmeticException("División por cero no permitida");  // Mejora: Agregado control para evitar división por cero.
        }
        return (double) numerador / denominador;  // Mejora: Convertir uno de los operandos a double para obtener el resultado decimal.
    }
}
