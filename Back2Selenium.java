import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Back2Selenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver  driver = new ChromeDriver();
		String s= "krishna";
		String t="sriram";
		String r="ram@gamil.com";
		String m="12345";
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		//driver.wait(5000);
		driver.findElement(By.id("inputUsername")).sendKeys(s);
		driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys(t);
        driver.findElement(By.name("chkboxOne")).click();
        driver.findElement(By.name("chkboxTwo")).click();
        driver.findElement(By.cssSelector("button.signInBtn")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        
       String x= driver.findElement(By.cssSelector("p.error")).getText();
        
        System.out.println(x);
        
        driver.findElement(By.linkText("Forgot your password?")).click();
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(s);
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(r);
        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys(m);
        Thread.sleep(3000);
        driver.findElement(By.className("reset-pwd-btn")).click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        //Thread.sleep(3000);
        String z= driver.findElement(By.cssSelector("p.infoMsg")).getText();
		String split []= z.split("'");
		String o= split[1];
		System.out.println(split[1]);
		
		driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys(s);
		driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys(o);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"chkboxOne\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"chkboxTwo\"]")).click();
		driver.findElement(By.cssSelector("button.submit")).click();
	String e=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/p")).getText();
		
       System.out.println(e); 
		

	}

}
