package co.com.ps.b5;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
       if (numero < 0) {
        System.out.println("El nùmero " + numero + " es: Negativo");
       } else  {
           System.out.println("El nùmero " + numero + " es: Positivo");
       }

    }
}
