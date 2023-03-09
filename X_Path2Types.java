package RelativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_Path2Types {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		                //Locators
		//Locators For By.Link Test we have to give Full name
		//WebElement element = driver.findElement(By.linkText("Forgotten password?"));
		 //element.click();
		
		//Locators For By.Partial Link Test we have to half name or [other way type 2 xpath option]
		// WebElement element = driver.findElement(By.partialLinkText("Forgotten password?"));
		 //element.click();
		
		                    //X Path
		
		// Type 1    1. Attribute value and attribute name are present

		             //syntax tagName[@attributeName = 'attribute value']

		//WebElement element1 = driver.findElement(By.xpath("//a[@rel='async']"));
		
		//element1.click();
		
		
		                   //or
		
           WebElement element1 = driver.findElement(By.xpath("//a[@role='button'][3]"));
		
		   element1.click();  
		
		
		
		
		
		
		// Type2     ( In Facebook  Forgotten Password ) 
		
		// If there is no attribute name and attribute value we use text() function
		
		//      SyntaxtagName[text()='text']
		  
		//WebElement element2 = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		
		//element2.click();
		
		
		
		
		 //3 Partial Text - InFacebook For Forgotten Password )Text Function
		
		// If there is no attribute name and attribute value we use text() function
	        // but that text() is more values means we use contains function

			// Syntax tagName[contains(text(),'partial text')]
		   
		   // WebElement element3 = driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]"));
		
		  //   element3.click();
		
		
		
		//4 4. Attribute value and attribute name present but attribute Value is bigger

		//    Syntax tagName[contains(@attributeName,'partial attribute value')]

		
		//WebElement element4 = driver.findElement(By.xpath("//a[contains(@data-testid,'open-registration')]"));
		
		//element4.click();
		   
		   
		
		//5 5. Its applicable for all the above scenarios 

		   //  it contains multiple webelements we pass the index at end

				//tagName[@attributename = 'attributevalue'])[index]
		     
		//WebElement element5 = driver.findElement(By.xpath("//a[@c='8'])[0]"));
		   
		//element5.click();
		
		
		
		
				
		
	}
}
