package config;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
  Properties prop;

  public ConfigReader() {
    try {
      FileInputStream fis = new FileInputStream("src/resources/config.properties");
      prop = new Properties();
      prop.load(fis);
    } catch (Exception e) {
      System.out.println("Error:: \n");
      e.printStackTrace();
    }
  }

  public String getProperty(String key) {
    return prop.getProperty(key);
  }
}
