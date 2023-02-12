import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver obj = new ChromeDriver ();
		
		obj.get("https://rahulshettyacademy.com/dropdownsPractise/");
		// Getting the web element in a web element with a Variable .
		WebElement dropdown = obj.findElement(By.cssSelector("select#ctl00_mainContent_DropDownListCurrency"));
		//there is a selector class in selenium to handle the select dropdowns so we are creating the object for it 
		// to access its methods . 
		// passing the web element stored in downdown . 
		Select dropdown2 = new Select(dropdown);
		// selecting the usd from the static dopdown 
		dropdown2.selectByIndex(3);
		//first selected option means by default we are selecting the USD so it extracts the value present in the USD . 
		System.out.println(dropdown2.getFirstSelectedOption().getText());
		// the dropdown value of INR is matched and the INR dropdown is selected . 
		dropdown2.selectByVisibleText("AED");
		// selecting a text based upon the value present in the attribute . 
		dropdown2.selectByValue("INR");
		
		
		
		
	}

}
