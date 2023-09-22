package sample;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class login {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\sample\\chromedriver.exe");    
		WebDriver driver = new ChromeDriver(); 
		  driver.get("https://www.hyrtutorials.com/p/basic-controls.html");  
		  Thread.sleep(3000);
		System.out.println("I am good boy");
		 driver.findElement(By.id("firstName")).sendKeys("achyu");
		 Thread.sleep(3000);
		 driver.findElement(By.id("lastName")).sendKeys("v");
		 Thread.sleep(3000);
		  driver.findElement(By.id("femalerb")).click();
		  Thread.sleep(3000);
		 driver.findElement(By.id("englishchbx")).click();
		 driver.findElement(By.id("email")).sendKeys("abc@gmail.com"); 
		 Thread.sleep(3000);
		 driver.findElement(By.id("password")).sendKeys("12345");
		 Thread.sleep(3000);
		  driver.findElement(By.id("clearbtn")).click();
		 Thread.sleep(3000);
		 List<WebElement> contact=new ArrayList<WebElement>();  
		contact=driver.findElements(By.xpath("//a[text()='Contact']"));
		System.out.println("size of contact is"+contact.size());
		 Thread.sleep(3000);
		 System.out.println( contact.get(1).getText());
		 contact.get(1).click();
		 driver.quit();
		 
		 
		 
	}

}
