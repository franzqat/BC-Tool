/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.util.Properties;


/**
 *
 * @author Francesco
 */
public class Configuration {
    private static final String CONFIG_FILE = "config.properties";
    private java.util.Properties p;
    private final String DEFAULT_PROPERTIES_FILE = "application.properties";
    private String path = "/src/Clock" + DEFAULT_PROPERTIES_FILE ;
 /*   public static Properties loadConfig() throws FileNotFoundException, IOException, URISyntaxException {
        //String path = "./" + CONFIG_FILE;
        String path = "F:\\Programmazione\\Clock\\dist\\";           
        FileInputStream fis = new FileInputStream(path);
        BufferedReader in = new BufferedReader(new InputStreamReader(fis));
        Properties properties = new Properties();
        properties.load(fis);

        return properties;
    }*/

        public Configuration() throws Exception {
        p = new java.util.Properties();
        p.load(Thread.currentThread().getContextClassLoader().getResourceAsStream(DEFAULT_PROPERTIES_FILE));
    }

    public Configuration(String propertiesFile) throws Exception {
        p = new java.util.Properties();
        p.load(Thread.currentThread().getContextClassLoader().getResourceAsStream(propertiesFile));
    }

    public java.lang.String get(String key) {
        String toret = "";
        toret = p.getProperty(key);
        return toret;
    }
    
    /*
    public static void main(String[] args) throws IOException, FileNotFoundException, URISyntaxException {
	
//	Properties prop = loadConfig();
       
    
}*/
}
