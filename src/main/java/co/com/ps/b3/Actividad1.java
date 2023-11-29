package co.com.ps.b3;

import org.json.JSONObject;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

// llenar el listado de tipos de datos
public class Actividad1 {

    public static void main(String[] args) {
        /* Tipos primitivos
                Los tipos primitivos son los bloques fundamentales de datos en Java.
                Representan valores simples y directos, sin métodos asociados.
                Incluyen tipos como int, long, float, double, char, byte, short, y boolean.
                Los valores de los tipos primitivos se almacenan directamente en memoria y ocupan un espacio fijo.
         */
        int val1 = -2147483648;         // int: -2,147,483,648 a 2,147,483,647
        long val3 = 9223372036854775807L;  // long: -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
        float val7 = 3.14f;         // float: Aproximadamente ±3.40282347E+38F
        double val2 = 3.141592;     // double: Aproximadamente ±1.79769313486231570E+308
        char val4 = 'A';            // char: 0 a 65535 (representa caracteres Unicode)
        byte val5 = 127;            // byte: -128 a 127
        short val6 = 32767;         // short: -32,768 a 32,767
        boolean val8 = true;        // boolean: true o false

        /* Wrappers
            Los wrappers son clases que encapsulan los tipos primitivos.
            Proporcionan métodos y funcionalidades adicionales que no están disponibles en los tipos primitivos.
            Permiten utilizar tipos primitivos donde se requieren objetos, ya que los objetos son más flexibles en términos de manipulación y operaciones.
            Ejemplos de wrappers son Integer para int, Long para long, Float para float, etc.
            Se utilizan comúnmente cuando se trabaja con estructuras de datos basadas en objetos, como colecciones y API de Java.
        */
        Integer w1 = 11;            // int: -2,147,483,648 a 2,147,483,647
        Long w2 = 9223372036854775807L; // long: -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
        Float w3 = 3.14f;           // float: Aproximadamente ±3.40282347E+38F
        Double w4 = 3.141592;       // double: Aproximadamente ±1.79769313486231570E+308
        Character w5 = 'A';         // char: 0 a 65535 (representa caracteres Unicode)
        Byte w6 = 127;              // byte: -128 a 127
        Short w7 = 32767;           // short: -32,768 a 32,767
        Boolean w8 = true;          // boolean: true o false
        String w9 = "Hola mundo";   // String: Secuencia de caracteres Unicode




        //convertir un entero en un String
        String telefono=w1.toString();

        //Objetos Utiles



        Date fecha;
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 1988);
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        fecha = cal.getTime();

        JSONObject jo = new JSONObject();
        BigDecimal moneda = new BigDecimal(10);
    }
}
