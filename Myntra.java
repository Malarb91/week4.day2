package week4.Day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		Thread.sleep(9000);
		
//		2) Mouse hover on MeN 
		WebElement men = driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(men);
		
		
//		3) Click Jackets 
		WebElement jacket = driver.findElement(By.xpath("(//a[text()=\"Jackets\"])[1]"));
		Thread.sleep(4000);
		builder.perform();
		
//		4) Find the total count of item 
	//	driver.findElement(By.xpath("//span[@class='title-count']"));
		
////		5) Validate the sum of categories count matches
//		driver.findElement(By.xpath("(//span[@class='categories-num'])[1]"));
//		driver.findElement(By.xpath("(//span[@class='categories-num'])[2]"));
//		
//		6) Check jackets
		driver.findElement(By.xpath("(//label[@class='common-customCheckbox vertical-filters-label'])[1]")).click();
		
//		7) Click + More option under BRAND
		driver.findElement(By.xpath("//div[@class='brand-more']")).click();
		
//		8) Type Duke and click checkbox
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Duke");
		driver.findElement(By.xpath("(//label[@class=' common-customCheckbox'])[1]")).click();
		//9) Close the pop-up x
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite FilterDirectory-close sprites-remove']")).click();
		
//		10) Confirm all the Coats are of brand Duke
//		    Hint : use List 
//		11) Sort by Better Discount
		WebElement click = driver.findElement(By.xpath("//div[@class='sort-sortBy']"));
		builder.moveToElement(click);
		click.click();
		
//		12) Find the price of first displayed item
		WebElement price = driver.findElement(By.xpath("(//span[@class='product-discountedPrice'])[1]"));
		String price1 = price.getText();
		System.out.println(price1);
		
//		Click on the first product
		driver.findElement(By.xpath("(//div[@class='product-productMetaInfo'])[1]")).click();
	Set<String> win1 = driver.getWindowHandles();
	List<String> win2 = new ArrayList<String>(win1);
	driver.switchTo().window(win2.get(1));
	
	
//		13) Take a screen shot
	
//		14) Click on WishList Now
	driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconWishlist sprites-headerWishlist']")).click();
	
//		15) Close Browser
	driver.close();
	

	}

}
