import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppingCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> product =driver.findElements(By.cssSelector("h4.product-name"));	
		//String veggis []= {"Cucumber","Brocolli"};
		ArrayList<String> Veggis = new ArrayList<String>();
		Veggis.add("Brocolli - 1 Kg");
		Veggis.add("Cucumber - 1 Kg");
        for (int i=0;i<product.size();i++) {
        	
        	String name = product.get(i).getText();
        	//if(name.equals(veggis))
        	if (Veggis.contains(name)){
        		System.out.println (name);
        		driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
        		
        		
        		
        	}
        	/*if(name.contains("Cucumber")) {
    		System.out.println (name);
    		driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
    		
    		break;*/
        	
        }
	}

}
