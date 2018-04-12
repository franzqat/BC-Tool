
package clock;
import java.awt.TextField;
import java.util.Calendar;
import java.util.Properties;
import java.time.*;
import java.time.temporal.Temporal;
import java.util.TimeZone;
import javax.swing.JTextField;
/**
 * @author Francesco
 */

//Classe fittizia che mi serve per capire come prendere e salvare impostazioni da file
public class TestingConfiguration {


    public static void main(String[] args) {
     
        WindowMaker window = new WindowMaker();
        
        System.out.println(
                "IDOC: " + window.idocWindow());;
        System.out.println(window.greatlyWindow());
        System.out.println(window.getDay());
        
        
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
    }
}
