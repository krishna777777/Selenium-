import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException  {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		////a[contains(text(),'SoapUI')]
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
List<WebElement> links = driver.findElements(By.xpath("//li[@class='gf-li']//a"));

// importing soft assertion to loop through remaing existing elements 

SoftAssert a = new SoftAssert();


for (WebElement link :links) {
	String url =link.getAttribute("href");

	//Already a Predefined URL Class in java 

	                 // open connection method is used so to access the open
	// creation method the method is present in URL call creating object of URL Class to 
	//access the open connection method .


	HttpURLConnection  obj = (HttpURLConnection)new URL(url).openConnection();

	/* The HEAD method asks for a response identical to that of a GET request, 
	 * but without the response body. This is useful for retrieving meta-information 
	 * written in response headers, without having to transport the entire content
	 * 
	 */


	obj.setRequestMethod("HEAD");
	obj.connect();
	//get the response code 

	int responsecode = obj.getResponseCode();

	System.out.println(responsecode);
	// it won't fail as soon as the error is encountered it will store the failure  
	
	a.assertTrue(responsecode<400, "the link with broken code is"+link.getText()+"with broken code"+responsecode);
	
	
	}

// store the failured results and conditions if the failures are present this condition 
// will fail 
a.assertAll();
	
}
		
		
		



	}


