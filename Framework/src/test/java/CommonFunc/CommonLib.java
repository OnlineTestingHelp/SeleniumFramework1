package CommonFunc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CommonLib {
	
	Properties p = null;
	
	public void LoadPropertyFile() throws IOException {
		File f = new File("./config/conf.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}
	
	public String readPropertyValue(String property) {
		return p.getProperty(property);
	}
}
