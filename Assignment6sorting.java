package week4.Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment6sorting {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/sorttable.html");
		
		List<WebElement> findElements = driver.findElements(By.xpath("//table[@id='table_id']//tr/td[2]"));
		for (WebElement webElement : findElements) {
			String text = webElement.getText();
			findElements.add(webElement);
			System.out.println(text);
		
			
			
			driver.findElement(By.xpath("//th[text()='Name']")).click();
			
			List<WebElement> compare = driver.findElements(By.xpath("//table[@id='table_id']//tr/td[2]"));
			for (WebElement webElement2 : compare) {
				String text2 = webElement2.getText();
				compare.add(webElement2);
				System.out.println(text2);
				
				
				if(findElements!=compare)
					System.out.println("unmatch");
				else
					System.out.println("match");
//				
			}
			
		}}}
