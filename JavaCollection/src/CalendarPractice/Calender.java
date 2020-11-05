package CalendarPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hamed\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
		driver.get("https://www.path2usa.com/travel-companions");
		
		WebElement travelbox=driver.findElement(By.xpath("//input[@id='travel_date']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver; 
	    js.executeScript("arguments[0].click();", travelbox);	
		
		WebElement month =driver.findElement(By.cssSelector("[class='datepicker-days'][class=datepicker-switch"));
		
		while(!month.getText().contains("December"))
		{
			driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='next'[contains(text(),'')]")).click();
		}
		List<WebElement> dates=driver.findElements(By.className("day"));
		//grab common attribute /put into list and iterate
		int count =driver.findElements(By.className("day")).size();
		
		for(int i=0; i<count; i++)
		{
			String text =driver.findElements(By.className("day")).get(i).getText();
			if (text.equalsIgnoreCase("20")) {
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		}

}
