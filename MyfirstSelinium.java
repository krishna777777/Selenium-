import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyfirstSelinium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Invoking the Browser 
		/* Chrome driver is a driver class which is used to access the chrome related 
		 * driver things . the chrome driver communicates with the chrome browser . 
		 * we need to invoke it and create the object of the class .
		 */
		
		//Invoking the chrome Browser 
		/* selenium will internally look for the path webdriver.chrome.driver and 
		 * give the chromedriver path as well .
		 */
		System.setProperty("webdriver.chrome.driver", "/ChromeDriver/chromedriver.exe");
		//web driver interface to execute the methods of the interface 
		//selenium.dev/selenium/docs/api/java/org/openqa/selenium/WebDriver.html --moreinfo
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/WebDriver.html");
		driver.get("https://qualysguard.p01.eng.sjc01.qualys.com/portal-front/home/");
		// In the abvove we are creating the object for the chrome driver class and 
		//we can import the methods of the class . for fixfox and other browser 
		// simply change the class name and object name that should be good . 
		
        /* we also need to import the web driver interface 
         * the interface does all the things the inteface asks the methods to do all the 
         * tasks . 
         */
		
		/* we write the webdriver object instead of chromedriver like above because 
		 * what happens is if we give this 
		 * ChromeDriver driver = new ChromeDriver(); --
		 * it will consider the chromedriver methods only 
		 * and if we want to execute the same script in firefox and all it will not work 
		 * so by stating 
		 * 
		 * WebDriver driver = new ChromeDriver();
		 * 
		 * we can make it understand to execute the web driver methods 
		 * 
		 */
		
		
		
	}

}
