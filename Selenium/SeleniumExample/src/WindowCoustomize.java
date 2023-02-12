import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowCoustomize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		//run in maximize mode 
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://youtube.com/");
		driver.navigate().back();
		
		

	}

}
