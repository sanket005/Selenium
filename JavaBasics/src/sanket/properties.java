package sanket;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class properties {
	public static void main(String [] args) {
		System.out.println(getvalue(".\\src\\file1.properties","password"));
	}
	public static String getvalue(String path,String input) {
		Properties p1=new Properties();
		try {
			FileInputStream fis =new FileInputStream(path);
		
			p1.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			
		}
		
		String Res=p1.getProperty(input);
		return Res;
		
	}
}


