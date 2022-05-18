package demoTestPractice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getAllLinkstext {
	 static WebDriver driver;

	public static void main(String[] args) {
		
	    
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=exzJoArl0h0&list=PLFGoYjJG_fqr84PKCp88iPkQDWJSfzaqz");
		
		//By listoftext = By.xpath("//div[@id='meta']/h4");
		 //System.out.println(getLinksTextList(listoftext)+ "\n");
		
		List<WebElement> ele = driver.findElements(By.xpath("//div[@id='meta']/h4"));
		for(WebElement links: ele) {
			System.out.println(links.getText());
		}
		
	}
	
	
	
	
	public static List<String> getLinksTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleTextList = new ArrayList<String>();
		for (WebElement e : eleList) {
			String text = e.getText();
			if (!text.isEmpty()) {
				eleTextList.add(text);
			}
		}
		return eleTextList;
	}
	
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

}
