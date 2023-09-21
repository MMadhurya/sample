package sample;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;


public class LOGIN1 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.crome.driver","C:\\Users\\HP\\eclipse-workspace\\sample\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.verizon.com/");
		driver.manage().window().maximize();
		Thread.sleep(100000);
		List<WebElement> search=new ArrayList<WebElement>();
		search=driver.findElements(By.xpath("//button[@aria-label='Search Verizon']"));
		System.out.println("size of search is:"+search.size());
		System.out.println(search.get(4).getText());
		search.get(4).click();
	}

}
