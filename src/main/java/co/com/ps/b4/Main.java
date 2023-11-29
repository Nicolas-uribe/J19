package co.com.ps.b4;

public class Main {
    public static void main(String[] args) {
        Mascota[] miMascota = new Mascota[3];
        miMascota[0] = new Mascota("TARA", 7, "Criolla", true );
        miMascota[1] = new Mascota("BONNIE", 4, "Fox terrier", false);
        miMascota[2] = new Mascota("CANELA", 3, "Pincher", false );
        for (int i = 0; i < 3; i++) {
            System.out.println("\nInformación de la mascota " + (i + 1) + ":");
            miMascota[i].mostrarInformacion();
        }
    }
}
