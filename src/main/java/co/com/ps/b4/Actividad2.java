package co.com.ps.b4;

//Crear objeto mascota con minimo 3 atributos y su constructor, y llamarlo desde un metodo main y llenarlo


public class Actividad2 {
    // Atributos de la clase
    private String nombre;
    private int edad;
    private String tipo;

    // Constructor
    public Actividad2(String nombre, int edad, String tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
    }

    // Método para obtener información de la actividad
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Tipo: " + tipo);
    }

    public static void main(String[] args) {
        // Crear una instancia de la clase Actividad2 y llenarla con información
        Actividad2 miActividad = new Actividad2("Correr", 3, "Deportiva");

        // Llamar al método para mostrar información de la actividad
        miActividad.mostrarInformacion();
    }
}
