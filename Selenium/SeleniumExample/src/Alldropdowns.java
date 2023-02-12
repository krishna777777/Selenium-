import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Alldropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("krishna");
		driver.findElement(By.cssSelector("input.form-control.ng-untouched.ng-pristine.ng-invalid")).sendKeys("krishna@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("krishna");
		driver.findElement(By.id("exampleCheck1")).click();
		//driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1'] //option[2]")).click();
	WebElement Element =driver.findElement(By.id("exampleFormControlSelect1"));
	Select j = new Select(Element);
	j.selectByVisibleText("Female");
	
		driver.findElement(By.id("inlineRadio2")).click();
		System.out.println(driver.findElement(By.id("inlineRadio3")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//input[@type='radio']")).getSize());
        driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("12-02-2023");
        driver.findElement(By.xpath("//input[@class='btn btn-success']")).click();
        System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
	}

}
