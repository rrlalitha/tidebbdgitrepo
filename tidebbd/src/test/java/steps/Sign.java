package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Sign {

	WebDriver driver=null;
	@When("user click on signup page")
	public void user_click_on_signup_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M1088031\\Downloads\\tidebbd\\tidebbd\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://tide.com/en-us");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	}

	@And("enter inforamtion")
	public void enter_inforamtion() throws InterruptedException {
driver.findElement(By.xpath("//button[@class='sticker_close']")).click();
		
	}

	@Then("user is navigated to next page")
	public void user_is_navigated_to_next_page() throws InterruptedException {
		driver.findElement(By.xpath("//span[@class='login-register']")).click();
		driver.findElement(By.xpath("//a[@class='event_internal_link']")).click();
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("kameswari");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Kameswari@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345");
		
		driver.findElement(By.xpath("//input[@value='CREATE ACCOUNT']")).click();		
	    
	}
}
