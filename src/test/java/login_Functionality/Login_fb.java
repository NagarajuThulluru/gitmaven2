package login_Functionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_fb {
	WebDriver driver;

	public void open_Browser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://fb.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
		System.out.println("open fb page successfully");

	}

	public static void main(String[] args) throws InterruptedException {

		Login_fb lo = new Login_fb();
		lo.open_Browser();

	}

}
