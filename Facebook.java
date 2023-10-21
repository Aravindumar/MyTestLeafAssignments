package org.test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		RemoteWebDriver driver = new EdgeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		driver.findElement(By.name("firstname")).sendKeys("Aravind");
		driver.findElement(By.name("lastname")).sendKeys("Kumar");
		driver.findElement(By.xpath("(//input[@aria-label='Mobile number or email address'])")).sendKeys("735259049");
		driver.findElement(By.id("password_step_input")).sendKeys("Aravind@12");
		WebElement day = driver.findElement(By.xpath("(//select[@aria-label='Day'])"));
		Select drpdwn = new Select(day);
		drpdwn.selectByValue("3");
		WebElement month = driver.findElement(By.xpath("(//select[@aria-label='Month'])"));
		Select drpdwn1 = new Select(month);
		drpdwn1.selectByIndex(10);
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select drpdwn2 = new Select(year);
		drpdwn2.selectByVisibleText("1995");
		driver.findElement(By.xpath("(//input[@value=1])")).click();
		
	}

}
