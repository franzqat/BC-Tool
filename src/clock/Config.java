package clock;
import java.util.Properties;

/**
 * @author Francesco
 */
public class Config {

    public static void main(String[] args) {

        Properties prop = new Properties();
        String user = "";

        Configuration conf = new Configuration();
        Configuration.saveConfig(prop, user);
        conf.loadConfig();
        System.out.println(conf.get("dbpassword"));

    }
}
