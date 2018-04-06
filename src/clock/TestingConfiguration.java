
package clock;
import java.util.Calendar;
import java.util.Properties;
import java.time.*;
import java.util.TimeZone;
/**
 * @author Francesco
 */

//Classe fittizia che mi serve per capire come prendere e salvare impostazioni da file
public class TestingConfiguration {


    public static void main(String[] args) {
        String fascia;
       TimeZone tz1 = TimeZone.getTimeZone("US/Eastern");
        Calendar est = Calendar.getInstance(tz1); // Calendar.getInstance();
        int h = est.get(Calendar.HOUR_OF_DAY);
        int m = est.get(Calendar.MINUTE);
        int ampm = est.get(Calendar.AM_PM);
        if (ampm == 1) //pm
        {
            fascia = "pm";
        } else {
            //am
            fascia = "am";
        }     
        //return  "" + h + m + fascia;
        
        String sssdsdd = "" + h + m + fascia;
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
    }
}
