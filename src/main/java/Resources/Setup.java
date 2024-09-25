package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Setup {
	public WebDriver driver;
	public String browserName;
	public Properties prop;
	public String DestinationPath;

	@SuppressWarnings("deprecation")
	public WebDriver browserLaunch() {
		try {
			System.out.println("Start");
			FileInputStream fis = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\main\\java\\Resources\\Datafile.properties");
			 prop = new Properties();
			prop.load(fis);
			browserName = prop.getProperty("BrowserName");
		} catch (Throwable e) {
			e.printStackTrace();
		}

		switch (browserName) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}
	public String takeScreenshot(String testname, WebDriver driver) {
		try {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File SSfile=ts.getScreenshotAs(OutputType.FILE);
		 DestinationPath=System.getProperty("user.dir")+"\\ScreenshotFolder\\"+testname+".png";
		File DestinationFile=new File(DestinationPath);
		FileUtils.copyFile(SSfile, DestinationFile);
	
		}catch(Exception e) {
			
		}
		return DestinationPath;
		
}
	
}
