package co.com.ps.b6;


import java.util.Random;
        import java.util.Scanner;

public class Actividad4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;

        System.out.println("¡Bienvenido al juego!");
        System.out.println("Adivina un número entre 1 y 100.");

        int intentos = 0;
        int intentosMaximos = 10;

        while (intentos < intentosMaximos) {
            System.out.print("Intento #" + (intentos + 1) + ": ");
            int numeroUsuario = scanner.nextInt();

            if (numeroUsuario == numeroAleatorio) {
                System.out.println("¡Felicidades! ¡Adivinaste el número!");
                break;
            } else if (numeroUsuario < numeroAleatorio) {
                System.out.println("Muy por abajo. Intenta de nuevo.");
            } else {
                System.out.println("Muy por arriba. Intenta de nuevo.");
            }

            intentos++;
        }
            System.out.println("¡Lo siento! Has agotado tus 10 intentos. El número era: " + numeroAleatorio);
        
    }
}
