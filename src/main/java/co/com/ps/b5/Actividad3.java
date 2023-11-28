package co.com.ps.b5;


import java.util.Scanner;

// decidir si un numero es negativo positivo o 0, clacular los 10 primero pares
// Adional, dar un limite mayor y menor y encontrar los numero primos
import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ejercicio 1: Determinar si un número es positivo o negativo
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        // Ejercicio 2: Calcular los 10 primeros números pares en un rango
        System.out.print("Ingrese el límite inferior del rango: ");
        int limiteInferior = scanner.nextInt();
        System.out.print("Ingrese el límite superior del rango: ");
        int limiteSuperior = scanner.nextInt();

        System.out.println("Los 10 primeros números pares en el rango son:");
        int contadorPares = 0;
        for (int i = limiteInferior; i <= limiteSuperior && contadorPares < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                contadorPares++;
            }
        }

        // Ejercicio 3: Encontrar números primos en un rango
        System.out.print("Ingrese el límite inferior del rango para números primos: ");
        int limiteInferiorPrimos = scanner.nextInt();
        System.out.print("Ingrese el límite superior del rango para números primos: ");
        int limiteSuperiorPrimos = scanner.nextInt();

        System.out.println("Los números primos en el rango son:");
        for (int i = limiteInferiorPrimos; i <= limiteSuperiorPrimos; i++) {
            if (esPrimo(i)) {
                System.out.println(i);
            }
        }

        scanner.close();
    }

    // Método para verificar si un número es primo
    private static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
