/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Francesco
 */
public class Configuration {
    private final String CONFIG_FILE = "config.properties";
    private final Properties p = new Properties();
    
    
  public Properties loadConfig() {
  
        //String path = "./" + CONFIG_FILE;
        //String path = "F:\\Programmazione\\Clock\\dist\\";           
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(CONFIG_FILE);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Configuration.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader in = new BufferedReader(new InputStreamReader(fis));
        try {
            p.load(fis);
        } catch (IOException ex) {
            Logger.getLogger(Configuration.class.getName()).log(Level.SEVERE, null, ex);
        }

        return p;
  }

 
    public java.lang.String get(String key) {
        String toret = "";
        toret = p.getProperty(key);
        return toret;
    }
    
    
     public static void saveConfig(Properties prop, String user) {
        OutputStream output = null;
        
        try {
            
            output = new FileOutputStream("config.properties");
           /*
            // set the properties value
            prop.setProperty("database", "localhost");
            prop.setProperty("dbuser", "mkyong");
            prop.setProperty("dbpassword", "password123");
            */
           
            // save properties to project root folder
            prop.store(output, null);
            
        } catch (IOException io) {
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                }
            }
            
        }
    }
}
