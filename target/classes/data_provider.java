package Resources;

import org.testng.annotations.DataProvider;

public class data_provider {
@DataProvider
public Object[][] getCredentials(){
	Object[][] Credentials= {{"hfgff","gfhfg"},{"Admin","admin123"}};//new Object[2][2];
	
	return Credentials;
}
}
