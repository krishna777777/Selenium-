import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver obj = new ChromeDriver();
		String name="krishna";//using it to give name and also check the assertions 
		
		obj.get("https://rahulshettyacademy.com/locatorspractice/");
		//obj.close();
		obj.findElement(By.id("inputUsername")).sendKeys(name);// want to type krishna 
		//in username field . 
	    obj.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
	    // to get the password 
	    obj.findElement(By.className("signInBtn")).click();
	    obj.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    System.out.println(obj.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/p")).getText());
	    //System.out.println(obj.findElement(By.tagName("p")).getText());
        Assert.assertEquals(obj.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/p")).getText(),"You are successfully logged in.");
        Assert.assertEquals(obj.findElement(By.cssSelector("h2")).getText(),"Hello "+name+",");
        obj.findElement(By.xpath("//button[text()=\"Log Out\"]")).click();
        obj.close();
        
	}

}
