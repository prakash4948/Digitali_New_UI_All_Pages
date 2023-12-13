package TRIAL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HIVE {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\praka\\Downloads\\edgedriver_win64 (3)\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		// get url

		driver.get("https://api-dev.hivepro.in:10443/artemis/artemis-dev-v2-1/#/app/project/list");

		// maximizw the window
		driver.manage().window().maximize();

		// static wait
		Thread.sleep(1000);
		
		// LOCATING THE WEBELEMENT
				WebElement Email = driver.findElement(By.xpath("//input[@id='login-username']"));
				
				// to highlight the ID
				JavascriptExecutor jse = (JavascriptExecutor) driver;
				jse.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Email);

				Thread.sleep(1000);
				
				Email.clear();
				Email.click();
				
				Thread.sleep(1000);
				Email.sendKeys("hero.test@yopmail.com");
				Thread.sleep(1000);
				
				
				

				// LOCATING THE WEBELEMENT
						WebElement Password = driver.findElement(By.xpath("//input[@id='login-password']"));
						
						// to highlight the ID
						JavascriptExecutor jse11 = (JavascriptExecutor) driver;
						jse11.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Password);

						Thread.sleep(1000);
						
						Password.clear();
						Password.click();
						
						Thread.sleep(1000);
						Password.sendKeys("Hive@Test@1234");
						Thread.sleep(1000);
						
						
						
						// Locating the sign_in
						WebElement Sign_In = driver.findElement(By.xpath("//button[@id='sign-in-button']"));

						Thread.sleep(1000);

						// Highlight the Title

						JavascriptExecutor jse1 = (JavascriptExecutor) driver;
						jse.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Sign_In);

						Thread.sleep(1000);
						
						Sign_In.click();
						Thread.sleep(2000);
						
						
						
				

						// LOCATING THE Assessment
						WebElement Assessment = driver.findElement(By.xpath("//header/app-navigation-content[1]/ul[1]/li[1]/ul[1]/app-navigation-collapse[2]/a[1]/span[2]"));

						Thread.sleep(2000);

						// to highlight the Assessment
						JavascriptExecutor jse12 = (JavascriptExecutor) driver;
						jse12.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Assessment);

						Thread.sleep(2000);
						
						Assessment.click();
						Thread.sleep(1000);
						
		
		

		// LOCATING THE WEBELEMENT
		WebElement ID = driver.findElement(By.xpath("//th[normalize-space()='ID']"));

		Thread.sleep(1000);

		// to highlight the ID
		JavascriptExecutor jse122 = (JavascriptExecutor) driver;
		jse122.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", ID);

		Thread.sleep(1000);

		boolean res = ID.isDisplayed();
		if (res == true) {
			System.out.println("ID is Displayed");
		} else {
			System.out.println("ID is not Displayed");
		}

	//-------------------------------------------------------------------------------------------------		
			
			// Locating the webelment
			WebElement Title = driver.findElement(By.xpath("//span[contains(text(),'Title')]"));

			Thread.sleep(2000);

			// Highlight the Title

			JavascriptExecutor jse13 = (JavascriptExecutor) driver;
			jse13.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Title);

			Thread.sleep(2000);

			boolean res13 = Title.isDisplayed();
			if (res == true) {
				System.out.println("Title is displayed");
			} else {
				System.out.println("Title is not displayed");
			}
			
			//-----------------------------------------------------------------------------

			
			//locating the webelemnt Mechanism
			WebElement Mechanism =driver.findElement(By.xpath("//span[contains(text(),'Mechanism')]"));
			
			Thread.sleep(2000);
			
			JavascriptExecutor jse2 = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Mechanism);

			Thread.sleep(1000);
			

			boolean res12 = Mechanism.isDisplayed();
			if (res12 == true) {
				System.out.println("Mechanism is displayed");
			} else {
				System.out.println("Mechanism is not displayed");
			}
			
			//locating the webelemnt Assessment_Type
			WebElement Assessment_Type =driver.findElement(By.xpath("//span[contains(text(),'Assessment Type')]"));
			
			Thread.sleep(2000);
			
			JavascriptExecutor jse121 = (JavascriptExecutor) driver;
			jse121.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Assessment_Type);

			Thread.sleep(1000);
			

			boolean res121 = Assessment_Type.isDisplayed();
			if (res121 == true) {
				System.out.println("Assessment_Type is displayed");
			} else {
				System.out.println("Assessment_Type is not displayed");
			}
			
			
			//locating the webelemnt Status
			WebElement Status =driver.findElement(By.xpath("//span[contains(text(),'Status')]"));
			
			Thread.sleep(2000);
			
			JavascriptExecutor jse1211 = (JavascriptExecutor) driver;
			jse1211.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Status);

			Thread.sleep(1000);
			
			jse1211.executeScript("scroll (0,600);");
			

			boolean res1211 = Assessment_Type.isDisplayed();
			if (res1211 == true) {
				System.out.println("Status is displayed");
			} else {
				System.out.println("Status is not displayed");
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			driver.close();
			driver.quit();
			
			
		}

	}

