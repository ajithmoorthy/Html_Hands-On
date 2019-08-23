package Seleniun.first;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class utest {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver web = new ChromeDriver();
		web.manage().window().maximize();
		// web.get("https://www.orangehrm.com/");
		web.get("file:///C:/Users/ajith.periyasamy/Documents/html/index.html");
		web.findElementByName("firstname").sendKeys("ajith");
		web.findElementByName("lastname").sendKeys("moorthy");
		web.findElementByName("gender").click();
		WebElement w = web.findElementById("dep");
		w.click();
		Select s = new Select(w);
		s.selectByIndex(2);
		web.findElementByName("skill1").click();
		web.findElementByName("message").sendKeys("ahsgdhasdfjdvjhav");
		WebElement w1 = web.findElementById("browsers");
		w.click();
		Select s1 = new Select(w1);
		s.selectByIndex(2);
		web.close();

	}
}
