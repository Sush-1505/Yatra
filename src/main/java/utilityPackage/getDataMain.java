package utilityPackage;

import java.io.FileInputStream;
import java.util.Properties;

public class getDataMain {

			 private static Properties prop;

		    public static String getProperty(String key) {

		        try {
		            if (prop == null) {
		                FileInputStream fis = new FileInputStream(
		                        "D:\\A new Eclipse Project\\Yatra.com\\src\\main\\resources\\Data.properties");

		                prop = new Properties();
		                prop.load(fis);
		            }

		        } catch (Exception e) {
		            e.printStackTrace();
		        }

		        return prop.getProperty(key);
		    }
}
