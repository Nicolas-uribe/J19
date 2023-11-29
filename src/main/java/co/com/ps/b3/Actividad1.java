package co.com.ps.b3;

import org.json.JSONObject;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

// llenar el listado de tipos de datos
public class Actividad1 {

    public static void main(String[] args) {
        int val1=1000000;
        long val3=9223372036854775807L;
        float val7;
        double val2;
        char val4;
        byte val5;
        short val6;
        boolean val8;

        //wrapers
        Integer w1=11;
        Long w2;
        Float w3;
        Double w4;
        Character w5;
        Byte w6;
        Short w7;
        Boolean w8;
        String w9="Hola mundo";

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
