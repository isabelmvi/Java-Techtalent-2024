import java.util.Date;
import java.text.SimpleDateFormat;

public class dateT05 {

    public static void main(String[] args) {

        Date fecha = new Date(); 
        SimpleDateFormat formatoHora= new SimpleDateFormat("HH");
        int HoraDia = Integer.parseInt(formatoHora.format(fecha));

        String saludo;

    switch(HoraDia) {
            case 9: 
            saludo= "Buenos días"; 
            break; 
            case 10: 
            saludo ="Buenas tardes"; 
            break;
            default: 
            saludo= "No es la hora";
    }
    System.out.println(saludo);
    }

}