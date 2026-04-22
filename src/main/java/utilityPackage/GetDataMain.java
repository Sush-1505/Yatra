package utilityPackage;

import java.io.FileInputStream;
import java.util.Properties;

public class GetDataMain {

			 private static Properties prop;

			 public static String getProperty(String key) {
			        try {
			            if (prop == null) {

			                String path = System.getProperty("user.dir")
			                        + "/src/main/resources/Data.properties";

			                FileInputStream fis = new FileInputStream(path);

			                prop = new Properties();
			                prop.load(fis);
			            }

			        } catch (Exception e) {
			            e.printStackTrace();
			        }

			        return prop.getProperty(key);
			    }}
