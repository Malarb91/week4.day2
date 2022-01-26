package week4.Day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		//1.Load the uRL https://www.amazon.in/
		driver.get("https://www.amazon.in/");
		
		//2.search as oneplus 9 pro 
	    WebElement step = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	    step.sendKeys("oneplus 9 pro",Keys.ENTER);
	    Thread.sleep(2000);

	    
	  //3.Get the price of the first product
	     WebElement price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
	     String price1 = price.getText();
	     System.out.println(price1);
	   
	    
	  //4. Print the number of customer ratings for the first displayed product
	   WebElement ratings = driver.findElement(By.xpath("(//i[@class='a-icon a-icon-star-small a-star-small-4-5 aok-align-bottom'])[1]"));
	   String rate = ratings.getText();
	   System.out.println(rate);

	 //5. Mouse Hover on the stars
	
	
	 //6. Get the percentage of ratings for the 5 star.
//	Actions builder = new Actions(driver);
//	builder.moveToElement(ratings);
//	
	 //7. Click the first text link of the first image
	   WebElement first = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
	   Set<String> windowHandles = driver.getWindowHandles();
	   List handles1 = new ArrayList<String>(windowHandles);
	   driver.switchTo().window((String) handles1.get(1));
	   driver.switchTo().window((String) handles1.get(0));
	   
	   
	  // 8. Take a screen shot of the product displayed
	   
	   
	 //9. Click 'Add to Cart' button
	  
	   WebElement cart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
	   String cart1 = cart.getText();
	   System.out.println(cart1);
	   
	 
	 //10. Get the cart subtotal and verify if it is correct.
	WebElement subtotal = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']"));
	String total = subtotal.getText();
	System.out.println(total);


	if(total==cart1)
	{
		System.out.println("verified yes matching");
		}
		else
		{
			System.out.println("verified yes matching");
		}}
	}



		
	



//Assignment:5
//===========
//Amazon:
//1.Load the uRL https://www.amazon.in/

//3.Get the price of the first product
//4. Print the number of customer ratings for the first displayed product
//5. Mouse Hover on the stars
//6. Get the percentage of ratings for the 5 star.
//7. Click the first text link of the first image
//8. Take a screen shot of the product displayed
//9. Click 'Add to Cart' button
//10. Get the cart subtotal and verify if it is correct.