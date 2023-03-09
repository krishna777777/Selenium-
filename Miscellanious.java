import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miscellanious {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//maximize window 
		driver.manage().window().maximize();
		driver.get("https://twitter.com/home");
		//delete cookies 
		driver.manage().deleteAllCookies();
		//taking screenshot 
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		//createing a file 
		
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		//storing the file in our Local Machine 
		
		FileUtils.copyFile(SrcFile, new File("C:\\Users\\ksriram\\EG.png"));
		
		

	}

}
