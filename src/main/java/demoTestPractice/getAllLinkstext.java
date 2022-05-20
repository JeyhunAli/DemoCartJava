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

	public static void main(String[] args) throws InterruptedException {
		
	    
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.udemy.com/course/100-python-programming-best-practices-for-absolute-beginner/");
		
		//By listoftext = By.xpath("//div[@id='meta']/h4");
		 //System.out.println(getLinksTextList(listoftext)+ "\n");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='panel--content-wrapper--1g5eE']//ul/li//button[@type='button']/span"));
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

}//div/ul/li/button[@type='button']/span
//div[@class='panel--content-wrapper--1g5eE']//ul
