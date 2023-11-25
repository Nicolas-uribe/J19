package co.com.ps.b4;

import java.util.Date;

public class PersonaMejorada {

    public PersonaMejorada(){

    }

    public PersonaMejorada(String nombre, String tipoDeSangre){
        this.nombre= nombre;
        this.tipoDeSangre= tipoDeSangre;
    }

    public PersonaMejorada(String nombre, short edad, String apellido, float altura, Date fechaNacimiento, String tipoDeSangre, float peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.apellido = apellido;
        this.altura = altura;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoDeSangre = tipoDeSangre;
        this.peso = peso;
    }

    private String nombre;
    private  short edad;
    private  String apellido;
    private float altura;

    private Date fechaNacimiento;

    private  String tipoDeSangre;

    private float peso;

    private String cedula;

    public void correr(){}
    public void caminar(){}
    public void bailar(){}
    public void trotar(){}
    public void pagar(){}

    public String getNombre() {
        return nombre;
    }

    public short getEdad() {
        return edad;
    }

    public String getApellido() {
        return apellido;
    }

    public float getAltura() {
        return altura;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getTipoDeSangre() {
        return tipoDeSangre;
    }

    public float getPeso() {
        return peso;
    }

    public String getCedula() {
        return cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
