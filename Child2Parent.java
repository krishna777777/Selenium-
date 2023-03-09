import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child2Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		// we need to switch from parent window to child window
		// for that we need to grab the id's of the parent and the child .

		Set<String> windows = driver.getWindowHandles(); // [parent, child ]
// switching back to the child window 
// we are switching to parent to child in the first place to grab the email id 

		// pulling the ID's from the set
		// iterating through the id

		Iterator<String> set = windows.iterator();
		// storing the parent and child id
		String parentId = set.next();
		String childId = set.next();
		// switching to the desired page
		driver.switchTo().window(childId);
	System.out.println(	driver.findElement(By.cssSelector(".im-para.red")).getText());

	String s = driver.findElement(By.cssSelector(".im-para.red")).getText();
	String[] strArray = null; 
	strArray = s.split("\\s");
	String emailId=null;
	
	for (int i=0;i<strArray.length;i++)
	{
		if (strArray[i].equalsIgnoreCase("mentor@rahulshettyacademy.com")) {
			 emailId = strArray[i];
			
			 //System.out.println(s2);
		}
	}
	System.out.println(emailId);
	
	driver.switchTo().window(parentId);
	driver.findElement(By.id("username")).sendKeys(emailId);
}
	}


