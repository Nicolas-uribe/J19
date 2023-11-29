package co.com.ps.b4;

public class Mascota {
    private String nombre;
    private int edad;
    private String raza;
    private boolean enfermo;

    // Constructor
    public Mascota(String nombre, int edad, String raza, boolean enfermo) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.enfermo = enfermo;
    }
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Raza: " + raza);
        System.out.println("Esta enfermo: " + enfermo);
    }
}
//



