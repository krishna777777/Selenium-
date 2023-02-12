import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// to use the Web driver interface Methods 
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//Importing the chrome driver 
        //System.setProperty("webdriver.chrome.driver","c:/SeleniumDriver/chromedriver");
		//System.getProperty("webdriver.firefox.driver", "C:/SeleniumDriver/geckodriver.exe");
		//System.getProperty("webdriver.edge.driver", "C:/SeleniumDriver/msedgedriver.exe");
		
        
        driver.get("https://www.youtube.com/");
        
        System.out.println(driver.getTitle());// Print the title in the console output 
        
        System.out.println(driver.getCurrentUrl()); // print the correct url in the console 
        
        driver.get("https://www.notion.so/desktop");
        
        driver.quit();
        
       
        
	}

}
