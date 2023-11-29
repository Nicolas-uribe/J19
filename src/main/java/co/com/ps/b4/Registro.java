package co.com.ps.b4;
import java.util.Scanner;
public class Registro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cúantas mascotas desea ingresar? ");
        int cantidad = scanner.nextInt(); // Captura de cantidad de mascotas para ingresar
        scanner.nextLine();
        Mascota[] mascotas = new Mascota[cantidad]; // Array para almacenar las mascotas

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el nombre de la mascota " + (i + 1) + ":");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese la edad de la mascota " + (i + 1) + ":");
            int edad = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Ingrese la raza de la mascota " + (i + 1) + ":");
            String raza = scanner.nextLine();

            System.out.println("¿La mascota " + (i + 1) + " está enferma? (true/false):");
            boolean enfermo = scanner.nextBoolean();
            scanner.nextLine();

            mascotas[i] = new Mascota(nombre, edad, raza, enfermo);
        }

        // For para mostrar la información de las mascotas ingresadas
        for (int i = 0; i < cantidad; i++) {
            System.out.println("\nInformación de la mascota " + (i + 1) + ":");
            mascotas[i].mostrarInformacion();
        }

        scanner.close();
    }
}

