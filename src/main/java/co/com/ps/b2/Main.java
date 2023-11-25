package co.com.ps.b2;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.saludo());
        nombre();
        Main vari= new Main();
        vari.saludo();
    }

    public   String saludo(){
        return "Hola mundo";
    }
    public   String despedida(){
        return "Adios";
    }
    public  static String nombre(){
        return "Cual es tu nombre";
    }
}
