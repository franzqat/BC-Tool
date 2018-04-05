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
import java.io.File;
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
    private final String CONFIG_FILE;
    private final Properties p;

    public Configuration() {
        this.p = new Properties();
        this.CONFIG_FILE = "config.properties";
       // saveConfig();
    }
    
    private void configExists() throws IOException {
        File yourFile = new File(CONFIG_FILE);
        if (!yourFile.exists()) {
           saveConfig();
        }
        //FileOutputStream oFile = new FileOutputStream(yourFile, false);
    }
    
  public Properties loadConfig() {        
        try {
            configExists();
        } catch (IOException ex) {
            Logger.getLogger(Configuration.class.getName()).log(Level.SEVERE, null, ex);
        }
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

 
    public String get(String key) {
        return p.getProperty(key);

    }
    
    
     public void saveConfig(String user) {
        OutputStream output = null;
        
        try {
            
            output = new FileOutputStream("config.properties");
            
            p.setProperty("username", user);
                
            /*
            // set the properties value
            p.setProperty("database", "localhost");
            p.setProperty("dbuser", "mkyong");
            p.setProperty("dbpassword", "password123");
            */
           
            // save properties to project root folder
            p.store(output, null);
            
        } catch (IOException io) {
            System.out.println("File not found");
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                }
            }
            
        }
    }
     public void saveConfig() {
        OutputStream output = null;
        
        try {
            
            output = new FileOutputStream("config.properties");
            
            p.setProperty("username", "default");
            // save properties to project root folder
            p.store(output, null);
            
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
