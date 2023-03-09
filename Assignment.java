import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption2")).click();
		String x = driver.findElement(By.xpath("//label[@for='benz']")).getText();
		System.out.println(x);
		Select dropdown = new Select(driver.findElement(By.id("dropdown-class-example")));

		dropdown.selectByVisibleText(x);

		driver.findElement(By.id("name")).sendKeys(x);
		driver.findElement(By.id("alertbtn")).click();
		String y =driver.switchTo().alert().getText();

		 System.out.println(y);
		 
		 if (y.contains("Option2")){
			 System.out.println("no error");
		 }
		 else {
			 System.out.println("error");
		 }
		// ok button click
		driver.switchTo().alert().accept();
		
		
		
		

	}

}
