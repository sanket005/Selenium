package sanket;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class File2 {

	public static void main(String[] args) {
		Properties prp=new Properties();
try {
	
	FileInputStream fis1=new FileInputStream("E:\\sandip\\work\\JavaBasics\\src\\file1.properties");
	prp.load(fis1);
}

catch(IOException e){
	
}

System.out.println(prp.getProperty("username"));
System.out.println(prp.getProperty("Password"));
	}
	
}
