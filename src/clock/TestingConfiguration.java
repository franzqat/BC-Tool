package clock;

import java.awt.TextField;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.util.Date;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import org.joda.time.format.DateTimeFormat;

/**
 * @author Francesco
 */

//Classe fittizia che mi serve per capire come prendere e salvare impostazioni da file
public class TestingConfiguration {

    public static void main(String[] args) {

        /*  
        JTextField field = new JTextField();
        field.setUI(new HintTextFieldUI("Search", true));
    
      
        String fascia;
       TimeZone tz1 = TimeZone.getTimeZone("US/Eastern");
        Calendar est = Calendar.getInstance(tz1); // Calendar.getInstance();
        int h = est.get(Calendar.HOUR_OF_DAY) + 6;

        int m = 5; //est.get(Calendar.MINUTE);
        String minuti;
        if (m < 10) {
            minuti = "0" + m;
        } else {
            minuti = Integer.toString(m);
        }   

        
        String sssdsdd = "" + h + minuti;
        System.out.println(sssdsdd);          
        
       /*
        Properties prop = new Properties();
        String user = "";

       Configuration config = new Configuration();
       
       //se loadconfig mi da eccezione -> saveconfig default, else load
       // config.saveConfig();

        config.loadConfig();
     
        System.out.println(config.loadConfig().get("username").toString());
         */
 /*  System.out.println(
                "IDOC: " + window.idocWindow());;
        System.out.println(window.greatlyWindow());
        System.out.println(window.getDay());
         */
        Calendar cal = convertTextToTime();

        WindowMaker window = new WindowMaker(cal);

        System.out.println("IDOC: " + window.idocWindow()
        );

        System.out.println("GW: " + window.greatlyWindow());
    }

    private static Calendar convertTextToTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:m");

        LocalDate date = LocalDate.now();

        String tempo = "15:5";
        LocalTime time = LocalTime.parse(tempo, formatter);

        Calendar c = Calendar.getInstance();

        c.set(Calendar.HOUR_OF_DAY, time.getHour());
        c.set(Calendar.MINUTE, time.getMinute());

        System.out.println(time.toString());

        return c;

    }

}

