package New;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UI {

	private WebDriver driver;

	// ------------------------------------------------------------
	@Test
	public void Login_Page() throws InterruptedException {// username PRAKASH
		System.setProperty("webdriver.edge.driver","C:\\Users\\praka\\Downloads\\edgedriver_win64 (3)\\msedgedriver.exe");
    	//"C:\Users\praka\Downloads\edgedriver_win64 (3)\msedgedriver.exe"
		// "C:\\Users\\praka\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");

		// up casting
		WebDriver driver = new EdgeDriver();

		// get URL
		driver.get("https://api-dev.hivepro.in:10443/artemis/artemis-dev-v2-1/#/auth/login");
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// maximize
		driver.manage().window().maximize();
		Thread.sleep(1000);

		// locate digital logo
		WebElement login_page = driver.findElement(By.xpath("//img[@alt='Digitali Logo']"));

		// to highlight the digitali_logo
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				login_page);
		Thread.sleep(1000);

		// digitali_logo is DISPLAYED or not
		boolean res = login_page.isDisplayed();

		if (res == true) {
			System.out.println("digitali_logo is DISPLAYED");
		} else {
			System.out.println("digitali_logo is not DISPLAYED");
		}
		// ----------------------------------------

		// ----------------------------------------

		// locate Home_Button
		WebElement Home_Button = driver
				.findElement(By.xpath("//div[@id='navbar-search']//a[normalize-space()='Home']"));
		Thread.sleep(1000);

		// to highlight the Home_Button
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Home_Button);
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------------------------
		// Home_Button is DISPLAYED or not
		boolean res1 = Home_Button.isDisplayed();

		if (res1 == true) {
			System.out.println("Home_Button is DISPLAYED");
		} else {
			System.out.println("Home_Button is not DISPLAYED");
		}

		// -----------------------------------------------------------------------------------------------------------------------------

		// locate Home_Heading
		WebElement Home_Heading = driver
				.findElement(By.xpath("//h1[normalize-space()='The most trusted NFT encyclopedia']"));
		Thread.sleep(1000);

		// to highlight the Home_Heading
		JavascriptExecutor jse00 = (JavascriptExecutor) driver;
		jse00.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Home_Heading);
		Thread.sleep(1000);

		// ----------------------------------------------------------------------------------

		// Home_Heading is DISPLAYED or not
		boolean res2 = Home_Heading.isDisplayed();

		if (res2 == true) {
			System.out.println("Home_Heading is DISPLAYED");
		} else {
			System.out.println("Home_Heading is not DISPLAYED");
		}

		// --------------------------------------------------

		// locate Collections_Button
		WebElement Collections_Button = driver
				.findElement(By.xpath("//div[@id='navbar-search']//a[normalize-space()='Collections']"));
		Thread.sleep(1000);

		// to highlight the Collection_Button
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Collections_Button);
		Thread.sleep(1000);

		// Collections_Button is DISPLAYED or not
		boolean res3 = Collections_Button.isDisplayed();

		if (res3 == true) {
			System.out.println("Collections_Button is DISPLAYED AND CLICKABLE");
		} else {
			System.out.println("Collections_Button is not DISPLAYED");
		}
		Collections_Button.click();
		Thread.sleep(1000);

		// --------------------------------------------------

		// --------------------------------------------------

		// locate heading
		WebElement Collections_Heading = driver
				.findElement(By.xpath("//div[contains(text(),'Explore NFT Collections')]"));
		Thread.sleep(1000);

		// to highlight the Collections_Heading
		JavascriptExecutor jse3 = (JavascriptExecutor) driver;
		jse3.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Collections_Heading);
		Thread.sleep(1000);

		// Collections_Heading is DISPLAYED or not
		boolean res4 = Collections_Heading.isDisplayed();

		if (res4 == true) {
			System.out.println("Collections_Heading is DISPLAYED");
		} else {
			System.out.println("Collections_Heading is not DISPLAYED");
		}

		driver.navigate().back();
		Thread.sleep(1000);

		// ---------------------------------------------------

		// -------------------------------------------------------------------------------------------------------------------------------------------------

		// locate About_US
		WebElement About_US = driver
				.findElement(By.xpath("//div[@id='navbar-search']//a[normalize-space()='About Us']"));
		Thread.sleep(1000);

		// to highlight the About_US
		JavascriptExecutor jse4 = (JavascriptExecutor) driver;
		jse4.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", About_US);
		Thread.sleep(1000);

		// About_US is DISPLAYED or not
		boolean res5 = About_US.isDisplayed();

		if (res5 == true) {
			System.out.println("About_US is DISPLAYED AND CLICKABLE");
		} else {
			System.out.println("About_US is not DISPLAYED");
		}

		About_US.click();
		Thread.sleep(1000);

		// --------------------------------------------------

		// --------------------------------------------------

		// locate About_US_heading
		WebElement About_US_heading = driver.findElement(By.xpath("//div[contains(text(),'About Digitali')]"));
		Thread.sleep(1000);

		// to highlight the About_US_heading
		JavascriptExecutor jse5 = (JavascriptExecutor) driver;
		jse5.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				About_US_heading);
		Thread.sleep(1000);

		// About_US_heading is DISPLAYED or not
		boolean res6 = About_US_heading.isDisplayed();

		if (res6 == true) {
			System.out.println("About_US_heading is DISPLAYED ");
		} else {
			System.out.println("About_US_heading is not DISPLAYED");
		}

		driver.navigate().back();
		Thread.sleep(1000);

		// ------------------------------------------------

		// locate Leaderboard
		WebElement Leaderboard = driver
				.findElement(By.xpath("//div[@id='navbar-search']//a[normalize-space()='Leaderboard']"));
		Thread.sleep(1000);

		// to highlight the Leaderboard
		JavascriptExecutor jse6 = (JavascriptExecutor) driver;
		jse6.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Leaderboard);
		Thread.sleep(1000);

		// Leaderboard is DISPLAYED or not
		boolean res7 = Leaderboard.isDisplayed();

		if (res7 == true) {
			System.out.println("Leaderboard is DISPLAYED ");
		} else {
			System.out.println("Leaderboard is not DISPLAYED");
		}

		Leaderboard.click();
		Thread.sleep(1000);

		// -------------------------------------------------------------------------------------------------------

		// locate Leaderboard_heading
		WebElement Leaderboard_heading = driver
				.findElement(By.xpath("//div[contains(text(),'Earn Rewards Points by contributing NFT Collection')]"));
		Thread.sleep(1000);

		// to highlight the Leaderboard_heading
		JavascriptExecutor jse7 = (JavascriptExecutor) driver;
		jse7.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Leaderboard_heading);

		Thread.sleep(1000);

		// Leaderboard_heading is DISPLAYED or not
		boolean res8 = Leaderboard_heading.isDisplayed();

		if (res8 == true) {
			System.out.println("Leaderboard_heading is DISPLAYED ");
		} else {
			System.out.println("Leaderboard_heading is not DISPLAYED");
		}

		// -------------------------------------------------

		// locate Search_bar
		WebElement Search_bar = driver.findElement(By.xpath("//input[@id='search-navbar-desktop']"));
		Thread.sleep(1000);

		// to highlight the Search_bar
		JavascriptExecutor jse8 = (JavascriptExecutor) driver;
		jse8.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Search_bar);
		Thread.sleep(1000);

		// Search_bar is DISPLAYED or not
		boolean res9 = Search_bar.isDisplayed();

		if (res9 == true) {
			System.out.println("Search_bar is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("Search_bar is not DISPLAYED");
		}
		Search_bar.clear();
		Search_bar.click();
		Search_bar.sendKeys("BEANZ Official");
		Thread.sleep(1000);
		Search_bar.sendKeys(Keys.RETURN);

		Thread.sleep(1000);
		driver.navigate().back();

		Thread.sleep(1000);

		// -----------------------------------------------------------------

		// locate Earn_Reward_Points
		WebElement Earn_Reward_Points = driver.findElement(By.xpath("//a[@type='button']"));
		Thread.sleep(1000);

		// to highlight the Earn_Reaward_Points
		JavascriptExecutor jse9 = (JavascriptExecutor) driver;
		jse9.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Earn_Reward_Points);
		Thread.sleep(1000);

		// Earn_Reaward_Points is DISPLAYED or not
		boolean res10 = Earn_Reward_Points.isDisplayed();

		if (res10 == true) {
			System.out.println("Earn_Reaward_Points is DISPLAYED ");
		} else {
			System.out.println("Earn_Reaward_Points is not DISPLAYED");
		}

		Earn_Reward_Points.click();
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------------
		// locate Earn_Reward_Points_heading
		WebElement Earn_Reward_Points_heading = driver
				.findElement(By.xpath("//h3[normalize-space()='Earning Reward Points is easy!']"));
		Thread.sleep(1000);

		// to highlight the Earn_Reward_Points_Heading
		JavascriptExecutor jse10 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Earn_Reward_Points_heading);
		Thread.sleep(1000);

		// Earn_Reward_Points_heading is DISPLAYED or not
		boolean res11 = Earn_Reward_Points_heading.isDisplayed();

		if (res11 == true) {
			System.out.println("Earn_Reward_Points_heading is DISPLAYED ");
		} else {
			System.out.println("Earn_Reward_Points_heading is not DISPLAYED");
		}

		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().back();
		jse.executeScript("scroll(0, 450);");
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------

		// ----------------------------------------------------------------------------------------
		// locate Know_what_you’re_buying
		WebElement Know_what_you_re_buying = driver
				.findElement(By.xpath("//h5[contains(text(),'Know what you’re buying')]"));
		Thread.sleep(1000);

		// to highlight the Know_what_you’re_buying
		JavascriptExecutor jse33 = (JavascriptExecutor) driver;
		jse33.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Know_what_you_re_buying);

		Thread.sleep(1000);

		// ------------------------------------------------------------------------------------------------

		// locate Understand_what_you_own
		WebElement Understand_what_you_own = driver
				.findElement(By.xpath("//h5[normalize-space()='Understand what you own']"));
		Thread.sleep(1000);

		// to highlight the Understand_what_you_own
		JavascriptExecutor jse44 = (JavascriptExecutor) driver;
		jse44.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Understand_what_you_own);

		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------

		// locate Earn_Reward_Points1
		WebElement Earn_Reward_Points1 = driver.findElement(By.xpath("//h5[normalize-space()='Earn Reward Points']"));
		Thread.sleep(1000);

		// to highlight the Earn_Reward_Points1
		JavascriptExecutor jse55 = (JavascriptExecutor) driver;
		jse55.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Earn_Reward_Points1);

		Thread.sleep(1000);

		// Earn_Reward_Points1 is DISPLAYED or not
		boolean res12 = Earn_Reward_Points1.isDisplayed();

		if (res12 == true) {
			System.out.println("Earn_Reward_Points1 is DISPLAYED ");
		} else {
			System.out.println("Earn_Reward_Points1 is not DISPLAYED");
		}

		// -----------------------------------------------------------------------

		// locate Explore_NFT_Collections
		WebElement Explore_NFT_Collections = driver
				.findElement(By.xpath("//a[normalize-space()='Explore NFT Collections']"));
		Thread.sleep(1000);

		// to highlight the Explore_NFT_Collections
		JavascriptExecutor jse66 = (JavascriptExecutor) driver;
		jse66.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Explore_NFT_Collections);

		Thread.sleep(1000);

		// Explore_NFT_Collections is DISPLAYED or not
		boolean res13 = Explore_NFT_Collections.isDisplayed();

		if (res13 == true) {
			System.out.println("Explore_NFT_Collections is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("Explore_NFT_Collections is not DISPLAYED");
		}

		Explore_NFT_Collections.click();
		driver.navigate().back();
		Thread.sleep(1000);

		// locate Explore_NFT_Collections
		WebElement Explore_NFT_Collections1 = driver
				.findElement(By.xpath("//a[normalize-space()='Explore NFT Collections']"));
		Thread.sleep(1000);

		// to highlight the Explore_NFT_Collections
		JavascriptExecutor jse11 = (JavascriptExecutor) driver;
		jse11.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Explore_NFT_Collections1);
		Thread.sleep(1000);

		Explore_NFT_Collections1.click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		jse.executeScript("scroll(0, 450);");
		Thread.sleep(1000);

		// ----------------------------------------------------------------

		// locate How_Do_I_Earn_Reward_Points
		WebElement How_Do_I_Earn_Reward_Points = driver
				.findElement(By.xpath("//a[normalize-space()='How do I earn Reward Points?']"));
		Thread.sleep(1000);

		// to highlight the How_Do_I_Earn_Reward_Points
		JavascriptExecutor jse12 = (JavascriptExecutor) driver;
		jse12.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				How_Do_I_Earn_Reward_Points);
		Thread.sleep(1000);

		// How_Do_I_Earn_Reward_Points is DISPLAYED or not
		boolean res14 = How_Do_I_Earn_Reward_Points.isDisplayed();

		if (res14 == true) {
			System.out.println("How_Do_I_Earn_Reward_Points is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("How_Do_I_Earn_Reward_Points is not DISPLAYED");
		}

		How_Do_I_Earn_Reward_Points.click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		jse.executeScript("scroll(0, 1200);");
		Thread.sleep(1000);

		// -------------------------------------------------------------------------------

		// locate Recently_updated_NFT_Collections
		WebElement Recently_updated_NFT_Collections = driver
				.findElement(By.xpath("//h1[normalize-space()='Recently updated NFT Collections']"));
		Thread.sleep(1000);

		// to highlight the Recently_updated_NFT_Collections
		JavascriptExecutor jse13 = (JavascriptExecutor) driver;
		jse13.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Recently_updated_NFT_Collections);
		Thread.sleep(1000);

		// Recently_updated_NFT_Collections is DISPLAYED or not
		boolean res15 = Recently_updated_NFT_Collections.isDisplayed();

		if (res15 == true) {
			System.out.println("Recently_updated_NFT_Collections is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("Recently_updated_NFT_Collections is not DISPLAYED");
		}

		jse.executeScript("scroll(0, 1400)");
		Thread.sleep(1000);

		// ------------------------------------------------------

		// locate Recently_updated_NFT_Collections_left_arrow
		WebElement Recently_updated_NFT_Collections_left_arrow = driver
				.findElement(By.xpath("//button[@aria-label='Go to previous slide']"));
		Thread.sleep(1000);

		// to highlight the Recently_updated_NFT_Collections_left_arrow
		JavascriptExecutor jse14 = (JavascriptExecutor) driver;
		jse14.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Recently_updated_NFT_Collections_left_arrow);
		Thread.sleep(1000);

		// Recently_updated_NFT_Collections_left_arrow is DISPLAYED or not
		boolean res16 = Recently_updated_NFT_Collections_left_arrow.isDisplayed();

		if (res16 == true) {
			System.out.println("Recently_updated_NFT_Collections_left_arrow is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("Recently_updated_NFT_Collections_left_arrow is not DISPLAYED");
		}

		Recently_updated_NFT_Collections_left_arrow.click();
		Recently_updated_NFT_Collections_left_arrow.click();

		// -----------------------------------------------------

		// locate Recently_updated_NFT_Collections_right_arrow
		WebElement Recently_updated_NFT_Collections_right_arrow = driver
				.findElement(By.xpath("//button[@aria-label='Go to next slide']"));
		Thread.sleep(1000);

		// to highlight the Recently_updated_NFT_Collections_right_arrow
		JavascriptExecutor jse15 = (JavascriptExecutor) driver;
		jse15.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Recently_updated_NFT_Collections_right_arrow);
		Thread.sleep(1000);

		// Recently_updated_NFT_Collections_right_arrow is DISPLAYED or not
		boolean res17 = Recently_updated_NFT_Collections_right_arrow.isDisplayed();

		if (res17 == true) {
			System.out.println("Recently_updated_NFT_Collections_right_arrow is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("Recently_updated_NFT_Collections_right_arrow is not DISPLAYED");
		}

		Recently_updated_NFT_Collections_right_arrow.click();
		Thread.sleep(1000);
		Recently_updated_NFT_Collections_right_arrow.click();
		Thread.sleep(1000);

		// ----------------------------------------------------------------------------------

		// locate View_all_collections
		WebElement View_all_collections = driver
				.findElement(By.xpath("//span[normalize-space()='View All Collections']"));
		Thread.sleep(1000);

		// to highlight the View_all_collections
		JavascriptExecutor jse16 = (JavascriptExecutor) driver;
		jse16.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				View_all_collections);
		Thread.sleep(3000);

		// View_all_collections is DISPLAYED or not
		boolean res18 = View_all_collections.isDisplayed();

		if (res18 == true) {
			System.out.println("View_all_collections is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("View_all_collections is not DISPLAYED");
		}

		// ---------------------------------------------------------------------------------------

		View_all_collections.click();
		Thread.sleep(3000);
		driver.navigate().back();

		// -------------------------------------------------------------------------------------------------------------------------------

		// --------------------------------------------------------------------------------------

		jse.executeScript("scroll(0, 2000)");

		// locate Contributors earn Reward Points
		WebElement Contributors_earn_Reward_Points = driver
				.findElement(By.xpath("//div[normalize-space()='Contributors earn Reward Points']"));
		Thread.sleep(1000);

		// to highlight the Contributors_earn_Reward_Points
		JavascriptExecutor jse17 = (JavascriptExecutor) driver;
		jse17.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Contributors_earn_Reward_Points);
		Thread.sleep(1000);

		// Contributors_earn_Reward_Points is DISPLAYED or not
		boolean res19 = Contributors_earn_Reward_Points.isDisplayed();

		if (res19 == true) {
			System.out.println("Contributors_earn_Reward_Points is DISPLAYED ");
		} else {
			System.out.println("Contributors_earn_Reward_Points is not DISPLAYED");
		}

		// -------------------------------------------------------------------------------------------

		// locate Earn_Reward_Points11
		WebElement Earn_Reward_Points11 = driver.findElement(By.xpath(
				"//div[@id='__next']//div//div//div//div//div//div//button[contains(text(),'Earn Reward Points')]"));
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------

		// to highlight the Earn_Reward_Points11
		JavascriptExecutor jse18 = (JavascriptExecutor) driver;
		jse18.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Earn_Reward_Points11);
		Thread.sleep(1000);

		// Earn_Reward_Points11 is DISPLAYED or not
		boolean res20 = Earn_Reward_Points11.isDisplayed();

		if (res20 == true) {
			System.out.println("Earn_Reward_Points11 is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("Earn_Reward_Points11 is not DISPLAYED");
		}

		Earn_Reward_Points11.click();
		Thread.sleep(1000);
		driver.navigate().back();
		jse.executeScript("scroll(0, 2500)");

		// -------------------------------------------------------------------------------------------

		// locate Leaderboard1
		WebElement Leaderboard1 = driver.findElement(By.xpath("//div[contains(text(),'Leaderboard')]"));
		Thread.sleep(1000);

		// to highlight the Leaderboard1
		JavascriptExecutor jse19 = (JavascriptExecutor) driver;
		jse19.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Leaderboard1);
		Thread.sleep(1000);

		// Leaderboard1 is DISPLAYED or not
		boolean res21 = Leaderboard1.isDisplayed();

		if (res21 == true) {
			System.out.println("Leaderboard1 is DISPLAYED  ");
		} else {
			System.out.println("Leaderboard1 is not DISPLAYED");
		}

		// -------------------------------------------------------------------------------

		// locate Total_Contributors
		WebElement Total_Contributors = driver.findElement(By.xpath("//div[contains(text(),'Total Contributors')]"));
		Thread.sleep(1000);

		// to highlight the Total_Contributors1
		JavascriptExecutor jse20 = (JavascriptExecutor) driver;
		jse20.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Total_Contributors);
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------------

		// locate Total_Contributions
		WebElement Total_Contributions = driver.findElement(By.xpath("//div[contains(text(),'Total Contributions')]"));
		Thread.sleep(1000);

		// to highlight the Total_Contributions
		JavascriptExecutor jse21 = (JavascriptExecutor) driver;
		jse21.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Total_Contributions);
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------

		// locate Earned_Reward_Points2
		WebElement Earned_Reward_Points2 = driver
				.findElement(By.xpath("//div[contains(text(),'Earned Reward Points')]"));
		Thread.sleep(1000);

		// to highlight the Total_Contributors3
		JavascriptExecutor jse22 = (JavascriptExecutor) driver;
		jse22.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Earned_Reward_Points2);
		Thread.sleep(1000);

		// ----------------------------------------------------------------------------------------------------------

		// locate Leaderboard_box
		WebElement Leaderboard_box = driver.findElement(By.xpath("//body/div[@id='__next']/div/div/div/div/div[2]"));
		Thread.sleep(1000);

		// to highlight the Total_Contributors3
		JavascriptExecutor jse23 = (JavascriptExecutor) driver;
		jse23.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Leaderboard_box);
		Thread.sleep(1000);

		// Leaderboard_box is DISPLAYED or not
		boolean res22 = Leaderboard_box.isDisplayed();

		if (res22 == true) {
			System.out.println("Leaderboard_box is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("Leaderboard_box is not DISPLAYED");
		}

		// -----------------------------------------------------------------------------------------------------------

		// locate Contributors_box
		WebElement Contributors_box = driver
				.findElement(By.xpath("//body[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[3]"));
		Thread.sleep(1000);

		// to highlight the Contributors_box
		JavascriptExecutor jse24 = (JavascriptExecutor) driver;
		jse24.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Contributors_box);
		Thread.sleep(1000);

		// Contributors_box is DISPLAYED or not
		boolean res23 = Contributors_box.isDisplayed();

		if (res23 == true) {
			System.out.println("Contributors_box is DISPLAYED  ");
		} else {
			System.out.println("Contributors_box is not DISPLAYED");
		}
		jse.executeScript("scroll(0, 3000)");

		// -------------------------------------------------------------------------------------------------------------------

		// locate View_full_leaderboard
		WebElement View_full_leaderboard = driver
				.findElement(By.xpath("//span[normalize-space()='View full Leaderboard']"));
		Thread.sleep(1000);

		// to highlight the View_full_leaderboard
		JavascriptExecutor jse25 = (JavascriptExecutor) driver;
		jse25.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				View_full_leaderboard);
		Thread.sleep(1000);

		// View_full_leaderboard is DISPLAYED or not
		boolean res24 = View_full_leaderboard.isDisplayed();

		if (res24 == true) {
			System.out.println("View_full_leaderboard is DISPLAYED  ");
		} else {
			System.out.println("View_full_leaderboard is not DISPLAYED");
		}

		View_full_leaderboard.click();
		Thread.sleep(1000);
		driver.navigate().back();
		jse.executeScript("scroll(0, 3200)");

		// -----------------------------------------------------------------------------------------------------

		// locate Our_blog
		WebElement Our_blog = driver.findElement(By.xpath("//h5[normalize-space()='Our Blog']"));
		Thread.sleep(1000);

		// to highlight the Our_blog
		JavascriptExecutor jse26 = (JavascriptExecutor) driver;
		jse26.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Our_blog);
		Thread.sleep(1000);

		// ------------------------------------------------------------------------------------------------------

		// locate Resources and insights
		WebElement Resources_and_insights = driver
				.findElement(By.xpath("//h2[normalize-space()='Resources and insights']"));
		Thread.sleep(1000);

		// to highlight the Resources_and_insights
		JavascriptExecutor jse27 = (JavascriptExecutor) driver;
		jse27.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Resources_and_insights);
		Thread.sleep(1000);

		// Resources_and_insights is DISPLAYED or not
		boolean res25 = Resources_and_insights.isDisplayed();

		if (res25 == true) {
			System.out.println("Resources_and_insights is DISPLAYED  ");
		} else {
			System.out.println("Resources_and_insights is not DISPLAYED");
		}

		// -------------------------------------------------------------------------------------------------------------

		// locate View_All
		WebElement View_All = driver.findElement(By.xpath("//a[normalize-space()='View All']"));
		Thread.sleep(1000);

		// to highlight the View_All
		JavascriptExecutor jse28 = (JavascriptExecutor) driver;
		jse28.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", View_All);
		Thread.sleep(1000);

		// View_All is DISPLAYED or not
		boolean res26 = View_All.isDisplayed();

		if (res26 == true) {
			System.out.println("View_All is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("View_All is not DISPLAYED");
		}

		View_All.click();
		Thread.sleep(1000);
		driver.navigate().back();
		jse.executeScript("scroll(0, 3400)");

		// -------------------------------------------------------------------------------------------------

		// locate Blog_1
		WebElement Blog_1 = driver
				.findElement(By.xpath("//a[@href='/blog/announcing-digitali']//div//span//img[@alt='News 01']"));
		Thread.sleep(1000);

		// to highlight the Blog_1
		JavascriptExecutor jse29 = (JavascriptExecutor) driver;
		jse29.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Blog_1);
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------

		// locate Blog_2
		WebElement Blog_2 = driver.findElement(
				By.xpath("//a[@href='/blog/top-nft-projects-by-market-cap']//div//span//img[@alt='News 01']"));
		Thread.sleep(1000);

		// to highlight the Blog_2
		JavascriptExecutor jse30 = (JavascriptExecutor) driver;
		jse30.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Blog_2);
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------

		// locate Blog_3
		WebElement Blog_3 = driver.findElement(By.xpath(
				"//a[@href='/blog/introducing-bitcoin-ordinals-with-digitali']//div//span//img[@alt='News 01']"));
		Thread.sleep(1000);

		// to highlight the Blog_3
		JavascriptExecutor jse31 = (JavascriptExecutor) driver;
		jse31.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Blog_3);
		Thread.sleep(1000);

		jse.executeScript("scroll(0, 4000)");
		// ------------------------------------------------------------------------------------------------------

		// locate Wen_Token
		WebElement Wen_Token = driver.findElement(By.xpath("//body/div[@id='__next']/footer/div/div/div/div[1]"));
		Thread.sleep(1000);

		// to highlight the Wen_Token
		JavascriptExecutor jse32 = (JavascriptExecutor) driver;
		jse32.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Wen_Token);
		Thread.sleep(1000);

		// Wen_Token is DISPLAYED or not
		boolean res27 = Wen_Token.isDisplayed();

		if (res27 == true) {
			System.out.println("Wen_Token is DISPLAYED ");
		} else {
			System.out.println("Wen_Token is not DISPLAYED");
		}

		// ---------------------------------------------------------------------------------------------
		// locate Email_Field
		WebElement Email_Field = driver.findElement(By.xpath("//input[@placeholder='Enter your email']"));
		Thread.sleep(1000);

		// to highlight the Email_Field
		JavascriptExecutor jse50 = (JavascriptExecutor) driver;
		jse50.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Email_Field);
		Thread.sleep(1000);

		// Email_Field is DISPLAYED or not
		boolean res28 = Email_Field.isDisplayed();

		if (res28 == true) {
			System.out.println("Email_Field is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("Email_Field is not DISPLAYED");
		}

		// -----------------------------------------------------------------------

		// locate See_our_privacy_policy
		WebElement See_our_privacy_policy = driver.findElement(By.xpath("//a[contains(text(),'privacy policy')]"));
		Thread.sleep(1000);

		// to highlight the See_our_privacy_policy
		JavascriptExecutor jse51 = (JavascriptExecutor) driver;
		jse51.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				See_our_privacy_policy);
		Thread.sleep(1000);

		// See_our_privacy_policy is DISPLAYED or not
		boolean res29 = See_our_privacy_policy.isDisplayed();

		if (res29 == true) {
			System.out.println("See_our_privacy_policy is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("See_our_privacy_policy is not DISPLAYED");
		}

		See_our_privacy_policy.click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);

		jse16.executeScript("scroll(0, 5000);");

		// --------------------------------------------------------------------------------------------
		// locate digitali_footer
		WebElement digitali_footer = driver
				.findElement(By.xpath("//body/div[@id='__next']/footer/div/div/div/div//*[name()='svg']"));
		Thread.sleep(1000);

		// to highlight the digitali_footer
		JavascriptExecutor jse100 = (JavascriptExecutor) driver;
		jse100.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				digitali_footer);
		Thread.sleep(1000);

		// digitali_footer is DISPLAYED or not
		boolean res30 = digitali_footer.isDisplayed();

		if (res30 == true) {
			System.out.println("digitali_footer is DISPLAYED  ");
		} else {
			System.out.println("digitali_footer is not DISPLAYED");
		}

		// --------------------------------------------------------------------------------------------------

		// locate digitali_footer_text
		WebElement digitali_footer_text = driver
				.findElement(By.xpath("//div[contains(text(),'The most trusted NFT encyclopedia')]"));
		Thread.sleep(1000);

		// to highlight the digitali_footer_text
		JavascriptExecutor jse34 = (JavascriptExecutor) driver;
		jse34.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				digitali_footer_text);
		Thread.sleep(1000);

		// digitali_footer_text is DISPLAYED or not
		boolean res31 = digitali_footer_text.isDisplayed();

		if (res31 == true) {
			System.out.println("digitali_footer_text is DISPLAYED  ");
		} else {
			System.out.println("digitali_footer_text is not DISPLAYED");
		}

		// ----------------------------------------------------------------------------------------------------------------

		// locate Explore
		WebElement Explore = driver.findElement(By.xpath("//div[normalize-space()='Explore']"));
		Thread.sleep(1000);

		// to highlight the Explore
		JavascriptExecutor jse35 = (JavascriptExecutor) driver;
		jse35.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Explore);
		Thread.sleep(1000);

		// Explore is DISPLAYED or not
		boolean res32 = Explore.isDisplayed();

		if (res32 == true) {
			System.out.println("Explore is DISPLAYED  ");
		} else {
			System.out.println("Explore is not DISPLAYED");
		}

		// --------------------------------------------------------------------------------------------------------------------

		// locate Collection
		WebElement Collection = driver.findElement(By.xpath(
				"//div[@id='__next']//footer//div//div//div//div//div//div//div//a[normalize-space()='Collections']"));
		Thread.sleep(1000);

		// to highlight the Collection
		JavascriptExecutor jse36 = (JavascriptExecutor) driver;
		jse36.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Collection);
		Thread.sleep(1000);

		// Collection is DISPLAYED or not
		boolean res33 = Collection.isDisplayed();

		if (res33 == true) {
			System.out.println("Collection is DISPLAYED  ");
		} else {
			System.out.println("Collection is not DISPLAYED");
		}

		// --------------------------------------------------------------------------------------------------------------------

		// locate Leaderboard4
		WebElement Leaderboard4 = driver.findElement(By.xpath(
				"//div[@id='__next']//footer//div//div//div//div//div//div//div//a[normalize-space()='Leaderboard']"));
		Thread.sleep(1000);

		// to highlight the Leaderboard4
		JavascriptExecutor jse37 = (JavascriptExecutor) driver;
		jse37.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Leaderboard4);
		Thread.sleep(1000);

		// Leaderboard4 is DISPLAYED or not
		boolean res34 = Leaderboard4.isDisplayed();

		if (res34 == true) {
			System.out.println("Leaderboard4 is DISPLAYED  ");
		} else {
			System.out.println("Leaderboard4 is not DISPLAYED");
		}

		// --------------------------------------------------------------------------------------------------------------------

		// locate Reward_Points1
		WebElement Reward_Points1 = driver.findElement(By.xpath("//a[normalize-space()='Reward Points']"));
		Thread.sleep(1000);

		// to highlight the Reward_Points1
		JavascriptExecutor jse38 = (JavascriptExecutor) driver;
		jse38.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Reward_Points1);
		Thread.sleep(1000);

		// Reward_Points1 is DISPLAYED or not
		boolean res35 = Reward_Points1.isDisplayed();

		if (res35 == true) {
			System.out.println("Reward_Points1 is DISPLAYED  ");
		} else {
			System.out.println("Reward_Points1 is not DISPLAYED");
		}

		// --------------------------------------------------------------------------------------------------------------------
		// locate About_Us
		WebElement About_Us = driver.findElement(By.xpath("//div[normalize-space()='About Us']"));
		Thread.sleep(1000);

		// to highlight the About_Us
		JavascriptExecutor jse388 = (JavascriptExecutor) driver;
		jse388.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", About_Us);
		Thread.sleep(1000);

		// About_Us is DISPLAYED or not
		boolean res36 = About_Us.isDisplayed();

		if (res36 == true) {
			System.out.println("About_Us is DISPLAYED  ");
		} else {
			System.out.println("About_Us is not DISPLAYED");
		}

		// --------------------------------------------------------------------------------------------------------------------
		// locate Digitali_1
		WebElement Digitali_1 = driver.findElement(By.xpath("//a[@href='/about-us'][normalize-space()='Digitali']"));
		Thread.sleep(1000);

		// to highlight the Digitali_1
		JavascriptExecutor jse3388 = (JavascriptExecutor) driver;
		jse3388.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Digitali_1);

		// Digitali_1 is DISPLAYED or not
		boolean res37 = Digitali_1.isDisplayed();

		if (res37 == true) {
			System.out.println("Digitali_1 is DISPLAYED  ");
		} else {
			System.out.println("Digitali_1 is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Blogs_footer
		WebElement Blogs_footer = driver.findElement(By.xpath("//a[normalize-space()='Blogs']"));
		Thread.sleep(1000);

		// to highlight the Blogs_footer
		JavascriptExecutor jse41 = (JavascriptExecutor) driver;
		jse41.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Blogs_footer);

		// Blogs_footer is DISPLAYED or not
		boolean res38 = Blogs_footer.isDisplayed();

		if (res38 == true) {
			System.out.println("Blogs_footer is DISPLAYED  ");
		} else {
			System.out.println("Blogs_footer is not DISPLAYED");
		}

		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate FAQ
		WebElement FAQ = driver.findElement(By.xpath("//a[normalize-space()='FAQ']"));
		Thread.sleep(1000);

		// to highlight the FAQ
		JavascriptExecutor jse42 = (JavascriptExecutor) driver;
		jse42.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", FAQ);
		Thread.sleep(1000);

		// FAQ is DISPLAYED or not
		boolean res39 = FAQ.isDisplayed();

		if (res39 == true) {
			System.out.println("FAQ is DISPLAYED  ");
		} else {
			System.out.println("FAQ is not DISPLAYED");
		}

		// ------------------------------------------------------------------------------------------------------------------

		// --------------------------------------------------------------------------------------------------------------------

		// locate Legal
		WebElement Legal = driver.findElement(By.xpath("//div[normalize-space()='Legal']"));
		Thread.sleep(1000);

		// to highlight the Legal
		JavascriptExecutor jse43 = (JavascriptExecutor) driver;
		jse43.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Legal);
		Thread.sleep(1000);

		// Legal is DISPLAYED or not
		boolean res40 = Legal.isDisplayed();

		if (res40 == true) {
			System.out.println("Legal is DISPLAYED  ");
		} else {
			System.out.println("Legal is not DISPLAYED");
		}

		// --------------------------------------------------------------------------------------------------------------------

		// locate Terms
		WebElement Terms = driver.findElement(By.xpath("//a[normalize-space()='Terms']"));
		Thread.sleep(1000);

		// to highlight the Terms
		JavascriptExecutor jse444 = (JavascriptExecutor) driver;
		jse444.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Terms);
		Thread.sleep(1000);

		// Terms is DISPLAYED or not
		boolean res41 = Terms.isDisplayed();

		if (res41 == true) {
			System.out.println("Terms is DISPLAYED  ");
		} else {
			System.out.println("Terms is not DISPLAYED");
		}

		// --------------------------------------------------------------------------------------------------------------------

		// locate Privacy
		WebElement Privacy = driver.findElement(By.xpath("//a[normalize-space()='Privacy']"));
		Thread.sleep(1000);

		// to highlight the Privacy
		JavascriptExecutor jse45 = (JavascriptExecutor) driver;
		jse45.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Privacy);
		Thread.sleep(1000);

		// Privacy is DISPLAYED or not
		boolean res42 = Privacy.isDisplayed();

		if (res42 == true) {
			System.out.println("Privacy is DISPLAYED  ");
		} else {
			System.out.println("Privacy is not DISPLAYED");
		}

		// ---------------------------------------------------------------------------------------------------------

		// locate All_Rights_Reserved
		WebElement All_Rights_Reserved = driver
				.findElement(By.xpath("//div[contains(text(),'© 2023 Digitali Technology Solutions Ltd. All righ')]"));
		Thread.sleep(1000);

		// to highlight the All_Rights_Reserved
		JavascriptExecutor jse46 = (JavascriptExecutor) driver;
		jse46.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				All_Rights_Reserved);
		Thread.sleep(1000);

		// All_Rights_Reserved is DISPLAYED or not
		boolean res43 = All_Rights_Reserved.isDisplayed();

		if (res43 == true) {
			System.out.println("All_Rights_Reserved is DISPLAYED  ");
		} else {
			System.out.println("All_Rights_Reserved is not DISPLAYED");
		}

		// -----------------------------------------------------------------------------------------------------------------

		// locate Twitter_Icon
		WebElement Twitter_Icon = driver.findElement(
				By.xpath("//body/div[@id='__next']/footer[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/a[1]/*[1]"));
		Thread.sleep(1000);

		// to highlight the Twitter_Icon
		JavascriptExecutor jse47 = (JavascriptExecutor) driver;
		jse47.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Twitter_Icon);

		// Twitter_Icon is DISPLAYED or not
		boolean res44 = Twitter_Icon.isDisplayed();

		if (res44 == true) {
			System.out.println("Twitter_Icon is DISPLAYED  ");
		} else {
			System.out.println("Twitter_Icon is not DISPLAYED");
		}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------------

		// locate Discord_Icon
		WebElement Discord_Icon = driver
				.findElement(By.xpath("//a[@href='https://discord.com/invite/dCYTykjgxW']//*[name()='svg']"));
		Thread.sleep(1000);

		// to highlight the Discord_Icon
		JavascriptExecutor jse48 = (JavascriptExecutor) driver;
		jse48.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Discord_Icon);

		// Discord_Icon is DISPLAYED or not
		boolean res45 = Discord_Icon.isDisplayed();

		if (res45 == true) {
			System.out.println("Discord_Icon is DISPLAYED  ");
		} else {
			System.out.println("Discord_Icon is not DISPLAYED");
		}
		Thread.sleep(1000);
		driver.close();
		driver.quit();

	}

	// --------------------------------------------------------------------

	@Test
	public void Collection_List_Page() throws InterruptedException {//Password with speacial characters prakash@4948
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\praka\\Downloads\\edgedriver_win64 (2)\\msedgedriver.exe");
		// System.setProperty("webdriver.edge.driver",
		// "C:\\Users\\praka\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");

		// up casting
		WebDriver driver = new EdgeDriver();

		// get URL
		driver.get("https://digitali.xyz/");
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// maximize
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);

		// locate Collections_Button
		WebElement Collections_Button = driver
				.findElement(By.xpath("//div[@id='navbar-search']//a[normalize-space()='Collections']"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Collection_Button
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Collections_Button);

		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// Collection_Button is DISPLAYED or not
		boolean res1 = Collections_Button.isDisplayed();

		if (res1 == true) {
			System.out.println("Collections_Button is DISPLAYED AND CLICKABLE  ");
		} else {
			System.out.println("Collections_Button is not DISPLAYED");
		}
		Collections_Button.click();
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);

		// -------------------------------------------------------------------------------------

		// locate heading
		WebElement Collections_Heading = driver
				.findElement(By.xpath("//div[contains(text(),'Explore NFT Collections')]"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Collections_Heading
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Collections_Heading);
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// Collections_Heading is DISPLAYED or not
		boolean res2 = Collections_Heading.isDisplayed();

		if (res2 == true) {
			System.out.println("Collections_Heading is DISPLAYED AND CLICKABLE  ");
		} else {
			System.out.println("Collections_Heading is not DISPLAYED");
		}
		// ---------------------------------------------------------------------------------------------------

//		// locate Sort_button
//		WebElement Sort_button = driver.findElement(By.xpath("//span[contains(text(),'Sort')]"));
//		Thread.sleep(1000);
//		driver.manage().deleteAllCookies();
//
//		// to highlight the Sort_button
//		JavascriptExecutor jse3 = (JavascriptExecutor) driver;
//		jse3.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Sort_button);
//		Thread.sleep(1000);
//		driver.manage().deleteAllCookies();
		// -----------------------------------------------------------------------------------------------------------------------

		// locate Collection1
		WebElement Collection1 = driver
				.findElement(By.xpath("//a[@href='/nft-collection-details/decentraland-nft-collection']"));
		Thread.sleep(1000);

		// to highlight the Collection1
		JavascriptExecutor jse4 = (JavascriptExecutor) driver;
		jse4.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Collection1);
		Thread.sleep(1000);

		// Collection1 is DISPLAYED or not
		boolean res3 = Collection1.isDisplayed();

		if (res3 == true) {
			System.out.println("Collection1 is DISPLAYED   ");
		} else {
			System.out.println("Collection1 is not DISPLAYED");
		}

		jse4.executeScript("scroll(0, 450);");

		// ----------------------------------------------------------------------------------------------------------

		// locate Collection2
		WebElement Collection2 = driver
				.findElement(By.xpath("//a[@href='/nft-collection-details/dourdarcels-nft-collection']"));
		Thread.sleep(1000);

		// to highlight the Collection2
		JavascriptExecutor jse6 = (JavascriptExecutor) driver;
		jse6.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Collection2);
		Thread.sleep(1000);

		// Collection2 is DISPLAYED or not
		boolean res4 = Collection2.isDisplayed();

		if (res4 == true) {
			System.out.println("Collection2 is DISPLAYED   ");
		} else {
			System.out.println("Collection2 is not DISPLAYED");
		}
		jse6.executeScript("scroll(0, 800);");

		// -----------------------------------------------------------------------------------------------------

		// locate Collection3
		WebElement Collection3 = driver
				.findElement(By.xpath("//a[@href='/nft-collection-details/clonex-mintvial-nft-collection']"));
		Thread.sleep(1000);

		// to highlight the Collection3
		JavascriptExecutor jse7 = (JavascriptExecutor) driver;
		jse7.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Collection3);
		Thread.sleep(1000);

		// Collection3 is DISPLAYED or not
		boolean res5 = Collection3.isDisplayed();

		if (res5 == true) {
			System.out.println("Collection3 is DISPLAYED   ");
		} else {
			System.out.println("Collection3 is not DISPLAYED");
		}
		jse7.executeScript("scroll(0, 1200);");

		// ---------------------------------------------------------------------------------------------------

		// locate Collection4
		WebElement Collection4 = driver
				.findElement(By.xpath("//a[@href='/nft-collection-details/bored-ape-kennel-club-nft-collection']"));
		Thread.sleep(1000);

		// to highlight the Collection4
		JavascriptExecutor jse8 = (JavascriptExecutor) driver;
		jse8.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Collection4);
		Thread.sleep(1000);

		// Collection4 is DISPLAYED or not
		boolean res6 = Collection3.isDisplayed();

		if (res6 == true) {
			System.out.println("Collection4 is DISPLAYED   ");
		} else {
			System.out.println("Collection4 is not DISPLAYED");
		}
		jse8.executeScript("scroll(0, 1800);");

		// ----------------------------------------------------------------------------------

		// locate Collection5
		WebElement Collection5 = driver
				.findElement(By.xpath("//a[@href='/nft-collection-details/hapeprime-nft-collection']"));
		Thread.sleep(1000);

		// to highlight the Collection5
		JavascriptExecutor jse9 = (JavascriptExecutor) driver;
		jse9.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Collection5);
		Thread.sleep(1000);

		// Collection5 is DISPLAYED or not
		boolean res7 = Collection5.isDisplayed();

		if (res7 == true) {
			System.out.println("Collection5 is DISPLAYED   ");
		} else {
			System.out.println("Collection5 is not DISPLAYED");
		}
		jse9.executeScript("scroll(0, 2400);");

		// ------------------------------------------------------------------------------

		// locate Collection6
		WebElement Collection6 = driver
				.findElement(By.xpath("//a[@href='/nft-collection-details/bored-ape-chemistry-club-nft-collection']"));
		Thread.sleep(1000);

		// to highlight the Collection6
		JavascriptExecutor jse10 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Collection6);

		// Collection6 is DISPLAYED or not
		boolean res8 = Collection6.isDisplayed();

		if (res8 == true) {
			System.out.println("Collection6 is DISPLAYED   ");
		} else {
			System.out.println("Collection6 is not DISPLAYED");
		}
		Thread.sleep(1000);

		// ----------------------------------------------------------------------------------

		// locate Page_no_1
		WebElement Page_no_1 = driver.findElement(By.xpath("//a[normalize-space()='1']"));
		Thread.sleep(1000);

		// to highlight the Page_no_1
		JavascriptExecutor jse11 = (JavascriptExecutor) driver;
		jse11.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Page_no_1);

		// Page_no_1 is DISPLAYED or not
		boolean res9 = Page_no_1.isDisplayed();

		if (res9 == true) {
			System.out.println("Page_no_1 is DISPLAYED AND CLICKABLE  ");
		} else {
			System.out.println("Page_no_1 is not DISPLAYED");
		}
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------

		// locate Page_no_2
		WebElement Page_no_2 = driver.findElement(By.xpath("//a[normalize-space()='2']"));
		Thread.sleep(1000);

		// to highlight the Page_no_2
		JavascriptExecutor jse12 = (JavascriptExecutor) driver;
		jse12.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Page_no_2);
		Thread.sleep(1000);

		// Page_no_2 is DISPLAYED or not
		boolean res10 = Page_no_1.isDisplayed();

		if (res10 == true) {
			System.out.println("Page_no_2 is DISPLAYED AND CLICKABLE  ");
		} else {
			System.out.println("Page_no_2 is not DISPLAYED");
		}
		Page_no_2.click();
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------------

		// locate Page_no_3
		WebElement Page_no_3 = driver.findElement(By.xpath("//a[normalize-space()='3']"));
		Thread.sleep(1000);

		// to highlight the Page_no_3
		JavascriptExecutor jse13 = (JavascriptExecutor) driver;
		jse13.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Page_no_3);
		Thread.sleep(1000);

		// Page_no_3 is DISPLAYED or not
		boolean res11 = Page_no_3.isDisplayed();

		if (res11 == true) {
			System.out.println("Page_no_3 is DISPLAYED AND CLICKABLE  ");
		} else {
			System.out.println("Page_no_3 is not DISPLAYED");
		}
		Page_no_3.click();
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------

		// locate Page_no_4
		WebElement Page_no_4 = driver.findElement(By.xpath("//a[normalize-space()='4']"));
		Thread.sleep(000);

		// to highlight the Page_no_4
		JavascriptExecutor jse14 = (JavascriptExecutor) driver;
		jse14.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Page_no_4);
		Thread.sleep(000);

		// Page_no_3 is DISPLAYED or not
		boolean res12 = Page_no_4.isDisplayed();

		if (res12 == true) {
			System.out.println("Page_no_4 is DISPLAYED AND CLICKABLE  ");
		} else {
			System.out.println("Page_no_4 is not DISPLAYED");
		}
		Page_no_4.click();
		// Thread.sleep(1000);

		Thread.sleep(1000);

//-----------------------------------------------------------------------------------------------		

		// locate Page_no_5
		WebElement Page_no_5 = driver.findElement(By.xpath("//a[normalize-space()='5']"));
		Thread.sleep(1000);

		// to highlight the Page_no_5
		JavascriptExecutor jse15 = (JavascriptExecutor) driver;
		jse15.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Page_no_5);
		// Thread.sleep(1000);

		// Page_no_5 is DISPLAYED or not
		boolean res13 = Page_no_4.isDisplayed();

		if (res13 == true) {
			System.out.println("Page_no_5 is DISPLAYED AND CLICKABLE  ");
		} else {
			System.out.println("Page_no_5 is not DISPLAYED");
		}
		Page_no_5.click();
		Thread.sleep(1000);

//---------------------------------------------------------------------------------------------------

		// locate Page_no_6
		WebElement Page_no_6 = driver.findElement(By.xpath("//a[normalize-space()='6']"));
		Thread.sleep(1000);

		// to highlight the Page_no_6
		JavascriptExecutor jse16 = (JavascriptExecutor) driver;
		jse16.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Page_no_6);
		Thread.sleep(1000);

		// Page_no_6 is DISPLAYED or not
		boolean res14 = Page_no_6.isDisplayed();

		if (res14 == true) {
			System.out.println("Page_no_6 is DISPLAYED AND CLICKABLE  ");
		} else {
			System.out.println("Page_no_6 is not DISPLAYED");
		}
		Page_no_6.click();
		Thread.sleep(1000);

		jse16.executeScript("scroll(0, 1400);");
//------------------------------------------------------------------------------------------------

		// locate Tweet to us
		WebElement Tweet_to_us = driver.findElement(By.xpath("//a[normalize-space()='Tweet to us']"));
		Thread.sleep(1000);

		// to highlight the Tweet_to_us
		JavascriptExecutor jse17 = (JavascriptExecutor) driver;
		jse17.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Tweet_to_us);
		Thread.sleep(1000);

		// Tweet is DISPLAYED or not
		boolean res15 = Tweet_to_us.isDisplayed();

		if (res15 == true) {
			System.out.println("Tweet_to_us is DISPLAYED   ");
		} else {
			System.out.println("Tweet_to_us is not DISPLAYED");
		}

		// --------------------------------------------------------------------------------------------

		// locate Message_us
		WebElement Message_us = driver.findElement(By.xpath("//a[normalize-space()='Message us']"));
		Thread.sleep(1000);

		// to highlight the Tweet_to_us
		JavascriptExecutor jse18 = (JavascriptExecutor) driver;
		jse18.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Message_us);
		Thread.sleep(1000);

		// Message_us is DISPLAYED or not
		boolean res16 = Message_us.isDisplayed();

		if (res16 == true) {
			System.out.println("Message_us is DISPLAYED ");
		} else {
			System.out.println("Message_us is not DISPLAYED");
		}

		// --------------------------------------------------------------------------------------------

		// locate NFT_Collection_card
		WebElement NFT_Collection_card = driver.findElement(By.xpath("//body[1]/div[1]/main[1]/div[2]/div[1]"));
		Thread.sleep(1000);

		// to highlight the Tweet_to_us
		JavascriptExecutor jse19 = (JavascriptExecutor) driver;
		jse19.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				NFT_Collection_card);
		Thread.sleep(1000);

		// NFT_Collection_card is DISPLAYED or not
		boolean res17 = NFT_Collection_card.isDisplayed();

		if (res17 == true) {
			System.out.println("NFT_Collection_card is DISPLAYED ");
		} else {
			System.out.println("NFT_Collection_card is not DISPLAYED");
		}
		jse19.executeScript("scroll(0, 2200);");

		// ------------------------------------------------------------------------------------------------

		// locate Wen_Token
		WebElement Wen_Token = driver.findElement(By.xpath("//body/div[@id='__next']/footer/div/div/div/div[1]"));
		Thread.sleep(1000);

		// to highlight the Wen_Token
		JavascriptExecutor jse32 = (JavascriptExecutor) driver;
		jse32.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Wen_Token);
		Thread.sleep(1000);

		// Wen_Token is DISPLAYED or not
		boolean res18 = Wen_Token.isDisplayed();

		if (res18 == true) {
			System.out.println("Wen_Token is DISPLAYED ");
		} else {
			System.out.println("Wen_Token is not DISPLAYED");
		}

		// ---------------------------------------------------------------------------------------------
		// locate Email_Field
		WebElement Email_Field = driver.findElement(By.xpath("//input[@placeholder='Enter your email']"));
		Thread.sleep(1000);

		// to highlight the Email_Field
		JavascriptExecutor jse50 = (JavascriptExecutor) driver;
		jse50.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Email_Field);

		// Email_Field is DISPLAYED or not
		boolean res19 = Wen_Token.isDisplayed();

		if (res19 == true) {
			System.out.println("Email_Field is DISPLAYED ");
		} else {
			System.out.println("Email_Field is not DISPLAYED");
		}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------

		// locate See_our_privacy_policy
		WebElement See_our_privacy_policy = driver.findElement(By.xpath("//a[contains(text(),'privacy policy')]"));
		Thread.sleep(1000);

		// to highlight the See_our_privacy_policy
		JavascriptExecutor jse51 = (JavascriptExecutor) driver;
		jse51.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				See_our_privacy_policy);
		Thread.sleep(1000);

		// See_our_privacy_policy is DISPLAYED or not
		boolean res20 = See_our_privacy_policy.isDisplayed();

		if (res20 == true) {
			System.out.println("See_our_privacy_policy is DISPLAYED ");
		} else {
			System.out.println("See_our_privacy_policy is not DISPLAYED");
		}

//				See_our_privacy_policy.click();
//                    Thread.sleep(1000);	
//             driver.navigate().back();
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------

//          // locate Collections_Button1
//     		WebElement Collections_Button1 = driver
//     				.findElement(By.xpath("//div[@id='navbar-search']//a[normalize-space()='Collections']"));
//     		Thread.sleep(1000);
//     		driver.manage().deleteAllCookies();
//
//     		// to highlight the Collection_Button
//     		JavascriptExecutor jse111 = (JavascriptExecutor) driver;
//     		jse111.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
//     				Collections_Button1);
//
//     		Thread.sleep(1000);
//     		driver.manage().deleteAllCookies();
//     		Collections_Button.click();
//     		driver.manage().deleteAllCookies();
//     		Thread.sleep(1000);
//				
		jse16.executeScript("scroll(0, 5000);");

		// -------------------------------------------------------------------------------------------

		// locate digitali_footer
		WebElement digitali_footer = driver
				.findElement(By.xpath("//body/div[@id='__next']/footer/div/div/div/div//*[name()='svg']"));
		// Thread.sleep(1000);

		// to highlight the digitali_footer
		JavascriptExecutor jse33 = (JavascriptExecutor) driver;
		jse33.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				digitali_footer);

		// digitali_footer is DISPLAYED or not
		boolean res21 = digitali_footer.isDisplayed();

		if (res21 == true) {
			System.out.println("digitali_footer is DISPLAYED ");
		} else {
			System.out.println("digitali_footer is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------

		// locate digitali_footer_text
		WebElement digitali_footer_text = driver
				.findElement(By.xpath("//div[contains(text(),'The most trusted NFT encyclopedia')]"));
		Thread.sleep(1000);

		// to highlight the digitali_footer_text
		JavascriptExecutor jse34 = (JavascriptExecutor) driver;
		jse34.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				digitali_footer_text);

		// digitali_footer_text is DISPLAYED or not
		boolean res22 = digitali_footer.isDisplayed();

		if (res22 == true) {
			System.out.println("digitali_footer_text is DISPLAYED ");
		} else {
			System.out.println("digitali_footer_text is not DISPLAYED");
		}
		Thread.sleep(1000);

		// ----------------------------------------------------------------------------------------------------------------

		// locate Explore
		WebElement Explore = driver.findElement(By.xpath("//div[normalize-space()='Explore']"));
		Thread.sleep(1000);

		// to highlight the Explore
		JavascriptExecutor jse35 = (JavascriptExecutor) driver;
		jse35.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Explore);
		Thread.sleep(1000);

		// Explore is DISPLAYED or not
		boolean res23 = Explore.isDisplayed();

		if (res23 == true) {
			System.out.println("Explore is DISPLAYED ");
		} else {
			System.out.println("Explore is not DISPLAYED");
		}

		// --------------------------------------------------------------------------------------------------------------------

		// locate Collection
		WebElement Collection = driver.findElement(By.xpath(
				"//div[@id='__next']//footer//div//div//div//div//div//div//div//a[normalize-space()='Collections']"));
		Thread.sleep(1000);

		// to highlight the Collection
		JavascriptExecutor jse36 = (JavascriptExecutor) driver;
		jse36.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Collection);
		Thread.sleep(1000);

		// Collection is DISPLAYED or not
		boolean res24 = Collection.isDisplayed();

		if (res24 == true) {
			System.out.println("Collection is DISPLAYED ");
		} else {
			System.out.println("Collection is not DISPLAYED");
		}

		// --------------------------------------------------------------------------------------------------------------------

		// locate Leaderboard4
		WebElement Leaderboard4 = driver.findElement(By.xpath(
				"//div[@id='__next']//footer//div//div//div//div//div//div//div//a[normalize-space()='Leaderboard']"));
		Thread.sleep(1000);

		// to highlight the Leaderboard4
		JavascriptExecutor jse37 = (JavascriptExecutor) driver;
		jse37.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Leaderboard4);

		// Leaderboard4 is DISPLAYED or not
		boolean res25 = Leaderboard4.isDisplayed();

		if (res25 == true) {
			System.out.println("Leaderboard4 is DISPLAYED ");
		} else {
			System.out.println("Leaderboard4 is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Reward_Points1
		WebElement Reward_Points1 = driver.findElement(By.xpath("//a[normalize-space()='Reward Points']"));
		Thread.sleep(1000);

		// to highlight the Reward_Points1
		JavascriptExecutor jse38 = (JavascriptExecutor) driver;
		jse38.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Reward_Points1);
		Thread.sleep(1000);

		// Reward_Points1 is DISPLAYED or not
		boolean res26 = Reward_Points1.isDisplayed();

		if (res26 == true) {
			System.out.println("Reward_Points1 is DISPLAYED ");
		} else {
			System.out.println("Reward_Points1 is not DISPLAYED");
		}

		// --------------------------------------------------------------------------------------------------------------------

		// locate About_us1
		WebElement About_us1 = driver.findElement(By.xpath("//div[normalize-space()='About Us']"));
		Thread.sleep(1000);

		// to highlight the About_us1
		JavascriptExecutor jse40 = (JavascriptExecutor) driver;
		jse40.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", About_us1);
		Thread.sleep(1000);

		// About_us1 is DISPLAYED or not
		boolean res27 = About_us1.isDisplayed();

		if (res27 == true) {
			System.out.println("About_us1 is DISPLAYED ");
		} else {
			System.out.println("About_us1 is not DISPLAYED");
		}

		// --------------------------------------------------------------------------------------------------------------------

		// locate Digitali
		WebElement Digitali = driver.findElement(By.xpath("//a[normalize-space()='Digitali']"));
		Thread.sleep(1000);

		// to highlight the Digitali
		JavascriptExecutor jse39 = (JavascriptExecutor) driver;
		jse39.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Digitali);
		Thread.sleep(1000);

		// Digitali is DISPLAYED or not
		boolean res28 = Digitali.isDisplayed();

		if (res28 == true) {
			System.out.println("Digitali is DISPLAYED ");
		} else {
			System.out.println("Digitali is not DISPLAYED");
		}

		// -------------------------------------------------------------------

		// locate Blogs_footer
		WebElement Blogs_footer = driver.findElement(By.xpath("//a[normalize-space()='Blogs']"));
		// Thread.sleep(1000);

		// to highlight the Blogs_footer
		JavascriptExecutor jse41 = (JavascriptExecutor) driver;
		jse41.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Blogs_footer);
		Thread.sleep(1000);

		// Blogs_footer is DISPLAYED or not
		boolean res29 = Digitali.isDisplayed();

		if (res29 == true) {
			System.out.println("Blogs_footer is DISPLAYED ");
		} else {
			System.out.println("Blogs_footer is not DISPLAYED");
		}

		// --------------------------------------------------------------------------------------------------------------------

		// locate FAQ
		WebElement FAQ = driver.findElement(By.xpath("//a[normalize-space()='FAQ']"));
		Thread.sleep(1000);

		// to highlight the FAQ
		JavascriptExecutor jse42 = (JavascriptExecutor) driver;
		jse42.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", FAQ);
		Thread.sleep(1000);

		// FAQ is DISPLAYED or not
		boolean res30 = FAQ.isDisplayed();

		if (res30 == true) {
			System.out.println("FAQ is DISPLAYED ");
		} else {
			System.out.println("FAQ is not DISPLAYED");
		}

		// --------------------------------------------------------------------------------------------------------------------

		// locate Legal
		WebElement Legal = driver.findElement(By.xpath("//div[normalize-space()='Legal']"));
		Thread.sleep(1000);

		// to highlight the Legal
		JavascriptExecutor jse43 = (JavascriptExecutor) driver;
		jse43.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Legal);
		Thread.sleep(1000);

		// Legal is DISPLAYED or not
		boolean res31 = Legal.isDisplayed();

		if (res31 == true) {
			System.out.println("Legal is DISPLAYED ");
		} else {
			System.out.println("Legal is not DISPLAYED");
		}

		// --------------------------------------------------------------------------------------------------------------------

		// locate Terms
		WebElement Terms = driver.findElement(By.xpath("//a[normalize-space()='Terms']"));
		Thread.sleep(1000);

		// to highlight the Terms
		JavascriptExecutor jse44 = (JavascriptExecutor) driver;
		jse44.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Terms);
		Thread.sleep(1000);

		// Terms is DISPLAYED or not
		boolean res32 = Legal.isDisplayed();

		if (res32 == true) {
			System.out.println("Terms is DISPLAYED ");
		} else {
			System.out.println("Terms is not DISPLAYED");
		}

		// --------------------------------------------------------------------------------------------------------------------

		// locate Privacy
		WebElement Privacy = driver.findElement(By.xpath("//a[normalize-space()='Privacy']"));
		Thread.sleep(1000);

		// to highlight the Privacy
		JavascriptExecutor jse45 = (JavascriptExecutor) driver;
		jse45.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Privacy);
		Thread.sleep(1000);

		// Privacy is DISPLAYED or not
		boolean res33 = Legal.isDisplayed();

		if (res33 == true) {
			System.out.println("Privacy is DISPLAYED ");
		} else {
			System.out.println("Privacy is not DISPLAYED");
		}
		// ---------------------------------------------------------------------------------------------------------

		// locate All_Rights_Reserved
		WebElement All_Rights_Reserved = driver
				.findElement(By.xpath("//div[contains(text(),'© 2023 Digitali Technology Solutions Ltd. All righ')]"));
		Thread.sleep(1000);

		// to highlight the Privacy
		JavascriptExecutor jse46 = (JavascriptExecutor) driver;
		jse46.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				All_Rights_Reserved);
		Thread.sleep(1000);

		// All_Rights_Reserved is DISPLAYED or not
		boolean res34 = All_Rights_Reserved.isDisplayed();

		if (res34 == true) {
			System.out.println("All_Rights_Reserved is DISPLAYED ");
		} else {
			System.out.println("All_Rights_Reserved is not DISPLAYED");
		}

		// -----------------------------------------------------------------------------------------------------------------
//
//		// locate Twitter_Icon
//		WebElement Twitter_Icon = driver.findElement(
//				By.xpath("//body/div[@id='__next']/footer[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/a[1]/*[1]"));
//		Thread.sleep(1000);
//
//		// to highlight the Twitter_Icon
//		JavascriptExecutor jse47 = (JavascriptExecutor) driver;
//		jse47.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
//				Twitter_Icon);
//		Thread.sleep(1000);
//
//		// -----------------------------------------------------------------------------------------------------------------
//
//		// locate Discord_Icon
//		WebElement Discord_Icon = driver.findElement(
//				By.xpath("//a[@href='https://discord.com/invite/dCYTykjgxW']//*[name()='svg']"));
//		Thread.sleep(1000);
//
//		// to highlight the Discord_Icon
//		JavascriptExecutor jse48 = (JavascriptExecutor) driver;
//		jse48.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
//				Discord_Icon);
		Thread.sleep(1000);
		driver.close();
		driver.quit();
	}

	@Test
	public void About_us() throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\praka\\Downloads\\edgedriver_win64 (2)\\msedgedriver.exe");
		// System.setProperty("webdriver.edge.driver",
		// "C:\\Users\\praka\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");

		// up casting
		WebDriver driver = new EdgeDriver();

		// get URL
		driver.get("https://digitali.xyz/");
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// maximize
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);

		// locate About_us
		WebElement About_us = driver
				.findElement(By.xpath("//div[@id='navbar-search']//a[normalize-space()='About Us']"));
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();

		// to highlight the About_us
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", About_us);

		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// About_us is DISPLAYED or not
		boolean res = About_us.isDisplayed();

		if (res == true) {
			System.out.println("About_us is DISPLAYED");
		} else {
			System.out.println("About_us is not DISPLAYED");
		}
		About_us.click();
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);

		// -------------------------------------------------------------------------------------

		// locate About_us_Heading
		WebElement About_us_Heading = driver.findElement(By.xpath("//div[contains(text(),'About Digitali')]"));
		Thread.sleep(1000);

		// to highlight the About_us_Heading
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				About_us_Heading);

		// About_us_Heading is DISPLAYED or not
		boolean res1 = About_us_Heading.isDisplayed();

		if (res1 == true) {
			System.out.println("About_us_Heading is DISPLAYED");
		} else {
			System.out.println("About_us_Heading is not DISPLAYED");
		}

		Thread.sleep(1000);

		// -------------------------------------------------------------------------------

		// locate Our_Mission
		WebElement Our_Mission = driver.findElement(By.xpath("//div[normalize-space()='Our Mission']"));
		Thread.sleep(1000);

		// to highlight the Our_Mission
		JavascriptExecutor jse3 = (JavascriptExecutor) driver;
		jse3.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Our_Mission);

		// About_us_Heading is DISPLAYED or not
		boolean res2 = About_us_Heading.isDisplayed();

		if (res2 == true) {
			System.out.println("About_us_Heading is DISPLAYED");
		} else {
			System.out.println("About_us_Heading is not DISPLAYED");
		}

		Thread.sleep(1000);

		// ------------------------------------------------------------------------------------------------

		// locate Text1
		WebElement Text1 = driver
				.findElement(By.xpath("//p[contains(text(),'Our mission is straightforward: to empower the com')]"));
		Thread.sleep(1000);

		// to highlight the Text1
		JavascriptExecutor jse4 = (JavascriptExecutor) driver;
		jse4.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text1);

		// Text1 is DISPLAYED or not
		boolean res3 = About_us_Heading.isDisplayed();

		if (res3 == true) {
			System.out.println("Text1 is DISPLAYED");
		} else {
			System.out.println("Text1 is not DISPLAYED");
		}

		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------

		// locate Text2
		WebElement Text2 = driver
				.findElement(By.xpath("//p[contains(text(),'Our community is building a comprehensive informat')]"));
		Thread.sleep(1000);

		// to highlight the Text2
		JavascriptExecutor jse5 = (JavascriptExecutor) driver;
		jse5.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text2);

		// Text2 is DISPLAYED or not
		boolean res4 = Text2.isDisplayed();

		if (res4 == true) {
			System.out.println("Text2 is DISPLAYED");
		} else {
			System.out.println("Text2 is not DISPLAYED");
		}

		Thread.sleep(1000);

		// -------------------------------------------------------------------

		// locate Text3
		WebElement Text3 = driver
				.findElement(By.xpath("//p[contains(text(),\"Here's what you'll find when you explore Digitali:\")]"));
		Thread.sleep(1000);

		// to highlight the Text3
		JavascriptExecutor jse6 = (JavascriptExecutor) driver;
		jse6.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text3);

		Thread.sleep(1000);

		// Text3 is DISPLAYED or not
		boolean res5 = Text3.isDisplayed();

		if (res5 == true) {
			System.out.println("Text3 is DISPLAYED");
		} else {
			System.out.println("Text3 is not DISPLAYED");
		}

		jse6.executeScript("scroll(0, 400);");

		// --------------------------------------------------------------------------------------------

		// locate Text4
		WebElement Text4 = driver.findElement(By.xpath("//li[normalize-space()='Its History']"));
		Thread.sleep(1000);

		// to highlight the Text4
		JavascriptExecutor jse7 = (JavascriptExecutor) driver;
		jse7.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text4);

		// Text4 is DISPLAYED or not
		boolean res6 = Text4.isDisplayed();

		if (res6 == true) {
			System.out.println("Text4 is DISPLAYED");
		} else {
			System.out.println("Text4 is not DISPLAYED");
		}

		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------

		// locate Text5
		WebElement Text5 = driver.findElement(By.xpath("//li[normalize-space()='The Founders']"));
		Thread.sleep(1000);

		// to highlight the Text5
		JavascriptExecutor jse8 = (JavascriptExecutor) driver;
		jse8.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text5);

		// Text5 is DISPLAYED or not
		boolean res7 = Text5.isDisplayed();

		if (res7 == true) {
			System.out.println("Text5 is DISPLAYED");
		} else {
			System.out.println("Text5 is not DISPLAYED");
		}

		Thread.sleep(1000);

		// -------------------------------------------------------------------------------------------------

		// locate Text6
		WebElement Text6 = driver.findElement(By.xpath("//li[normalize-space()='The Founders']"));
		Thread.sleep(1000);

		// to highlight the Text6
		JavascriptExecutor jse9 = (JavascriptExecutor) driver;
		jse9.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text6);

		// Text6 is DISPLAYED or not
		boolean res8 = Text6.isDisplayed();

		if (res8 == true) {
			System.out.println("Text6 is DISPLAYED");
		} else {
			System.out.println("Text6 is not DISPLAYED");
		}

		Thread.sleep(1000);

		// -------------------------------------------------------------------------------------------------------

		// locate Text7
		WebElement Text7 = driver.findElement(By.xpath("//li[normalize-space()='NFT Characteristics']"));
		Thread.sleep(1000);

		// to highlight the Text7
		JavascriptExecutor jse10 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text7);

		// Text7 is DISPLAYED or not
		boolean res9 = Text7.isDisplayed();

		if (res9 == true) {
			System.out.println("Text7 is DISPLAYED");
		} else {
			System.out.println("Text7 is not DISPLAYED");
		}

		Thread.sleep(1000);

		// ----------------------------------------------------------------------------------------------

		// locate Text8
		WebElement Text8 = driver.findElement(By.xpath("//li[normalize-space()='Rarity Traits']"));
		Thread.sleep(1000);

		// to highlight the Text8
		JavascriptExecutor jse11 = (JavascriptExecutor) driver;
		jse11.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text8);

		// Text8 is DISPLAYED or not
		boolean res10 = Text8.isDisplayed();

		if (res10 == true) {
			System.out.println("Text8 is DISPLAYED");
		} else {
			System.out.println("Text8 is not DISPLAYED");
		}

		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------

		// locate Text9
		WebElement Text9 = driver.findElement(By.xpath("//li[normalize-space()='Functionality']"));
		Thread.sleep(1000);

		// to highlight the Text9
		JavascriptExecutor jse12 = (JavascriptExecutor) driver;
		jse12.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text9);

		// Text9 is DISPLAYED or not
		boolean res11 = Text9.isDisplayed();

		if (res11 == true) {
			System.out.println("Text9 is DISPLAYED");
		} else {
			System.out.println("Text9 is not DISPLAYED");
		}

		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------

		// locate Text10
		WebElement Text10 = driver.findElement(By.xpath("//li[normalize-space()='NFT Ownership Rights']"));
		Thread.sleep(1000);

		// to highlight the Text10
		JavascriptExecutor jse13 = (JavascriptExecutor) driver;
		jse13.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text10);

		// Text10 is DISPLAYED or not
		boolean res12 = Text10.isDisplayed();

		if (res12 == true) {
			System.out.println("Text10 is DISPLAYED");
		} else {
			System.out.println("Text10 is not DISPLAYED");
		}

		Thread.sleep(1000);

		jse13.executeScript("scroll(0, 600);");

		// ------------------------------------------------------------------------------------------------

		// locate Core_Principles
		WebElement Core_Principles = driver.findElement(By.xpath("//div[normalize-space()='Core Principles']"));
		Thread.sleep(1000);

		// to highlight the Core_Principles
		JavascriptExecutor jse14 = (JavascriptExecutor) driver;
		jse14.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Core_Principles);

		// Core_Principles is DISPLAYED or not
		boolean res13 = Core_Principles.isDisplayed();

		if (res13 == true) {
			System.out.println("Core_Principles is DISPLAYED");
		} else {
			System.out.println("Core_Principles is not DISPLAYED");
		}

		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------

		// locate Neutrality
		WebElement Neutrality = driver.findElement(By.xpath("//div[normalize-space()='Neutrality']"));
		Thread.sleep(1000);

		// to highlight the Neutrality
		JavascriptExecutor jse15 = (JavascriptExecutor) driver;
		jse15.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Neutrality);

		// Neutrality is DISPLAYED or not
		boolean res14 = Neutrality.isDisplayed();

		if (res14 == true) {
			System.out.println("Neutrality is DISPLAYED");
		} else {
			System.out.println("Neutrality is not DISPLAYED");
		}

		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------

		// locate Clarity
		WebElement Clarity = driver.findElement(By.xpath("//div[normalize-space()='Clarity']"));
		Thread.sleep(1000);

		// to highlight the Neutrality
		JavascriptExecutor jse16 = (JavascriptExecutor) driver;
		jse16.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Clarity);

		// Clarity is DISPLAYED or not
		boolean res15 = Clarity.isDisplayed();

		if (res15 == true) {
			System.out.println("Clarity is DISPLAYED");
		} else {
			System.out.println("Clarity is not DISPLAYED");
		}

		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------

		// locate Transparency
		WebElement Transparency = driver.findElement(By.xpath("//div[normalize-space()='Transparency']"));
		Thread.sleep(1000);

		// to highlight the Transparency
		JavascriptExecutor jse17 = (JavascriptExecutor) driver;
		jse17.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Transparency);

		// Transparency is DISPLAYED or not
		boolean res16 = Transparency.isDisplayed();

		if (res16 == true) {
			System.out.println("Transparency is DISPLAYED");
		} else {
			System.out.println("Transparency is not DISPLAYED");
		}

		Thread.sleep(1000);
		jse17.executeScript("scroll(0, 1300);");

		// --------------------------------------------------------------------------------

		// locate Why_Digitali?
		WebElement Why_Digitali = driver.findElement(By.xpath("//div[normalize-space()='Why Digitali?']"));
		Thread.sleep(1000);

		// to highlight the Why_Digitali
		JavascriptExecutor jse18 = (JavascriptExecutor) driver;
		jse18.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Why_Digitali);

		// Why_Digitali is DISPLAYED or not
		boolean res17 = Transparency.isDisplayed();

		if (res17 == true) {
			System.out.println("Why_Digitali is DISPLAYED");
		} else {
			System.out.println("Why_Digitali is not DISPLAYED");
		}

		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------

		// locate Text11
		WebElement Text11 = driver
				.findElement(By.xpath("//p[contains(text(),'The NFT industry currently lacks a reliable reposi')]"));
		Thread.sleep(1000);

		// to highlight the Text11
		JavascriptExecutor jse19 = (JavascriptExecutor) driver;
		jse19.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text11);

		// Text11 is DISPLAYED or not
		boolean res18 = Text11.isDisplayed();

		if (res18 == true) {
			System.out.println("Text11 is DISPLAYED");
		} else {
			System.out.println("Text11 is not DISPLAYED");
		}

		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------

		// locate Text12
		WebElement Text12 = driver
				.findElement(By.xpath("//p[contains(text(),'Researching a collection often involves sifting th')]"));
		Thread.sleep(1000);

		// to highlight the Text12
		JavascriptExecutor jse20 = (JavascriptExecutor) driver;
		jse20.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text12);

		// Text12 is DISPLAYED or not
		boolean res19 = Text12.isDisplayed();

		if (res19 == true) {
			System.out.println("Text12 is DISPLAYED");
		} else {
			System.out.println("Text12 is not DISPLAYED");
		}

		Thread.sleep(1000);

		// ----------------------------------------------------------------------------------------------

		// locate Text13
		WebElement Text13 = driver
				.findElement(By.xpath("//p[contains(text(),\"Digitali's mission is to simplify this process.\")]"));
		Thread.sleep(1000);

		// to highlight the Text13
		JavascriptExecutor jse21 = (JavascriptExecutor) driver;
		jse21.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text13);

		// Text13 is DISPLAYED or not
		boolean res20 = Text13.isDisplayed();

		if (res20 == true) {
			System.out.println("Text13 is DISPLAYED");
		} else {
			System.out.println("Text13 is not DISPLAYED");
		}

		Thread.sleep(1000);

		// -------------------------------------------------------------------------------------------------------------------

		// locate Text14
		WebElement Text14 = driver
				.findElement(By.xpath("//p[contains(text(),'We aim to provide a one-stop, trusted, and reliabl')]"));
		Thread.sleep(1000);

		// to highlight the Text14
		JavascriptExecutor jse22 = (JavascriptExecutor) driver;
		jse22.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text14);

		// Text14 is DISPLAYED or not
		boolean res21 = Text14.isDisplayed();

		if (res21 == true) {
			System.out.println("Text14 is DISPLAYED");
		} else {
			System.out.println("Text14 is not DISPLAYED");
		}

		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------

		// locate Text15
		WebElement Text15 = driver
				.findElement(By.xpath("//p[contains(text(),\"We're building Digitali to meet our own needs and \")]"));
		Thread.sleep(1000);

		// to highlight the Text15
		JavascriptExecutor jse23 = (JavascriptExecutor) driver;
		jse23.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text15);

		// Text15 is DISPLAYED or not
		boolean res22 = Text15.isDisplayed();

		if (res22 == true) {
			System.out.println("Text15 is DISPLAYED");
		} else {
			System.out.println("Text15 is not DISPLAYED");
		}

		Thread.sleep(1000);
		jse23.executeScript("scroll(0, 1900);");
		// --------------------------------------------------------------------------------------------------------

		// locate Primary Objectives
		WebElement Primary_Objectives = driver.findElement(By.xpath("//div[contains(text(),'Primary Objectives')]"));
		Thread.sleep(1000);

		// to highlight the Primary_Objectives
		JavascriptExecutor jse24 = (JavascriptExecutor) driver;
		jse24.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Primary_Objectives);

		// Primary_Objectives is DISPLAYED or not
		boolean res23 = Primary_Objectives.isDisplayed();

		if (res23 == true) {
			System.out.println("Primary_Objectives is DISPLAYED");
		} else {
			System.out.println("Primary_Objectives is not DISPLAYED");
		}

		Thread.sleep(1000);
		jse23.executeScript("scroll(0, 1000);");

		// ------------------------------------------------------------------------------------------------
		// locate Submitting_content_that_is_balanced_accurate
		WebElement Submitting_content_that_is_balanced_accurate = driver
				.findElement(By.xpath("//p[contains(text(),'Submitting content that is balanced, accurate, ref')]"));
		Thread.sleep(1000);

		// to highlight the Submitting_content_that_is_balanced_accurate
		JavascriptExecutor jse224 = (JavascriptExecutor) driver;
		jse224.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Submitting_content_that_is_balanced_accurate);

		Thread.sleep(1000);
		jse224.executeScript("scroll(0, 2000);");

		// ----------------------------------------------------------------------
		// locate Building_the_NFT
		WebElement Building_the_NFT = driver
				.findElement(By.xpath("//div[contains(text(),'Building the definitive Web3 Wiki for NFT collecti')]"));
		Thread.sleep(1000);

		// to highlight the Building_the_NFT
		JavascriptExecutor jse25 = (JavascriptExecutor) driver;
		jse25.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Building_the_NFT);

		Thread.sleep(1000);

		// ------------------------------------------------------------------------------------------------

		// locate Building_awareness
		WebElement Building_awareness = driver
				.findElement(By.xpath("//div[contains(text(),'Building awareness of Digitali to drive content co')]"));
		Thread.sleep(1000);

		// to highlight the Building_awareness
		JavascriptExecutor jse26 = (JavascriptExecutor) driver;
		jse26.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Building_awareness);

		Thread.sleep(1000);

		// ------------------------------------------------------------------------------------------------

		// locate Recording_submissions
		WebElement Recording_submissions = driver
				.findElement(By.xpath("//div[contains(text(),'Recording submissions and rewarding our users for ')]"));
		Thread.sleep(1000);

		// to highlight the Recording_submissions
		JavascriptExecutor jse27 = (JavascriptExecutor) driver;
		jse27.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Recording_submissions);

		Thread.sleep(1000);
		jse23.executeScript("scroll(0, 2400);");

//			// -------------------------------------------------------------------------------------------------

		// locate Reward_Points_Digitali_Token
		WebElement Reward_Points_Digitali_Token = driver
				.findElement(By.xpath("//div[normalize-space()='Reward Points & Digitali Token']"));
		Thread.sleep(1000);

		// to highlight the Reward_Points_Digitali_Token
		JavascriptExecutor jse28 = (JavascriptExecutor) driver;
		jse28.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Reward_Points_Digitali_Token);

		// Reward_Points_Digitali_Token is DISPLAYED or not
		boolean res24 = Reward_Points_Digitali_Token.isDisplayed();

		if (res24 == true) {
			System.out.println("Reward_Points_Digitali_Token is DISPLAYED");
		} else {
			System.out.println("Reward_Points_Digitali_Token is not DISPLAYED");
		}

		Thread.sleep(1000);

		// ------------------------------------------------------------------------------------------

		// locate Our_community_ofcontributors_plays_a_pivotal_role
		WebElement Our_community_ofcontributors_plays_a_pivotal_role = driver
				.findElement(By.xpath("//p[contains(text(),'Our community of contributors plays a pivotal role')]"));
		Thread.sleep(1000);

		// to highlight the Our_community_ofcontributors_plays_a_pivotal_role
		JavascriptExecutor jse29 = (JavascriptExecutor) driver;
		jse29.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Our_community_ofcontributors_plays_a_pivotal_role);

		Thread.sleep(1000);
		//
		// ------------------------------------------------------------------------------------------------------------

		// locate_In_preparation_for_the_launch_of_a_Digitali_token
		WebElement locate_In_preparation_for_the_launch_of_a_Digitali_token = driver
				.findElement(By.xpath("//p[contains(text(),'In preparation for the launch of a Digitali token,')]"));
		Thread.sleep(1000);

		// to highlight the locate_In_preparation_for_the_launch_of_a_Digitali_token
		JavascriptExecutor jse30 = (JavascriptExecutor) driver;
		jse30.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				locate_In_preparation_for_the_launch_of_a_Digitali_token);

		Thread.sleep(1000);
		jse23.executeScript("scroll(0, 2600);");
		//
//			// -----------------------------------------------------------------------------------------------
		//
		// locate Reward_Points
		WebElement Reward_Points = driver.findElement(By.xpath(
				"//p[contains(text(),'In preparation for the launch of a Digitali token,')]//a[normalize-space()='Reward Points']"));
		Thread.sleep(1000);

		// to highlight the Reward_Points
		JavascriptExecutor jse31 = (JavascriptExecutor) driver;
		jse31.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Reward_Points);

		Thread.sleep(1000);
		Reward_Points.click();
		Thread.sleep(1000);
		driver.navigate().back();

		jse16.executeScript("scroll(0, 2300);");

		//// -----------------------------------------------------------------------------------------------------------

		// locate FAQ
		WebElement FAQ = driver
				.findElement(By.xpath("//p[contains(text(),'More information about')]//a[normalize-space()='FAQ']"));
		Thread.sleep(1000);

		// to highlight the FAQ
		JavascriptExecutor jse32 = (JavascriptExecutor) driver;
		jse32.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", FAQ);

		Thread.sleep(1000);
		FAQ.click();
		Thread.sleep(1000);
		driver.navigate().back();

		jse32.executeScript("scroll(0, 2600);");
		//
//			// -------------------------------------------------------------------------------------------------

		// locate More_information_about
		WebElement More_information_about = driver
				.findElement(By.xpath("//p[contains(text(),'More information about')]"));
		Thread.sleep(2000);

		// to highlight the More_information_about
		JavascriptExecutor jse33 = (JavascriptExecutor) driver;
		jse33.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				More_information_about);

		Thread.sleep(1000);
		//
//			// ------------------------------------------------------------------------------------------------------------------

		// locate As_we_achieve_milestones_in_terms_of_contributors
		WebElement As_we_achieve_milestones_in_terms_of_contributors = driver
				.findElement(By.xpath("//p[contains(text(),'As we achieve milestones in terms of contributors ')]"));
		Thread.sleep(1000);

		// to highlight the As_we_achieve_milestones_in_terms_of_contributors
		JavascriptExecutor jse34 = (JavascriptExecutor) driver;
		jse34.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				As_we_achieve_milestones_in_terms_of_contributors);

		Thread.sleep(1000);

//			// ----------------------------------------------------------------------------------------------

		// locate Meet_our_team
		WebElement Meet_our_team = driver.findElement(By.xpath("//div[normalize-space()='Meet our team']"));
		Thread.sleep(1000);

		// to highlight the Meet_our_team
		JavascriptExecutor jse35 = (JavascriptExecutor) driver;
		jse35.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Meet_our_team);

		// Meet_our_team is DISPLAYED or not
		boolean res25 = Meet_our_team.isDisplayed();

		if (res25 == true) {
			System.out.println("Meet_our_team is DISPLAYED");
		} else {
			System.out.println("Meet_our_team is not DISPLAYED");
		}

		Thread.sleep(1000);
		//
//			// ---------------------------------------------------------------------------------------------------
		//
		// locate We_are_Cumberland_Labs_an_early_stage_Web3_incuba
		WebElement We_are_Cumberland_Labs_an_early_stage_Web3_incuba = driver
				.findElement(By.xpath("//p[contains(text(),'We are Cumberland Labs, an early-stage Web3 incuba')]"));
		Thread.sleep(1000);

		// to highlight the We_are_Cumberland_Labs_an_early_stage_Web3_incuba
		JavascriptExecutor jse36 = (JavascriptExecutor) driver;
		jse36.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				We_are_Cumberland_Labs_an_early_stage_Web3_incuba);

		Thread.sleep(1000);
		//
		// ---------------------------------------------------------------------------------------------------

		// locate Our_team_comprises_builders_founders_product_man
		WebElement Our_team_comprises_builders_founders_product_man = driver
				.findElement(By.xpath("//p[contains(text(),'Our team comprises builders, founders, product man')]"));
		Thread.sleep(1000);

		// to highlight the Our_team_comprises_builders_founders_product_man
		JavascriptExecutor jse37 = (JavascriptExecutor) driver;
		jse37.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Our_team_comprises_builders_founders_product_man);

		Thread.sleep(1000);
		//
		//// ---------------------------------------------------------------------------------------------------
		//
		// locate Feel_free_to_reach_out_to_us_at_Digitali_anytime_v
		WebElement Feel_free_to_reach_out_to_us_at_Digitali_anytime_v = driver
				.findElement(By.xpath("//p[contains(text(),'Feel free to reach out to us at Digitali anytime v')]"));
		Thread.sleep(1000);

		// to highlight the Feel_free_to_reach_out_to_us_at_Digitali_anytime_v
		JavascriptExecutor jse38 = (JavascriptExecutor) driver;
		jse38.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Feel_free_to_reach_out_to_us_at_Digitali_anytime_v);

		Thread.sleep(1000);

		//// ---------------------------------------------------------------------------------------------------
		//
		// locate For_more_details_about_our_content_review_process
		WebElement For_more_details_about_our_content_review_process = driver
				.findElement(By.xpath("//p[contains(text(),'For more details about our content, review process')]"));
		Thread.sleep(1000);

		// to highlight the For_more_details_about_our_content_review_process
		JavascriptExecutor jse39 = (JavascriptExecutor) driver;
		jse39.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				For_more_details_about_our_content_review_process);

		Thread.sleep(1000);
		jse39.executeScript("scroll(0, 3200);");

		//// ---------------------------------------------------------------------------------------------------

		// locate Tama
		WebElement Tama = driver
				.findElement(By.xpath("//body[1]/div[1]/div[1]/main[1]/div[1]/div[14]/div[1]/div[1]/div[1]"));
		Thread.sleep(1000);

		// to highlight the Tama
		JavascriptExecutor jse40 = (JavascriptExecutor) driver;
		jse40.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Tama);

		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------

		// locate David
		WebElement David = driver
				.findElement(By.xpath("//body[1]/div[1]/div[1]/main[1]/div[1]/div[14]/div[1]/div[2]/div[1]"));
		Thread.sleep(1000);

		// to highlight the David
		JavascriptExecutor jse41 = (JavascriptExecutor) driver;
		jse41.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", David);

		Thread.sleep(1000);
		//
		//// ---------------------------------------------------------------------------------------------------
		// locate Saqib
		WebElement Saqib = driver
				.findElement(By.xpath("//body[1]/div[1]/div[1]/main[1]/div[1]/div[14]/div[1]/div[3]/div[1]"));
		Thread.sleep(1000);

		// to highlight the Saqib
		JavascriptExecutor jse42 = (JavascriptExecutor) driver;
		jse42.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Saqib);

		Thread.sleep(1000);
		//
		//// ---------------------------------------------------------------------------------------------------
		// locate Tushar
		WebElement Tushar = driver
				.findElement(By.xpath("//body[1]/div[1]/div[1]/main[1]/div[1]/div[14]/div[1]/div[4]/div[1]"));
		Thread.sleep(1000);

		// to highlight the Tushar
		JavascriptExecutor jse43 = (JavascriptExecutor) driver;
		jse43.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Tushar);

		Thread.sleep(1000);
		jse43.executeScript("scroll(0, 3800);");

		//// ---------------------------------------------------------------------------------------------------

		// locate Join_our_team
		WebElement Join_our_team = driver.findElement(By.xpath("//div[normalize-space()='Join our team']"));
		Thread.sleep(1000);

		// to highlight the Join_our_team
		JavascriptExecutor jse44 = (JavascriptExecutor) driver;
		jse44.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Join_our_team);

		// Join_our_team is DISPLAYED or not
		boolean res26 = Join_our_team.isDisplayed();

		if (res26 == true) {
			System.out.println("Join_our_team is DISPLAYED");
		} else {
			System.out.println("Join_our_team is not DISPLAYED");
		}

		Thread.sleep(1000);

		//// ---------------------------------------------------------------------------------------------------
		// locate info_digitali_xyz.xyz
		WebElement info_digitali_xyz = driver.findElement(By.xpath("//a[normalize-space()='info@digitali.xyz']"));
		Thread.sleep(1000);

		// to highlight the info_digitali_xyz
		JavascriptExecutor jse45 = (JavascriptExecutor) driver;
		jse45.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				info_digitali_xyz);

		Thread.sleep(1000);
		//
		//// ---------------------------------------------------------------------------------------------------
		// locate Our_philosophy_is_simple_hire_a_team_of_diverse
		WebElement Our_philosophy_is_simple_hire_a_team_of_diverse = driver
				.findElement(By.xpath("//div[contains(text(),'Our philosophy is simple — hire a team of diverse,')]"));
		Thread.sleep(1000);

		// to highlight the Our_philosophy_is_simple_hire_a_team_of_diverse
		JavascriptExecutor jse46 = (JavascriptExecutor) driver;
		jse46.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Our_philosophy_is_simple_hire_a_team_of_diverse);

		Thread.sleep(1000);
		jse43.executeScript("scroll(0,4500);");
		//
		//// ---------------------------------------------------------------------------------------------------

		// locate Wen_Token
		WebElement Wen_Token = driver.findElement(By.xpath("//body/div[@id='__next']/footer/div/div/div/div[1]"));
		Thread.sleep(1000);

		// to highlight the Wen_Token
		JavascriptExecutor jse47 = (JavascriptExecutor) driver;
		jse47.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Wen_Token);

		// Wen_Token is DISPLAYED or not
		boolean res27 = Wen_Token.isDisplayed();

		if (res27 == true) {
			System.out.println("Wen_Token is DISPLAYED");
		} else {
			System.out.println("Wen_Token is not DISPLAYED");
		}

		Thread.sleep(1000);

//			// ---------------------------------------------------------------------------------------------
		// locate Email_Field
		WebElement Email_Field = driver.findElement(By.xpath("//input[@placeholder='Enter your email']"));
		Thread.sleep(1000);

		// to highlight the Wen_Token
		JavascriptExecutor jse48 = (JavascriptExecutor) driver;
		jse48.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Email_Field);

		// Email_Field is DISPLAYED or not
		boolean res28 = Email_Field.isDisplayed();

		if (res28 == true) {
			System.out.println("Email_Field is DISPLAYED");
		} else {
			System.out.println("Email_Field is not DISPLAYED");
		}

		Thread.sleep(1000);

		// -----------------------------------------------------------------------

		// locate See_our_privacy_policy
		WebElement See_our_privacy_policy = driver.findElement(By.xpath("//a[contains(text(),'privacy policy')]"));
		Thread.sleep(1000);

		// to highlight the Wen_Token
		JavascriptExecutor jse49 = (JavascriptExecutor) driver;
		jse49.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				See_our_privacy_policy);
		Thread.sleep(1000);

		// See_our_privacy_policy is DISPLAYED or not
		boolean res29 = See_our_privacy_policy.isDisplayed();

		if (res29 == true) {
			System.out.println("See_our_privacy_policy is DISPLAYED");
		} else {
			System.out.println("See_our_privacy_policy is not DISPLAYED");
		}

		See_our_privacy_policy.click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);

		jse49.executeScript("scroll(0, 5000);");

		// --------------------------------------------------------------------------------------------
		// locate digitali_footer
		WebElement digitali_footer = driver
				.findElement(By.xpath("//body/div[@id='__next']/footer/div/div/div/div//*[name()='svg']"));
		Thread.sleep(1000);

		// to highlight the digitali_footer
		JavascriptExecutor jse50 = (JavascriptExecutor) driver;
		jse50.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				digitali_footer);

		// digitali_footer is DISPLAYED or not
		boolean res30 = digitali_footer.isDisplayed();

		if (res30 == true) {
			System.out.println("digitali_footer is DISPLAYED");
		} else {
			System.out.println("digitali_footer is not DISPLAYED");
		}

		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------

		// locate digitali_footer_text
		WebElement digitali_footer_text = driver
				.findElement(By.xpath("//div[contains(text(),'The most trusted NFT encyclopedia')]"));
		Thread.sleep(1000);

		// to highlight the digitali_footer_text
		JavascriptExecutor jse51 = (JavascriptExecutor) driver;
		jse51.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				digitali_footer_text);

		// digitali_footer_text is DISPLAYED or not
		boolean res31 = digitali_footer_text.isDisplayed();

		if (res31 == true) {
			System.out.println("digitali_footer_text is DISPLAYED");
		} else {
			System.out.println("digitali_footer_text is not DISPLAYED");
		}
		Thread.sleep(1000);

		// ----------------------------------------------------------------------------------------------------------------

		// locate Explore
		WebElement Explore = driver.findElement(By.xpath("//div[normalize-space()='Explore']"));
		Thread.sleep(1000);

		// to highlight the Explore
		JavascriptExecutor jse52 = (JavascriptExecutor) driver;
		jse52.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Explore);

		// Explore is DISPLAYED or not
		boolean res32 = Explore.isDisplayed();

		if (res32 == true) {
			System.out.println("Explore is DISPLAYED");
		} else {
			System.out.println("Explore is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Collection
		WebElement Collections = driver.findElement(
				By.xpath("//body/div[@id='__next']/footer[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/a[1]"));
		Thread.sleep(1000);

		// to highlight the Collections
		JavascriptExecutor jse53 = (JavascriptExecutor) driver;
		jse53.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Collections);

		// Collections is DISPLAYED or not
		boolean res33 = Collections.isDisplayed();

		if (res33 == true) {
			System.out.println("Collections is DISPLAYED");
		} else {
			System.out.println("Collections is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Leaderboard4
		WebElement Leaderboard4 = driver.findElement(By.xpath(
				"//div[@id='__next']//footer//div//div//div//div//div//div//div//a[normalize-space()='Leaderboard']"));
		Thread.sleep(1000);

		// to highlight the Leaderboard4
		JavascriptExecutor jse54 = (JavascriptExecutor) driver;
		jse54.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Leaderboard4);

		// Leaderboard4 is DISPLAYED or not
		boolean res34 = Leaderboard4.isDisplayed();

		if (res34 == true) {
			System.out.println("Leaderboard4 is DISPLAYED");
		} else {
			System.out.println("Leaderboard4 is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Reward_Points1
		WebElement Reward_Points1 = driver.findElement(By.xpath(
				"//div[@id='__next']//footer//div//div//div//div//div//div//div//a[normalize-space()='Reward Points']"));
		Thread.sleep(1000);

		// to highlight the Reward_Points1
		JavascriptExecutor jse55 = (JavascriptExecutor) driver;
		jse55.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Reward_Points1);

		// Reward_Points1 is DISPLAYED or not
		boolean res35 = Reward_Points1.isDisplayed();

		if (res35 == true) {
			System.out.println("Reward_Points1 is DISPLAYED");
		} else {
			System.out.println("Reward_Points1 is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate About_Us1
		WebElement About_Us1 = driver.findElement(By.xpath("//div[normalize-space()='About Us']"));
		Thread.sleep(1000);

		// to highlight the About_Us1
		JavascriptExecutor jse56 = (JavascriptExecutor) driver;
		jse56.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", About_Us1);

		// About_Us1 is DISPLAYED or not
		boolean res36 = Reward_Points1.isDisplayed();

		if (res36 == true) {
			System.out.println("About_Us1 is DISPLAYED");
		} else {
			System.out.println("About_Us1 is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Digitali
		WebElement Digitali = driver.findElement(By.xpath("//a[normalize-space()='Digitali']"));
		Thread.sleep(1000);

		// to highlight the Digitali
		JavascriptExecutor jse57 = (JavascriptExecutor) driver;
		jse57.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Digitali);

		// Digitali is DISPLAYED or not
		boolean res37 = Digitali.isDisplayed();

		if (res37 == true) {
			System.out.println("Digitali is DISPLAYED");
		} else {
			System.out.println("Digitali is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Blogs_footer
		WebElement Blogs_footer = driver.findElement(By.xpath("//a[normalize-space()='Blogs']"));
		Thread.sleep(1000);

		// to highlight the Blogs_footer
		JavascriptExecutor jse58 = (JavascriptExecutor) driver;
		jse58.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Blogs_footer);

		// Blogs_footer is DISPLAYED or not
		boolean res38 = Blogs_footer.isDisplayed();

		if (res38 == true) {
			System.out.println("Blogs_footer is DISPLAYED");
		} else {
			System.out.println("Blogs_footer is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate FAQ1
		WebElement FAQ1 = driver.findElement(
				By.xpath("//div[@id='__next']//footer//div//div//div//div//div//div//div//a[normalize-space()='FAQ']"));
		Thread.sleep(1000);

		// to highlight the FAQ1
		JavascriptExecutor jse59 = (JavascriptExecutor) driver;
		jse59.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", FAQ1);

		// FAQ1 is DISPLAYED or not
		boolean res39 = FAQ1.isDisplayed();

		if (res39 == true) {
			System.out.println("FAQ1 is DISPLAYED");
		} else {
			System.out.println("FAQ1 is not DISPLAYED");
		}
		Thread.sleep(1000);
		Thread.sleep(2000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Legal
		WebElement Legal = driver.findElement(By.xpath("//div[normalize-space()='Legal']"));
		Thread.sleep(1000);

		// to highlight the Legal
		JavascriptExecutor jse60 = (JavascriptExecutor) driver;
		jse60.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Legal);

		// Legal is DISPLAYED or not
		boolean res40 = Legal.isDisplayed();

		if (res40 == true) {
			System.out.println("Legal is DISPLAYED");
		} else {
			System.out.println("Legal is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Terms
		WebElement Terms = driver.findElement(By.xpath("//a[normalize-space()='Terms']"));
		Thread.sleep(1000);

		// to highlight the Terms
		JavascriptExecutor jse61 = (JavascriptExecutor) driver;
		jse61.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Terms);

		// Terms is DISPLAYED or not
		boolean res41 = Terms.isDisplayed();

		if (res41 == true) {
			System.out.println("Terms is DISPLAYED");
		} else {
			System.out.println("Terms is not DISPLAYED");
		}

		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Privacy
		WebElement Privacy = driver.findElement(By.xpath("//a[normalize-space()='Privacy']"));
		Thread.sleep(1000);

		// to highlight the Privacy
		JavascriptExecutor jse62 = (JavascriptExecutor) driver;
		jse62.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Privacy);

		// Privacy is DISPLAYED or not
		boolean res42 = Privacy.isDisplayed();

		if (res42 == true) {
			System.out.println("Privacy is DISPLAYED");
		} else {
			System.out.println("Privacy is not DISPLAYED");
		}
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------------

		// locate All_Rights_Reserved
		WebElement All_Rights_Reserved = driver
				.findElement(By.xpath("//div[contains(text(),'© 2023 Digitali Technology Solutions Ltd. All righ')]"));
		Thread.sleep(1000);

		// to highlight the All_Rights_Reserved
		JavascriptExecutor jse63 = (JavascriptExecutor) driver;
		jse63.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				All_Rights_Reserved);

		// All_Rights_Reserved is DISPLAYED or not
		boolean res43 = All_Rights_Reserved.isDisplayed();

		if (res43 == true) {
			System.out.println("All_Rights_Reserved is DISPLAYED");
		} else {
			System.out.println("All_Rights_Reserved is not DISPLAYED");
		}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------------

		// locate Twitter_Icon
		WebElement Twitter_Icon = driver.findElement(
				By.xpath("//body/div[@id='__next']/footer[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/a[1]/*[1]"));
		Thread.sleep(1000);

		// to highlight the Twitter_Icon
		JavascriptExecutor jse64 = (JavascriptExecutor) driver;
		jse64.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Twitter_Icon);

		// Twitter_Icon is DISPLAYED or not
		boolean res44 = All_Rights_Reserved.isDisplayed();

		if (res44 == true) {
			System.out.println("Twitter_Icon is DISPLAYED");
		} else {
			System.out.println("Twitter_Icon is not DISPLAYED");
		}

		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------------

		// locate Discord_Icon
		WebElement Discord_Icon = driver.findElement(
				By.xpath("//body/div[@id='__next']/footer[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/a[1]/*[1]"));
		Thread.sleep(1000);

		// to highlight the Discord_Icon
		JavascriptExecutor jse65 = (JavascriptExecutor) driver;
		jse65.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Discord_Icon);

		// Discord_Icon is DISPLAYED or not
		boolean res45 = Discord_Icon.isDisplayed();

		if (res45 == true) {
			System.out.println("Discord_Icon is DISPLAYED");
		} else {
			System.out.println("Discord_Icon is not DISPLAYED");
		}
		Thread.sleep(1000);

		driver.close();
		driver.quit();

	}

	@Test
	public void Add_Content() throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\praka\\Downloads\\edgedriver_win64 (2)\\msedgedriver.exe");
		// System.setProperty("webdriver.edge.driver",
		// "C:\\Users\\praka\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");

		// up casting
		WebDriver driver = new EdgeDriver();

		// get URL
		driver.get("https://digitali.xyz/");
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// maximize
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);

		// -------------------------------------------------------------------------------------------------------------------------------------

		// locate Collections_Button
		WebElement Collections_Button = driver
				.findElement(By.xpath("//div[@id='navbar-search']//a[normalize-space()='Collections']"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Collections_Button
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Collections_Button);

		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// Collections_Button is DISPLAYED or not
		boolean res = Collections_Button.isDisplayed();

		if (res == true) {
			System.out.println("Collections_Button is DISPLAYED AND CLICKABLE");
		} else {
			System.out.println("Collections_Button is not DISPLAYED");
		}

		Collections_Button.click();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);

		// -------------------------------------------------------------------------------------

		// locate Collection
		WebElement Collection = driver.findElement(By.xpath("//span[contains(text(),'Decentraland')]"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Collection
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Collection);
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// Collection is DISPLAYED or not
		boolean res1 = Collection.isDisplayed();

		if (res1 == true) {
			System.out.println("Collection is DISPLAYED AND CLICKABLE");
		} else {
			System.out.println("Collection is not DISPLAYED");
		}
		Collection.click();
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------

		// locate Collection_Name
		WebElement Collection_Name = driver.findElement(By.xpath("//div[contains(text(),'DECENTRALAND')]"));
		Thread.sleep(1000);

		// to highlight the Collection_Name
		JavascriptExecutor jse3 = (JavascriptExecutor) driver;
		jse3.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Collection_Name);
		Thread.sleep(1000);

		// Collection_Name is DISPLAYED or not
		boolean res2 = Collection_Name.isDisplayed();

		if (res2 == true) {
			System.out.println("Collection_Name is DISPLAYED AND CLICKABLE");
		} else {
			System.out.println("Collection_Name is not DISPLAYED");
		}
		Collection_Name.click();
		Thread.sleep(1000);
		jse3.executeScript("scroll(0, 450);");

		// ----------------------------------------------------------------------------------------------------------

		// locate Add_Content
		WebElement Add_Content = driver.findElement(By.xpath("//div[@id='project-information']//div//div//button"));
		Thread.sleep(1000);

		// to highlight the Add_Content
		JavascriptExecutor jse4 = (JavascriptExecutor) driver;
		jse4.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Add_Content);
		Thread.sleep(3000);

		// Add_Content is DISPLAYED or not
		boolean res3 = Add_Content.isDisplayed();

		if (res3 == true) {
			System.out.println("Add_Content is DISPLAYED AND CLICKABLE");
		} else {
			System.out.println("Add_Content is not DISPLAYED");
		}
		Add_Content.click();
		Thread.sleep(3000);
		jse4.executeScript("scroll(0, 650);");

		// ------------------------------------------------------------------------------------------------------------

		// locate Credentials
		WebElement Credentials = driver.findElement(By.xpath("//div[normalize-space()='CREDENTIALS']"));
		Thread.sleep(1000);

		// to highlight the Credentials
		JavascriptExecutor jse5 = (JavascriptExecutor) driver;
		jse5.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Credentials);

		// Credentials is DISPLAYED or not
		boolean res4 = Credentials.isDisplayed();

		if (res4 == true) {
			System.out.println("Credentials is DISPLAYED AND CLICKABLE");
		} else {
			System.out.println("Credentials is not DISPLAYED");
		}
		Thread.sleep(3000);

		// -------------------------------------------------------------------------------------------------------------------------------

		// locate EMAIL_ID
		WebElement EMAIL_ID = driver.findElement(By.xpath("//div[contains(text(),'EMAIL ID*')]"));
		Thread.sleep(1000);

		// to highlight the EMAIL_ID
		JavascriptExecutor jse6 = (JavascriptExecutor) driver;
		jse6.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", EMAIL_ID);

		// EMAIL_ID is DISPLAYED or not
		boolean res5 = EMAIL_ID.isDisplayed();

		if (res5 == true) {
			System.out.println("EMAIL_ID is DISPLAYED ");
		} else {
			System.out.println("EMAIL_ID is not DISPLAYED");
		}

		Thread.sleep(1000);

		// -------------------------------------------------------------------------------------------------------------------------------------

		// locate EMAIL_ID_box
		WebElement EMAIL_ID_box = driver.findElement(By.xpath("//input[@id='userMail']"));
		Thread.sleep(1000);

		// to highlight the EMAIL_ID_box
		JavascriptExecutor jse7 = (JavascriptExecutor) driver;
		jse7.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				EMAIL_ID_box);
		Thread.sleep(1000);

		// EMAIL_ID_box is DISPLAYED or not
		boolean res6 = EMAIL_ID_box.isDisplayed();

		if (res6 == true) {
			System.out.println("EMAIL_ID_box is DISPLAYED ");
		} else {
			System.out.println("EMAIL_ID_box is not DISPLAYED");
		}
		EMAIL_ID_box.clear();
		EMAIL_ID_box.click();
		EMAIL_ID_box.sendKeys("prakash@ix.cumberlandlabs.io");
		Thread.sleep(2000);

		// --------------------------------------------------------------------------------------------------------------------------------------

		// locate ETH_Wallet_Address
		WebElement ETH_Wallet_Address = driver.findElement(By.xpath("//div[contains(text(),'ETH Wallet Address*')]"));
		Thread.sleep(1000);

		// to highlight the ETH_Wallet_Address
		JavascriptExecutor jse8 = (JavascriptExecutor) driver;
		jse8.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				ETH_Wallet_Address);

		// ETH_Wallet_Address is DISPLAYED or not
		boolean res7 = ETH_Wallet_Address.isDisplayed();

		if (res7 == true) {
			System.out.println("ETH_Wallet_Address is DISPLAYED ");
		} else {
			System.out.println("ETH_Wallet_Address is not DISPLAYED");
		}
		Thread.sleep(1000);

		// ------------------------------------------------------------------------------------------------------------

		// locate ETH_Wallet_Address_box
		WebElement ETH_Wallet_Address_box = driver.findElement(By.xpath("//input[@id='userWalletAddress']"));
		Thread.sleep(1000);

		// to highlight the ETH_Wallet_Address_box
		JavascriptExecutor jse9 = (JavascriptExecutor) driver;
		jse9.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				ETH_Wallet_Address_box);
		Thread.sleep(2000);

		// ETH_Wallet_Address_box is DISPLAYED or not
		boolean res8 = ETH_Wallet_Address_box.isDisplayed();

		if (res8 == true) {
			System.out.println("ETH_Wallet_Address_box is DISPLAYED ");
		} else {
			System.out.println("ETH_Wallet_Address_box is not DISPLAYED");
		}
		ETH_Wallet_Address_box.clear();
		ETH_Wallet_Address_box.click();
		ETH_Wallet_Address_box.sendKeys("0x6Fb447Ae94F5180254D436A693907a1f57696900");
		Thread.sleep(2000);
		jse9.executeScript("scroll(0, 950);");

		// ----------------------------------------------------------------------------------------------------------------------------

		// locate Next
		WebElement Next = driver.findElement(By.xpath("//span[normalize-space()='Next']"));
		Thread.sleep(1000);

		// to highlight the Next
		JavascriptExecutor jse10 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')", Next);
		Thread.sleep(1000);

		// Next is DISPLAYED or not
		boolean res9 = Next.isDisplayed();

		if (res9 == true) {
			System.out.println("Next is DISPLAYED ");
		} else {
			System.out.println("Next is not DISPLAYED");
		}
		Next.click();
		Thread.sleep(1000);

		// ----------------------------------------------------------------------------------------------------------------------------

		// locate Project_Information
		WebElement Project_Information = driver
				.findElement(By.xpath("//body/div[@id='__next']/form[@id='form']/div[1]/div[2]"));
		Thread.sleep(1000);

		// to highlight the Credentials
		JavascriptExecutor jse555 = (JavascriptExecutor) driver;
		jse555.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Project_Information);

		// Project_Information is DISPLAYED or not
		boolean res10 = Project_Information.isDisplayed();

		if (res10 == true) {
			System.out.println("Project_Information is DISPLAYED ");
		} else {
			System.out.println("Project_Information is not DISPLAYED");
		}
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------
		// locate Information_box
		WebElement Information_box = driver.findElement(By.xpath("//h2[normalize-space()='Founders']"));
		Thread.sleep(1000);

		// to highlight the Information_box
		JavascriptExecutor jse11 = (JavascriptExecutor) driver;
		jse11.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Information_box);
		Thread.sleep(2000);

		// Information_box is DISPLAYED or not
		boolean res11 = Information_box.isDisplayed();

		if (res11 == true) {
			System.out.println("Information_box is DISPLAYED ");
		} else {
			System.out.println("Information_box is not DISPLAYED");
		}
		Information_box.click();
		Thread.sleep(2000);
		Information_box.sendKeys(
				"Decentraland was established by Argentinians[19] Esteban Ordano and Ariel Meilich in 2015 in Buenos Aires, ArgentinaOrdano, a software engineer, has experience working at BitPay Inc. and as an advisor to Matic Network. He has also founded two software companies, Smart Contract Solutions and Zeppelin Solutions.");
		Thread.sleep(1000);
		jse11.executeScript("scroll(0, 2800);");
		Thread.sleep(2000);
		// --------------------------------------------------------------------------------------------------------

		// locate Next1
		WebElement Next1 = driver.findElement(By.xpath("//span[normalize-space()='Next']"));
		Thread.sleep(1000);

		// to highlight the Next1
		JavascriptExecutor jse12 = (JavascriptExecutor) driver;
		jse12.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')", Next1);

		// Next1 is DISPLAYED or not
		boolean res12 = Next1.isDisplayed();

		if (res12 == true) {
			System.out.println("Next1 is DISPLAYED ");
		} else {
			System.out.println("Next1 is not DISPLAYED");
		}
		Thread.sleep(2000);
		Next1.click();
		Thread.sleep(1000);

		// -------------------------------------------------------------------------------------------------------

		// locate Preview
		WebElement Preview = driver.findElement(By.xpath("//body/div[@id='__next']/form[@id='form']/div[1]/div[3]"));
		Thread.sleep(1000);

		// to highlight the Preview
		JavascriptExecutor jse5555 = (JavascriptExecutor) driver;
		jse5555.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Preview);

		// Preview is DISPLAYED or not
		boolean res13 = Preview.isDisplayed();

		if (res13 == true) {
			System.out.println("Preview is DISPLAYED ");
		} else {
			System.out.println("Preview is not DISPLAYED");
		}
		Thread.sleep(1000);

		// -------------------------------------------------------------------------------------------------------------

		// locate Submit
		WebElement Submit = driver.findElement(By.xpath("//span[contains(text(),'Submit')]"));
		Thread.sleep(1000);

		// to highlight the Submit
		JavascriptExecutor jse55555 = (JavascriptExecutor) driver;
		jse55555.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Submit);
		Thread.sleep(1000);

		// Submit is DISPLAYED or not
		boolean res14 = Submit.isDisplayed();

		if (res14 == true) {
			System.out.println("Submit is DISPLAYED ");
		} else {
			System.out.println("Submit is not DISPLAYED");
		}
		Submit.click();
		Thread.sleep(3000);
		driver.close();
		driver.quit();

	}

	@Test
	public void Blogs() throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\praka\\Downloads\\edgedriver_win64 (2)\\msedgedriver.exe");
		// System.setProperty("webdriver.edge.driver",
		// "C:\\Users\\praka\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");

		// up casting
		WebDriver driver = new EdgeDriver();

		// get URL
		driver.get("https://digitali.xyz/");
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// maximize
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);

		// locate digital logo
		WebElement digitali_logo = driver.findElement(By.xpath("//img[@alt='Digitali Logo']"));

		// to highlight the digitali_logo
		JavascriptExecutor jse00 = (JavascriptExecutor) driver;
		jse00.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				digitali_logo);

		// digitali_logo is DISPLAYED or not
		boolean res = digitali_logo.isDisplayed();

		if (res == true) {
			System.out.println("digitali_logo is DISPLAYED ");
		} else {
			System.out.println("digitali_logo is not DISPLAYED");
		}
		Thread.sleep(1000);

		jse00.executeScript("scroll(0, 5000);");

		// ---------------------------------------------------------------------------------------------------------------------------------

		// locate Blogs
		WebElement Blogs = driver.findElement(By.xpath("//a[normalize-space()='Blogs']"));
		Thread.sleep(1000);

		// to highlight the Blogs
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Blogs);
		Thread.sleep(1000);

		// Blogs is DISPLAYED or not
		boolean res1 = digitali_logo.isDisplayed();

		if (res1 == true) {
			System.out.println("Blogs is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("Blogs is not DISPLAYED");
		}
		Blogs.click();
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------------------------------------

		// locate Heading
		WebElement Heading = driver.findElement(By.xpath("//h2[normalize-space()='Resources and insights']"));
		Thread.sleep(1000);

		// to highlight the Blogs
		JavascriptExecutor jse000 = (JavascriptExecutor) driver;
		jse000.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Heading);

		// Heading is DISPLAYED or not
		boolean res2 = Heading.isDisplayed();

		if (res2 == true) {
			System.out.println("Heading is DISPLAYED  ");
		} else {
			System.out.println("Heading is not DISPLAYED");
		}
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------------------------------------

		// locate News
		WebElement News = driver
				.findElement(By.xpath("//p[contains(text(),'The latest industry news, interviews, technologies')]"));

		// to highlight the News
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", News);

		// News is DISPLAYED or not
		boolean res3 = News.isDisplayed();

		if (res3 == true) {
			System.out.println("News is DISPLAYED  ");
		} else {
			System.out.println("News is not DISPLAYED");
		}
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------------------------------------

		// locate Blog1
		WebElement Blog1 = driver.findElement(By.xpath("//article[1]"));

		// to highlight the Blog1
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Blog1);

		// Blog1 is DISPLAYED or not
		boolean res4 = Blog1.isDisplayed();

		if (res4 == true) {
			System.out.println("Blog1 is DISPLAYED  ");
		} else {
			System.out.println("Blog1 is not DISPLAYED");
		}
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------------------------------------

		// locate Blog2
		WebElement Blog2 = driver.findElement(By.xpath("//article[2]"));

		// to highlight the Blog2
		JavascriptExecutor jse3 = (JavascriptExecutor) driver;
		jse3.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Blog2);

		// Blog2 is DISPLAYED or not
		boolean res5 = Blog2.isDisplayed();

		if (res5 == true) {
			System.out.println("Blog2 is DISPLAYED  ");
		} else {
			System.out.println("Blog2 is not DISPLAYED");
		}
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------------------------------------

		// locate Blog3
		WebElement Blog3 = driver.findElement(By.xpath("//article[3]"));

		// to highlight the Blog3
		JavascriptExecutor jse4 = (JavascriptExecutor) driver;
		jse4.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Blog3);

		// Blog3 is DISPLAYED or not
		boolean res6 = Blog3.isDisplayed();

		if (res6 == true) {
			System.out.println("Blog3 is DISPLAYED  ");
		} else {
			System.out.println("Blog3 is not DISPLAYED");
		}
		Thread.sleep(1000);
		jse4.executeScript("scroll(0, 5000);");

		// ---------------------------------------------------------------------------------------------------------------------------------

		// locate Wen_Token
		WebElement Wen_Token = driver.findElement(By.xpath("//div[normalize-space()='Wen Token?']"));
		Thread.sleep(1000);

		// to highlight the Wen_Token
		JavascriptExecutor jse47 = (JavascriptExecutor) driver;
		jse47.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Wen_Token);

		// Wen_Token is DISPLAYED or not
		boolean res7 = Wen_Token.isDisplayed();

		if (res7 == true) {
			System.out.println("Wen_Token is DISPLAYED  ");
		} else {
			System.out.println("Wen_Token is not DISPLAYED");
		}
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------

		// locate Email_Field
		WebElement Email_Field = driver.findElement(By.xpath("//input[@placeholder='Enter your email']"));
		Thread.sleep(1000);

		// to highlight the Email_Field
		JavascriptExecutor jse48 = (JavascriptExecutor) driver;
		jse48.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Email_Field);

		// Email_Field is DISPLAYED or not
		boolean res8 = Email_Field.isDisplayed();

		if (res8 == true) {
			System.out.println("Email_Field is DISPLAYED  ");
		} else {
			System.out.println("Email_Field is not DISPLAYED");
		}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------

		// locate See_our_privacy_policy
		WebElement See_our_privacy_policy = driver.findElement(By.xpath("//a[contains(text(),'privacy policy')]"));
		Thread.sleep(1000);

		// to highlight the See_our_privacy_policy
		JavascriptExecutor jse49 = (JavascriptExecutor) driver;
		jse49.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				See_our_privacy_policy);
		Thread.sleep(1000);

		// -------------------------------------------------------------------------

		// See_our_privacy_policy is DISPLAYED or not
		boolean res9 = See_our_privacy_policy.isDisplayed();

		if (res9 == true) {
			System.out.println("See_our_privacy_policy is DISPLAYED  ");
		} else {
			System.out.println("See_our_privacy_policy is not DISPLAYED");
		}

		See_our_privacy_policy.click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);

		jse49.executeScript("scroll(0, 5000);");

		// --------------------------------------------------------------------------------------------
		// locate digitali_footer
		WebElement digitali_footer = driver
				.findElement(By.xpath("//body/div[@id='__next']/div/div/div/div/div/div//*[name()='svg']"));
		Thread.sleep(1000);

		// to highlight the digitali_footer
		JavascriptExecutor jse50 = (JavascriptExecutor) driver;
		jse50.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				digitali_footer);

		// digitali_footer is DISPLAYED or not
		boolean res10 = digitali_footer.isDisplayed();

		if (res10 == true) {
			System.out.println("digitali_footer is DISPLAYED  ");
		} else {
			System.out.println("digitali_footer is not DISPLAYED");
		}

		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------

		// locate digitali_footer_text
		WebElement digitali_footer_text = driver
				.findElement(By.xpath("//div[contains(text(),'The most trusted NFT encyclopedia')]"));
		Thread.sleep(1000);

		// to highlight the digitali_footer_text
		JavascriptExecutor jse51 = (JavascriptExecutor) driver;
		jse51.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				digitali_footer_text);

		// digitali_footer_text is DISPLAYED or not
		boolean res11 = digitali_footer_text.isDisplayed();

		if (res11 == true) {
			System.out.println("digitali_footer_text is DISPLAYED  ");
		} else {
			System.out.println("digitali_footer_text is not DISPLAYED");
		}
		Thread.sleep(1000);

		// ----------------------------------------------------------------------------------------------------------------

		// locate Explore
		WebElement Explore = driver.findElement(By.xpath("//div[normalize-space()='Explore']"));
		Thread.sleep(1000);

		// to highlight the Explore
		JavascriptExecutor jse52 = (JavascriptExecutor) driver;
		jse52.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Explore);

		// Explore is DISPLAYED or not
		boolean res12 = Explore.isDisplayed();

		if (res12 == true) {
			System.out.println("Explore is DISPLAYED  ");
		} else {
			System.out.println("Explore is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Collection
		WebElement Collections = driver.findElement(By.xpath(
				"//div[@id='__next']//div//div//div//div//div//div//div//div//div//a[normalize-space()='Collections']"));
		Thread.sleep(1000);

		// to highlight the Collections
		JavascriptExecutor jse53 = (JavascriptExecutor) driver;
		jse53.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Collections);

		// Collections is DISPLAYED or not
		boolean res13 = Collections.isDisplayed();

		if (res13 == true) {
			System.out.println("Collections is DISPLAYED  ");
		} else {
			System.out.println("Collections is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Leaderboard4
		WebElement Leaderboard4 = driver.findElement(By.xpath(
				"//div[@id='__next']//div//div//div//div//div//div//div//div//div//a[normalize-space()='Leaderboard']"));
		Thread.sleep(1000);

		// to highlight the Leaderboard4
		JavascriptExecutor jse54 = (JavascriptExecutor) driver;
		jse54.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Leaderboard4);

		// Leaderboard4 is DISPLAYED or not
		boolean res14 = Leaderboard4.isDisplayed();

		if (res14 == true) {
			System.out.println("Leaderboard4 is DISPLAYED  ");
		} else {
			System.out.println("Leaderboard4 is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Reward_Points1
		WebElement Reward_Points1 = driver.findElement(By.xpath("//a[normalize-space()='Reward Points']"));
		Thread.sleep(1000);

		// to highlight the Reward_Points1
		JavascriptExecutor jse55 = (JavascriptExecutor) driver;
		jse55.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Reward_Points1);

		// Reward_Points1 is DISPLAYED or not
		boolean res15 = Reward_Points1.isDisplayed();

		if (res15 == true) {
			System.out.println("Reward_Points1 is DISPLAYED  ");
		} else {
			System.out.println("Reward_Points1 is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate About_Us1
		WebElement About_Us1 = driver.findElement(By.xpath("//div[normalize-space()='About Us']"));
		Thread.sleep(1000);

		// to highlight the About_Us1
		JavascriptExecutor jse56 = (JavascriptExecutor) driver;
		jse56.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", About_Us1);

		// About_Us1 is DISPLAYED or not
		boolean res16 = About_Us1.isDisplayed();

		if (res16 == true) {
			System.out.println("About_Us1 is DISPLAYED  ");
		} else {
			System.out.println("About_Us1 is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Digitali
		WebElement Digitali = driver.findElement(By.xpath("//a[@href='/about-us'][normalize-space()='Digitali']"));
		Thread.sleep(1000);

		// to highlight the Digitali
		JavascriptExecutor jse57 = (JavascriptExecutor) driver;
		jse57.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Digitali);

		// Digitali is DISPLAYED or not
		boolean res17 = Digitali.isDisplayed();

		if (res17 == true) {
			System.out.println("Digitali is DISPLAYED  ");
		} else {
			System.out.println("Digitali is not DISPLAYED");
		}
		Thread.sleep(000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Blogs_footer
		WebElement Blogs_footer = driver.findElement(By.xpath("//a[normalize-space()='Blogs']"));
		Thread.sleep(1000);

		// to highlight the Blogs_footer
		JavascriptExecutor jse58 = (JavascriptExecutor) driver;
		jse58.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Blogs_footer);

		// Blogs_footer is DISPLAYED or not
		boolean res18 = Blogs_footer.isDisplayed();

		if (res18 == true) {
			System.out.println("Blogs_footer is DISPLAYED  ");
		} else {
			System.out.println("Blogs_footer is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate FAQ1
		WebElement FAQ1 = driver.findElement(By.xpath("//a[normalize-space()='FAQ']"));
		Thread.sleep(1000);

		// to highlight the FAQ1
		JavascriptExecutor jse59 = (JavascriptExecutor) driver;
		jse59.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", FAQ1);

		// FAQ1 is DISPLAYED or not
		boolean res19 = FAQ1.isDisplayed();

		if (res19 == true) {
			System.out.println("FAQ1 is DISPLAYED  ");
		} else {
			System.out.println("FAQ1 is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Legal
		WebElement Legal = driver.findElement(By.xpath("//div[normalize-space()='Legal']"));
		Thread.sleep(1000);

		// to highlight the Legal
		JavascriptExecutor jse60 = (JavascriptExecutor) driver;
		jse60.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Legal);

		// Legal is DISPLAYED or not
		boolean res20 = Legal.isDisplayed();

		if (res20 == true) {
			System.out.println("Legal is DISPLAYED  ");
		} else {
			System.out.println("Legal is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Terms
		WebElement Terms = driver.findElement(By.xpath("//a[normalize-space()='Terms']"));
		Thread.sleep(1000);

		// to highlight the Terms
		JavascriptExecutor jse61 = (JavascriptExecutor) driver;
		jse61.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Terms);

		// Terms is DISPLAYED or not
		boolean res21 = Legal.isDisplayed();

		if (res21 == true) {
			System.out.println("Terms is DISPLAYED  ");
		} else {
			System.out.println("Terms is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Privacy
		WebElement Privacy = driver.findElement(By.xpath("//a[normalize-space()='Privacy']"));
		Thread.sleep(1000);

		// to highlight the Privacy
		JavascriptExecutor jse62 = (JavascriptExecutor) driver;
		jse62.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Privacy);

		// Privacy is DISPLAYED or not
		boolean res22 = Privacy.isDisplayed();

		if (res22 == true) {
			System.out.println("Privacy is DISPLAYED  ");
		} else {
			System.out.println("Privacy is not DISPLAYED");
		}
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------------

		// locate All_Rights_Reserved
		WebElement All_Rights_Reserved = driver
				.findElement(By.xpath("//div[contains(text(),'© 2023 Digitali Technology Solutions Ltd. All righ')]"));
		Thread.sleep(1000);

		// to highlight the All_Rights_Reserved
		JavascriptExecutor jse63 = (JavascriptExecutor) driver;
		jse63.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				All_Rights_Reserved);

		// All_Rights_Reserved is DISPLAYED or not
		boolean res23 = All_Rights_Reserved.isDisplayed();

		if (res23 == true) {
			System.out.println("All_Rights_Reserved is DISPLAYED  ");
		} else {
			System.out.println("All_Rights_Reserved is not DISPLAYED");
		}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------------

//		// locate Twitter_Icon
//		WebElement Twitter_Icon = driver.findElement(
//				By.xpath("//body/div[@id='__next']/footer[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/a[1]/*[1]"));
//		Thread.sleep(1000);
//
//		// to highlight the Twitter_Icon
//		JavascriptExecutor jse64 = (JavascriptExecutor) driver;
//		jse64.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
//				Twitter_Icon);
//		Thread.sleep(1000);
//
//		// -----------------------------------------------------------------------------------------------------------------
//
//		// locate Discord_Icon
//		WebElement Discord_Icon = driver
//				.findElement(By.xpath("//body/div[@id='__next']/footer[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/a[1]/*[1]"));
//		Thread.sleep(1000);
//
//		// to highlight the Discord_Icon
//		JavascriptExecutor jse65 = (JavascriptExecutor) driver;
//		jse65.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
//				Discord_Icon);
//		Thread.sleep(1000);

		driver.close();
		driver.quit();

	}

	@Test
	public void Collection_detail_page() throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\praka\\Downloads\\edgedriver_win64 (2)\\msedgedriver.exe");
		// System.setProperty("webdriver.edge.driver",
		// "C:\\Users\\praka\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");

		// up casting
		WebDriver driver = new EdgeDriver();

		// get URL
		driver.get("https://digitali.xyz/");
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// maximize
		driver.manage().window().maximize();
		Thread.sleep(1000);

		// -------------------------------------------------------------------------------------------

		// locate Collections_Button
		WebElement Collections_Button = driver
				.findElement(By.xpath("//div[@id='navbar-search']//a[normalize-space()='Collections']"));
		Thread.sleep(2000);

		driver.manage().deleteAllCookies();

		// to highlight the Collection_Button
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Collections_Button);

		Thread.sleep(1000);

		// Collections_Button is DISPLAYED or not
		boolean res = Collections_Button.isDisplayed();

		if (res == true) {
			System.out.println("Collections_Button is DISPLAYED  ");
		} else {
			System.out.println("Collections_Button is not DISPLAYED");
		}
		driver.manage().deleteAllCookies();
		Collections_Button.click();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);

		// -------------------------------------------------------------------------------------

		// locate Collection
		WebElement Collection = driver.findElement(By.xpath("//span[contains(text(),'Decentraland')]"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Collection
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Collection);
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// Collection is DISPLAYED or not
		boolean res1 = Collection.isDisplayed();

		if (res1 == true) {
			System.out.println("Collection is DISPLAYED  ");
		} else {
			System.out.println("Collection is not DISPLAYED");
		}
		Collection.click();
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------

		// locate Collection_Name
		WebElement Collection_Name = driver.findElement(By.xpath("//div[contains(text(),'DECENTRALAND')]"));
		Thread.sleep(1000);

		// to highlight the Collection_Name
		JavascriptExecutor jse3 = (JavascriptExecutor) driver;
		jse3.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Collection_Name);

		// Collection_Name is DISPLAYED or not
		boolean res2 = Collection_Name.isDisplayed();

		if (res2 == true) {
			System.out.println("Collection_Name is DISPLAYED  ");
		} else {
			System.out.println("Collection_Name is not DISPLAYED");
		}
		Thread.sleep(1000);

		jse3.executeScript("scroll(0, 450);");

		// ----------------------------------------------------------------------------------------------------------

		// locate Collection_Info
		WebElement Collection_Info = driver
				.findElement(By.xpath("//div[contains(text(),'Decentraland is a user-governed virtual world wher')]"));
		Thread.sleep(1000);

		// to highlight the Collection_Info
		JavascriptExecutor jse4 = (JavascriptExecutor) driver;
		jse4.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Collection_Info);

		// Collection_Info is DISPLAYED or not
		boolean res3 = Collection_Info.isDisplayed();

		if (res3 == true) {
			System.out.println("Collection_Info is DISPLAYED  ");
		} else {
			System.out.println("Collection_Info is not DISPLAYED");
		}
		Thread.sleep(1000);
		jse4.executeScript("scroll(0, 250);");
		// ---------------------------------------------------------------------------------------------------------

		// locate ETH_Address_bar
		WebElement ETH_Address_bar = driver
				.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]"));
		Thread.sleep(1000);

		// to highlight the ETH_Address_bar
		JavascriptExecutor jse5 = (JavascriptExecutor) driver;
		jse5.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				ETH_Address_bar);

		// ETH_Address_bar is DISPLAYED or not
		boolean res4 = ETH_Address_bar.isDisplayed();

		if (res4 == true) {
			System.out.println("ETH_Address_bar is DISPLAYED  ");
		} else {
			System.out.println("ETH_Address_bar is not DISPLAYED");
		}

		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------------

		// locate Website
		WebElement Website = driver
				.findElement(By.xpath("//a[@href='https://decentraland.org/']//div//*[name()='svg']"));
		Thread.sleep(1000);

		// to highlight the Website
		JavascriptExecutor jse6 = (JavascriptExecutor) driver;
		jse6.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')", Website);

		// Website is DISPLAYED or not
		boolean res5 = Website.isDisplayed();

		if (res5 == true) {
			System.out.println("Website is DISPLAYED  ");
		} else {
			System.out.println("Website is not DISPLAYED");
		}
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------------

		// locate Twitter
		WebElement Twitter = driver.findElement(By.xpath(
				"//a[@href='https://twitter.com/decentraland']//div[@class='flex items-center justify-center icons-container']"));
		Thread.sleep(1000);

		// to highlight the Twitter
		JavascriptExecutor jse7 = (JavascriptExecutor) driver;
		jse7.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')", Twitter);

		// Twitter is DISPLAYED or not
		boolean res6 = Twitter.isDisplayed();

		if (res6 == true) {
			System.out.println("Twitter is DISPLAYED  ");
		} else {
			System.out.println("Twitter is not DISPLAYED");
		}
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------------

		// locate Insta
		WebElement Insta = driver.findElement(By.xpath(
				"//a[@href='https://ig.me/m/decentraland_foundation/']//div[@class='flex items-center justify-center icons-container']"));
		Thread.sleep(1000);

		// to highlight the Insta
		JavascriptExecutor jse8 = (JavascriptExecutor) driver;
		jse8.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')", Insta);

		// Insta is DISPLAYED or not
		boolean res7 = Insta.isDisplayed();

		if (res7 == true) {
			System.out.println("Insta is DISPLAYED  ");
		} else {
			System.out.println("Insta is not DISPLAYED");
		}
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------------

		// locate Discord
		WebElement Discord = driver.findElement(
				By.xpath("//div[@class='flex justify-between banner-collection-detail-wrapper']//a[4]//div[1]"));
		Thread.sleep(1000);

		// to highlight the Discord
		JavascriptExecutor jse9 = (JavascriptExecutor) driver;
		jse9.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')", Discord);

		// Insta is DISPLAYED or not
		boolean res8 = Insta.isDisplayed();

		if (res8 == true) {
			System.out.println("Discord is DISPLAYED  ");
		} else {
			System.out.println("Discord is not DISPLAYED");
		}
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------------

		// locate Stats
		WebElement Token = driver.findElement(By.xpath("//div[@class='flex flex-col gap-5']"));
		Thread.sleep(1000);

		// to highlight the Token
		JavascriptExecutor jse10 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')", Token);
		Thread.sleep(1000);

		// Token is DISPLAYED or not
		boolean res9 = Token.isDisplayed();

		if (res9 == true) {
			System.out.println("Token is DISPLAYED  ");
		} else {
			System.out.println("Token is not DISPLAYED");
		}
		jse10.executeScript("scroll(0, 450);");
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------------

		// locate Project_Information
		WebElement Project_Information = driver.findElement(By.xpath(
				"//div[@class='cursor-pointer inline-flex left-item-text-container'][normalize-space()='Project Information']"));
		Thread.sleep(1000);

		// to highlight the Project_Information
		JavascriptExecutor jse11 = (JavascriptExecutor) driver;
		jse11.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Project_Information);
		Thread.sleep(1000);

		// Project_Information is DISPLAYED or not
		boolean res10 = Project_Information.isDisplayed();

		if (res10 == true) {
			System.out.println("Project_Information is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("Project_Information is not DISPLAYED");
		}

		Project_Information.click();
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------------

		// locate Project_Information_data
		WebElement Project_Information_data = driver.findElement(
				By.xpath("//div[@id='project-information']//div[contains(@class,'typo-about-body-text')]"));
		Thread.sleep(1000);

		// to highlight the Project_Information_data
		JavascriptExecutor jse12 = (JavascriptExecutor) driver;
		jse12.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')",
				Project_Information_data);

		// Project_Information_data is DISPLAYED or not
		boolean res11 = Project_Information_data.isDisplayed();

		if (res11 == true) {
			System.out.println("Project_Information_data is DISPLAYED  ");
		} else {
			System.out.println("Project_Information_data is not DISPLAYED");
		}
		Thread.sleep(1000);

		// -------------------------------------------------------------------------------------------------------------------

		// locate Functionality
		WebElement Functionality = driver.findElement(By.xpath(
				"//div[@class='cursor-pointer inline-flex left-item-text-container'][normalize-space()='Functionality']"));
		Thread.sleep(1000);

		// to highlight the Functionality
		JavascriptExecutor jse13 = (JavascriptExecutor) driver;
		jse13.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Functionality);

		// Functionality is DISPLAYED or not
		boolean res12 = Functionality.isDisplayed();

		if (res12 == true) {
			System.out.println("Functionality is DISPLAYED  AND CLICKABLE");
		} else {
			System.out.println("Functionality is not DISPLAYED");
		}
		Thread.sleep(1000);

		Functionality.click();
		Thread.sleep(1000);

		// ------------------------------------------------------------------------------------------------------------------------

		// locate Functionality_data
		WebElement Functionality_data = driver
				.findElement(By.xpath("//div[@id='functionality']//div[contains(@class,'typo-about-body-text')]"));
		Thread.sleep(1000);

		// to highlight the Functionality_data
		JavascriptExecutor jse14 = (JavascriptExecutor) driver;
		jse14.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')",
				Functionality_data);

		// Functionality_data is DISPLAYED or not
		boolean res13 = Functionality_data.isDisplayed();

		if (res13 == true) {
			System.out.println("Functionality_data is DISPLAYED  ");
		} else {
			System.out.println("Functionality_data is not DISPLAYED");
		}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------

		// locate Ownership_Rights
		WebElement Ownership_Rights = driver.findElement(By.xpath(
				"//div[@class='cursor-pointer inline-flex left-item-text-container'][normalize-space()='Ownership Rights']"));
		Thread.sleep(1000);

		// to highlight the Ownership_Rights
		JavascriptExecutor jse15 = (JavascriptExecutor) driver;
		jse15.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Ownership_Rights);

		// Ownership_Rights is DISPLAYED or not
		boolean res14 = Ownership_Rights.isDisplayed();

		if (res14 == true) {
			System.out.println("Ownership_Rights is DISPLAYED  AND CLICKABLE");
		} else {
			System.out.println("Ownership_Rights is not DISPLAYED");
		}
		Thread.sleep(1000);

		Ownership_Rights.click();
		Thread.sleep(1000);

		// ------------------------------------------------------------------------------------------------------------------------

		// locate Ownership_data
		WebElement Ownership_data = driver.findElement(By.xpath("//div[@id='ownership-rights']"));
		Thread.sleep(1000);

		// to highlight the Ownership_data
		JavascriptExecutor jse16 = (JavascriptExecutor) driver;
		jse16.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')",
				Ownership_data);

		// Ownership_data is DISPLAYED or not
		boolean res15 = Ownership_data.isDisplayed();

		if (res15 == true) {
			System.out.println("Ownership_data is DISPLAYED  ");
		} else {
			System.out.println("Ownership_data is not DISPLAYED");
		}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------

		// locate Rarity_Traits
		WebElement Rarity_Traits = driver.findElement(By.xpath(
				"//div[@class='cursor-pointer inline-flex left-item-text-container'][normalize-space()='Rarity Traits']"));
		Thread.sleep(1000);

		// to highlight the Rarity_Traits
		JavascriptExecutor jse17 = (JavascriptExecutor) driver;
		jse17.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Rarity_Traits);

		// Rarity_Traits is DISPLAYED or not
		boolean res16 = Rarity_Traits.isDisplayed();

		if (res16 == true) {
			System.out.println("Rarity_Traits is DISPLAYED  AND CLICKABLE");
		} else {
			System.out.println("Rarity_Traits is not DISPLAYED");
		}
		Thread.sleep(1000);

		Rarity_Traits.click();
		Thread.sleep(1000);

		// ------------------------------------------------------------------------------------------------------------------------

		// locate Rarity_Traits_data
		WebElement Rarity_Traits_data = driver
				.findElement(By.xpath("//div[@id='rarity-traits']//div[contains(@class,'typo-about-body-text')]"));
		Thread.sleep(1000);

		// to highlight the Rarity_Traits_data
		JavascriptExecutor jse18 = (JavascriptExecutor) driver;
		jse18.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')",
				Rarity_Traits_data);

		// Rarity_Traits_data is DISPLAYED or not
		boolean res17 = Rarity_Traits_data.isDisplayed();

		if (res17 == true) {
			System.out.println("Rarity_Traits_data is DISPLAYED  ");
		} else {
			System.out.println("Rarity_Traits_data is not DISPLAYED");
		}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------

		// locate Upcoming_Events
		WebElement Upcoming_Events = driver.findElement(By.xpath(
				"//div[@class='cursor-pointer inline-flex left-item-text-container'][normalize-space()='Upcoming Events']"));
		Thread.sleep(1000);

		// to highlight the Rarity_Traits
		JavascriptExecutor jse19 = (JavascriptExecutor) driver;
		jse19.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Upcoming_Events);

		// Upcoming_Events is DISPLAYED or not
		boolean res18 = Upcoming_Events.isDisplayed();

		if (res18 == true) {
			System.out.println("Upcoming_Events is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("Upcoming_Events is not DISPLAYED");
		}
		Thread.sleep(1000);

		Upcoming_Events.click();
		Thread.sleep(1000);

		// ------------------------------------------------------------------------------------------------------------------------

		// locate Upcoming_Events_data
		WebElement Upcoming_Events_data = driver
				.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[3]/div[2]/div[5]"));
		Thread.sleep(1000);

		// to highlight the Upcoming_Events_data
		JavascriptExecutor jse20 = (JavascriptExecutor) driver;
		jse20.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')",
				Upcoming_Events_data);

		// Upcoming_Events_data is DISPLAYED or not
		boolean res19 = Upcoming_Events_data.isDisplayed();

		if (res19 == true) {
			System.out.println("Upcoming_Events_data is DISPLAYED  ");
		} else {
			System.out.println("Upcoming_Events_data is not DISPLAYED");
		}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------

		// locate Marketplace_Links
		WebElement Marketplace_Links = driver.findElement(By.xpath(
				"//div[@class='cursor-pointer inline-flex left-item-text-container'][normalize-space()='Marketplace Links']"));
		Thread.sleep(1000);

		// to highlight the Marketplace_Links
		JavascriptExecutor jse21 = (JavascriptExecutor) driver;
		jse21.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Marketplace_Links);

		// Marketplace_Links is DISPLAYED or not
		boolean res20 = Marketplace_Links.isDisplayed();

		if (res20 == true) {
			System.out.println("Marketplace_Links is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("Marketplace_Links is not DISPLAYED");
		}
		Thread.sleep(1000);

		Marketplace_Links.click();
		Thread.sleep(1000);

		// ------------------------------------------------------------------------------------------------------------------------

		// locate Marketplace_Links_data
		WebElement Marketplace_Links_data = driver
				.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[3]/div[2]/div[6]"));
		Thread.sleep(1000);

		// to highlight the Marketplace_Links_data
		JavascriptExecutor jse22 = (JavascriptExecutor) driver;
		jse22.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')",
				Marketplace_Links_data);

		// Marketplace_Links_data is DISPLAYED or not
		boolean res21 = Marketplace_Links_data.isDisplayed();

		if (res21 == true) {
			System.out.println("Marketplace_Links_data is DISPLAYED  ");
		} else {
			System.out.println("MarMarketplace_Links_dataketplace_Links is not DISPLAYED");
		}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------

		// locate Creative_Team
		WebElement Creative_Team = driver.findElement(By.xpath(
				"//div[@class='cursor-pointer inline-flex left-item-text-container'][normalize-space()='Creative Team']"));
		Thread.sleep(1000);

		// to highlight the Creative_Team
		JavascriptExecutor jse23 = (JavascriptExecutor) driver;
		jse23.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Creative_Team);

		// Creative_Team is DISPLAYED or not
		boolean res22 = Creative_Team.isDisplayed();

		if (res22 == true) {
			System.out.println("Creative_Team is DISPLAYED AND CLICKABLE  ");
		} else {
			System.out.println("Creative_Team is not DISPLAYED");
		}
		Thread.sleep(1000);
		Thread.sleep(1000);

		Creative_Team.click();
		Thread.sleep(1000);

		// ------------------------------------------------------------------------------------------------------------------------

		// locate Creative_Team_data
		WebElement Creative_Team_data = driver
				.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[3]/div[2]/div[7]"));
		Thread.sleep(1000);

		// to highlight the Creative_Team_data
		JavascriptExecutor jse24 = (JavascriptExecutor) driver;
		jse24.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')",
				Creative_Team_data);

		// Creative_Team_data is DISPLAYED or not
		boolean res23 = Creative_Team_data.isDisplayed();

		if (res23 == true) {
			System.out.println("Creative_Team_data is DISPLAYED  ");
		} else {
			System.out.println("Creative_Team_data is not DISPLAYED");
		}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------

		// locate Partnership
		WebElement Partnership = driver.findElement(By.xpath(
				"//div[@class='cursor-pointer inline-flex left-item-text-container'][normalize-space()='Partnership']"));
		Thread.sleep(1000);

		// to highlight the Partnership
		JavascriptExecutor jse25 = (JavascriptExecutor) driver;
		jse25.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Partnership);

		// Partnership is DISPLAYED or not
		boolean res24 = Partnership.isDisplayed();

		if (res24 == true) {
			System.out.println("Partnership is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("Partnership is not DISPLAYED");
		}
		Thread.sleep(1000);

		Partnership.click();
		Thread.sleep(1000);

		// ------------------------------------------------------------------------------------------------------------------------

		// locate Partnership_data
		WebElement Partnership_data = driver
				.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[3]/div[2]/div[8]/div[2]"));
		Thread.sleep(1000);

		// to highlight the Partnership_data
		JavascriptExecutor jse26 = (JavascriptExecutor) driver;
		jse26.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')",
				Partnership_data);

		// Partnership_data is DISPLAYED or not
		boolean res25 = Partnership.isDisplayed();

		if (res25 == true) {
			System.out.println("Partnership_data is DISPLAYED  ");
		} else {
			System.out.println("Partnership_data is not DISPLAYED");
		}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------

		// locate Notable_Owners
		WebElement Notable_Owners = driver.findElement(By.xpath(
				"//div[@class='cursor-pointer inline-flex left-item-text-container'][normalize-space()='Notable Owners']"));
		Thread.sleep(1000);

		// to highlight the Notable_Owners
		JavascriptExecutor jse27 = (JavascriptExecutor) driver;
		jse27.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Notable_Owners);

		// Notable_Owners is DISPLAYED or not
		boolean res26 = Notable_Owners.isDisplayed();

		if (res26 == true) {
			System.out.println("Notable_Owners is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("Notable_Owners is not DISPLAYED");
		}
		Thread.sleep(1000);

		Notable_Owners.click();
		Thread.sleep(1000);

		// ------------------------------------------------------------------------------------------------------------------------

		// locate Notable_Owners_data
		WebElement Notable_Owners_data = driver
				.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[3]/div[2]/div[9]/div[2]"));
		Thread.sleep(1000);

		// to highlight the Notable_Owners_data
		JavascriptExecutor jse28 = (JavascriptExecutor) driver;
		jse28.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')",
				Notable_Owners_data);

		// Notable_Owners_data is DISPLAYED or not
		boolean res27 = Notable_Owners_data.isDisplayed();

		if (res27 == true) {
			System.out.println("Notable_Owners_data is DISPLAYED  ");
		} else {
			System.out.println("Notable_Owners_data is not DISPLAYED");
		}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------

		// locate News_and_Articles
		WebElement News_and_Articles = driver.findElement(By.xpath(
				"//div[@class='cursor-pointer inline-flex left-item-text-container'][normalize-space()='News and Articles']"));
		Thread.sleep(1000);

		// to highlight the News_and_Articles
		JavascriptExecutor jse29 = (JavascriptExecutor) driver;
		jse29.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_and_Articles);
		Thread.sleep(1000);

		// News_and_Articles is DISPLAYED or not
		boolean res28 = News_and_Articles.isDisplayed();

		if (res28 == true) {
			System.out.println("News_and_Articles is DISPLAYED  ");
		} else {
			System.out.println("News_and_Articles is not DISPLAYED");
		}

		News_and_Articles.click();
		Thread.sleep(1000);

		// ------------------------------------------------------------------------------------------------------------------------

		// locate News_and_Articles_data
		WebElement News_and_Articles_data = driver
				.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[3]/div[2]/div[10]"));
		Thread.sleep(1000);

		// to highlight the News_and_Articles_data
		JavascriptExecutor jse30 = (JavascriptExecutor) driver;
		jse30.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')",
				News_and_Articles_data);

		// News_and_Articles_data is DISPLAYED or not
		boolean res29 = News_and_Articles_data.isDisplayed();

		if (res29 == true) {
			System.out.println("News_and_Articles_data is DISPLAYED  ");
		} else {
			System.out.println("News_and_Articles_data is not DISPLAYED");
		}

		Thread.sleep(1000);
		jse30.executeScript("scroll(0, 8500);");

		// -----------------------------------------------------------------------------------------------------------

		// locate Top_NFTs_of_this_collection
		WebElement Top_NFTs_of_this_collection = driver
				.findElement(By.xpath("//h1[contains(text(),'Top NFTs of this collection')]"));
		Thread.sleep(1000);

		// to highlight the Top_NFTs_of_this_collection
		JavascriptExecutor jse31 = (JavascriptExecutor) driver;
		jse31.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Top_NFTs_of_this_collection);

		// Top_NFTs_of_this_collection is DISPLAYED or not
		boolean res30 = Top_NFTs_of_this_collection.isDisplayed();

		if (res30 == true) {
			System.out.println("Top_NFTs_of_this_collection is DISPLAYED  ");
		} else {
			System.out.println("Top_NFTs_of_this_collection is not DISPLAYED");
		}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------

		// locate left_swipe
		WebElement left_swipe = driver.findElement(
				By.xpath("//div[@class='sc-d9026495-2 lmFsid']//button[@aria-label='Go to previous slide']"));
		Thread.sleep(1000);

		// to highlight the left_swipe
		JavascriptExecutor jse32 = (JavascriptExecutor) driver;
		jse32.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				left_swipe);

		// left_swipe is DISPLAYED or not
		boolean res31 = left_swipe.isDisplayed();

		if (res31 == true) {
			System.out.println("left_swipe is DISPLAYED AND CLICKABLE  ");
		} else {
			System.out.println("left_swipe is not DISPLAYED");
		}
		Thread.sleep(1000);
		left_swipe.click();
		left_swipe.click();
		Thread.sleep(1000);

//-----------------------------------------------------------------------------------------------------------

		// locate Right_swipe
		WebElement Right_swipe = driver
				.findElement(By.xpath("//div[@class='sc-d9026495-2 lmFsid']//button[@aria-label='Go to next slide']"));
		Thread.sleep(1000);

		// to highlight the Right_swipe
		JavascriptExecutor jse33 = (JavascriptExecutor) driver;
		jse33.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Right_swipe);

		// Right_swipe is DISPLAYED or not
		boolean res32 = Right_swipe.isDisplayed();

		if (res32 == true) {
			System.out.println("Right_swipe is DISPLAYED AND CLICKABLE  ");
		} else {
			System.out.println("Right_swipe is not DISPLAYED");
		}
		Thread.sleep(1000);
		Right_swipe.click();
		Right_swipe.click();
		Thread.sleep(1000);
		jse33.executeScript("scroll(0, 9000);");

		// -----------------------------------------------------------------------------------------------------------

		// locate Other_NFT_Collections
		WebElement Other_NFT_Collections = driver
				.findElement(By.xpath("//h1[contains(text(),'Other NFT Collections')]"));
		Thread.sleep(1000);

		// to highlight the Other_NFT_Collections
		JavascriptExecutor jse34 = (JavascriptExecutor) driver;
		jse34.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Other_NFT_Collections);

		// Other_NFT_Collections is DISPLAYED or not
		boolean res33 = Other_NFT_Collections.isDisplayed();

		if (res33 == true) {
			System.out.println("Other_NFT_Collections is DISPLAYED   ");
		} else {
			System.out.println("Other_NFT_Collections is not DISPLAYED");
		}
		Thread.sleep(1000);

//-----------------------------------------------------------------------------------------------------------

		// locate left_swipe1
		WebElement left_swipe1 = driver.findElement(
				By.xpath("//div[@class='sc-ece1a9d2-2 iUXLNY']//button[@aria-label='Go to previous slide']"));
		Thread.sleep(1000);

		// to highlight the left_swipe1
		JavascriptExecutor jse35 = (JavascriptExecutor) driver;
		jse35.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				left_swipe1);

		// left_swipe1 is DISPLAYED or not
		boolean res34 = left_swipe1.isDisplayed();

		if (res34 == true) {
			System.out.println("left_swipe1 is DISPLAYED AND CLICKABLE  ");
		} else {
			System.out.println("left_swipe1 is not DISPLAYED");
		}
		Thread.sleep(1000);
		left_swipe1.click();
		left_swipe1.click();
		Thread.sleep(1000);

//-----------------------------------------------------------------------------------------------------------

		// locate Right_swipe1
		WebElement Right_swipe1 = driver
				.findElement(By.xpath("//div[@class='sc-ece1a9d2-2 iUXLNY']//button[@aria-label='Go to next slide']"));
		Thread.sleep(1000);

		// to highlight the Right_swipe1
		JavascriptExecutor jse36 = (JavascriptExecutor) driver;
		jse36.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Right_swipe1);
		Thread.sleep(1000);

		// Right_swipe1 is DISPLAYED or not
		boolean res35 = Right_swipe1.isDisplayed();

		if (res35 == true) {
			System.out.println("Right_swipe1 is DISPLAYED AND CLICKABLE  ");
		} else {
			System.out.println("Right_swipe1 is not DISPLAYED");
		}
		Right_swipe1.click();
		Right_swipe1.click();
		Thread.sleep(1000);
		jse36.executeScript("scroll(0, 9400);");
		// -----------------------------------------------------------------------------------------------------

		// locate Wen_Token
		WebElement Wen_Token = driver.findElement(By.xpath("//div[normalize-space()='Wen Token?']"));
		Thread.sleep(1000);

		// to highlight the Wen_Token
		JavascriptExecutor jse447 = (JavascriptExecutor) driver;
		jse447.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Wen_Token);

		// Wen_Token is DISPLAYED or not
		boolean res36 = Wen_Token.isDisplayed();

		if (res36 == true) {
			System.out.println("Wen_Token is DISPLAYED AND CLICKABLE  ");
		} else {
			System.out.println("Wen_Token is not DISPLAYED");
		}

		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------

		// locate Email_Field
		WebElement Email_Field = driver.findElement(By.xpath("//input[@placeholder='Enter your email']"));
		Thread.sleep(1000);

		// to highlight the Email_Field
		JavascriptExecutor jse448 = (JavascriptExecutor) driver;
		jse448.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Email_Field);

		// Email_Field is DISPLAYED or not
		boolean res37 = Email_Field.isDisplayed();

		if (res37 == true) {
			System.out.println("Email_Field is DISPLAYED AND CLICKABLE  ");
		} else {
			System.out.println("Email_Field is not DISPLAYED");
		}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------

		// locate See_our_privacy_policy
		WebElement See_our_privacy_policy = driver.findElement(By.xpath("//a[contains(text(),'privacy policy')]"));
		Thread.sleep(1000);

		// to highlight the See_our_privacy_policy
		JavascriptExecutor jse449 = (JavascriptExecutor) driver;
		jse449.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				See_our_privacy_policy);
		Thread.sleep(1000);

		// See_our_privacy_policy is DISPLAYED or not
		boolean res38 = See_our_privacy_policy.isDisplayed();

		if (res38 == true) {
			System.out.println("See_our_privacy_policy is DISPLAYED AND CLICKABLE  ");
		} else {
			System.out.println("See_our_privacy_policy is not DISPLAYED");
		}

		See_our_privacy_policy.click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);

		jse449.executeScript("scroll(0, 10000);");

		// --------------------------------------------------------------------------------------------
		// locate digitali_footer
		WebElement digitali_footer = driver.findElement(
				By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/*[1]"));
		Thread.sleep(1000);

		// to highlight the digitali_footer
		JavascriptExecutor jse550 = (JavascriptExecutor) driver;
		jse550.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				digitali_footer);

		// digitali_footer is DISPLAYED or not
		boolean res39 = digitali_footer.isDisplayed();

		if (res39 == true) {
			System.out.println("digitali_footer is DISPLAYED  ");
		} else {
			System.out.println("digitali_footer is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------

		// locate digitali_footer_text
		WebElement digitali_footer_text = driver
				.findElement(By.xpath("//div[contains(text(),'The most trusted NFT encyclopedia')]"));
		Thread.sleep(1000);

		// to highlight the digitali_footer_text
		JavascriptExecutor jse551 = (JavascriptExecutor) driver;
		jse551.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				digitali_footer_text);

		// digitali_footer_text is DISPLAYED or not
		boolean res40 = digitali_footer_text.isDisplayed();

		if (res40 == true) {
			System.out.println("digitali_footer_text is DISPLAYED  ");
		} else {
			System.out.println("digitali_footer_text is not DISPLAYED");
		}
		Thread.sleep(1000);

		// ----------------------------------------------------------------------------------------------------------------

		// locate Explore
		WebElement Explore = driver.findElement(By.xpath("//div[normalize-space()='Explore']"));
		Thread.sleep(1000);

		// to highlight the Explore
		JavascriptExecutor jse552 = (JavascriptExecutor) driver;
		jse552.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Explore);

		// Explore is DISPLAYED or not
		boolean res41 = Explore.isDisplayed();

		if (res41 == true) {
			System.out.println("Explore is DISPLAYED ");
		} else {
			System.out.println("Explore is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

//		// locate Collection
//		WebElement Collections = driver.findElement(
//				By.xpath("//div[@id='__next']//div//div//div//div//div//div//div//div//a[normalize-space()='Collections']"));
//		Thread.sleep(1000);
//
//		// to highlight the Collections
//		JavascriptExecutor jse53 = (JavascriptExecutor) driver;
//		jse53.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
//				Collections);
//
//		// Collection is DISPLAYED or not
//		boolean res42 = Collection.isDisplayed();
//
//		if (res42 == true) {
//			System.out.println("Collection is DISPLAYED  ");
//		} else {
//			System.out.println("Collection is not DISPLAYED");
//		}
//		Thread.sleep(1000);
//
//		// --------------------------------------------------------------------------------------------------------------------
//
//		// locate Leaderboard4
//		WebElement Leaderboard4 = driver.findElement(By.xpath(
//				"//div[@id='__next']//div//div//div//div//div//div//div//div//a[normalize-space()='Leaderboard']"));
//		Thread.sleep(1000);
//
//		// to highlight the Leaderboard4
//		JavascriptExecutor jse54 = (JavascriptExecutor) driver;
//		jse54.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
//				Leaderboard4);
//
//		// Leaderboard4 is DISPLAYED or not
//		boolean res43 = Leaderboard4.isDisplayed();
//
//		if (res43 == true) {
//			System.out.println("Leaderboard4 is DISPLAYED  ");
//		} else {
//			System.out.println("Leaderboard4 is not DISPLAYED");
//		}
//		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Reward_Points1
		WebElement Reward_Points1 = driver.findElement(By.xpath("//a[normalize-space()='Reward Points']"));
		Thread.sleep(1000);

		// to highlight the Reward_Points1
		JavascriptExecutor jse55 = (JavascriptExecutor) driver;
		jse55.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Reward_Points1);

		// Reward_Points1 is DISPLAYED or not
		boolean res44 = Reward_Points1.isDisplayed();

		if (res44 == true) {
			System.out.println("Reward_Points1 is DISPLAYED   ");
		} else {
			System.out.println("Reward_Points1 is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate About_Us1
		WebElement About_Us1 = driver.findElement(By.xpath("//div[normalize-space()='About Us']"));
		Thread.sleep(1000);

		// to highlight the About_Us1
		JavascriptExecutor jse56 = (JavascriptExecutor) driver;
		jse56.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", About_Us1);

		// About_Us1 is DISPLAYED or not
		boolean res45 = About_Us1.isDisplayed();

		if (res45 == true) {
			System.out.println("About_Us1 is DISPLAYED   ");
		} else {
			System.out.println("About_Us1 is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Digitali
		WebElement Digitali = driver.findElement(By.xpath("//a[normalize-space()='Digitali']"));
		Thread.sleep(1000);

		// to highlight the Digitali
		JavascriptExecutor jse57 = (JavascriptExecutor) driver;
		jse57.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Digitali);

		// Digitali is DISPLAYED or not
		boolean res46 = Digitali.isDisplayed();

		if (res46 == true) {
			System.out.println("Digitali is DISPLAYED   ");
		} else {
			System.out.println("Digitali is not DISPLAYED");
		}
		Thread.sleep(000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Blogs_footer
		WebElement Blogs_footer = driver.findElement(By.xpath("//a[normalize-space()='Blogs']"));
		Thread.sleep(1000);

		// to highlight the Blogs_footer
		JavascriptExecutor jse58 = (JavascriptExecutor) driver;
		jse58.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Blogs_footer);

		// Digitali is DISPLAYED or not
		boolean res47 = Digitali.isDisplayed();

		if (res47 == true) {
			System.out.println("Digitali is DISPLAYED   ");
		} else {
			System.out.println("Digitali is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate FAQ1
		WebElement FAQ1 = driver.findElement(By.xpath("//a[normalize-space()='FAQ']"));
		Thread.sleep(1000);

		// to highlight the FAQ1
		JavascriptExecutor jse59 = (JavascriptExecutor) driver;
		jse59.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", FAQ1);

		// FAQ1 is DISPLAYED or not
		boolean res48 = FAQ1.isDisplayed();

		if (res48 == true) {
			System.out.println("FAQ1 is DISPLAYED   ");
		} else {
			System.out.println("FAQ1 is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Legal
		WebElement Legal = driver.findElement(By.xpath("//div[normalize-space()='Legal']"));
		Thread.sleep(1000);

		// to highlight the Legal
		JavascriptExecutor jse60 = (JavascriptExecutor) driver;
		jse60.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Legal);

		// Legal is DISPLAYED or not
		boolean res49 = Legal.isDisplayed();

		if (res49 == true) {
			System.out.println("Legal is DISPLAYED   ");
		} else {
			System.out.println("Legal is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Terms111
		WebElement Terms111 = driver.findElement(By.xpath("//a[normalize-space()='Terms']"));
		Thread.sleep(1000);

		// to highlight the Terms111
		JavascriptExecutor jse61 = (JavascriptExecutor) driver;
		jse61.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Terms111);

		// Terms111 is DISPLAYED or not
		boolean res50 = Terms111.isDisplayed();

		if (res50 == true) {
			System.out.println("Terms111 is DISPLAYED   ");
		} else {
			System.out.println("Terms111 is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Privacy
		WebElement Privacy = driver.findElement(By.xpath("//a[normalize-space()='Privacy']"));
		Thread.sleep(1000);

		// to highlight the Privacy
		JavascriptExecutor jse62 = (JavascriptExecutor) driver;
		jse62.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Privacy);

		// Privacy is DISPLAYED or not
		boolean res51 = Privacy.isDisplayed();

		if (res51 == true) {
			System.out.println("Privacy is DISPLAYED   ");
		} else {
			System.out.println("Privacy is not DISPLAYED");
		}
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------------

		// locate All_Rights_Reserved
		WebElement All_Rights_Reserved = driver
				.findElement(By.xpath("//div[contains(text(),'© 2023 Digitali Technology Solutions Ltd. All righ')]"));
		Thread.sleep(1000);

		// to highlight the All_Rights_Reserved
		JavascriptExecutor jse63 = (JavascriptExecutor) driver;
		jse63.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				All_Rights_Reserved);

		// All_Rights_Reserved is DISPLAYED or not
		boolean res52 = All_Rights_Reserved.isDisplayed();

		if (res52 == true) {
			System.out.println("All_Rights_Reserved is DISPLAYED   ");
		} else {
			System.out.println("All_Rights_Reserved is not DISPLAYED");
		}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------------

//				// locate Twitter_Icon
//				WebElement Twitter_Icon = driver
//						.findElement(By.xpath("//body/div[@id='__next']/footer[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/a[1]/*[1]"));
//				Thread.sleep(1000);
//
//				// to highlight the Twitter_Icon
//				JavascriptExecutor jse64 = (JavascriptExecutor) driver;
//				jse64.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
//						Twitter_Icon);
//				Thread.sleep(1000);
//
//				// -----------------------------------------------------------------------------------------------------------------
//
//				// locate Discord_Icon
//				WebElement Discord_Icon = driver
//						.findElement(By.xpath("//a[@href='https://discord.com/invite/dCYTykjgxW']//*[name()='svg']"));
//				Thread.sleep(1000);
//
//				// to highlight the Discord_Icon
//				JavascriptExecutor jse65 = (JavascriptExecutor) driver;
//				jse65.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
//						Discord_Icon);
//				Thread.sleep(1000);
		driver.close();
		driver.quit();

	}

	@Test
	public void Earn_Reward_Points() throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\praka\\Downloads\\edgedriver_win64 (2)\\msedgedriver.exe");
		// System.setProperty("webdriver.edge.driver",
		// "C:\\Users\\praka\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");

		// up casting
		WebDriver driver = new EdgeDriver();

		// get URL
		driver.get("https://digitali.xyz/");
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// maximize
		driver.manage().window().maximize();
		Thread.sleep(1000);

		// locate digital logo
		WebElement digitali_logo = driver.findElement(By.xpath("//img[@alt='Digitali Logo']"));

		// to highlight the digitali_logo
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				digitali_logo);
		Thread.sleep(1000);

		// locate Earn_Reward_Points
		WebElement Earn_Reward_Points = driver.findElement(By.xpath("//a[@type='button']"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Earn_Reward_Points
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Earn_Reward_Points);

		Thread.sleep(1000);

		// Earn_Reward_Points is DISPLAYED or not
		boolean res1 = Earn_Reward_Points.isDisplayed();

		if (res1 == true) {
			System.out.println("Earn_Reward_Points is DISPLAYED AND CLICKABLE  ");
		} else {
			System.out.println("Earn_Reward_Points is not DISPLAYED");
		}
		driver.manage().deleteAllCookies();
		Earn_Reward_Points.click();
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);

		// ----------------------------------------------------------------------------------------------------------------------------

		// locate Heading
		WebElement Heading = driver.findElement(By.xpath("//h3[normalize-space()='Earning Reward Points is easy!']"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Heading
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Heading);

		// Heading is DISPLAYED or not
		boolean res2 = Heading.isDisplayed();

		if (res2 == true) {
			System.out.println("Heading is DISPLAYED ");
		} else {
			System.out.println("Heading is not DISPLAYED");
		}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------------------------------

		// locate Step1
		WebElement Step1 = driver
				.findElement(By.xpath("//body/div[@id='__next']/main/div/div/section/div/div/div/div[1]/div[1]"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Step1
		JavascriptExecutor jse3 = (JavascriptExecutor) driver;
		jse3.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Step1);

		// Step1 is DISPLAYED or not
		boolean res3 = Step1.isDisplayed();

		if (res3 == true) {
			System.out.println("Step1 is DISPLAYED ");
		} else {
			System.out.println("Step1 is not DISPLAYED");
		}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------------------------------

		// locate Our_content
		WebElement Our_content = driver
				.findElement(By.xpath("//body/div[@id='__next']/main/div/div/section/div/div/div/div/div[2]"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Our_content
		JavascriptExecutor jse4 = (JavascriptExecutor) driver;
		jse4.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Our_content);
		Thread.sleep(1000);

		// Our_content is DISPLAYED or not
		boolean res4 = Our_content.isDisplayed();

		if (res4 == true) {
			System.out.println("Our_content is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("Our_content is not DISPLAYED");
		}
		Our_content.click();
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------------------------------

		// locate Successful_submission
		WebElement Successful_submission = driver
				.findElement(By.xpath("//div[@id='__next']//div//div//section//div[3]"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Successful_submission
		JavascriptExecutor jse5 = (JavascriptExecutor) driver;
		jse5.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Successful_submission);
		Thread.sleep(1000);

		// Successful_submission is DISPLAYED or not
		boolean res5 = Successful_submission.isDisplayed();

		if (res5 == true) {
			System.out.println("Successful_submission is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("Successful_submission is not DISPLAYED");
		}
		Successful_submission.click();
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------------------------------

		// locate Collection_Image
		WebElement Collection_Image = driver
				.findElement(By.xpath("//body/div[@id='__next']/main/div/div/section/div/div/div/div[2]/div[1]"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Collection_Image
		JavascriptExecutor jse6 = (JavascriptExecutor) driver;
		jse6.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Collection_Image);

		// Collection_Image is DISPLAYED or not
		boolean res6 = Collection_Image.isDisplayed();

		if (res6 == true) {
			System.out.println("Collection_Image is DISPLAYED ");
		} else {
			System.out.println("Collection_Image is not DISPLAYED");
		}
		Thread.sleep(1000);
		jse6.executeScript("scroll(0, 650);");

		// -----------------------------------------------------------------------------------------------------------------------------------

		// locate Find_your_NFT_Collection
		WebElement Find_your_NFT_Collection = driver
				.findElement(By.xpath("//span[normalize-space()='Find your NFT Collection']"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Find_your_NFT_Collection
		JavascriptExecutor jse7 = (JavascriptExecutor) driver;
		jse7.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Find_your_NFT_Collection);
		Thread.sleep(1000);

		// Find_your_NFT_Collection is DISPLAYED or not
		boolean res7 = Find_your_NFT_Collection.isDisplayed();

		if (res7 == true) {
			System.out.println("Find_your_NFT_Collection is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("Find_your_NFT_Collection is not DISPLAYED");
		}

		Find_your_NFT_Collection.click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		jse7.executeScript("scroll(0, 800);");

		// -----------------------------------------------------------------------------------------------------------------------------------

		// locate How_Reward_Points_Work
		WebElement How_Reward_Points_Work = driver
				.findElement(By.xpath("//h3[normalize-space()='How Reward Points Work?']"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the How_Reward_Points_Work
		JavascriptExecutor jse8 = (JavascriptExecutor) driver;
		jse8.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				How_Reward_Points_Work);

		// How_Reward_Points_Work is DISPLAYED or not
		boolean res8 = How_Reward_Points_Work.isDisplayed();

		if (res8 == true) {
			System.out.println("How_Reward_Points_Work is DISPLAYED  ");
		} else {
			System.out.println("How_Reward_Points_Work is not DISPLAYED");
		}

		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------------------------------

		// locate BOX1
		WebElement BOX1 = driver.findElement(
				By.xpath("//body[1]/div[1]/main[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the BOX1
		JavascriptExecutor jse9 = (JavascriptExecutor) driver;
		jse9.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", BOX1);

		// BOX1 is DISPLAYED or not
		boolean res9 = BOX1.isDisplayed();

		if (res9 == true) {
			System.out.println("BOX1 is DISPLAYED  ");
		} else {
			System.out.println("BOX1 is not DISPLAYED");
		}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------------------------------

		// locate BOX2
		WebElement BOX2 = driver.findElement(
				By.xpath("//body[1]/div[1]/main[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the BOX2
		JavascriptExecutor jse10 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", BOX2);

		// BOX2 is DISPLAYED or not
		boolean res10 = BOX2.isDisplayed();

		if (res10 == true) {
			System.out.println("BOX2 is DISPLAYED  ");
		} else {
			System.out.println("BOX2 is not DISPLAYED");
		}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------------------------------

		// locate BOX3
		WebElement BOX3 = driver.findElement(
				By.xpath("//body[1]/div[1]/main[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the BOX3
		JavascriptExecutor jse11 = (JavascriptExecutor) driver;
		jse11.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", BOX3);

		// BOX3 is DISPLAYED or not
		boolean res11 = BOX3.isDisplayed();

		if (res11 == true) {
			System.out.println("BOX3 is DISPLAYED  ");
		} else {
			System.out.println("BOX3 is not DISPLAYED");
		}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------------------------------

		// locate BOX4
		WebElement BOX4 = driver.findElement(By.xpath(
				"//body/div[@id='__next']/main[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/span[1]/img[1]"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the BOX4
		JavascriptExecutor jse111 = (JavascriptExecutor) driver;
		jse111.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", BOX4);
		Thread.sleep(1000);
		jse111.executeScript("scroll(0, 1000);");

		// BOX4 is DISPLAYED or not
		boolean res12 = BOX4.isDisplayed();

		if (res12 == true) {
			System.out.println("BOX4 is DISPLAYED  ");
		} else {
			System.out.println("BOX4 is not DISPLAYED");
		}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------------------------------

		// locate BOX5
		WebElement BOX5 = driver.findElement(By
				.xpath("//body/div[@id='__next']/main[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the BOX5
		JavascriptExecutor jse12 = (JavascriptExecutor) driver;
		jse12.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", BOX5);

		// BOX5 is DISPLAYED or not
		boolean res13 = BOX4.isDisplayed();

		if (res13 == true) {
			System.out.println("BOX5 is DISPLAYED  ");
		} else {
			System.out.println("BOX5 is not DISPLAYED");
		}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------------------------------

//				// locate BOX6
//				WebElement BOX6 = driver.findElement(
//						By.xpath("//body[1]/div[1]/main[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]"));
//				Thread.sleep(1000);
//				driver.manage().deleteAllCookies();
		//
//				// to highlight the BOX6
//				JavascriptExecutor jse13 = (JavascriptExecutor) driver;
//				jse13.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", BOX5);
//				Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------------------------------

		// locate BOX7
		WebElement BOX7 = driver.findElement(By
				.xpath("//body/div[@id='__next']/main[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the BOX7
		JavascriptExecutor jse16 = (JavascriptExecutor) driver;
		jse16.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", BOX7);
		Thread.sleep(1000);

		// BOX7 is DISPLAYED or not
		boolean res14 = BOX7.isDisplayed();

		if (res14 == true) {
			System.out.println("BOX7 is DISPLAYED  ");
		} else {
			System.out.println("BOX7 is not DISPLAYED");
		}
		jse16.executeScript("scroll(0, 1600);");
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------------------------------

		// locate Content_Guidelines
		WebElement Content_Guidelines = driver.findElement(By.xpath("//h3[normalize-space()='Content Guidelines']"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Content_Guidelines
		JavascriptExecutor jse17 = (JavascriptExecutor) driver;
		jse17.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Content_Guidelines);

		// Content_Guidelines is DISPLAYED or not
		boolean res15 = Content_Guidelines.isDisplayed();

		if (res15 == true) {
			System.out.println("Content_Guidelines is DISPLAYED  ");
		} else {
			System.out.println("Content_Guidelines is not DISPLAYED");
		}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------------------------------

		// locate Neutrality
		WebElement Neutrality = driver
				.findElement(By.xpath("//body[1]/div[1]/main[1]/div[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[1]"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Neutrality
		JavascriptExecutor jse18 = (JavascriptExecutor) driver;
		jse18.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Neutrality);
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------------------
		// locate Clarity
		WebElement Clarity = driver
				.findElement(By.xpath("//body[1]/div[1]/main[1]/div[1]/section[2]/div[1]/div[1]/div[2]/div[2]/div[1]"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Clarity
		JavascriptExecutor jse19 = (JavascriptExecutor) driver;
		jse19.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Clarity);
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------------------------------

		// locate Transparency
		WebElement Transparency = driver
				.findElement(By.xpath("//body[1]/div[1]/main[1]/div[1]/section[2]/div[1]/div[1]/div[2]/div[3]/div[1]"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Transparency
		JavascriptExecutor jse20 = (JavascriptExecutor) driver;
		jse20.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Transparency);
		Thread.sleep(1000);
		jse20.executeScript("scroll(0, 2200);");
		// -----------------------------------------------------------------------------------------------------------------------------------

		// locate Do_s
		WebElement Do_s = driver
				.findElement(By.xpath("//body[1]/div[1]/main[1]/div[1]/section[2]/div[1]/div[1]/div[3]/div[1]"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Do_s
		JavascriptExecutor jse21 = (JavascriptExecutor) driver;
		jse21.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Do_s);

		// Do_s is DISPLAYED or not
		boolean res16 = Do_s.isDisplayed();

		if (res16 == true) {
			System.out.println("Do_s is DISPLAYED  ");
		} else {
			System.out.println("Do_s is not DISPLAYED");
		}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------------------------------

		// locate Dont_s
		WebElement Dont_s = driver
				.findElement(By.xpath("//body[1]/div[1]/main[1]/div[1]/section[2]/div[1]/div[1]/div[3]/div[2]"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Dont_s
		JavascriptExecutor jse22 = (JavascriptExecutor) driver;
		jse22.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Dont_s);

		// Dont_s is DISPLAYED or not
		boolean res17 = Dont_s.isDisplayed();

		if (res17 == true) {
			System.out.println("Dont_s is DISPLAYED  ");
		} else {
			System.out.println("Dont_s is not DISPLAYED");
		}
		Thread.sleep(1000);
		jse22.executeScript("scroll(0, 2800);");

		// -----------------------------------------------------------------------------------------------------------------------------------

		// locate Wen_Token
		WebElement Wen_Token = driver.findElement(By.xpath("//body/div[@id='__next']/footer/div/div/div/div[1]"));
		Thread.sleep(1000);

		// to highlight the Wen_Token
		JavascriptExecutor jse47 = (JavascriptExecutor) driver;
		jse47.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Wen_Token);

		// Wen_Token is DISPLAYED or not
		boolean res18 = Wen_Token.isDisplayed();

		if (res18 == true) {
			System.out.println("Wen_Token is DISPLAYED  ");
		} else {
			System.out.println("Wen_Token is not DISPLAYED");
		}
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------

		// locate Email_Field
		WebElement Email_Field = driver.findElement(By.xpath("//input[@placeholder='Enter your email']"));
		Thread.sleep(1000);

		// to highlight the Email_Field
		JavascriptExecutor jse48 = (JavascriptExecutor) driver;
		jse48.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Email_Field);

		// Email_Field is DISPLAYED or not
		boolean res19 = Email_Field.isDisplayed();

		if (res19 == true) {
			System.out.println("Email_Field is DISPLAYED  ");
		} else {
			System.out.println("Email_Field is not DISPLAYED");
		}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------

		// locate See_our_privacy_policy
		WebElement See_our_privacy_policy = driver.findElement(By.xpath("//a[contains(text(),'privacy policy')]"));
		Thread.sleep(1000);

		// to highlight the See_our_privacy_policy
		JavascriptExecutor jse49 = (JavascriptExecutor) driver;
		jse49.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				See_our_privacy_policy);
		Thread.sleep(1000);

		// See_our_privacy_policy is DISPLAYED or not
		boolean res20 = See_our_privacy_policy.isDisplayed();

		if (res20 == true) {
			System.out.println("See_our_privacy_policy is DISPLAYED  ");
		} else {
			System.out.println("See_our_privacy_policy is not DISPLAYED");
		}

		See_our_privacy_policy.click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);

		jse49.executeScript("scroll(0, 5000);");

		// --------------------------------------------------------------------------------------------
		// locate digitali_footer
		WebElement digitali_footer = driver
				.findElement(By.xpath("//body/div[@id='__next']/footer/div/div/div/div//*[name()='svg']"));
		Thread.sleep(1000);

		// to highlight the digitali_footer
		JavascriptExecutor jse50 = (JavascriptExecutor) driver;
		jse50.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				digitali_footer);

		// digitali_footer is DISPLAYED or not
		boolean res21 = digitali_footer.isDisplayed();

		if (res21 == true) {
			System.out.println("digitali_footer is DISPLAYED  ");
		} else {
			System.out.println("digitali_footer is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------

		// locate digitali_footer_text
		WebElement digitali_footer_text = driver
				.findElement(By.xpath("//div[contains(text(),'The most trusted NFT encyclopedia')]"));
		Thread.sleep(1000);

		// to highlight the digitali_footer_text
		JavascriptExecutor jse51 = (JavascriptExecutor) driver;
		jse51.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				digitali_footer_text);

		// digitali_footer_text is DISPLAYED or not
		boolean res22 = digitali_footer_text.isDisplayed();

		if (res22 == true) {
			System.out.println("digitali_footer_text is DISPLAYED  ");
		} else {
			System.out.println("digitali_footer_text is not DISPLAYED");
		}
		Thread.sleep(1000);

		// ----------------------------------------------------------------------------------------------------------------

		// locate Explore
		WebElement Explore = driver.findElement(By.xpath("//div[normalize-space()='Explore']"));
		Thread.sleep(1000);

		// to highlight the Explore
		JavascriptExecutor jse52 = (JavascriptExecutor) driver;
		jse52.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Explore);

		// Explore is DISPLAYED or not
		boolean res23 = Explore.isDisplayed();

		if (res23 == true) {
			System.out.println("Explore is DISPLAYED  ");
		} else {
			System.out.println("Explore is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Collection
		WebElement Collections = driver.findElement(
				By.xpath("//body/div[@id='__next']/footer[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/a[1]"));
		Thread.sleep(1000);

		// to highlight the Collections
		JavascriptExecutor jse53 = (JavascriptExecutor) driver;
		jse53.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Collections);

		// Collections is DISPLAYED or not
		boolean res24 = Collections.isDisplayed();

		if (res24 == true) {
			System.out.println("Collections is DISPLAYED  ");
		} else {
			System.out.println("Collections is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Leaderboard4
		WebElement Leaderboard4 = driver.findElement(By.xpath(
				"//div[@id='__next']//footer//div//div//div//div//div//div//div//a[normalize-space()='Leaderboard']"));
		Thread.sleep(1000);

		// to highlight the Leaderboard4
		JavascriptExecutor jse54 = (JavascriptExecutor) driver;
		jse54.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Leaderboard4);

		// Leaderboard4 is DISPLAYED or not
		boolean res25 = Leaderboard4.isDisplayed();

		if (res25 == true) {
			System.out.println("Leaderboard4 is DISPLAYED  ");
		} else {
			System.out.println("Leaderboard4 is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Reward_Points1
		WebElement Reward_Points1 = driver.findElement(By.xpath(
				"//div[@id='__next']//footer//div//div//div//div//div//div//div//a[normalize-space()='Reward Points']"));
		Thread.sleep(1000);

		// to highlight the Reward_Points1
		JavascriptExecutor jse55 = (JavascriptExecutor) driver;
		jse55.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Reward_Points1);

		// Reward_Points1 is DISPLAYED or not
		boolean res26 = Reward_Points1.isDisplayed();

		if (res26 == true) {
			System.out.println("Reward_Points1 is DISPLAYED  ");
		} else {
			System.out.println("Reward_Points1 is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate About_Us1
		WebElement About_Us1 = driver.findElement(By.xpath("//div[normalize-space()='About Us']"));
		Thread.sleep(1000);

		// to highlight the About_Us1
		JavascriptExecutor jse56 = (JavascriptExecutor) driver;
		jse56.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", About_Us1);

		// About_Us1 is DISPLAYED or not
		boolean res27 = About_Us1.isDisplayed();

		if (res27 == true) {
			System.out.println("About_Us1 is DISPLAYED  ");
		} else {
			System.out.println("About_Us1 is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Digitali
		WebElement Digitali = driver.findElement(By.xpath("//a[normalize-space()='Digitali']"));
		Thread.sleep(1000);

		// to highlight the Digitali
		JavascriptExecutor jse57 = (JavascriptExecutor) driver;
		jse57.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Digitali);

		// Digitali is DISPLAYED or not
		boolean res28 = Digitali.isDisplayed();

		if (res28 == true) {
			System.out.println("Digitali is DISPLAYED  ");
		} else {
			System.out.println("Digitali is not DISPLAYED");
		}
		Thread.sleep(000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Blogs_footer
		WebElement Blogs_footer = driver.findElement(By.xpath("//a[normalize-space()='Blogs']"));
		Thread.sleep(1000);

		// to highlight the Blogs_footer
		JavascriptExecutor jse58 = (JavascriptExecutor) driver;
		jse58.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Blogs_footer);

		// Blogs_footer is DISPLAYED or not
		boolean res29 = Blogs_footer.isDisplayed();

		if (res29 == true) {
			System.out.println("Blogs_footer is DISPLAYED  ");
		} else {
			System.out.println("Blogs_footer is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate FAQ1
		WebElement FAQ1 = driver.findElement(
				By.xpath("//div[@id='__next']//footer//div//div//div//div//div//div//div//a[normalize-space()='FAQ']"));
		Thread.sleep(1000);

		// to highlight the FAQ1
		JavascriptExecutor jse59 = (JavascriptExecutor) driver;
		jse59.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", FAQ1);

		// FAQ1 is DISPLAYED or not
		boolean res30 = FAQ1.isDisplayed();

		if (res30 == true) {
			System.out.println("FAQ1 is DISPLAYED  ");
		} else {
			System.out.println("FAQ1 is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Legal
		WebElement Legal = driver.findElement(By.xpath("//div[normalize-space()='Legal']"));
		Thread.sleep(1000);

		// to highlight the Legal
		JavascriptExecutor jse60 = (JavascriptExecutor) driver;
		jse60.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Legal);

		// Legal is DISPLAYED or not
		boolean res31 = Legal.isDisplayed();

		if (res31 == true) {
			System.out.println("Legal is DISPLAYED  ");
		} else {
			System.out.println("Legal is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Terms
		WebElement Terms = driver.findElement(By.xpath("//a[normalize-space()='Terms']"));
		Thread.sleep(1000);

		// to highlight the Terms
		JavascriptExecutor jse61 = (JavascriptExecutor) driver;
		jse61.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Terms);

		// Terms is DISPLAYED or not
		boolean res32 = Terms.isDisplayed();

		if (res32 == true) {
			System.out.println("Terms is DISPLAYED  ");
		} else {
			System.out.println("Terms is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Privacy
		WebElement Privacy = driver.findElement(By.xpath("//a[normalize-space()='Privacy']"));
		Thread.sleep(1000);

		// to highlight the Privacy
		JavascriptExecutor jse62 = (JavascriptExecutor) driver;
		jse62.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Privacy);

		// Privacy is DISPLAYED or not
		boolean res33 = Privacy.isDisplayed();

		if (res33 == true) {
			System.out.println("Privacy is DISPLAYED  ");
		} else {
			System.out.println("Privacy is not DISPLAYED");
		}
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------------

		// locate All_Rights_Reserved
		WebElement All_Rights_Reserved = driver
				.findElement(By.xpath("//div[contains(text(),'© 2023 Digitali Technology Solutions Ltd. All righ')]"));
		Thread.sleep(1000);

		// to highlight the All_Rights_Reserved
		JavascriptExecutor jse63 = (JavascriptExecutor) driver;
		jse63.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				All_Rights_Reserved);

		// All_Rights_Reserved is DISPLAYED or not
		boolean res34 = All_Rights_Reserved.isDisplayed();

		if (res34 == true) {
			System.out.println("All_Rights_Reserved is DISPLAYED  ");
		} else {
			System.out.println("All_Rights_Reserved is not DISPLAYED");
		}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------------

//				// locate Twitter_Icon
//				WebElement Twitter_Icon = driver.findElement(
//						By.xpath("//body/div[@id='__next']/footer[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/a[1]/*[1]"));
//				Thread.sleep(1000);
		//
//				// to highlight the Twitter_Icon
//				JavascriptExecutor jse64 = (JavascriptExecutor) driver;
//				jse64.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
//						Twitter_Icon);
//				Thread.sleep(1000);
		//
//				// -----------------------------------------------------------------------------------------------------------------
		//
//				// locate Discord_Icon
//				WebElement Discord_Icon = driver
//						.findElement(By.xpath("//a[@href='https://discord.com/invite/dCYTykjgxW']//*[name()='svg']"));
//				Thread.sleep(1000);
		//
//				// to highlight the Discord_Icon
//				JavascriptExecutor jse65 = (JavascriptExecutor) driver;
//				jse65.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
//						Discord_Icon);
//				Thread.sleep(1000);
		driver.close();
		driver.quit();

	}

	// ------------------------------------------------------------
	@Test
	public void FAQ() throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\praka\\Downloads\\edgedriver_win64 (2)\\msedgedriver.exe");
		// System.setProperty("webdriver.edge.driver",
		// "C:\\Users\\praka\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");

		// up casting
		WebDriver driver = new EdgeDriver();

		// get URL
		driver.get("https://digitali.xyz/");
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// maximize
		driver.manage().window().maximize();
		Thread.sleep(1000);

		// locate digital logo
		WebElement digitali_logo = driver.findElement(By.xpath("//img[@alt='Digitali Logo']"));

		// to highlight the digitali_logo
		JavascriptExecutor jse00 = (JavascriptExecutor) driver;
		jse00.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				digitali_logo);
		Thread.sleep(1000);

		// digitali_logo is DISPLAYED or not
		boolean res1 = digitali_logo.isDisplayed();

		if (res1 == true) {
			System.out.println("digitali_logo is DISPLAYED  ");
		} else {
			System.out.println("digitali_logo is not DISPLAYED");
		}

		jse00.executeScript("scroll(0, 5000);");

		// ---------------------------------------------------------------------------------------------------------------------------------

		// locate FAQ
		WebElement FAQ = driver.findElement(By.xpath("//a[normalize-space()='FAQ']"));
		Thread.sleep(1000);

		// to highlight the FAQ
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", FAQ);
		Thread.sleep(1000);

		// FAQ is DISPLAYED or not
		boolean res2 = FAQ.isDisplayed();

		if (res2 == true) {
			System.out.println("FAQ is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("FAQ is not DISPLAYED");
		}
		FAQ.click();
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------------------------------------

		// locate FAQs
		WebElement FAQs = driver.findElement(By.xpath("//div[normalize-space()='FAQs']"));
		Thread.sleep(1000);

		// to highlight the FAQs
		JavascriptExecutor jse000 = (JavascriptExecutor) driver;
		jse000.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", FAQs);
		Thread.sleep(1000);

		// FAQs is DISPLAYED or not
		boolean res3 = FAQs.isDisplayed();

		if (res3 == true) {
			System.out.println("FAQs is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("FAQs is not DISPLAYED");
		}
		jse000.executeScript("scroll(0, 100);");

		// ---------------------------------------------------------------------------------------------------------------------------------

		// locate Top_questions_about_Digitali
		WebElement Top_questions_about_Digitali = driver
				.findElement(By.xpath("//div[normalize-space()='Top questions about Digitali']"));
		Thread.sleep(1000);

		// to highlight the Top_questions_about_Digitali
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Top_questions_about_Digitali);
		Thread.sleep(1000);

		// Top_questions_about_Digitali is DISPLAYED or not
		boolean res4 = Top_questions_about_Digitali.isDisplayed();

		if (res4 == true) {
			System.out.println("Top_questions_about_Digitali is DISPLAYED ");
		} else {
			System.out.println("Top_questions_about_Digitali is not DISPLAYED");
		}
		jse1.executeScript("scroll(0, 100);");

		// ---------------------------------------------------------------------------------------------------------------------------------

		// locate Need_Something
		WebElement Need_Something = driver
				.findElement(By.xpath("//div[contains(text(),'Need something cleared up? Here are our most frequ')]"));
		Thread.sleep(1000);

		// to highlight the Need_Something
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Need_Something);
		Thread.sleep(1000);
		jse2.executeScript("scroll(0, 100);");

		// ---------------------------------------------------------------------------------------------------------------------------------

		// locate What_is_Digitali?
		WebElement What_is_Digitali = driver.findElement(By.xpath("//div[contains(text(),'What is Digitali?')]"));
		Thread.sleep(1000);

		// to highlight the What_is_Digitali
		JavascriptExecutor jse3 = (JavascriptExecutor) driver;
		jse3.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				What_is_Digitali);
		Thread.sleep(1000);

		// What_is_Digitali is DISPLAYED or not
		boolean res5 = What_is_Digitali.isDisplayed();

		if (res5 == true) {
			System.out.println("What_is_Digitali is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("What_is_Digitali is not DISPLAYED");
		}
		What_is_Digitali.click();
		Thread.sleep(1000);
		jse3.executeScript("scroll(0, 100);");

		// ---------------------------------------------------------------------------------------------------------------------------------

		// locate Digitali_is_a_community_driven_Web3_collaborative
		WebElement Digitali_is_a_community_driven_Web3_collaborative = driver
				.findElement(By.xpath("//p[contains(text(),'Digitali is a community-driven Web3 collaborative ')]"));
		Thread.sleep(1000);

		// to highlight the Digitali_is_a_community_driven_Web3_collaborative
		JavascriptExecutor jse4 = (JavascriptExecutor) driver;
		jse4.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')",
				Digitali_is_a_community_driven_Web3_collaborative);
		Thread.sleep(1000);
		jse4.executeScript("scroll(0, 100);");

		// ---------------------------------------------------------------------------------------------------------------------------------

		// locate Our_mission_is_to_establish_a_comprehensive_reposi
		WebElement Our_mission_is_to_establish_a_comprehensive_reposi = driver
				.findElement(By.xpath("//p[contains(text(),'Our mission is to establish a comprehensive reposi')]"));
		Thread.sleep(1000);

		// to highlight the Our_mission_is_to_establish_a_comprehensive_reposi
		JavascriptExecutor jse5 = (JavascriptExecutor) driver;
		jse5.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')",
				Our_mission_is_to_establish_a_comprehensive_reposi);
		Thread.sleep(1000);
		jse5.executeScript("scroll(0, 200);");

		// ---------------------------------------------------------------------------------------------------------------------------------

		// locate We_are_committed_to_providing_the_community_with_a
		WebElement We_are_committed_to_providing_the_community_with_a = driver
				.findElement(By.xpath("//p[contains(text(),'We are committed to providing the community with a')]"));
		Thread.sleep(1000);

		// to highlight the We_are_committed_to_providing_the_community_with_a
		JavascriptExecutor jse6 = (JavascriptExecutor) driver;
		jse6.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')",
				We_are_committed_to_providing_the_community_with_a);
		Thread.sleep(1000);
		jse6.executeScript("scroll(0, 200);");

		// ---------------------------------------------------------------------------------------------------------------------------------

		// locate How_does_Digitali_work
		WebElement How_does_Digitali_work = driver
				.findElement(By.xpath("//div[contains(text(),'How does Digitali work?')]"));
		Thread.sleep(1000);

		// to highlight the How_does_Digitali_work
		JavascriptExecutor jse7 = (JavascriptExecutor) driver;
		jse7.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				How_does_Digitali_work);
		Thread.sleep(1000);

		// How_does_Digitali_work is DISPLAYED or not
		boolean res6 = How_does_Digitali_work.isDisplayed();

		if (res6 == true) {
			System.out.println("How_does_Digitali_work is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("How_does_Digitali_work is not DISPLAYED");
		}
		How_does_Digitali_work.click();
		Thread.sleep(1000);
		jse7.executeScript("scroll(0, 300);");

		// -----------------------------------------------------------------------------------------------------

		// locate Contributors_can_navigate_to_a_specific_NFT_collec
		WebElement Contributors_can_navigate_to_a_specific_NFT_collec = driver
				.findElement(By.xpath("//div[contains(text(),'Contributors can navigate to a specific NFT collec')]"));
		Thread.sleep(1000);

		// to highlight the Contributors_can_navigate_to_a_specific_NFT_collec
		JavascriptExecutor jse8 = (JavascriptExecutor) driver;
		jse8.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')",
				Contributors_can_navigate_to_a_specific_NFT_collec);
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------------------------------------

		// locate What_kinds_of_NFTs_does_Digitali_currently_cover
		WebElement What_kinds_of_NFTs_does_Digitali_currently_cover = driver
				.findElement(By.xpath("//div[contains(text(),'What kinds of NFTs does Digitali currently cover?')]"));
		Thread.sleep(1000);

		// to highlight the What_kinds_of_NFTs_does_Digitali_currently_cover
		JavascriptExecutor jse9 = (JavascriptExecutor) driver;
		jse9.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				What_kinds_of_NFTs_does_Digitali_currently_cover);
		Thread.sleep(1000);

		// What_kinds_of_NFTs_does_Digitali_currently_cover is DISPLAYED or not
		boolean res7 = What_kinds_of_NFTs_does_Digitali_currently_cover.isDisplayed();

		if (res7 == true) {
			System.out.println("What_kinds_of_NFTs_does_Digitali_currently_cover is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("What_kinds_of_NFTs_does_Digitali_currently_cover is not DISPLAYED");
		}
		What_kinds_of_NFTs_does_Digitali_currently_cover.click();
		Thread.sleep(1000);
		jse9.executeScript("scroll(0, 300);");

		// ----------------------------------------------------------------------------------------------------------------------------------------

		// locate We_ve_initially_started_with_PFP_style_collections
		WebElement We_ve_initially_started_with_PFP_style_collections = driver
				.findElement(By.xpath("//p[contains(text(),'We′ve initially started with PFP-style collections')]"));
		Thread.sleep(1000);

		// to highlight the We_ve_initially_started_with_PFP_style_collections
		JavascriptExecutor jse10 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')",
				We_ve_initially_started_with_PFP_style_collections);
		Thread.sleep(1000);
		jse10.executeScript("scroll(0, 600);");

		// ----------------------------------------------------------------------------------------------------------------------------------------

		// locate Our_ultimate_goal_is_to_evolve_and_encompass_a_bro
		WebElement Our_ultimate_goal_is_to_evolve_and_encompass_a_bro = driver
				.findElement(By.xpath("//p[contains(text(),'Our ultimate goal is to evolve and encompass a bro')]"));
		Thread.sleep(1000);

		// to highlight the Our_ultimate_goal_is_to_evolve_and_encompass_a_bro
		JavascriptExecutor jse11 = (JavascriptExecutor) driver;
		jse11.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')",
				Our_ultimate_goal_is_to_evolve_and_encompass_a_bro);
		Thread.sleep(1000);
		jse11.executeScript("scroll(0, 600);");

		// ---------------------------------------------------------------------------------------------------------------------------------------

		// locate How_can_I_contribute_content_to_Digitali
		WebElement How_can_I_contribute_content_to_Digitali = driver
				.findElement(By.xpath("//div[contains(text(),'How can I contribute content to Digitali?')]"));
		Thread.sleep(1000);

		// to highlight the How_can_I_contribute_content_to_Digitali
		JavascriptExecutor jse12 = (JavascriptExecutor) driver;
		jse12.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				How_can_I_contribute_content_to_Digitali);
		Thread.sleep(1000);

		// How_can_I_contribute_content_to_Digitali is DISPLAYED or not
		boolean res8 = How_can_I_contribute_content_to_Digitali.isDisplayed();

		if (res8 == true) {
			System.out.println("How_can_I_contribute_content_to_Digitali is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("How_can_I_contribute_content_to_Digitali is not DISPLAYED");
		}

		How_can_I_contribute_content_to_Digitali.click();
		Thread.sleep(1000);
		jse12.executeScript("scroll(0, 600);");

		// ----------------------------------------------------------------------------------------------------------------------------------------

		// locate Contributing_content_is_effortless
		WebElement Contributing_content_is_effortless = driver
				.findElement(By.xpath("//p[normalize-space()='Contributing content is effortless.']"));
		Thread.sleep(1000);

		// to highlight the Contributing_content_is_effortless
		JavascriptExecutor jse14 = (JavascriptExecutor) driver;
		jse14.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')",
				Contributing_content_is_effortless);
		Thread.sleep(1000);
		jse14.executeScript("scroll(0, 600);");

		// ------------------------------------------------------------------------------------------------------------------------------------------

		// locate Simply_go_to_a_collection_page_and_click_the
		WebElement Simply_go_to_a_collection_page_and_click_the = driver
				.findElement(By.xpath("//p[contains(text(),'Simply go to a collection page, and click the \"ADD')]"));
		Thread.sleep(1000);

		// to highlight the Simply_go_to_a_collection_page_and_click_the
		JavascriptExecutor jse15 = (JavascriptExecutor) driver;
		jse15.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')",
				Simply_go_to_a_collection_page_and_click_the);
		Thread.sleep(1000);
		jse15.executeScript("scroll(0, 600);");

		// ------------------------------------------------------------------------------------------------------------------------------------------

		// locate Provide_your_email_and_ETH_address_for_communicati
		WebElement Provide_your_email_and_ETH_address_for_communicati = driver
				.findElement(By.xpath("//p[contains(text(),'Provide your email and ETH address for communicati')]"));
		Thread.sleep(1000);

		// to highlight the Provide_your_email_and_ETH_address_for_communicati
		JavascriptExecutor jse16 = (JavascriptExecutor) driver;
		jse16.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')",
				Provide_your_email_and_ETH_address_for_communicati);
		Thread.sleep(1000);
		jse16.executeScript("scroll(0, 600);");

		// -------------------------------------------------------------------------------------------------------------------------------------------

		// locate It_s_that_simple
		WebElement It_s_that_simple = driver.findElement(By.xpath("//p[contains(text(),'It′s that simple!')]"));
		Thread.sleep(1000);

		// to highlight the It_s_that_simple
		JavascriptExecutor jse17 = (JavascriptExecutor) driver;
		jse17.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')",
				It_s_that_simple);
		Thread.sleep(1000);
		jse17.executeScript("scroll(0, 600);");

		// -------------------------------------------------------------------------------------------------------------------------------------------

		// locate What_kind_of_information_can_I_contribute_to_Digit
		WebElement What_kind_of_information_can_I_contribute_to_Digit = driver
				.findElement(By.xpath("//div[contains(text(),'What kind of information can I contribute to Digit')]"));
		Thread.sleep(1000);

		// to highlight the What_kind_of_information_can_I_contribute_to_Digit
		JavascriptExecutor jse13 = (JavascriptExecutor) driver;
		jse13.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				What_kind_of_information_can_I_contribute_to_Digit);
		Thread.sleep(1000);

		// What_kind_of_information_can_I_contribute_to_Digit is DISPLAYED or not
		boolean res9 = What_kind_of_information_can_I_contribute_to_Digit.isDisplayed();

		if (res9 == true) {
			System.out.println("What_kind_of_information_can_I_contribute_to_Digit is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("What_kind_of_information_can_I_contribute_to_Digit is not DISPLAYED");
		}
		What_kind_of_information_can_I_contribute_to_Digit.click();
		Thread.sleep(1000);

		// -------------------------------------------------------------------------------------------------------------------------------------------

		// locate ans
		WebElement ans = driver.findElement(
				By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[5]/div[2]/div[1]/div[1]"));
		Thread.sleep(1000);

		// to highlight the It_s_that_simple
		JavascriptExecutor jse18 = (JavascriptExecutor) driver;
		jse18.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')", ans);
		Thread.sleep(1000);
		jse18.executeScript("scroll(0, 600);");

		// ---------------------------------------------------------------------------------------------------------------------------------

		// locate Are_there_any_guidelines_or_rules_for_contributing
		WebElement Are_there_any_guidelines_or_rules_for_contributing = driver
				.findElement(By.xpath("//div[contains(text(),'Are there any guidelines or rules for contributing')]"));
		Thread.sleep(1000);

		// to highlight the Are_there_any_guidelines_or_rules_for_contributing
		JavascriptExecutor jse19 = (JavascriptExecutor) driver;
		jse19.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Are_there_any_guidelines_or_rules_for_contributing);
		Thread.sleep(1000);

		// Are_there_any_guidelines_or_rules_for_contributing is DISPLAYED or not
		boolean res10 = Are_there_any_guidelines_or_rules_for_contributing.isDisplayed();

		if (res10 == true) {
			System.out.println("Are_there_any_guidelines_or_rules_for_contributing is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("Are_there_any_guidelines_or_rules_for_contributing is not DISPLAYED");
		}
		Are_there_any_guidelines_or_rules_for_contributing.click();
		Thread.sleep(1000);
		jse19.executeScript("scroll(0, 600);");

		// ------------------------------------------------------------------------------------------------------------------------------------------

		// locate ans1
		WebElement ans1 = driver.findElement(
				By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[6]/div[2]/div[1]/div[1]"));
		Thread.sleep(1000);

		// to highlight the It_s_that_simple
		JavascriptExecutor jse20 = (JavascriptExecutor) driver;
		jse20.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')", ans1);
		Thread.sleep(1000);
		jse20.executeScript("scroll(0, 600);");

		// -----------------------------------------------------------------------------------------------------------------------------------------

		// locate What_happens_to_the_content_I_submit
		WebElement What_happens_to_the_content_I_submit = driver
				.findElement(By.xpath("//div[contains(text(),'What happens to the content I submit?')]"));
		Thread.sleep(1000);

		// to highlight the What_happens_to_the_content_I_submit
		JavascriptExecutor jse21 = (JavascriptExecutor) driver;
		jse21.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				What_happens_to_the_content_I_submit);
		Thread.sleep(1000);

		// What_happens_to_the_content_I_submit is DISPLAYED or not
		boolean res11 = What_happens_to_the_content_I_submit.isDisplayed();

		if (res11 == true) {
			System.out.println("What_happens_to_the_content_I_submit is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("What_happens_to_the_content_I_submit is not DISPLAYED");
		}
		What_happens_to_the_content_I_submit.click();
		Thread.sleep(1000);
		jse21.executeScript("scroll(0, 600);");

		// --------------------------------------------------------------------------------------------------------------------------------
		// locate Reward_Points11
		WebElement Reward_Points11 = driver.findElement(By.xpath(
				"//p[contains(text(),'Next, we multiply this Quality Score ratio by the ')]//a[normalize-space()='Reward Points']"));
		Thread.sleep(1000);

		// to highlight the Reward_Points11
		JavascriptExecutor jse24 = (JavascriptExecutor) driver;
		jse24.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Reward_Points11);
		Thread.sleep(1000);
		jse24.executeScript("scroll(0, 600);");
		Reward_Points11.click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		jse24.executeScript("scroll(0, 700);");

		// ------------------------------------------------------------

//					// locate ans2
//					WebElement ans2 = driver
//							.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[6]/div[2]/div[1]/div[1]"));
//					Thread.sleep(1000);
		//
//					// to highlight the It_s_that_simple
//					JavascriptExecutor jse22 = (JavascriptExecutor) driver;
//					jse22.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
//							ans2);
//					Thread.sleep(1000);
//					jse22.executeScript("scroll(0, 300);");

		// ---------------------------------------------------------------------------------------------------------------------------

		// locate
		// What_happens_to_the_contWhat_happens_to_the_content_I_submitent_I_submit
		WebElement What_happens_to_the_contWhat_happens_to_the_content_I_submitent_I_submit = driver
				.findElement(By.xpath("//div[contains(text(),'What happens to the content I submit?')]"));
		Thread.sleep(1000);

		// to highlight the
		// What_happens_to_the_contWhat_happens_to_the_content_I_submitent_I_submit
		JavascriptExecutor jse23 = (JavascriptExecutor) driver;
		jse23.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				What_happens_to_the_contWhat_happens_to_the_content_I_submitent_I_submit);
		Thread.sleep(1000);

		// What_happens_to_the_contWhat_happens_to_the_content_I_submitent_I_submit is
		// DISPLAYED or not
		boolean res12 = What_happens_to_the_contWhat_happens_to_the_content_I_submitent_I_submit.isDisplayed();

		if (res12 == true) {
			System.out.println(
					"What_happens_to_the_contWhat_happens_to_the_content_I_submitent_I_submit is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println(
					"What_happens_to_the_contWhat_happens_to_the_content_I_submitent_I_submit is not DISPLAYED");
		}
		What_happens_to_the_contWhat_happens_to_the_content_I_submitent_I_submit.click();
		Thread.sleep(1000);
		jse23.executeScript("scroll(0, 800);");

		// ---------------------------------------------------------------------------------------------------------------

		// ---------------------------------------------------------------------------------------------------------------

		// locate ans3
		WebElement ans3 = driver.findElement(
				By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[7]/div[2]/div[1]/div[1]"));
		Thread.sleep(1000);

		// to highlight the It_s_that_simple
		JavascriptExecutor jse244 = (JavascriptExecutor) driver;
		jse244.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')", ans3);
		Thread.sleep(1000);
		jse244.executeScript("scroll(0, 600);");

		// ---------------------------------------------------------------------------------------------------------------------------

		// locate Who_decides_what_gets_approved_for_a_collection_pa
		WebElement Who_decides_what_gets_approved_for_a_collection_pa = driver
				.findElement(By.xpath("//div[contains(text(),'Who decides what gets approved for a collection pa')]"));
		Thread.sleep(1000);

		// to highlight the Who_decides_what_gets_approved_for_a_collection_pa
		JavascriptExecutor jse25 = (JavascriptExecutor) driver;
		jse25.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Who_decides_what_gets_approved_for_a_collection_pa);
		Thread.sleep(1000);

		// Who_decides_what_gets_approved_for_a_collection_pa is DISPLAYED or not
		boolean res13 = Who_decides_what_gets_approved_for_a_collection_pa.isDisplayed();

		if (res13 == true) {
			System.out.println("Who_decides_what_gets_approved_for_a_collection_pa is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("Who_decides_what_gets_approved_for_a_collection_pa is not DISPLAYED");
		}
		Who_decides_what_gets_approved_for_a_collection_pa.click();
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------------------

		// locate ans4
		WebElement ans4 = driver.findElement(
				By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[2]/div[1]/div[1]"));
		Thread.sleep(1000);

		// to highlight the It_s_that_simple
		JavascriptExecutor jse26 = (JavascriptExecutor) driver;
		jse26.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')", ans4);
		Thread.sleep(1000);
		jse26.executeScript("scroll(0, 700);");

		// ---------------------------------------------------------------------------------------------------------------------------

		// locate Can_I_contribute_content_to_multiple_collection_pa
		WebElement Can_I_contribute_content_to_multiple_collection_pa = driver
				.findElement(By.xpath("//div[contains(text(),'Can I contribute content to multiple collection pa')]"));
		Thread.sleep(1000);

		// to highlight the Can_I_contribute_content_to_multiple_collection_pa
		JavascriptExecutor jse27 = (JavascriptExecutor) driver;
		jse27.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Can_I_contribute_content_to_multiple_collection_pa);
		Thread.sleep(1000);

		// Can_I_contribute_content_to_multiple_collection_pa is DISPLAYED or not
		boolean res14 = Can_I_contribute_content_to_multiple_collection_pa.isDisplayed();

		if (res14 == true) {
			System.out.println("Can_I_contribute_content_to_multiple_collection_pa is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("Can_I_contribute_content_to_multiple_collection_pa is not DISPLAYED");
		}
		Can_I_contribute_content_to_multiple_collection_pa.click();
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------------------

		// locate ans5
		WebElement ans5 = driver.findElement(
				By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[2]/div[1]/div[1]"));
		Thread.sleep(1000);

		// to highlight the It_s_that_simple
		JavascriptExecutor jse28 = (JavascriptExecutor) driver;
		jse28.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')", ans5);
		Thread.sleep(1000);
		jse28.executeScript("scroll(0, 700);");

		// ---------------------------------------------------------------------------------------------------------------------------

		// locate How_do_I_report_inaccurate_or_misleading_informati
		WebElement How_do_I_report_inaccurate_or_misleading_informati = driver
				.findElement(By.xpath("//div[contains(text(),'How do I report inaccurate or misleading informati')]"));
		Thread.sleep(1000);

		// to highlight the How_do_I_report_inaccurate_or_misleading_informati
		JavascriptExecutor jse29 = (JavascriptExecutor) driver;
		jse29.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				How_do_I_report_inaccurate_or_misleading_informati);
		Thread.sleep(1000);

		// How_do_I_report_inaccurate_or_misleading_informati is DISPLAYED or not
		boolean res15 = How_do_I_report_inaccurate_or_misleading_informati.isDisplayed();

		if (res15 == true) {
			System.out.println("How_do_I_report_inaccurate_or_misleading_informati is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("How_do_I_report_inaccurate_or_misleading_informati is not DISPLAYED");
		}
		How_do_I_report_inaccurate_or_misleading_informati.click();
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------------------

		// locate ans6
		WebElement ans6 = driver.findElement(
				By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[10]/div[2]/div[1]/div[1]"));
		Thread.sleep(1000);

		// to highlight the It_s_that_simple
		JavascriptExecutor jse30 = (JavascriptExecutor) driver;
		jse30.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')", ans6);
		Thread.sleep(1000);
		jse30.executeScript("scroll(0, 700);");

		// ---------------------------------------------------------------------------------------------------------------------

		// locate_Is_the_information_on_Digitali_verified_or_fact_ch
		WebElement locate_Is_the_information_on_Digitali_verified_or_fact_ch = driver
				.findElement(By.xpath("//div[contains(text(),'Is the information on Digitali verified or fact-ch')]"));
		Thread.sleep(1000);

		// to highlight the locate_Is_the_information_on_Digitali_verified_or_fact_ch
		JavascriptExecutor jse31 = (JavascriptExecutor) driver;
		jse31.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				locate_Is_the_information_on_Digitali_verified_or_fact_ch);
		Thread.sleep(1000);

		// locate_Is_the_information_on_Digitali_verified_or_fact_ch is DISPLAYED or not
		boolean res16 = locate_Is_the_information_on_Digitali_verified_or_fact_ch.isDisplayed();

		if (res16 == true) {
			System.out.println("locate_Is_the_information_on_Digitali_verified_or_fact_ch is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("locate_Is_the_information_on_Digitali_verified_or_fact_ch is not DISPLAYED");
		}
		locate_Is_the_information_on_Digitali_verified_or_fact_ch.click();
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------------------

		// locate ans7
		WebElement ans7 = driver
				.findElement(By.xpath("//p[contains(text(),'Yes, our content moderators review all submitted c')]"));
		Thread.sleep(1000);

		// to highlight the It_s_that_simple
		JavascriptExecutor jse32 = (JavascriptExecutor) driver;
		jse32.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')", ans7);
		Thread.sleep(1000);
		jse32.executeScript("scroll(0, 700);");

		// ---------------------------------------------------------------------------------------------------------------------

		// What_information_do_I_need_to_provide_when_contrib
		WebElement What_information_do_I_need_to_provide_when_contrib = driver
				.findElement(By.xpath("//div[contains(text(),'What information do I need to provide when contrib')]"));
		Thread.sleep(1000);

		// to highlight the What_information_do_I_need_to_provide_when_contrib
		JavascriptExecutor jse33 = (JavascriptExecutor) driver;
		jse33.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				What_information_do_I_need_to_provide_when_contrib);
		Thread.sleep(1000);

		// What_information_do_I_need_to_provide_when_contrib is DISPLAYED or not
		boolean res17 = What_information_do_I_need_to_provide_when_contrib.isDisplayed();

		if (res17 == true) {
			System.out.println("What_information_do_I_need_to_provide_when_contrib is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("What_information_do_I_need_to_provide_when_contrib is not DISPLAYED");
		}
		What_information_do_I_need_to_provide_when_contrib.click();
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------------------

		// locate ans8
		WebElement ans8 = driver
				.findElement(By.xpath("//p[contains(text(),'We require your email address, ETH address, conten')]"));
		Thread.sleep(1000);

		// to highlight the It_s_that_simple
		JavascriptExecutor jse34 = (JavascriptExecutor) driver;
		jse34.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')", ans8);
		Thread.sleep(1000);
		jse34.executeScript("scroll(0, 600);");

		// ---------------------------------------------------------------------------------------------------------------------

		// Why_do_I_need_to_include_my_email_address_when_sub
		WebElement Why_do_I_need_to_include_my_email_address_when_sub = driver
				.findElement(By.xpath("//div[contains(text(),'Why do I need to include my email address when sub')]"));
		Thread.sleep(1000);

		// to highlight the Why_do_I_need_to_include_my_email_address_when_sub
		JavascriptExecutor jse35 = (JavascriptExecutor) driver;
		jse35.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Why_do_I_need_to_include_my_email_address_when_sub);
		Thread.sleep(1000);

		// Why_do_I_need_to_include_my_email_address_when_sub is DISPLAYED or not
		boolean res18 = Why_do_I_need_to_include_my_email_address_when_sub.isDisplayed();

		if (res18 == true) {
			System.out.println("Why_do_I_need_to_include_my_email_address_when_sub is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("Why_do_I_need_to_include_my_email_address_when_sub is not DISPLAYED");
		}
		Why_do_I_need_to_include_my_email_address_when_sub.click();
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------------------

		// locate ans9
		WebElement ans9 = driver.findElement(
				By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[13]/div[2]/div[1]/div[1]"));
		Thread.sleep(1000);

		// to highlight the It_s_that_simple
		JavascriptExecutor jse36 = (JavascriptExecutor) driver;
		jse36.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')", ans9);
		Thread.sleep(1000);
		jse36.executeScript("scroll(0, 700);");

		// ---------------------------------------------------------------------------------------------------------------------

		// What_do_I_do_if_I_can_t_find_an_NFT_Collection_pag
		WebElement What_do_I_do_if_I_can_t_find_an_NFT_Collection_pag = driver
				.findElement(By.xpath("//div[contains(text(),'What do I do if I can′t find an NFT Collection pag')]"));
		Thread.sleep(1000);

		// to highlight the What_do_I_do_if_I_can_t_find_an_NFT_Collection_pag
		JavascriptExecutor jse37 = (JavascriptExecutor) driver;
		jse37.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				What_do_I_do_if_I_can_t_find_an_NFT_Collection_pag);
		Thread.sleep(1000);

		// What_do_I_do_if_I_can_t_find_an_NFT_Collection_pag is DISPLAYED or not
		boolean res19 = What_do_I_do_if_I_can_t_find_an_NFT_Collection_pag.isDisplayed();

		if (res19 == true) {
			System.out.println("What_do_I_do_if_I_can_t_find_an_NFT_Collection_pag is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("What_do_I_do_if_I_can_t_find_an_NFT_Collection_pag is not DISPLAYED");
		}
		What_do_I_do_if_I_can_t_find_an_NFT_Collection_pag.click();
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------------------

		// locate ans10
		WebElement ans10 = driver
				.findElement(By.xpath("//div[contains(text(),'You can request the creation of a new page for you')]"));
		Thread.sleep(1000);

		// to highlight the It_s_that_simple
		JavascriptExecutor jse38 = (JavascriptExecutor) driver;
		jse38.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')", ans10);
		Thread.sleep(1000);
		jse38.executeScript("scroll(0, 700);");

		// ---------------------------------------------------------------------------------------------------------------------

		// Does_Digitali_offer_NFT_Collection_pages_for_non_E
		WebElement Does_Digitali_offer_NFT_Collection_pages_for_non_E = driver
				.findElement(By.xpath("//div[contains(text(),'Does Digitali offer NFT Collection pages for non-E')]"));
		Thread.sleep(1000);

		// to highlight the Does_Digitali_offer_NFT_Collection_pages_for_non_E
		JavascriptExecutor jse39 = (JavascriptExecutor) driver;
		jse39.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Does_Digitali_offer_NFT_Collection_pages_for_non_E);
		Thread.sleep(1000);

		// Does_Digitali_offer_NFT_Collection_pages_for_non_E is DISPLAYED or not
		boolean res20 = Does_Digitali_offer_NFT_Collection_pages_for_non_E.isDisplayed();

		if (res20 == true) {
			System.out.println("Does_Digitali_offer_NFT_Collection_pages_for_non_E is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("Does_Digitali_offer_NFT_Collection_pages_for_non_E is not DISPLAYED");
		}
		Does_Digitali_offer_NFT_Collection_pages_for_non_E.click();
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------------------

		// locate ans11
		WebElement ans11 = driver
				.findElement(By.xpath("//p[contains(text(),'Absolutely! While most collections on Digitali are')]"));
		Thread.sleep(1000);

		// to highlight the It_s_that_simple
		JavascriptExecutor jse40 = (JavascriptExecutor) driver;
		jse40.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')", ans11);
		Thread.sleep(1000);
		jse40.executeScript("scroll(0, 700);");

		// ---------------------------------------------------------------------------------------------------------------------

		// What_are_Reward_Points_on_Digitali
		WebElement What_are_Reward_Points_on_Digitali = driver
				.findElement(By.xpath("//div[contains(text(),'What are Reward Points on Digitali?')]"));
		Thread.sleep(1000);

		// to highlight the What_are_Reward_Points_on_Digitali
		JavascriptExecutor jse41 = (JavascriptExecutor) driver;
		jse41.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				What_are_Reward_Points_on_Digitali);
		Thread.sleep(1000);

		// What_are_Reward_Points_on_Digitali is DISPLAYED or not
		boolean res21 = What_are_Reward_Points_on_Digitali.isDisplayed();

		if (res21 == true) {
			System.out.println("What_are_Reward_Points_on_Digitali is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("What_are_Reward_Points_on_Digitali is not DISPLAYED");
		}
		What_are_Reward_Points_on_Digitali.click();
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------------------

		// locate ans12
		WebElement ans12 = driver.findElement(
				By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[16]/div[2]/div[1]/div[1]"));
		Thread.sleep(1000);

		// to highlight the It_s_that_simple
		JavascriptExecutor jse42 = (JavascriptExecutor) driver;
		jse42.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')", ans12);
		Thread.sleep(1000);
		jse42.executeScript("scroll(0, 700);");

		// ---------------------------------------------------------------------------------------------------------------------

		// Is_there_a_Digitali_token
		WebElement Is_there_a_Digitali_token = driver
				.findElement(By.xpath("//div[contains(text(),'Is there a Digitali token?')]"));
		Thread.sleep(1000);

		// to highlight the Is_there_a_Digitali_token
		JavascriptExecutor jse43 = (JavascriptExecutor) driver;
		jse43.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Is_there_a_Digitali_token);
		Thread.sleep(1000);

		// Is_there_a_Digitali_token is DISPLAYED or not
		boolean res22 = Is_there_a_Digitali_token.isDisplayed();

		if (res22 == true) {
			System.out.println("Is_there_a_Digitali_token is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("Is_there_a_Digitali_token is not DISPLAYED");
		}
		Is_there_a_Digitali_token.click();
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------

		// locate ans13
		WebElement ans13 = driver
				.findElement(By.xpath("//p[contains(text(),'Not at the moment. Our primary focus is on buildin')]"));
		Thread.sleep(1000);

		// to highlight the It_s_that_simple
		JavascriptExecutor jse44 = (JavascriptExecutor) driver;
		jse44.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')", ans13);
		Thread.sleep(1000);
		jse44.executeScript("scroll(0, 700);");

		// ---------------------------------------------------------------------------------------------

		// How_will_token_distribution_work_on_Digitali_in_th
		WebElement How_will_token_distribution_work_on_Digitali_in_th = driver
				.findElement(By.xpath("//div[contains(text(),'How will token distribution work on Digitali in th')]"));
		Thread.sleep(1000);

		// to highlight the How_will_token_distribution_work_on_Digitali_in_th
		JavascriptExecutor jse45 = (JavascriptExecutor) driver;
		jse45.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				How_will_token_distribution_work_on_Digitali_in_th);
		Thread.sleep(1000);

		// How_will_token_distribution_work_on_Digitali_in_th is DISPLAYED or not
		boolean res23 = How_will_token_distribution_work_on_Digitali_in_th.isDisplayed();

		if (res23 == true) {
			System.out.println("How_will_token_distribution_work_on_Digitali_in_th is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("How_will_token_distribution_work_on_Digitali_in_th is not DISPLAYED");
		}
		How_will_token_distribution_work_on_Digitali_in_th.click();
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------

		// locate ans14
		WebElement ans14 = driver
				.findElement(By.xpath("//p[contains(text(),'We′re exploring various options and will involve o')]"));
		Thread.sleep(1000);

		// to highlight the It_s_that_simple
		JavascriptExecutor jse46 = (JavascriptExecutor) driver;
		jse46.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')", ans14);
		Thread.sleep(1000);
		jse46.executeScript("scroll(0, 700);");

		// ---------------------------------------------------------------------------------------------

		// Can_I_promote_my_own_NFT_collection_on_Digitali
		WebElement Can_I_promote_my_own_NFT_collection_on_Digitali = driver
				.findElement(By.xpath("//div[contains(text(),'Can I promote my own NFT collection on Digitali?')]"));
		Thread.sleep(1000);

		// to highlight the Can_I_promote_my_own_NFT_collection_on_Digitali
		JavascriptExecutor jse47 = (JavascriptExecutor) driver;
		jse47.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Can_I_promote_my_own_NFT_collection_on_Digitali);
		Thread.sleep(1000);

		// Can_I_promote_my_own_NFT_collection_on_Digitali is DISPLAYED or not
		boolean res24 = Can_I_promote_my_own_NFT_collection_on_Digitali.isDisplayed();

		if (res24 == true) {
			System.out.println("Can_I_promote_my_own_NFT_collection_on_Digitali is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("Can_I_promote_my_own_NFT_collection_on_Digitali is not DISPLAYED");
		}
		Can_I_promote_my_own_NFT_collection_on_Digitali.click();
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------

		// locate ans15
		WebElement ans15 = driver.findElement(
				By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[1]/div[2]/div[2]/div[19]/div[2]/div[1]/div[1]"));
		Thread.sleep(1000);

		// to highlight the It_s_that_simple
		JavascriptExecutor jse48 = (JavascriptExecutor) driver;
		jse48.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')", ans15);
		Thread.sleep(1000);
		jse48.executeScript("scroll(0, 700);");

		// ---------------------------------------------------------------------------------------------

		// How_can_I_provide_feedback_or_suggest_improvements
		WebElement How_can_I_provide_feedback_or_suggest_improvements = driver
				.findElement(By.xpath("//div[contains(text(),'How can I provide feedback or suggest improvements')]"));
		Thread.sleep(1000);

		// to highlight the How_can_I_provide_feedback_or_suggest_improvements
		JavascriptExecutor jse49 = (JavascriptExecutor) driver;
		jse49.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				How_can_I_provide_feedback_or_suggest_improvements);
		Thread.sleep(1000);

		// How_can_I_provide_feedback_or_suggest_improvements is DISPLAYED or not
		boolean res25 = How_can_I_provide_feedback_or_suggest_improvements.isDisplayed();

		if (res25 == true) {
			System.out.println("How_can_I_provide_feedback_or_suggest_improvements is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("How_can_I_provide_feedback_or_suggest_improvements is not DISPLAYED");
		}
		How_can_I_provide_feedback_or_suggest_improvements.click();
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------

		// locate ans16
		WebElement ans16 = driver.findElement(By.xpath("//p[contains(text(),'Feel free to join our')]"));
		Thread.sleep(1000);

		// to highlight the It_s_that_simple
		JavascriptExecutor jse50 = (JavascriptExecutor) driver;
		jse50.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')", ans16);
		Thread.sleep(1000);
		jse50.executeScript("scroll(0, 700);");

		// ---------------------------------------------------------------------------------------------

		// Is_Digitali_open_to_collaborations_or_partnerships
		WebElement Is_Digitali_open_to_collaborations_or_partnerships = driver
				.findElement(By.xpath("//div[contains(text(),'Is Digitali open to collaborations or partnerships')]"));
		Thread.sleep(1000);

		// to highlight the Is_Digitali_open_to_collaborations_or_partnerships
		JavascriptExecutor jse51 = (JavascriptExecutor) driver;
		jse51.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Is_Digitali_open_to_collaborations_or_partnerships);
		Thread.sleep(1000);

		// Is_Digitali_open_to_collaborations_or_partnerships is DISPLAYED or not
		boolean res26 = Is_Digitali_open_to_collaborations_or_partnerships.isDisplayed();

		if (res26 == true) {
			System.out.println("Is_Digitali_open_to_collaborations_or_partnerships is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("Is_Digitali_open_to_collaborations_or_partnerships is not DISPLAYED");
		}
		Is_Digitali_open_to_collaborations_or_partnerships.click();
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------

		// locate ans17
		WebElement ans17 = driver.findElement(
				By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[21]/div[2]/div[1]/div[1]"));
		Thread.sleep(1000);

		// to highlight the It_s_that_simple
		JavascriptExecutor jse52 = (JavascriptExecutor) driver;
		jse52.executeScript("arguments[0].setAttribute('style','background: blue; border: 4px solid red;')", ans17);
		Thread.sleep(1000);
		jse52.executeScript("scroll(0, 5000);");

		// -------------------------------------------------------------------------------------------------------

		// locate Wen_Token
		WebElement Wen_Token = driver.findElement(By.xpath("//div[contains(text(),'Wen Token?')]"));
		Thread.sleep(1000);

		// to highlight the Wen_Token
		JavascriptExecutor jse447 = (JavascriptExecutor) driver;
		jse447.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Wen_Token);

		// Wen_Token is DISPLAYED or not
		boolean res27 = Wen_Token.isDisplayed();

		if (res27 == true) {
			System.out.println("Wen_Token is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("Wen_Token is not DISPLAYED");
		}

		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------

		// locate Email_Field
		WebElement Email_Field = driver.findElement(By.xpath("//input[@placeholder='Enter your email']"));
		Thread.sleep(1000);

		// to highlight the Email_Field
		JavascriptExecutor jse448 = (JavascriptExecutor) driver;
		jse448.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Email_Field);

		// Email_Field is DISPLAYED or not
		boolean res28 = Email_Field.isDisplayed();

		if (res28 == true) {
			System.out.println("Email_Field is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("Email_Field is not DISPLAYED");
		}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------

		// locate See_our_privacy_policy
		WebElement See_our_privacy_policy = driver.findElement(By.xpath("//a[contains(text(),'privacy policy')]"));
		Thread.sleep(1000);

		// to highlight the See_our_privacy_policy
		JavascriptExecutor jse449 = (JavascriptExecutor) driver;
		jse449.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				See_our_privacy_policy);
		Thread.sleep(1000);

		// See_our_privacy_policy is DISPLAYED or not
		boolean res29 = See_our_privacy_policy.isDisplayed();

		if (res29 == true) {
			System.out.println("See_our_privacy_policy is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("See_our_privacy_policy is not DISPLAYED");
		}

		See_our_privacy_policy.click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		jse449.executeScript("scroll(0, 10000);");

		// --------------------------------------------------------------------------------------------
		// locate digitali_footer
		WebElement digitali_footer = driver
				.findElement(By.xpath("//body/div[@id='__next']/div/div/div/div//*[name()='svg']"));
		Thread.sleep(1000);

		// to highlight the digitali_footer
		JavascriptExecutor jse550 = (JavascriptExecutor) driver;
		jse550.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				digitali_footer);

		// digitali_footer is DISPLAYED or not
		boolean res30 = digitali_footer.isDisplayed();

		if (res30 == true) {
			System.out.println("digitali_footer is DISPLAYED ");
		} else {
			System.out.println("digitali_footer is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------

		// locate digitali_footer_text
		WebElement digitali_footer_text = driver
				.findElement(By.xpath("//div[contains(text(),'The most trusted NFT encyclopedia')]"));
		Thread.sleep(1000);

		// to highlight the digitali_footer_text
		JavascriptExecutor jse551 = (JavascriptExecutor) driver;
		jse551.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				digitali_footer_text);

		// digitali_footer_text is DISPLAYED or not
		boolean res31 = digitali_footer_text.isDisplayed();

		if (res31 == true) {
			System.out.println("digitali_footer_text is DISPLAYED  ");
		} else {
			System.out.println("digitali_footer_text is not DISPLAYED");
		}
		Thread.sleep(1000);

		// ----------------------------------------------------------------------------------------------------------------

		// locate Explore
		WebElement Explore = driver.findElement(By.xpath("//div[normalize-space()='Explore']"));
		Thread.sleep(1000);

		// to highlight the Explore
		JavascriptExecutor jse552 = (JavascriptExecutor) driver;
		jse552.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Explore);

		// Explore is DISPLAYED or not
		boolean res32 = Explore.isDisplayed();

		if (res32 == true) {
			System.out.println("Explore is DISPLAYED ");
		} else {
			System.out.println("Explore is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Collection
		WebElement Collections = driver.findElement(By.xpath(
				"//div[@id='__next']//div//div//div//div//div//div//div//div//a[normalize-space()='Collections']"));
		Thread.sleep(1000);

		// to highlight the Collections
		JavascriptExecutor jse53 = (JavascriptExecutor) driver;
		jse53.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Collections);

		// Collections is DISPLAYED or not
		boolean res33 = Collections.isDisplayed();

		if (res33 == true) {
			System.out.println("Collections is DISPLAYED  ");
		} else {
			System.out.println("Collections is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Leaderboard4
		WebElement Leaderboard4 = driver.findElement(By.xpath(
				"//div[@id='__next']//div//div//div//div//div//div//div//div//a[normalize-space()='Leaderboard']"));
		Thread.sleep(1000);

		// to highlight the Leaderboard4
		JavascriptExecutor jse54 = (JavascriptExecutor) driver;
		jse54.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Leaderboard4);

		// Leaderboard4 is DISPLAYED or not
		boolean res34 = Leaderboard4.isDisplayed();

		if (res34 == true) {
			System.out.println("Leaderboard4 is DISPLAYED  ");
		} else {
			System.out.println("Leaderboard4 is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Reward_Points1
		WebElement Reward_Points1 = driver.findElement(By.xpath("//a[normalize-space()='Reward Points']"));
		Thread.sleep(1000);

		// to highlight the Reward_Points1
		JavascriptExecutor jse55 = (JavascriptExecutor) driver;
		jse55.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Reward_Points1);

		// Reward_Points1 is DISPLAYED or not
		boolean res35 = Reward_Points1.isDisplayed();

		if (res35 == true) {
			System.out.println("Reward_Points1 is DISPLAYED  ");
		} else {
			System.out.println("Reward_Points1 is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate About_Us1
		WebElement About_Us1 = driver.findElement(By.xpath("//div[normalize-space()='About Us']"));
		Thread.sleep(1000);

		// to highlight the About_Us1
		JavascriptExecutor jse56 = (JavascriptExecutor) driver;
		jse56.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", About_Us1);

		// About_Us1 is DISPLAYED or not
		boolean res36 = About_Us1.isDisplayed();

		if (res36 == true) {
			System.out.println("About_Us1 is DISPLAYED  ");
		} else {
			System.out.println("About_Us1 is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Digitali
		WebElement Digitali = driver.findElement(By.xpath("//a[normalize-space()='Digitali']"));
		Thread.sleep(1000);

		// to highlight the Digitali
		JavascriptExecutor jse57 = (JavascriptExecutor) driver;
		jse57.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Digitali);

		// Digitali is DISPLAYED or not
		boolean res37 = Digitali.isDisplayed();

		if (res37 == true) {
			System.out.println("Digitali is DISPLAYED  ");
		} else {
			System.out.println("Digitali is not DISPLAYED");
		}
		Thread.sleep(000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Blogs_footer
		WebElement Blogs_footer = driver.findElement(By.xpath("//a[normalize-space()='Blogs']"));
		Thread.sleep(1000);

		// to highlight the Blogs_footer
		JavascriptExecutor jse58 = (JavascriptExecutor) driver;
		jse58.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Blogs_footer);

		// Blogs_footer is DISPLAYED or not
		boolean res38 = Blogs_footer.isDisplayed();

		if (res38 == true) {
			System.out.println("Blogs_footer is DISPLAYED  ");
		} else {
			System.out.println("Blogs_footer is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate FAQ1
		WebElement FAQ1 = driver.findElement(By.xpath("//a[normalize-space()='FAQ']"));
		Thread.sleep(1000);

		// to highlight the FAQ1
		JavascriptExecutor jse59 = (JavascriptExecutor) driver;
		jse59.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", FAQ1);

		// FAQ1 is DISPLAYED or not
		boolean res39 = FAQ1.isDisplayed();

		if (res39 == true) {
			System.out.println("FAQ1 is DISPLAYED  ");
		} else {
			System.out.println("FAQ1 is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Legal
		WebElement Legal = driver.findElement(By.xpath("//div[normalize-space()='Legal']"));
		Thread.sleep(1000);

		// to highlight the Legal
		JavascriptExecutor jse60 = (JavascriptExecutor) driver;
		jse60.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Legal);

		// Legal is DISPLAYED or not
		boolean res40 = Legal.isDisplayed();

		if (res40 == true) {
			System.out.println("Legal is DISPLAYED  ");
		} else {
			System.out.println("Legal is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Terms
		WebElement Terms = driver.findElement(By.xpath("//a[normalize-space()='Terms']"));
		Thread.sleep(1000);

		// to highlight the Terms
		JavascriptExecutor jse61 = (JavascriptExecutor) driver;
		jse61.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Terms);

		// Terms is DISPLAYED or not
		boolean res41 = Terms.isDisplayed();

		if (res41 == true) {
			System.out.println("Terms is DISPLAYED  ");
		} else {
			System.out.println("Terms is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Privacy
		WebElement Privacy = driver.findElement(By.xpath("//a[normalize-space()='Privacy']"));
		Thread.sleep(1000);

		// to highlight the Privacy
		JavascriptExecutor jse62 = (JavascriptExecutor) driver;
		jse62.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Privacy);

		// Privacy is DISPLAYED or not
		boolean res42 = Privacy.isDisplayed();

		if (res42 == true) {
			System.out.println("Privacy is DISPLAYED  ");
		} else {
			System.out.println("Privacy is not DISPLAYED");
		}
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------------

		// locate All_Rights_Reserved
		WebElement All_Rights_Reserved = driver
				.findElement(By.xpath("//div[contains(text(),'© 2023 Digitali Technology Solutions Ltd. All righ')]"));
		Thread.sleep(1000);

		// to highlight the All_Rights_Reserved
		JavascriptExecutor jse63 = (JavascriptExecutor) driver;
		jse63.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				All_Rights_Reserved);

		// All_Rights_Reserved is DISPLAYED or not
		boolean res43 = All_Rights_Reserved.isDisplayed();

		if (res43 == true) {
			System.out.println("All_Rights_Reserved is DISPLAYED  ");
		} else {
			System.out.println("All_Rights_Reserved is not DISPLAYED");
		}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------------

//			// locate Twitter_Icon
//			WebElement Twitter_Icon = driver.findElement(
//					By.xpath("//body/div[@id='__next']/footer[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/a[1]/*[1]"));
//			Thread.sleep(1000);
		//
//			// to highlight the Twitter_Icon
//			JavascriptExecutor jse64 = (JavascriptExecutor) driver;
//			jse64.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
//					Twitter_Icon);
//			Thread.sleep(1000);
		//
//			// -----------------------------------------------------------------------------------------------------------------
		//
//			// locate Discord_Icon
//			WebElement Discord_Icon = driver.findElement(By.xpath("//a[@href='https://discord.com/invite/dCYTykjgxW']//*[name()='svg']"));
//			Thread.sleep(1000);
		//
//			// to highlight the Discord_Icon
//			JavascriptExecutor jse65 = (JavascriptExecutor) driver;
//			jse65.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
//					Discord_Icon);
//			Thread.sleep(1000);
		driver.close();
		driver.quit();

	}

	@Test
	public void Leaderboard() throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\praka\\Downloads\\edgedriver_win64 (2)\\msedgedriver.exe");
		// System.setProperty("webdriver.edge.driver",
		// "C:\\Users\\praka\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");

		// up casting
		WebDriver driver = new EdgeDriver();

		// get URL
		driver.get("https://digitali.xyz/");
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// maximize
		driver.manage().window().maximize();
		Thread.sleep(1000);

		// locate Leaderboard
		WebElement Leaderboard = driver
				.findElement(By.xpath("//div[@id='navbar-search']//a[normalize-space()='Leaderboard']"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Leaderboard
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Leaderboard);

		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// Leaderboard is DISPLAYED or not
		boolean res = Leaderboard.isDisplayed();

		if (res == true) {
			System.out.println("Leaderboard is DISPLAYED AND CLICKABLE ");
		} else {
			System.out.println("Leaderboard is not DISPLAYED");
		}
		Leaderboard.click();
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);

		// ----------------------------------------------------------------------------------------------------------------------------

		// locate Leaderboard_Heading
		WebElement Leaderboard_Heading = driver
				.findElement(By.xpath("//div[contains(text(),'Earn Rewards Points by contributing NFT Collection')]"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Leaderboard_Heading
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Leaderboard_Heading);

		// Leaderboard_Heading is DISPLAYED or not
		boolean res1 = Leaderboard_Heading.isDisplayed();

		if (res1 == true) {
			System.out.println("Leaderboard_Heading is DISPLAYED  ");
		} else {
			System.out.println("Leaderboard_Heading is not DISPLAYED");
		}

		Thread.sleep(1000);

//----------------------------------------------------------------------------------------------------------------------------

		// locate Reward_Points_unlock_any_future_Digitali_token_dis
		WebElement Reward_Points_unlock_any_future_Digitali_token_dis = driver
				.findElement(By.xpath("//div[contains(text(),'Reward Points unlock any future Digitali token dis')]"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Reward_Points_unlock_any_future_Digitali_token_dis
		JavascriptExecutor jse3 = (JavascriptExecutor) driver;
		jse3.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Reward_Points_unlock_any_future_Digitali_token_dis);

		// Reward_Points_unlock_any_future_Digitali_token_dis is DISPLAYED or not
		boolean res2 = Reward_Points_unlock_any_future_Digitali_token_dis.isDisplayed();

		if (res2 == true) {
			System.out.println("Reward_Points_unlock_any_future_Digitali_token_dis is DISPLAYED  ");
		} else {
			System.out.println("Reward_Points_unlock_any_future_Digitali_token_dis is not DISPLAYED");
		}

		Thread.sleep(1000);

//----------------------------------------------------------------------------------------------------------------------------

		// locate Earn_Reward_Points
		WebElement Earn_Reward_Points = driver.findElement(By.xpath(
				"//div[@id='__next']//main//div//div//div//div//div//a[normalize-space()='Earn Reward Points']"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Earn_Reward_Points
		JavascriptExecutor jse4 = (JavascriptExecutor) driver;
		jse4.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Earn_Reward_Points);

		// Earn_Reward_Points is DISPLAYED or not
		boolean res3 = Earn_Reward_Points.isDisplayed();

		if (res3 == true) {
			System.out.println("Earn_Reward_Points is DISPLAYED  ");
		} else {
			System.out.println("Earn_Reward_Points is not DISPLAYED");
		}

		Thread.sleep(1000);

//----------------------------------------------------------------------------------------------------------------------------

		// locate win_prize
		WebElement win_prize = driver.findElement(By.xpath("//img[@alt='win prize']"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the win_prize
		JavascriptExecutor jse5 = (JavascriptExecutor) driver;
		jse5.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", win_prize);

		// win_prize is DISPLAYED or not
		boolean res4 = win_prize.isDisplayed();

		if (res4 == true) {
			System.out.println("win_prize is DISPLAYED  ");
		} else {
			System.out.println("win_prize is not DISPLAYED");
		}

		Thread.sleep(1000);

//----------------------------------------------------------------------------------------------------------------------------

		// locate Leaderboard11
		WebElement Leaderboard11 = driver.findElement(By.xpath("//div[contains(text(),'Leaderboard')]"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Leaderboard11
		JavascriptExecutor jse6 = (JavascriptExecutor) driver;
		jse6.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Leaderboard11);

		Thread.sleep(1000);
		jse6.executeScript("scroll(0, 500);");

//----------------------------------------------------------------------------------------------------------------------------

		// locate Total_Contributors
		WebElement Total_Contributors = driver
				.findElement(By.xpath("//body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Total_Contributors
		JavascriptExecutor jse7 = (JavascriptExecutor) driver;
		jse7.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Total_Contributors);

		Thread.sleep(1000);

//----------------------------------------------------------------------------------------------------------------------------

		// locate Total_Contributions
		WebElement Total_Contributions = driver
				.findElement(By.xpath("//body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Total_Contributions
		JavascriptExecutor jse8 = (JavascriptExecutor) driver;
		jse8.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Total_Contributions);

		Thread.sleep(1000);

//----------------------------------------------------------------------------------------------------------------------------

		// locate Earn_Reward_Points1
		WebElement Earn_Reward_Points1 = driver
				.findElement(By.xpath("//body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Earn_Reward_Points1
		JavascriptExecutor jse9 = (JavascriptExecutor) driver;
		jse9.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Earn_Reward_Points1);

		// Earn_Reward_Points1 is DISPLAYED or not
		boolean res5 = Earn_Reward_Points1.isDisplayed();

		if (res5 == true) {
			System.out.println("Earn_Reward_Points1 is DISPLAYED  ");
		} else {
			System.out.println("Earn_Reward_Points1 is not DISPLAYED");
		}

		Thread.sleep(1000);
		jse9.executeScript("scroll(0, 500);");
		Thread.sleep(1000);

//----------------------------------------------------------------------------------------------------------------------------

		// locate Leaderboard_box
		WebElement Leaderboard_box = driver
				.findElement(By.xpath("//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[3]"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Leaderboard_box
		JavascriptExecutor jse10 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Leaderboard_box);

		// Leaderboard_box is DISPLAYED or not
		boolean res6 = Leaderboard_box.isDisplayed();

		if (res6 == true) {
			System.out.println("Leaderboard_box is DISPLAYED  ");
		} else {
			System.out.println("Leaderboard_box is not DISPLAYED");
		}

		Thread.sleep(1000);
		jse10.executeScript("scroll(0, 800);");
		Thread.sleep(1000);

//----------------------------------------------------------------------------------------------------------------------------

		// locate Leaderboard_box1
		WebElement Leaderboard_box1 = driver
				.findElement(By.xpath("//body/div[@id='__next']/main[1]/div[1]/div[1]/div[1]/div[4]/div[1]"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Leaderboard_box1
		JavascriptExecutor jse11 = (JavascriptExecutor) driver;
		jse11.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Leaderboard_box1);

		Thread.sleep(1000);
		jse11.executeScript("scroll(0, 1400);");
		Thread.sleep(1000);

//----------------------------------------------------------------------------------------------------------------------------

		// locate Wen_Token
		WebElement Wen_Token = driver.findElement(By.xpath("//body/div[@id='__next']/footer/div/div/div/div[1]"));
		Thread.sleep(1000);

		// to highlight the Wen_Token
		JavascriptExecutor jse47 = (JavascriptExecutor) driver;
		jse47.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Wen_Token);

		// Wen_Token is DISPLAYED or not
		boolean res27 = Wen_Token.isDisplayed();

		if (res27 == true) {
			System.out.println("Wen_Token is DISPLAYED");
		} else {
			System.out.println("Wen_Token is not DISPLAYED");
		}

		Thread.sleep(1000);

//		// ---------------------------------------------------------------------------------------------
		// locate Email_Field
		WebElement Email_Field = driver.findElement(By.xpath("//input[@placeholder='Enter your email']"));
		Thread.sleep(1000);

		// to highlight the Wen_Token
		JavascriptExecutor jse48 = (JavascriptExecutor) driver;
		jse48.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Email_Field);

		// Email_Field is DISPLAYED or not
		boolean res28 = Email_Field.isDisplayed();

		if (res28 == true) {
			System.out.println("Email_Field is DISPLAYED");
		} else {
			System.out.println("Email_Field is not DISPLAYED");
		}

		Thread.sleep(1000);

		// -----------------------------------------------------------------------

		// locate See_our_privacy_policy
		WebElement See_our_privacy_policy = driver.findElement(By.xpath("//a[contains(text(),'privacy policy')]"));
		Thread.sleep(1000);

		// to highlight the Wen_Token
		JavascriptExecutor jse49 = (JavascriptExecutor) driver;
		jse49.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				See_our_privacy_policy);
		Thread.sleep(1000);

		// See_our_privacy_policy is DISPLAYED or not
		boolean res29 = See_our_privacy_policy.isDisplayed();

		if (res29 == true) {
			System.out.println("See_our_privacy_policy is DISPLAYED");
		} else {
			System.out.println("See_our_privacy_policy is not DISPLAYED");
		}

		See_our_privacy_policy.click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);

		jse49.executeScript("scroll(0, 5000);");

		// --------------------------------------------------------------------------------------------
		// locate digitali_footer
		WebElement digitali_footer = driver
				.findElement(By.xpath("//body/div[@id='__next']/footer/div/div/div/div//*[name()='svg']"));
		Thread.sleep(1000);

		// to highlight the digitali_footer
		JavascriptExecutor jse50 = (JavascriptExecutor) driver;
		jse50.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				digitali_footer);

		// digitali_footer is DISPLAYED or not
		boolean res30 = digitali_footer.isDisplayed();

		if (res30 == true) {
			System.out.println("digitali_footer is DISPLAYED");
		} else {
			System.out.println("digitali_footer is not DISPLAYED");
		}

		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------

		// locate digitali_footer_text
		WebElement digitali_footer_text = driver
				.findElement(By.xpath("//div[contains(text(),'The most trusted NFT encyclopedia')]"));
		Thread.sleep(1000);

		// to highlight the digitali_footer_text
		JavascriptExecutor jse51 = (JavascriptExecutor) driver;
		jse51.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				digitali_footer_text);

		// digitali_footer_text is DISPLAYED or not
		boolean res31 = digitali_footer_text.isDisplayed();

		if (res31 == true) {
			System.out.println("digitali_footer_text is DISPLAYED");
		} else {
			System.out.println("digitali_footer_text is not DISPLAYED");
		}
		Thread.sleep(1000);

		// ----------------------------------------------------------------------------------------------------------------

		// locate Explore
		WebElement Explore = driver.findElement(By.xpath("//div[normalize-space()='Explore']"));
		Thread.sleep(1000);

		// to highlight the Explore
		JavascriptExecutor jse52 = (JavascriptExecutor) driver;
		jse52.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Explore);

		// Explore is DISPLAYED or not
		boolean res32 = Explore.isDisplayed();

		if (res32 == true) {
			System.out.println("Explore is DISPLAYED");
		} else {
			System.out.println("Explore is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Collection
		WebElement Collections = driver.findElement(
				By.xpath("//body/div[@id='__next']/footer[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/a[1]"));
		Thread.sleep(1000);

		// to highlight the Collections
		JavascriptExecutor jse53 = (JavascriptExecutor) driver;
		jse53.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Collections);

		// Collections is DISPLAYED or not
		boolean res33 = Collections.isDisplayed();

		if (res33 == true) {
			System.out.println("Collections is DISPLAYED");
		} else {
			System.out.println("Collections is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Leaderboard4
		WebElement Leaderboard4 = driver.findElement(By.xpath(
				"//div[@id='__next']//footer//div//div//div//div//div//div//div//a[normalize-space()='Leaderboard']"));
		Thread.sleep(1000);

		// to highlight the Leaderboard4
		JavascriptExecutor jse54 = (JavascriptExecutor) driver;
		jse54.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Leaderboard4);

		// Leaderboard4 is DISPLAYED or not
		boolean res34 = Leaderboard4.isDisplayed();

		if (res34 == true) {
			System.out.println("Leaderboard4 is DISPLAYED");
		} else {
			System.out.println("Leaderboard4 is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Reward_Points1
		WebElement Reward_Points1 = driver.findElement(By.xpath(
				"//div[@id='__next']//footer//div//div//div//div//div//div//div//a[normalize-space()='Reward Points']"));
		Thread.sleep(1000);

		// to highlight the Reward_Points1
		JavascriptExecutor jse55 = (JavascriptExecutor) driver;
		jse55.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Reward_Points1);

		// Reward_Points1 is DISPLAYED or not
		boolean res35 = Reward_Points1.isDisplayed();

		if (res35 == true) {
			System.out.println("Reward_Points1 is DISPLAYED");
		} else {
			System.out.println("Reward_Points1 is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate About_Us1
		WebElement About_Us1 = driver.findElement(By.xpath("//div[normalize-space()='About Us']"));
		Thread.sleep(1000);

		// to highlight the About_Us1
		JavascriptExecutor jse56 = (JavascriptExecutor) driver;
		jse56.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", About_Us1);

		// About_Us1 is DISPLAYED or not
		boolean res36 = Reward_Points1.isDisplayed();

		if (res36 == true) {
			System.out.println("About_Us1 is DISPLAYED");
		} else {
			System.out.println("About_Us1 is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Digitali
		WebElement Digitali = driver.findElement(By.xpath("//a[normalize-space()='Digitali']"));
		Thread.sleep(1000);

		// to highlight the Digitali
		JavascriptExecutor jse57 = (JavascriptExecutor) driver;
		jse57.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Digitali);

		// Digitali is DISPLAYED or not
		boolean res37 = Digitali.isDisplayed();

		if (res37 == true) {
			System.out.println("Digitali is DISPLAYED");
		} else {
			System.out.println("Digitali is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Blogs_footer
		WebElement Blogs_footer = driver.findElement(By.xpath("//a[normalize-space()='Blogs']"));
		Thread.sleep(1000);

		// to highlight the Blogs_footer
		JavascriptExecutor jse58 = (JavascriptExecutor) driver;
		jse58.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Blogs_footer);

		// Blogs_footer is DISPLAYED or not
		boolean res38 = Blogs_footer.isDisplayed();

		if (res38 == true) {
			System.out.println("Blogs_footer is DISPLAYED");
		} else {
			System.out.println("Blogs_footer is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate FAQ1
		WebElement FAQ1 = driver.findElement(
				By.xpath("//div[@id='__next']//footer//div//div//div//div//div//div//div//a[normalize-space()='FAQ']"));
		Thread.sleep(1000);

		// to highlight the FAQ1
		JavascriptExecutor jse59 = (JavascriptExecutor) driver;
		jse59.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", FAQ1);

		// FAQ1 is DISPLAYED or not
		boolean res39 = FAQ1.isDisplayed();

		if (res39 == true) {
			System.out.println("FAQ1 is DISPLAYED");
		} else {
			System.out.println("FAQ1 is not DISPLAYED");
		}
		Thread.sleep(1000);
		Thread.sleep(2000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Legal
		WebElement Legal = driver.findElement(By.xpath("//div[normalize-space()='Legal']"));
		Thread.sleep(1000);

		// to highlight the Legal
		JavascriptExecutor jse60 = (JavascriptExecutor) driver;
		jse60.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Legal);

		// Legal is DISPLAYED or not
		boolean res40 = Legal.isDisplayed();

		if (res40 == true) {
			System.out.println("Legal is DISPLAYED");
		} else {
			System.out.println("Legal is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Terms
		WebElement Terms = driver.findElement(By.xpath("//a[normalize-space()='Terms']"));
		Thread.sleep(1000);

		// to highlight the Terms
		JavascriptExecutor jse61 = (JavascriptExecutor) driver;
		jse61.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Terms);

		// Terms is DISPLAYED or not
		boolean res41 = Terms.isDisplayed();

		if (res41 == true) {
			System.out.println("Terms is DISPLAYED");
		} else {
			System.out.println("Terms is not DISPLAYED");
		}

		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Privacy
		WebElement Privacy = driver.findElement(By.xpath("//a[normalize-space()='Privacy']"));
		Thread.sleep(1000);

		// to highlight the Privacy
		JavascriptExecutor jse62 = (JavascriptExecutor) driver;
		jse62.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Privacy);

		// Privacy is DISPLAYED or not
		boolean res42 = Privacy.isDisplayed();

		if (res42 == true) {
			System.out.println("Privacy is DISPLAYED");
		} else {
			System.out.println("Privacy is not DISPLAYED");
		}
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------------

		// locate All_Rights_Reserved
		WebElement All_Rights_Reserved = driver
				.findElement(By.xpath("//div[contains(text(),'© 2023 Digitali Technology Solutions Ltd. All righ')]"));
		Thread.sleep(1000);

		// to highlight the All_Rights_Reserved
		JavascriptExecutor jse63 = (JavascriptExecutor) driver;
		jse63.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				All_Rights_Reserved);

		// All_Rights_Reserved is DISPLAYED or not
		boolean res43 = All_Rights_Reserved.isDisplayed();

		if (res43 == true) {
			System.out.println("All_Rights_Reserved is DISPLAYED");
		} else {
			System.out.println("All_Rights_Reserved is not DISPLAYED");
		}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------------

		// locate Twitter_Icon
		WebElement Twitter_Icon = driver.findElement(
				By.xpath("//body/div[@id='__next']/footer[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/a[1]/*[1]"));
		Thread.sleep(1000);

		// to highlight the Twitter_Icon
		JavascriptExecutor jse64 = (JavascriptExecutor) driver;
		jse64.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Twitter_Icon);

		// Twitter_Icon is DISPLAYED or not
		boolean res44 = All_Rights_Reserved.isDisplayed();

		if (res44 == true) {
			System.out.println("Twitter_Icon is DISPLAYED");
		} else {
			System.out.println("Twitter_Icon is not DISPLAYED");
		}

		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------------

		// locate Discord_Icon
		WebElement Discord_Icon = driver.findElement(
				By.xpath("//body/div[@id='__next']/footer[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/a[1]/*[1]"));
		Thread.sleep(1000);

		// to highlight the Discord_Icon
		JavascriptExecutor jse65 = (JavascriptExecutor) driver;
		jse65.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Discord_Icon);

		// Discord_Icon is DISPLAYED or not
		boolean res45 = Discord_Icon.isDisplayed();

		if (res45 == true) {
			System.out.println("Discord_Icon is DISPLAYED");
		} else {
			System.out.println("Discord_Icon is not DISPLAYED");
		}
		Thread.sleep(1000);
		driver.close();
		driver.quit();

	}

	@Test
	public void Privacy() throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\praka\\Downloads\\edgedriver_win64 (2)\\msedgedriver.exe");
		// System.setProperty("webdriver.edge.driver",
		// "C:\\Users\\praka\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");

		// up casting
		WebDriver driver = new EdgeDriver();

		// get URL
		driver.get("https://digitali.xyz/");
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// maximize
		driver.manage().window().maximize();
		Thread.sleep(1000);

		// locate Privacy
		WebElement Privacy = driver.findElement(By.xpath("//a[contains(text(),'Privacy')]"));
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();

		// to highlight the Privacy
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Privacy);

		Thread.sleep(1000);

		// Privacy is DISPLAYED or not
		boolean res1 = Privacy.isDisplayed();

		if (res1 == true) {
			System.out.println("Privacy is DISPLAYED");
		} else {
			System.out.println("Privacy is not DISPLAYED");
		}

		driver.manage().deleteAllCookies();
		Privacy.click();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);

		// -------------------------------------------------------------------------------------

		// locate Privacy_Heading
		WebElement Privacy_Heading = driver
				.findElement(By.xpath("//div[contains(text(),'We Care About Your Privacy')]"));
		Thread.sleep(1000);

		// to highlight the Privacy_Heading
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Privacy_Heading);

		// Privacy_Heading is DISPLAYED or not
		boolean res2 = Privacy_Heading.isDisplayed();

		if (res2 == true) {
			System.out.println("Privacy_Heading is DISPLAYED");
		} else {
			System.out.println("Privacy_Heading is not DISPLAYED");
		}

		// Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------

		// locate Text1
		WebElement Text1 = driver
				.findElement(By.xpath("//div[contains(text(),'Your privacy is important to us at Digitali. We re')]"));
		Thread.sleep(1000);

		// to highlight the Text1
		JavascriptExecutor jse3 = (JavascriptExecutor) driver;
		jse3.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text1);

		// Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------

		// locate Text2
		WebElement Text2 = driver.findElement(By.xpath("//div[contains(text(),'Privacy Policy')]"));
		Thread.sleep(1000);

		// to highlight the Text2
		JavascriptExecutor jse4 = (JavascriptExecutor) driver;
		jse4.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text2);

		// Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------

		// locate Text3
		WebElement Text3 = driver.findElement(By.xpath("//p[contains(text(),'Effective: 1 June 2023')]"));
		Thread.sleep(1000);

		// to highlight the Text3
		JavascriptExecutor jse5 = (JavascriptExecutor) driver;
		jse5.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text3);

		// Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------

		// locate Text4
		WebElement Text4 = driver
				.findElement(By.xpath("//p[contains(text(),'We take the protection of your privacy and your pe')]"));
		Thread.sleep(1000);

		// to highlight the Text4
		JavascriptExecutor jse6 = (JavascriptExecutor) driver;
		jse6.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text4);

		// Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------

		// locate Text5
		WebElement Text5 = driver
				.findElement(By.xpath("//p[contains(text(),'We at Digitali Ltd. operate an online service that')]"));
		Thread.sleep(1000);

		// to highlight the Text5
		JavascriptExecutor jse7 = (JavascriptExecutor) driver;
		jse7.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text5);

		// Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------

		// locate Text6
		WebElement Text6 = driver
				.findElement(By.xpath("//p[contains(text(),'Our Services are owned and operated by Digitali Lt')]"));
		Thread.sleep(1000);

		// to highlight the Text6
		JavascriptExecutor jse8 = (JavascriptExecutor) driver;
		jse8.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text6);

		// Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------

		// locate Text7
		WebElement Text7 = driver.findElement(By.xpath("//div[contains(text(),'Information Collected')]"));
		Thread.sleep(1000);

		// to highlight the Text7
		JavascriptExecutor jse9 = (JavascriptExecutor) driver;
		jse9.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text7);

		// Thread.sleep(1000);
		jse9.executeScript("scroll(0,1000);");

		// --------------------------------------------------------------------------------------------------

		// locate Text8
		WebElement Text8 = driver.findElement(By.xpath("//body/div[@id='__next']/main[1]/div[1]/div[5]"));
		Thread.sleep(1000);

		// to highlight the Text8
		JavascriptExecutor jse10 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text8);

		// Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------

		// locate Text9
		WebElement Text9 = driver.findElement(By.xpath("//div[contains(text(),'Information Uses')]"));
		Thread.sleep(1000);

		// to highlight the Text9
		JavascriptExecutor jse11 = (JavascriptExecutor) driver;
		jse11.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text9);

		// Thread.sleep(1000);
		jse11.executeScript("scroll(0,1200);");

		// --------------------------------------------------------------------------------------------------

		// locate Text10
		WebElement Text10 = driver.findElement(By.xpath("//body/div[@id='__next']/main[1]/div[1]/div[7]"));
		Thread.sleep(1000);

		// to highlight the Text10
		JavascriptExecutor jse12 = (JavascriptExecutor) driver;
		jse12.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text10);

		// Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------

		// locate Text11
		WebElement Text11 = driver.findElement(By.xpath("//div[contains(text(),'Information Sharing')]"));
		Thread.sleep(1000);

		// to highlight the Text11
		JavascriptExecutor jse13 = (JavascriptExecutor) driver;
		jse13.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text11);

		// Thread.sleep(1000);
		jse13.executeScript("scroll(0,2000);");

		// -------------------------------------------------------------------------------------

		// locate Text12
		WebElement Text12 = driver.findElement(By.xpath("//body/div[@id='__next']/main[1]/div[1]/div[9]"));
		Thread.sleep(1000);

		// to highlight the Text12
		JavascriptExecutor jse14 = (JavascriptExecutor) driver;
		jse14.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text12);

		// Thread.sleep(1000);

//-------------------------------------------------------------------------------------

		// locate Text13
		WebElement Text13 = driver.findElement(By.xpath("//div[contains(text(),'Information Choices')]"));
		Thread.sleep(1000);

		// to highlight the Text13
		JavascriptExecutor jse15 = (JavascriptExecutor) driver;
		jse15.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text13);

		// Thread.sleep(1000);

		// ------------------------------------------------------------------------------------------------------

		// locate Text14
		WebElement Text14 = driver.findElement(By.xpath("//body/div[@id='__next']/main[1]/div[1]/div[11]"));
		Thread.sleep(1000);

		// to highlight the Text14
		JavascriptExecutor jse16 = (JavascriptExecutor) driver;
		jse16.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text14);

		// Thread.sleep(1000);

		// ------------------------------------------------------------------------------------------------------

		// locate Text15
		WebElement Text15 = driver.findElement(By.xpath("//div[contains(text(),'Information Transfers')]"));
		Thread.sleep(1000);

		// to highlight the Text15
		JavascriptExecutor jse17 = (JavascriptExecutor) driver;
		jse17.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text15);

		// Thread.sleep(1000);
		jse17.executeScript("scroll(0,3000);");

		// -------------------------------------------------------------------------------------

		// locate Text16
		WebElement Text16 = driver
				.findElement(By.xpath("//p[contains(text(),'We are a global company and operate in many differ')]"));
		Thread.sleep(1000);

		// to highlight the Text16
		JavascriptExecutor jse18 = (JavascriptExecutor) driver;
		jse18.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text16);

		// Thread.sleep(1000);

//-------------------------------------------------------------------------------------

		// locate Text17
		WebElement Text17 = driver.findElement(By.xpath("//div[contains(text(),'Information Security')]"));
		Thread.sleep(1000);

		// to highlight the Text17
		JavascriptExecutor jse19 = (JavascriptExecutor) driver;
		jse19.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text17);

		// Thread.sleep(1000);

//-------------------------------------------------------------------------------------

		// locate Text18
		WebElement Text18 = driver
				.findElement(By.xpath("//p[contains(text(),'We have implemented appropriate administrative, te')]"));
		Thread.sleep(1000);

		// to highlight the Text18
		JavascriptExecutor jse20 = (JavascriptExecutor) driver;
		jse20.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text18);

		// Thread.sleep(1000);

		// ------------------------------------------------------------------------------------------

		// locate Text19
		WebElement Text19 = driver.findElement(By.xpath("//div[contains(text(),'Information Retention')]"));
		Thread.sleep(1000);

		// to highlight the Text19
		JavascriptExecutor jse21 = (JavascriptExecutor) driver;
		jse21.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text19);

		// Thread.sleep(1000);

//-------------------------------------------------------------------------------------

		// locate Text20
		WebElement Text20 = driver
				.findElement(By.xpath("//p[contains(text(),'We will retain copies of your information for as l')]"));
		Thread.sleep(1000);

		// to highlight the Text20
		JavascriptExecutor jse22 = (JavascriptExecutor) driver;
		jse22.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text20);

		// Thread.sleep(1000);

//-------------------------------------------------------------------------------------

		// locate Text21
		WebElement Text21 = driver.findElement(By.xpath("//div[contains(text(),'Cookies')]"));
		Thread.sleep(1000);

		// to highlight the Text21
		JavascriptExecutor jse23 = (JavascriptExecutor) driver;
		jse23.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text21);

		// Thread.sleep(1000);
		jse23.executeScript("scroll(0,3500);");

//-------------------------------------------------------------------------------------

		// locate Text22
		WebElement Text22 = driver
				.findElement(By.xpath("//p[contains(text(),'We want your access to our Services to be as easy,')]"));
		Thread.sleep(1000);

		// to highlight the Text22
		JavascriptExecutor jse24 = (JavascriptExecutor) driver;
		jse24.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text22);

		// Thread.sleep(1000);

//-------------------------------------------------------------------------------------

		// locate Text23
		WebElement Text23 = driver
				.findElement(By.xpath("//p[contains(text(),'Cookies are small text files that are automaticall')]"));
		Thread.sleep(1000);

		// to highlight the Text23
		JavascriptExecutor jse25 = (JavascriptExecutor) driver;
		jse25.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text23);

		// Thread.sleep(1000);
		jse25.executeScript("scroll(0,3800);");

		// ------------------------------------------------------------------------------------------------

		// locate Text24
		WebElement Text24 = driver
				.findElement(By.xpath("//div[@class='inline-block min-w-full py-2 sm:px-6 lg:px-8']"));
		Thread.sleep(1000);

		// to highlight the Text24
		JavascriptExecutor jse26 = (JavascriptExecutor) driver;
		jse26.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text24);

		// Thread.sleep(1000);
		jse26.executeScript("scroll(0,4800);");

		// ------------------------------------------------------------------------------------------------

//------------------------------------------------------------------------------------------------

		// locate Text25
		WebElement Text25 = driver.findElement(By.xpath("//i[normalize-space()='Cookie Consent Policy']"));
		Thread.sleep(1000);

		// to highlight the Text25
		JavascriptExecutor jse27 = (JavascriptExecutor) driver;
		jse27.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text25);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text26
		WebElement Text26 = driver
				.findElement(By.xpath("//p[contains(text(),'To give you control, we allow you to decide whethe')]"));
		Thread.sleep(1000);

		// to highlight the Text26
		JavascriptExecutor jse28 = (JavascriptExecutor) driver;
		jse28.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text26);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text27
		WebElement Text27 = driver
				.findElement(By.xpath("//p[contains(text(),'If you delete your cookies, your access to some fu')]"));
		Thread.sleep(1000);

		// to highlight the Text27
		JavascriptExecutor jse29 = (JavascriptExecutor) driver;
		jse29.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text27);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text28
		WebElement Text28 = driver
				.findElement(By.xpath("//p[contains(text(),'Our use of any information we collect through cook')]"));
		Thread.sleep(1000);

		// to highlight the Text28
		JavascriptExecutor jse30 = (JavascriptExecutor) driver;
		jse30.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text28);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text29
		WebElement Text29 = driver
				.findElement(By.xpath("//p[contains(text(),'If you delete your cookies, your access to some fu')]"));
		Thread.sleep(1000);

		// to highlight the Text29
		JavascriptExecutor jse31 = (JavascriptExecutor) driver;
		jse31.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text29);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text30
		WebElement Text30 = driver
				.findElement(By.xpath("//div[contains(text(),'Statement Changes and Notification')]"));
		Thread.sleep(1000);

		// to highlight the Text30
		JavascriptExecutor jse32 = (JavascriptExecutor) driver;
		jse32.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text30);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text31
		WebElement Text31 = driver
				.findElement(By.xpath("//p[contains(text(),'We may update this Statement in the future. If we ')]"));
		Thread.sleep(1000);

		// to highlight the Text31
		JavascriptExecutor jse33 = (JavascriptExecutor) driver;
		jse33.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text31);

		// Thread.sleep(1000);
		jse33.executeScript("scroll(0,5300);");

//----------------------------------------------------------------------------------------------

		// locate Text32
		WebElement Text32 = driver.findElement(By.xpath("//div[contains(text(),'Contact')]"));
		Thread.sleep(1000);

		// to highlight the Text32
		JavascriptExecutor jse34 = (JavascriptExecutor) driver;
		jse34.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text32);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text33
		WebElement Text33 = driver
				.findElement(By.xpath("//p[contains(text(),'If you have a data privacy request, such as a requ')]"));
		Thread.sleep(1000);

		// to highlight the Text33
		JavascriptExecutor jse35 = (JavascriptExecutor) driver;
		jse35.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text33);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text34
		WebElement Text34 = driver.findElement(By.xpath("//div[contains(text(),'Europe')]"));
		Thread.sleep(1000);

		// to highlight the Text34
		JavascriptExecutor jse36 = (JavascriptExecutor) driver;
		jse36.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text34);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text35
		WebElement Text35 = driver
				.findElement(By.xpath("//p[contains(text(),'General Data Protection Regulation Privacy Stateme')]"));
		Thread.sleep(1000);

		// to highlight the Text35
		JavascriptExecutor jse37 = (JavascriptExecutor) driver;
		jse37.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text35);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text36
		WebElement Text36 = driver
				.findElement(By.xpath("//p[contains(text(),'This GDPR Statement applies to persons in the Euro')]"));
		Thread.sleep(1000);

		// to highlight the Text36
		JavascriptExecutor jse38 = (JavascriptExecutor) driver;
		jse38.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text36);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text37
		WebElement Text37 = driver.findElement(By.xpath("//p[contains(text(),'Controller of Personal Information')]"));
		Thread.sleep(1000);

		// to highlight the Text37
		JavascriptExecutor jse39 = (JavascriptExecutor) driver;
		jse39.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text37);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text38
		WebElement Text38 = driver
				.findElement(By.xpath("//p[contains(text(),'Digitali Ltd is the data controller of personal in')]"));
		Thread.sleep(1000);

		// to highlight the Text38
		JavascriptExecutor jse40 = (JavascriptExecutor) driver;
		jse40.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text38);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text39
		WebElement Text39 = driver.findElement(By.xpath("//p[contains(text(),'Your rights under GDPR')]"));
		Thread.sleep(1000);

		// to highlight the Text39
		JavascriptExecutor jse41 = (JavascriptExecutor) driver;
		jse41.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text39);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text40
		WebElement Text40 = driver
				.findElement(By.xpath("//p[contains(text(),'You have certain rights regarding your personal da')]"));
		Thread.sleep(1000);

		// to highlight the Text40
		JavascriptExecutor jse42 = (JavascriptExecutor) driver;
		jse42.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text40);

		// Thread.sleep(1000);
		jse42.executeScript("scroll(0,5800);");

//------------------------------------------------------------------------------------------------

		// locate Text41
		WebElement Text41 = driver
				.findElement(By.xpath("//ul[contains(text(),'The right to restrict the processing of personal d')]"));
		Thread.sleep(1000);

		// to highlight the Text41
		JavascriptExecutor jse43 = (JavascriptExecutor) driver;
		jse43.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text41);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text42
		WebElement Text42 = driver
				.findElement(By.xpath("//p[contains(text(),'You will not have to pay a fee to access your pers')]"));
		Thread.sleep(1000);

		// to highlight the Text42
		JavascriptExecutor jse44 = (JavascriptExecutor) driver;
		jse44.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text42);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text43
		WebElement Text43 = driver
				.findElement(By.xpath("//p[contains(text(),'We may need to request specific information from y')]"));
		Thread.sleep(1000);

		// to highlight the Text43
		JavascriptExecutor jse45 = (JavascriptExecutor) driver;
		jse45.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text43);

		// Thread.sleep(1000);
		jse45.executeScript("scroll(0,6000);");

//------------------------------------------------------------------------------------------------

		// locate Text44
		WebElement Text44 = driver.findElement(By.xpath("//p[normalize-space()='Information Uses']"));
		Thread.sleep(1000);

		// to highlight the Text44
		JavascriptExecutor jse46 = (JavascriptExecutor) driver;
		jse46.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text44);

		// Thread.sleep(1000);
		jse46.executeScript("scroll(0,6800);");

//------------------------------------------------------------------------------------------------

		// locate Text45
		WebElement Text45 = driver
				.findElement(By.xpath("//p[contains(text(),'We will only use your personal data when the law a')]"));
		Thread.sleep(1000);

		// to highlight the Text45
		JavascriptExecutor jse47 = (JavascriptExecutor) driver;
		jse47.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text45);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text46
		WebElement Text46 = driver.findElement(By.xpath("//body[1]/div[1]/main[1]/div[1]/div[25]/ul[2]"));
		Thread.sleep(1000);

		// to highlight the Text46
		JavascriptExecutor jse48 = (JavascriptExecutor) driver;
		jse48.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text46);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text47
		WebElement Text47 = driver.findElement(By.xpath("//p[normalize-space()='International Transfers']"));
		Thread.sleep(1000);

		// to highlight the Text47
		JavascriptExecutor jse49 = (JavascriptExecutor) driver;
		jse49.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text47);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text48
		WebElement Text48 = driver
				.findElement(By.xpath("//p[contains(text(),'Your personal data may be stored or transferred to')]"));
		Thread.sleep(1000);

		// to highlight the Text48
		JavascriptExecutor jse50 = (JavascriptExecutor) driver;
		jse50.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text48);

		// Thread.sleep(1000);
		jse50.executeScript("scroll(0,7200);");
//------------------------------------------------------------------------------------------------

		// locate Text49
		WebElement Text49 = driver
				.findElement(By.xpath("//p[contains(text(),'Whenever we store or transfer your personal data o')]"));
		Thread.sleep(1000);

		// to highlight the Text49
		JavascriptExecutor jse51 = (JavascriptExecutor) driver;
		jse51.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text49);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text50
		WebElement Text50 = driver
				.findElement(By.xpath("//p[contains(text(),'By using our services, you understand that your pe')]"));
		Thread.sleep(1000);

		// to highlight the Text50
		JavascriptExecutor jse52 = (JavascriptExecutor) driver;
		jse52.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text50);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text51
		WebElement Text51 = driver.findElement(By.xpath("//div[contains(text(),'California')]"));
		Thread.sleep(1000);

		// to highlight the Text51
		JavascriptExecutor jse53 = (JavascriptExecutor) driver;
		jse53.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text51);

		// Thread.sleep(1000);
		jse53.executeScript("scroll(0,7500);");

//------------------------------------------------------------------------------------------------

		// locate Text52
		WebElement Text52 = driver
				.findElement(By.xpath("//p[contains(text(),'California Consumer Privacy Act Privacy Statement ')]"));
		Thread.sleep(1000);

		// to highlight the Text52
		JavascriptExecutor jse54 = (JavascriptExecutor) driver;
		jse54.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text52);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text53
		WebElement Text53 = driver.findElement(By.xpath("//p[contains(text(),'Your rights under CCPA')]"));
		Thread.sleep(1000);

		// to highlight the Text53
		JavascriptExecutor jse55 = (JavascriptExecutor) driver;
		jse55.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text53);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text54
		WebElement Text54 = driver
				.findElement(By.xpath("//p[contains(text(),'As of January 1, 2020, California law permits resi')]"));
		Thread.sleep(1000);

		// to highlight the Text54
		JavascriptExecutor jse56 = (JavascriptExecutor) driver;
		jse56.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text54);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text55
		WebElement Text55 = driver
				.findElement(By.xpath("//p[contains(text(),'California residents may also take advantage of th')]"));
		Thread.sleep(1000);

		// to highlight the Text55
		JavascriptExecutor jse57 = (JavascriptExecutor) driver;
		jse57.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text55);

		// Thread.sleep(1000);
		jse57.executeScript("scroll(0,7800);");

//------------------------------------------------------------------------------------------------

		// locate Text56
		WebElement Text56 = driver.findElement(By.xpath("//body/div[@id='__next']/main[1]/div[1]/div[27]/ul[1]"));
		Thread.sleep(1000);

		// to highlight the Text56
		JavascriptExecutor jse58 = (JavascriptExecutor) driver;
		jse58.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text56);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text57
		WebElement Text57 = driver
				.findElement(By.xpath("//p[contains(text(),'To take advantage of your disclosure and deletion ')]"));
		Thread.sleep(1000);

		// to highlight the Text57
		JavascriptExecutor jse59 = (JavascriptExecutor) driver;
		jse59.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text57);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text58
		WebElement Text58 = driver.findElement(By.xpath("//p[normalize-space()='Disclosures']"));
		Thread.sleep(1000);

		// to highlight the Text58
		JavascriptExecutor jse60 = (JavascriptExecutor) driver;
		jse60.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text58);

		// Thread.sleep(1000);

//------------------------------------------------------------------------------------------------

		// locate Text59
		WebElement Text59 = driver
				.findElement(By.xpath("//p[contains(text(),'For purposes of compliance with the CCPA, in addit')]"));
		Thread.sleep(1000);

		// to highlight the Text59
		JavascriptExecutor jse61 = (JavascriptExecutor) driver;
		jse61.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text59);

		// Thread.sleep(1000);
		jse61.executeScript("scroll(0,8300);");

//------------------------------------------------------------------------------------------------

		// locate Text60
		WebElement Text60 = driver.findElement(By.xpath("//body[1]/div[1]/main[1]/div[1]/div[27]/ul[2]"));
		Thread.sleep(1000);

		// to highlight the Text60
		JavascriptExecutor jse62 = (JavascriptExecutor) driver;
		jse62.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text60);

		// Thread.sleep(1000);
		jse62.executeScript("scroll(0,8600);");
//
//------------------------------------------------------------------------------------------------
		// locate Wen_Token
		WebElement Wen_Token = driver.findElement(By.xpath("//body/div[@id='__next']/footer/div/div/div/div[1]"));
		Thread.sleep(1000);

		// to highlight the Wen_Token
		JavascriptExecutor jse447 = (JavascriptExecutor) driver;
		jse447.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Wen_Token);

		// Wen_Token is DISPLAYED or not
		boolean res27 = Wen_Token.isDisplayed();

		if (res27 == true) {
			System.out.println("Wen_Token is DISPLAYED");
		} else {
			System.out.println("Wen_Token is not DISPLAYED");
		}

		Thread.sleep(1000);

//	// ---------------------------------------------------------------------------------------------
		// locate Email_Field
		WebElement Email_Field = driver.findElement(By.xpath("//input[@placeholder='Enter your email']"));
		Thread.sleep(1000);

		// to highlight the Wen_Token
		JavascriptExecutor jse448 = (JavascriptExecutor) driver;
		jse448.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Email_Field);

		// Email_Field is DISPLAYED or not
		boolean res28 = Email_Field.isDisplayed();

		if (res28 == true) {
			System.out.println("Email_Field is DISPLAYED");
		} else {
			System.out.println("Email_Field is not DISPLAYED");
		}

		Thread.sleep(1000);

		// -----------------------------------------------------------------------

		// locate See_our_privacy_policy
		WebElement See_our_privacy_policy = driver.findElement(By.xpath("//a[contains(text(),'privacy policy')]"));
		Thread.sleep(1000);

		// to highlight the Wen_Token
		JavascriptExecutor jse449 = (JavascriptExecutor) driver;
		jse449.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				See_our_privacy_policy);
		Thread.sleep(1000);

		// See_our_privacy_policy is DISPLAYED or not
		boolean res29 = See_our_privacy_policy.isDisplayed();

		if (res29 == true) {
			System.out.println("See_our_privacy_policy is DISPLAYED");
		} else {
			System.out.println("See_our_privacy_policy is not DISPLAYED");
		}

		See_our_privacy_policy.click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);

		jse49.executeScript("scroll(0, 5000);");

		// --------------------------------------------------------------------------------------------
		// locate digitali_footer
		WebElement digitali_footer = driver
				.findElement(By.xpath("//body/div[@id='__next']/footer/div/div/div/div//*[name()='svg']"));
		Thread.sleep(1000);

		// to highlight the digitali_footer
		JavascriptExecutor jse550 = (JavascriptExecutor) driver;
		jse550.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				digitali_footer);

		// digitali_footer is DISPLAYED or not
		boolean res30 = digitali_footer.isDisplayed();

		if (res30 == true) {
			System.out.println("digitali_footer is DISPLAYED");
		} else {
			System.out.println("digitali_footer is not DISPLAYED");
		}

		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------

		// locate digitali_footer_text
		WebElement digitali_footer_text = driver
				.findElement(By.xpath("//div[contains(text(),'The most trusted NFT encyclopedia')]"));
		Thread.sleep(1000);

		// to highlight the digitali_footer_text
		JavascriptExecutor jse551 = (JavascriptExecutor) driver;
		jse551.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				digitali_footer_text);

		// digitali_footer_text is DISPLAYED or not
		boolean res31 = digitali_footer_text.isDisplayed();

		if (res31 == true) {
			System.out.println("digitali_footer_text is DISPLAYED");
		} else {
			System.out.println("digitali_footer_text is not DISPLAYED");
		}
		Thread.sleep(1000);

		// ----------------------------------------------------------------------------------------------------------------

		// locate Explore
		WebElement Explore = driver.findElement(By.xpath("//div[normalize-space()='Explore']"));
		Thread.sleep(1000);

		// to highlight the Explore
		JavascriptExecutor jse552 = (JavascriptExecutor) driver;
		jse552.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Explore);

		// Explore is DISPLAYED or not
		boolean res32 = Explore.isDisplayed();

		if (res32 == true) {
			System.out.println("Explore is DISPLAYED");
		} else {
			System.out.println("Explore is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Collection
		WebElement Collections = driver.findElement(
				By.xpath("//body/div[@id='__next']/footer[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/a[1]"));
		Thread.sleep(1000);

		// to highlight the Collections
		JavascriptExecutor jse553 = (JavascriptExecutor) driver;
		jse553.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Collections);

		// Collections is DISPLAYED or not
		boolean res33 = Collections.isDisplayed();

		if (res33 == true) {
			System.out.println("Collections is DISPLAYED");
		} else {
			System.out.println("Collections is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Leaderboard4
		WebElement Leaderboard4 = driver.findElement(By.xpath(
				"//div[@id='__next']//footer//div//div//div//div//div//div//div//a[normalize-space()='Leaderboard']"));
		Thread.sleep(1000);

		// to highlight the Leaderboard4
		JavascriptExecutor jse554 = (JavascriptExecutor) driver;
		jse554.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Leaderboard4);

		// Leaderboard4 is DISPLAYED or not
		boolean res34 = Leaderboard4.isDisplayed();

		if (res34 == true) {
			System.out.println("Leaderboard4 is DISPLAYED");
		} else {
			System.out.println("Leaderboard4 is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Reward_Points1
		WebElement Reward_Points1 = driver.findElement(By.xpath(
				"//div[@id='__next']//footer//div//div//div//div//div//div//div//a[normalize-space()='Reward Points']"));
		Thread.sleep(1000);

		// to highlight the Reward_Points1
		JavascriptExecutor jse555 = (JavascriptExecutor) driver;
		jse555.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Reward_Points1);

		// Reward_Points1 is DISPLAYED or not
		boolean res35 = Reward_Points1.isDisplayed();

		if (res35 == true) {
			System.out.println("Reward_Points1 is DISPLAYED");
		} else {
			System.out.println("Reward_Points1 is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate About_Us1
		WebElement About_Us1 = driver.findElement(By.xpath("//div[normalize-space()='About Us']"));
		Thread.sleep(1000);

		// to highlight the About_Us1
		JavascriptExecutor jse556 = (JavascriptExecutor) driver;
		jse556.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", About_Us1);

		// About_Us1 is DISPLAYED or not
		boolean res36 = Reward_Points1.isDisplayed();

		if (res36 == true) {
			System.out.println("About_Us1 is DISPLAYED");
		} else {
			System.out.println("About_Us1 is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Digitali
		WebElement Digitali = driver.findElement(By.xpath("//a[normalize-space()='Digitali']"));
		Thread.sleep(1000);

		// to highlight the Digitali
		JavascriptExecutor jse557 = (JavascriptExecutor) driver;
		jse557.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Digitali);

		// Digitali is DISPLAYED or not
		boolean res37 = Digitali.isDisplayed();

		if (res37 == true) {
			System.out.println("Digitali is DISPLAYED");
		} else {
			System.out.println("Digitali is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Blogs_footer
		WebElement Blogs_footer = driver.findElement(By.xpath("//a[normalize-space()='Blogs']"));
		Thread.sleep(1000);

		// to highlight the Blogs_footer
		JavascriptExecutor jse558 = (JavascriptExecutor) driver;
		jse558.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Blogs_footer);

		// Blogs_footer is DISPLAYED or not
		boolean res38 = Blogs_footer.isDisplayed();

		if (res38 == true) {
			System.out.println("Blogs_footer is DISPLAYED");
		} else {
			System.out.println("Blogs_footer is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate FAQ1
		WebElement FAQ1 = driver.findElement(
				By.xpath("//div[@id='__next']//footer//div//div//div//div//div//div//div//a[normalize-space()='FAQ']"));
		Thread.sleep(1000);

		// to highlight the FAQ1
		JavascriptExecutor jse559 = (JavascriptExecutor) driver;
		jse559.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", FAQ1);

		// FAQ1 is DISPLAYED or not
		boolean res39 = FAQ1.isDisplayed();

		if (res39 == true) {
			System.out.println("FAQ1 is DISPLAYED");
		} else {
			System.out.println("FAQ1 is not DISPLAYED");
		}
		Thread.sleep(1000);
		Thread.sleep(2000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Legal
		WebElement Legal = driver.findElement(By.xpath("//div[normalize-space()='Legal']"));
		Thread.sleep(1000);

		// to highlight the Legal
		JavascriptExecutor jse660 = (JavascriptExecutor) driver;
		jse660.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Legal);

		// Legal is DISPLAYED or not
		boolean res40 = Legal.isDisplayed();

		if (res40 == true) {
			System.out.println("Legal is DISPLAYED");
		} else {
			System.out.println("Legal is not DISPLAYED");
		}
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Terms
		WebElement Terms = driver.findElement(By.xpath("//a[normalize-space()='Terms']"));
		Thread.sleep(1000);

		// to highlight the Terms
		JavascriptExecutor jse661 = (JavascriptExecutor) driver;
		jse661.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Terms);

		// Terms is DISPLAYED or not
		boolean res41 = Terms.isDisplayed();

		if (res41 == true) {
			System.out.println("Terms is DISPLAYED");
		} else {
			System.out.println("Terms is not DISPLAYED");
		}

		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------------------

		// locate Privacy111
		WebElement Privacy111 = driver.findElement(By.xpath("//a[normalize-space()='Privacy']"));
		Thread.sleep(1000);

		// to highlight the Privacy111
		JavascriptExecutor jse662 = (JavascriptExecutor) driver;
		jse662.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Privacy111);

		// Privacy is DISPLAYED or not
		boolean res42 = Privacy111.isDisplayed();

		if (res42 == true) {
			System.out.println("Privacy111 is DISPLAYED");
		} else {
			System.out.println("Privacy111 is not DISPLAYED");
		}
		Thread.sleep(1000);

		// ---------------------------------------------------------------------------------------------------------

		// locate All_Rights_Reserved
		WebElement All_Rights_Reserved = driver
				.findElement(By.xpath("//div[contains(text(),'© 2023 Digitali Technology Solutions Ltd. All righ')]"));
		Thread.sleep(1000);

		// to highlight the All_Rights_Reserved
		JavascriptExecutor jse63 = (JavascriptExecutor) driver;
		jse63.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				All_Rights_Reserved);

		// All_Rights_Reserved is DISPLAYED or not
		boolean res43 = All_Rights_Reserved.isDisplayed();

		if (res43 == true) {
			System.out.println("All_Rights_Reserved is DISPLAYED");
		} else {
			System.out.println("All_Rights_Reserved is not DISPLAYED");
		}
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------------

		// locate Twitter_Icon
		WebElement Twitter_Icon = driver.findElement(
				By.xpath("//body/div[@id='__next']/footer[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/a[1]/*[1]"));
		Thread.sleep(1000);

		// to highlight the Twitter_Icon
		JavascriptExecutor jse64 = (JavascriptExecutor) driver;
		jse64.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Twitter_Icon);

		// Twitter_Icon is DISPLAYED or not
		boolean res44 = All_Rights_Reserved.isDisplayed();

		if (res44 == true) {
			System.out.println("Twitter_Icon is DISPLAYED");
		} else {
			System.out.println("Twitter_Icon is not DISPLAYED");
		}

		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------------------

		// locate Discord_Icon
		WebElement Discord_Icon = driver.findElement(
				By.xpath("//body/div[@id='__next']/footer[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/a[1]/*[1]"));
		Thread.sleep(1000);

		// to highlight the Discord_Icon
		JavascriptExecutor jse65 = (JavascriptExecutor) driver;
		jse65.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Discord_Icon);

		// Discord_Icon is DISPLAYED or not
		boolean res45 = Discord_Icon.isDisplayed();

		if (res45 == true) {
			System.out.println("Discord_Icon is DISPLAYED");
		} else {
			System.out.println("Discord_Icon is not DISPLAYED");
		}
		Thread.sleep(1000);

		driver.close();
		driver.quit();

	}
	
	@Test
	public void Social_Media_Icons() throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\praka\\Downloads\\edgedriver_win64 (2)\\msedgedriver.exe");
		// System.setProperty("webdriver.edge.driver",
		// "C:\\Users\\praka\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");

		// up casting
		WebDriver driver = new EdgeDriver();

		// get URL
		driver.get("https://digitali.xyz/");
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// maximize
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);

		// locate Collections_Button
		WebElement Collections_Button = driver
				.findElement(By.xpath("//div[@id='navbar-search']//a[normalize-space()='Collections']"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Collection_Button
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
				Collections_Button);

		Thread.sleep(2000);
		
		
		// Collections_Button is DISPLAYED or not
				boolean res = Collections_Button.isDisplayed();

				if (res == true) {
					System.out.println("Collections_Button is DISPLAYED ");
				} else {
					System.out.println("Collections_Button is not DISPLAYED");
				}
		driver.manage().deleteAllCookies();
		Collections_Button.click();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);

		// -------------------------------------------------------------------------------------

		// locate Collection
		WebElement Collection = driver.findElement(By.xpath("//span[contains(text(),'Decentraland')]"));
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// to highlight the Collection
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Collection);
		Thread.sleep(2000);
		
		// Collections_Button is DISPLAYED or not
		boolean res1 = Collection.isDisplayed();

		if (res1 == true) {
			System.out.println("Collection is DISPLAYED ");
		} else {
			System.out.println("Collection is not DISPLAYED");
		}
		driver.manage().deleteAllCookies();
		Collection.click();
		Thread.sleep(2000);

		// ---------------------------------------------------------------------------------------------------

		// locate Collection_Name
		WebElement Collection_Name = driver.findElement(By.xpath("//div[contains(text(),'DECENTRALAND')]"));
		Thread.sleep(1000);

		// to highlight the Collection_Name
		JavascriptExecutor jse3 = (JavascriptExecutor) driver;
		jse3.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Collection_Name);
		Thread.sleep(2000);
		
		// Collection_Name is DISPLAYED or not
				boolean res2 = Collection_Name.isDisplayed();

				if (res2 == true) {
					System.out.println("Collection_Name is DISPLAYED ");
				} else {
					System.out.println("Collection_Name is not DISPLAYED");
				}
		Collection_Name.click();
		Thread.sleep(2000);
		jse3.executeScript("scroll(0, 350);");

		// -------------------------------------------------------------------------------------------------------

		// locate Website
		WebElement Website = driver
				.findElement(By.xpath("//a[@href='https://decentraland.org/']//div//*[name()='svg']"));
		Thread.sleep(1000);

		// to highlight the Website
		JavascriptExecutor jse6 = (JavascriptExecutor) driver;
		jse6.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')", Website);
		Thread.sleep(2000);
		
		// Collection_Name is DISPLAYED or not
		boolean res3 = Website.isDisplayed();

		if (res3 == true) {
			System.out.println("Website is DISPLAYED ");
		} else {
			System.out.println("Website is not DISPLAYED");
		}
		Website.click();
		Thread.sleep(2000);

		// ------------------------------------------------------------------------------------------------------------------

		driver.get("https://digitali.xyz/nft-collection-details/decentraland-nft-collection");
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// maximize
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);

		// --------------------------------------------

		// locate Twitter
		WebElement Twitter = driver.findElement(By.xpath(
				"//a[@href='https://twitter.com/decentraland']//div[@class='flex items-center justify-center icons-container']"));
		Thread.sleep(1000);

		// to highlight the Twitter
		JavascriptExecutor jse7 = (JavascriptExecutor) driver;
		jse7.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')", Twitter);
		Thread.sleep(2000);
		
		// Twitter is DISPLAYED or not
				boolean res4 = Twitter.isDisplayed();

				if (res4 == true) {
					System.out.println("Twitter is DISPLAYED ");
				} else {
					System.out.println("Twitter is not DISPLAYED");
				}
		Twitter.click();
		Thread.sleep(2000);

		// ---------------------------------------------------------------------------------------------------------------

		driver.get("https://digitali.xyz/nft-collection-details/decentraland-nft-collection");
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// maximize
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);

		// -----------------------------------------------------------------------------------------------------

		// locate Insta
		WebElement Insta = driver.findElement(By.xpath(
				"//a[@href='https://ig.me/m/decentraland_foundation/']//div[@class='flex items-center justify-center icons-container']"));
		Thread.sleep(1000);

		// to highlight the Insta
		JavascriptExecutor jse8 = (JavascriptExecutor) driver;
		jse8.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')", Insta);
		Thread.sleep(1000);
		
		// Insta is DISPLAYED or not
		boolean res5 = Twitter.isDisplayed();

		if (res5 == true) {
			System.out.println("Insta is DISPLAYED ");
		} else {
			System.out.println("Insta is not DISPLAYED");
		}
		Insta.click();
		Thread.sleep(1000);

		// ------------------------------

		driver.get("https://digitali.xyz/nft-collection-details/decentraland-nft-collection");
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// maximize
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);

		// ----------------------------------------------------------------------------------------------------------

		// locate Discord
		WebElement Discord = driver.findElement(
				By.xpath("//div[@class='flex justify-between banner-collection-detail-wrapper']//a[4]//div[1]"));
		Thread.sleep(1000);

		// to highlight the Discord
		JavascriptExecutor jse9 = (JavascriptExecutor) driver;
		jse9.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')", Discord);
		Thread.sleep(1000);
		
		// Discord is DISPLAYED or not
		boolean res6 = Discord.isDisplayed();

		if (res6 == true) {
			System.out.println("Discord is DISPLAYED ");
		} else {
			System.out.println("Discord is not DISPLAYED");
		}
		Discord.click();
		Thread.sleep(1000);

		driver.close();
		driver.quit();

	}
	@Test
	public void Terms() throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\praka\\Downloads\\edgedriver_win64 (2)\\msedgedriver.exe");
		// System.setProperty("webdriver.edge.driver",
		// "C:\\Users\\praka\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");

		// up casting
		WebDriver driver = new EdgeDriver();

		// get URL
		driver.get("https://digitali.xyz/");
		Thread.sleep(1000);
		driver.manage().deleteAllCookies();

		// maximize
		driver.manage().window().maximize();
		Thread.sleep(1000);

		// locate digital logo
				WebElement digitali_logo = driver.findElement(By.xpath("//img[@alt='Digitali Logo']"));

				// to highlight the digitali_logo
				JavascriptExecutor jse = (JavascriptExecutor) driver;
				jse.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
						digitali_logo);
				
				
				// digitali_logo is DISPLAYED or not
				boolean res = digitali_logo.isDisplayed();

				if (res == true) {
					System.out.println("digitali_logo is DISPLAYED ");
				} else {
					System.out.println("digitali_logo is not DISPLAYED");
				}
				Thread.sleep(1000);

				jse.executeScript("scroll(0, 5000);");

				// --------------------------------------------------------------------------------

				// locate Terms
				WebElement Terms = driver.findElement(By.xpath("//a[normalize-space()='Terms']"));
				Thread.sleep(2000);
				driver.manage().deleteAllCookies();

				// to highlight the Terms
				JavascriptExecutor jse1 = (JavascriptExecutor) driver;
				jse1.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Terms);

				Thread.sleep(2000);
				
				// Terms is DISPLAYED or not
						boolean res1 = Terms.isDisplayed();

						if (res1 == true) {
							System.out.println("Terms is DISPLAYED ");
						} else {
							System.out.println("Terms is not DISPLAYED");
						}
				driver.manage().deleteAllCookies();
				Terms.click();
				driver.manage().deleteAllCookies();
				Thread.sleep(2000);

				// -------------------------------------------------------------------------------------

				// locate Terms_Heading
				WebElement Terms_Heading = driver.findElement(By.xpath("//div[contains(text(),'Terms Of Service')]"));
				Thread.sleep(1000);

				// to highlight the Terms_Heading
				JavascriptExecutor jse2 = (JavascriptExecutor) driver;
				jse2.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
						Terms_Heading);
				
				// Terms_Heading is DISPLAYED or not
				boolean res2 = Terms_Heading.isDisplayed();

				if (res2 == true) {
					System.out.println("Terms_Heading is DISPLAYED ");
				} else {
					System.out.println("Terms_Heading is not DISPLAYED");
				}

				// Thread.sleep(1000);

				// -------------------------------------------------------------------------------------

				// locate Text1
				WebElement Text1 = driver.findElement(By.xpath("//body[1]/div[1]/main[1]/div[1]/div[2]/p[1]"));
				Thread.sleep(1000);

				// to highlight the Text1
				JavascriptExecutor jse3 = (JavascriptExecutor) driver;
				jse3.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text1);

				// Thread.sleep(1000);

				// -------------------------------------------------------------------------------------

				// locate Text2
				WebElement Text2 = driver.findElement(By.xpath("//div[contains(text(),'Your Access to the Services')]"));
				Thread.sleep(1000);

				// to highlight the Text2
				JavascriptExecutor jse4 = (JavascriptExecutor) driver;
				jse4.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text2);

				// Thread.sleep(1000);

				// -------------------------------------------------------------------------------------

				// locate Text3
				WebElement Text3 = driver.findElement(By.xpath("//body/div[@id='__next']/main[1]/div[1]/div[4]"));
				Thread.sleep(1000);

				// to highlight the Text3
				JavascriptExecutor jse5 = (JavascriptExecutor) driver;
				jse5.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text3);

				// Thread.sleep(1000);

				// -------------------------------------------------------------------------------------

				// locate Text5
				WebElement Text5 = driver.findElement(By.xpath("//div[contains(text(),'Your Use of the Services')]"));
				Thread.sleep(1000);

				// to highlight the Text5
				JavascriptExecutor jse7 = (JavascriptExecutor) driver;
				jse7.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text5);

				// Thread.sleep(1000);
				jse7.executeScript("scroll(0, 700);");

				// -------------------------------------------------------------------------------------

				// locate Text6
				WebElement Text6 = driver
						.findElement(By.xpath("//div[contains(text(),'Subject to your complete and ongoing compliance wi')]"));
				Thread.sleep(1000);

				// to highlight the Text6
				JavascriptExecutor jse8 = (JavascriptExecutor) driver;
				jse8.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')", Text6);

				// Thread.sleep(1000);

				// -------------------------------------------------------------------------------------

				// locate Text7
				WebElement Text7 = driver.findElement(By.xpath("//div[contains(text(),'Personal Use Only')]"));
				Thread.sleep(1000);

				// to highlight the Text7
				JavascriptExecutor jse9 = (JavascriptExecutor) driver;
				jse9.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text7);

				// Thread.sleep(1000);

				// ------------------------------------------------------------------------------------------------

				// locate Text8
				WebElement Text8 = driver.findElement(By.xpath("//div[contains(text(),'Personal Use Only')]"));
				Thread.sleep(1000);

				// to highlight the Text8
				JavascriptExecutor jse10 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text8);

				// Thread.sleep(1000);

				// ------------------------------------------------------------------------------------------------

				// locate Text9
				WebElement Text9 = driver.findElement(By.xpath("//body[1]/div[1]/main[1]/div[1]/div[8]/p[1]"));
				Thread.sleep(1000);

				// to highlight the Text9
				JavascriptExecutor jse11 = (JavascriptExecutor) driver;
				jse11.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text9);

				// Thread.sleep(1000);

		//------------------------------------------------------------------------------------------------

				// locate Text10
				WebElement Text10 = driver.findElement(By.xpath("//div[contains(text(),'Not Investment Advice')]"));
				Thread.sleep(1000);

				// to highlight the Text10
				JavascriptExecutor jse12 = (JavascriptExecutor) driver;
				jse12.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text10);

				// Thread.sleep(1000);

		//------------------------------------------------------------------------------------------------

				// locate Text11
				WebElement Text11 = driver.findElement(By.xpath("//body[1]/div[1]/main[1]/div[1]/div[10]/p[1]"));
				Thread.sleep(1000);

				// to highlight the Text11
				JavascriptExecutor jse13 = (JavascriptExecutor) driver;
				jse13.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text11);

				// Thread.sleep(1000);

		//------------------------------------------------------------------------------------------------

				// locate Text12
				WebElement Text12 = driver
						.findElement(By.xpath("//p[contains(text(),'References to any specific NFT or other product or')]"));
				Thread.sleep(1000);

				// to highlight the Text12
				JavascriptExecutor jse14 = (JavascriptExecutor) driver;
				jse14.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text12);

				// Thread.sleep(1000);
				jse14.executeScript("scroll(0, 1200);");

		//------------------------------------------------------------------------------------------------

				// locate Text13
				WebElement Text13 = driver.findElement(By.xpath("//div[contains(text(),'No Reverse Engineering')]"));
				Thread.sleep(1000);

				// to highlight the Text13
				JavascriptExecutor jse15 = (JavascriptExecutor) driver;
				jse15.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text13);

				// Thread.sleep(1000);

		//------------------------------------------------------------------------------------------------

				// locate Text14
				WebElement Text14 = driver
						.findElement(By.xpath("//p[contains(text(),'You may not, and you agree not to or enable others')]"));
				Thread.sleep(1000);

				// to highlight the Text14
				JavascriptExecutor jse16 = (JavascriptExecutor) driver;
				jse16.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text14);

				// Thread.sleep(1000);
				jse16.executeScript("scroll(0, 1500);");
		//------------------------------------------------------------------------------------------------

				// locate Text15
				WebElement Text15 = driver.findElement(By.xpath("//div[contains(text(),'Copyright')]"));
				Thread.sleep(1000);

				// to highlight the Text15
				JavascriptExecutor jse17 = (JavascriptExecutor) driver;
				jse17.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text15);

				// Thread.sleep(1000);

		//------------------------------------------------------------------------------------------------

				// locate Text16
				WebElement Text16 = driver
						.findElement(By.xpath("//p[contains(text(),'All information available through this website is ')]"));
				Thread.sleep(1000);

				// to highlight the Text16
				JavascriptExecutor jse18 = (JavascriptExecutor) driver;
				jse18.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text16);

				// Thread.sleep(1000);

		//------------------------------------------------------------------------------------------------

				// locate Text17
				WebElement Text17 = driver
						.findElement(By.xpath("//p[contains(text(),'You are granted only a limited, non-exclusive, rev')]"));
				Thread.sleep(1000);

				// to highlight the Text17
				JavascriptExecutor jse19 = (JavascriptExecutor) driver;
				jse19.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text17);

				// Thread.sleep(1000);
				jse19.executeScript("scroll(0, 1300);");
		//------------------------------------------------------------------------------------------------

				// locate Text18
				WebElement Text18 = driver.findElement(By.xpath("//div[normalize-space()='Trademarks']"));
				Thread.sleep(1000);

				// to highlight the Text18
				JavascriptExecutor jse20 = (JavascriptExecutor) driver;
				jse20.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text18);

				// Thread.sleep(1000);
				jse20.executeScript("scroll(0, 1300);");

		//------------------------------------------------------------------------------------------------

				// locate Text19
				WebElement Text19 = driver
						.findElement(By.xpath("//p[contains(text(),'All trademarks used in conjunction with any Digita')]"));
				Thread.sleep(1000);

				// to highlight the Text19
				JavascriptExecutor jse21 = (JavascriptExecutor) driver;
				jse21.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text19);

				// Thread.sleep(1000);
				jse21.executeScript("scroll(0, 2000);");

		//------------------------------------------------------------------------------------------------

				// locate Text20
				WebElement Text20 = driver.findElement(By.xpath("//div[normalize-space()='User-Generated Content']"));
				Thread.sleep(1000);

				// to highlight the Text20
				JavascriptExecutor jse22 = (JavascriptExecutor) driver;
				jse22.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text20);

				// Thread.sleep(1000);

		//------------------------------------------------------------------------------------------------

				// locate Text21
				WebElement Text21 = driver
						.findElement(By.xpath("//p[contains(text(),'The Services may include means by which you and ot')]"));
				Thread.sleep(1000);

				// to highlight the Text21
				JavascriptExecutor jse23 = (JavascriptExecutor) driver;
				jse23.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text21);

				// Thread.sleep(1000);

		//------------------------------------------------------------------------------------------------

				// locate Text22
				WebElement Text22 = driver
						.findElement(By.xpath("//div[normalize-space()='Disclaimers - Services are Provided As-Is']"));
				Thread.sleep(1000);

				// to highlight the Text22
				JavascriptExecutor jse24 = (JavascriptExecutor) driver;
				jse24.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text22);

				// Thread.sleep(1000);
				jse21.executeScript("scroll(0, 2400);");
		//------------------------------------------------------------------------------------------------

				// locate Text23
				WebElement Text23 = driver
						.findElement(By.xpath("//p[contains(text(),'Neither Cumberland Labs, Digitali, nor any of its ')]"));
				Thread.sleep(1000);

				// to highlight the Text23
				JavascriptExecutor jse25 = (JavascriptExecutor) driver;
				jse25.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text23);

				// Thread.sleep(1000);

				// ------------------------------------------------------------------------------------------------------

				// locate Text24
				WebElement Text24 = driver
						.findElement(By.xpath("//p[contains(text(),'NEITHER CUMBERLAND INNOVATIONS LLC, DIGITALI NOR A')]"));
				Thread.sleep(1000);

				// to highlight the Text24
				JavascriptExecutor jse26 = (JavascriptExecutor) driver;
				jse26.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text24);

				// Thread.sleep(1000);

				// ------------------------------------------------------------------------------------------------------

				// locate Text25
				WebElement Text25 = driver
						.findElement(By.xpath("//p[contains(text(),'NEITHER CUMBERLAND INNOVATIONS LLC, DIGITALI, NOR ')]"));
				Thread.sleep(1000);

				// to highlight the Text25
				JavascriptExecutor jse27 = (JavascriptExecutor) driver;
				jse27.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text25);

				// Thread.sleep(1000);
				jse27.executeScript("scroll(0, 2900);");

				// ------------------------------------------------------------------------------------------------------

				// locate Text26
				WebElement Text26 = driver.findElement(By.xpath("//div[normalize-space()='Governing Law and Venue']"));
				Thread.sleep(1000);

				// to highlight the Text26
				JavascriptExecutor jse28 = (JavascriptExecutor) driver;
				jse28.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text26);

				// Thread.sleep(1000);

				// ------------------------------------------------------------------------------------------------------

				// locate Text27
				WebElement Text27 = driver.findElement(By.xpath("//body/div[@id='__next']/main[1]/div[1]/div[22]/p[1]"));
				Thread.sleep(1000);

				// to highlight the Text27
				JavascriptExecutor jse29 = (JavascriptExecutor) driver;
				jse29.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text27);

				// Thread.sleep(1000);

				// ------------------------------------------------------------------------------------------------------

				// locate Text28
				WebElement Text28 = driver.findElement(By.xpath("//div[contains(text(),'Changes to these Terms')]"));
				Thread.sleep(1000);

				// to highlight the Text28
				JavascriptExecutor jse30 = (JavascriptExecutor) driver;
				jse30.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text28);

				// Thread.sleep(1000);

				// ------------------------------------------------------------------------------------------------------

				// locate Text29
				WebElement Text29 = driver
						.findElement(By.xpath("//p[contains(text(),'We may make changes to these Terms from time to ti')]"));
				Thread.sleep(1000);

				// to highlight the Text29
				JavascriptExecutor jse31 = (JavascriptExecutor) driver;
				jse31.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text29);

				// Thread.sleep(1000);

				// ------------------------------------------------------------------------------------------------------

				// locate Text30
				WebElement Text30 = driver.findElement(By.xpath("//div[contains(text(),'Termination')]"));
				Thread.sleep(1000);

				// to highlight the Text30
				JavascriptExecutor jse32 = (JavascriptExecutor) driver;
				jse32.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text30);

				// Thread.sleep(1000);
				jse32.executeScript("scroll(0, 3800);");

				// ------------------------------------------------------------------------------------------------------

				// locate Text31
				WebElement Text31 = driver.findElement(By.xpath("//body[1]/div[1]/main[1]/div[1]/div[26]/p[1]"));
				Thread.sleep(1000);

				// to highlight the Text31
				JavascriptExecutor jse33 = (JavascriptExecutor) driver;
				jse33.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text31);

				// Thread.sleep(1000);

				// ------------------------------------------------------------------------------------------------------

				// locate Text32
				WebElement Text32 = driver
						.findElement(By.xpath("//p[contains(text(),'The following sections will survive any terminatio')]"));
				Thread.sleep(1000);

				// to highlight the Text32
				JavascriptExecutor jse34 = (JavascriptExecutor) driver;
				jse34.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text32);

				// Thread.sleep(1000);

				// ------------------------------------------------------------------------------------------------------

				// locate Text33
				WebElement Text33 = driver.findElement(By.xpath("//div[contains(text(),'Miscellaneous')]"));
				Thread.sleep(1000);

				// to highlight the Text33
				JavascriptExecutor jse35 = (JavascriptExecutor) driver;
				jse35.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Text33);

				// Thread.sleep(1000);
				jse35.executeScript("scroll(0, 3800);");

				// ------------------------------------------------------------------------------------------------------

				// locate Text34
				WebElement Text34 = driver
						.findElement(By.xpath("//p[contains(text(),'These Terms, together with the Privacy Policy and ')]"));
				Thread.sleep(1000);

				// to highlight the Text34
				JavascriptExecutor jse36 = (JavascriptExecutor) driver;
				jse36.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text34);

				// Thread.sleep(1000);

				// ------------------------------------------------------------------------------------------------------

				// locate Text35
				WebElement Text35 = driver
						.findElement(By.xpath("//p[contains(text(),'These Terms are a legally binding agreement betwee')]"));
				Thread.sleep(1000);

				// to highlight the Text35
				JavascriptExecutor jse37 = (JavascriptExecutor) driver;
				jse37.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Text35);

				// Thread.sleep(1000);

				// ------------------------------------------------------------------------------------------------------

				// locate Wen_Token
						WebElement Wen_Token = driver.findElement(By.xpath("//body/div[@id='__next']/footer/div/div/div/div[1]"));
						Thread.sleep(1000);

						// to highlight the Wen_Token
						JavascriptExecutor jse47 = (JavascriptExecutor) driver;
						jse47.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Wen_Token);

						// Wen_Token is DISPLAYED or not
						boolean res27 = Wen_Token.isDisplayed();

						if (res27 == true) {
							System.out.println("Wen_Token is DISPLAYED");
						} else {
							System.out.println("Wen_Token is not DISPLAYED");
						}

						Thread.sleep(1000);

//						// ---------------------------------------------------------------------------------------------
						// locate Email_Field
						WebElement Email_Field = driver.findElement(By.xpath("//input[@placeholder='Enter your email']"));
						Thread.sleep(1000);

						// to highlight the Wen_Token
						JavascriptExecutor jse48 = (JavascriptExecutor) driver;
						jse48.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
								Email_Field);

						// Email_Field is DISPLAYED or not
						boolean res28 = Email_Field.isDisplayed();

						if (res28 == true) {
							System.out.println("Email_Field is DISPLAYED");
						} else {
							System.out.println("Email_Field is not DISPLAYED");
						}

						Thread.sleep(1000);

						// -----------------------------------------------------------------------

						// locate See_our_privacy_policy
						WebElement See_our_privacy_policy = driver.findElement(By.xpath("//a[contains(text(),'privacy policy')]"));
						Thread.sleep(1000);

						// to highlight the Wen_Token
						JavascriptExecutor jse49 = (JavascriptExecutor) driver;
						jse49.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
								See_our_privacy_policy);
						Thread.sleep(1000);

						// See_our_privacy_policy is DISPLAYED or not
						boolean res29 = See_our_privacy_policy.isDisplayed();

						if (res29 == true) {
							System.out.println("See_our_privacy_policy is DISPLAYED");
						} else {
							System.out.println("See_our_privacy_policy is not DISPLAYED");
						}

						See_our_privacy_policy.click();
						Thread.sleep(1000);
						driver.navigate().back();
						Thread.sleep(1000);

						jse49.executeScript("scroll(0, 5000);");

						// --------------------------------------------------------------------------------------------
						// locate digitali_footer
						WebElement digitali_footer = driver
								.findElement(By.xpath("//body/div[@id='__next']/footer/div/div/div/div//*[name()='svg']"));
						Thread.sleep(1000);

						// to highlight the digitali_footer
						JavascriptExecutor jse50 = (JavascriptExecutor) driver;
						jse50.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
								digitali_footer);

						// digitali_footer is DISPLAYED or not
						boolean res30 = digitali_footer.isDisplayed();

						if (res30 == true) {
							System.out.println("digitali_footer is DISPLAYED");
						} else {
							System.out.println("digitali_footer is not DISPLAYED");
						}

						Thread.sleep(1000);

						// --------------------------------------------------------------------------------------------------

						// locate digitali_footer_text
						WebElement digitali_footer_text = driver
								.findElement(By.xpath("//div[contains(text(),'The most trusted NFT encyclopedia')]"));
						Thread.sleep(1000);

						// to highlight the digitali_footer_text
						JavascriptExecutor jse51 = (JavascriptExecutor) driver;
						jse51.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
								digitali_footer_text);

						// digitali_footer_text is DISPLAYED or not
						boolean res31 = digitali_footer_text.isDisplayed();

						if (res31 == true) {
							System.out.println("digitali_footer_text is DISPLAYED");
						} else {
							System.out.println("digitali_footer_text is not DISPLAYED");
						}
						Thread.sleep(1000);

						// ----------------------------------------------------------------------------------------------------------------

						// locate Explore
						WebElement Explore = driver.findElement(By.xpath("//div[normalize-space()='Explore']"));
						Thread.sleep(1000);

						// to highlight the Explore
						JavascriptExecutor jse52 = (JavascriptExecutor) driver;
						jse52.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Explore);

						// Explore is DISPLAYED or not
						boolean res32 = Explore.isDisplayed();

						if (res32 == true) {
							System.out.println("Explore is DISPLAYED");
						} else {
							System.out.println("Explore is not DISPLAYED");
						}
						Thread.sleep(1000);

						// --------------------------------------------------------------------------------------------------------------------

						// locate Collection
						WebElement Collections = driver.findElement(
								By.xpath("//body/div[@id='__next']/footer[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/a[1]"));
						Thread.sleep(1000);

						// to highlight the Collections
						JavascriptExecutor jse53 = (JavascriptExecutor) driver;
						jse53.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
								Collections);

						// Collections is DISPLAYED or not
						boolean res33 = Collections.isDisplayed();

						if (res33 == true) {
							System.out.println("Collections is DISPLAYED");
						} else {
							System.out.println("Collections is not DISPLAYED");
						}
						Thread.sleep(1000);

						// --------------------------------------------------------------------------------------------------------------------

						// locate Leaderboard4
						WebElement Leaderboard4 = driver.findElement(By.xpath(
								"//div[@id='__next']//footer//div//div//div//div//div//div//div//a[normalize-space()='Leaderboard']"));
						Thread.sleep(1000);

						// to highlight the Leaderboard4
						JavascriptExecutor jse54 = (JavascriptExecutor) driver;
						jse54.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
								Leaderboard4);

						// Leaderboard4 is DISPLAYED or not
						boolean res34 = Leaderboard4.isDisplayed();

						if (res34 == true) {
							System.out.println("Leaderboard4 is DISPLAYED");
						} else {
							System.out.println("Leaderboard4 is not DISPLAYED");
						}
						Thread.sleep(1000);

						// --------------------------------------------------------------------------------------------------------------------

						// locate Reward_Points1
						WebElement Reward_Points1 = driver.findElement(By.xpath(
								"//div[@id='__next']//footer//div//div//div//div//div//div//div//a[normalize-space()='Reward Points']"));
						Thread.sleep(1000);

						// to highlight the Reward_Points1
						JavascriptExecutor jse55 = (JavascriptExecutor) driver;
						jse55.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
								Reward_Points1);

						// Reward_Points1 is DISPLAYED or not
						boolean res35 = Reward_Points1.isDisplayed();

						if (res35 == true) {
							System.out.println("Reward_Points1 is DISPLAYED");
						} else {
							System.out.println("Reward_Points1 is not DISPLAYED");
						}
						Thread.sleep(1000);

						// --------------------------------------------------------------------------------------------------------------------

						// locate About_Us1
						WebElement About_Us1 = driver.findElement(By.xpath("//div[normalize-space()='About Us']"));
						Thread.sleep(1000);

						// to highlight the About_Us1
						JavascriptExecutor jse56 = (JavascriptExecutor) driver;
						jse56.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", About_Us1);

						// About_Us1 is DISPLAYED or not
						boolean res36 = Reward_Points1.isDisplayed();

						if (res36 == true) {
							System.out.println("About_Us1 is DISPLAYED");
						} else {
							System.out.println("About_Us1 is not DISPLAYED");
						}
						Thread.sleep(1000);

						// --------------------------------------------------------------------------------------------------------------------

						// locate Digitali
						WebElement Digitali = driver.findElement(By.xpath("//a[normalize-space()='Digitali']"));
						Thread.sleep(1000);

						// to highlight the Digitali
						JavascriptExecutor jse57 = (JavascriptExecutor) driver;
						jse57.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Digitali);

						// Digitali is DISPLAYED or not
						boolean res37 = Digitali.isDisplayed();

						if (res37 == true) {
							System.out.println("Digitali is DISPLAYED");
						} else {
							System.out.println("Digitali is not DISPLAYED");
						}
						Thread.sleep(1000);

						// --------------------------------------------------------------------------------------------------------------------

						// locate Blogs_footer
						WebElement Blogs_footer = driver.findElement(By.xpath("//a[normalize-space()='Blogs']"));
						Thread.sleep(1000);

						// to highlight the Blogs_footer
						JavascriptExecutor jse58 = (JavascriptExecutor) driver;
						jse58.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
								Blogs_footer);

						// Blogs_footer is DISPLAYED or not
						boolean res38 = Blogs_footer.isDisplayed();

						if (res38 == true) {
							System.out.println("Blogs_footer is DISPLAYED");
						} else {
							System.out.println("Blogs_footer is not DISPLAYED");
						}
						Thread.sleep(1000);

						// --------------------------------------------------------------------------------------------------------------------

						// locate FAQ1
						WebElement FAQ1 = driver.findElement(
								By.xpath("//div[@id='__next']//footer//div//div//div//div//div//div//div//a[normalize-space()='FAQ']"));
						Thread.sleep(1000);

						// to highlight the FAQ1
						JavascriptExecutor jse59 = (JavascriptExecutor) driver;
						jse59.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", FAQ1);

						// FAQ1 is DISPLAYED or not
						boolean res39 = FAQ1.isDisplayed();

						if (res39 == true) {
							System.out.println("FAQ1 is DISPLAYED");
						} else {
							System.out.println("FAQ1 is not DISPLAYED");
						}
						Thread.sleep(1000);
						Thread.sleep(2000);

						// --------------------------------------------------------------------------------------------------------------------

						// locate Legal
						WebElement Legal = driver.findElement(By.xpath("//div[normalize-space()='Legal']"));
						Thread.sleep(1000);

						// to highlight the Legal
						JavascriptExecutor jse60 = (JavascriptExecutor) driver;
						jse60.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Legal);

						// Legal is DISPLAYED or not
						boolean res40 = Legal.isDisplayed();

						if (res40 == true) {
							System.out.println("Legal is DISPLAYED");
						} else {
							System.out.println("Legal is not DISPLAYED");
						}
						Thread.sleep(1000);

						// --------------------------------------------------------------------------------------------------------------------

						// locate Terms11
						WebElement Terms11 = driver.findElement(By.xpath("//a[normalize-space()='Terms']"));
						Thread.sleep(1000);

						// to highlight the Terms11
						JavascriptExecutor jse61 = (JavascriptExecutor) driver;
						jse61.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Terms11);

						// Terms is DISPLAYED or not
						boolean res41 = Terms11.isDisplayed();

						if (res41 == true) {
							System.out.println("Terms11 is DISPLAYED");
						} else {
							System.out.println("Terms11 is not DISPLAYED");
						}

						Thread.sleep(1000);

						// --------------------------------------------------------------------------------------------------------------------

						// locate Privacy
						WebElement Privacy = driver.findElement(By.xpath("//a[normalize-space()='Privacy']"));
						Thread.sleep(1000);

						// to highlight the Privacy
						JavascriptExecutor jse62 = (JavascriptExecutor) driver;
						jse62.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", Privacy);

						// Privacy is DISPLAYED or not
						boolean res42 = Privacy.isDisplayed();

						if (res42 == true) {
							System.out.println("Privacy is DISPLAYED");
						} else {
							System.out.println("Privacy is not DISPLAYED");
						}
						Thread.sleep(1000);

						// ---------------------------------------------------------------------------------------------------------

						// locate All_Rights_Reserved
						WebElement All_Rights_Reserved = driver
								.findElement(By.xpath("//div[contains(text(),'© 2023 Digitali Technology Solutions Ltd. All righ')]"));
						Thread.sleep(1000);

						// to highlight the All_Rights_Reserved
						JavascriptExecutor jse63 = (JavascriptExecutor) driver;
						jse63.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
								All_Rights_Reserved);

						// All_Rights_Reserved is DISPLAYED or not
						boolean res43 = All_Rights_Reserved.isDisplayed();

						if (res43 == true) {
							System.out.println("All_Rights_Reserved is DISPLAYED");
						} else {
							System.out.println("All_Rights_Reserved is not DISPLAYED");
						}
						Thread.sleep(1000);

						// -----------------------------------------------------------------------------------------------------------------

						// locate Twitter_Icon
						WebElement Twitter_Icon = driver.findElement(
								By.xpath("//body/div[@id='__next']/footer[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/a[1]/*[1]"));
						Thread.sleep(1000);

						// to highlight the Twitter_Icon
						JavascriptExecutor jse64 = (JavascriptExecutor) driver;
						jse64.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
								Twitter_Icon);

						// Twitter_Icon is DISPLAYED or not
						boolean res44 = All_Rights_Reserved.isDisplayed();

						if (res44 == true) {
							System.out.println("Twitter_Icon is DISPLAYED");
						} else {
							System.out.println("Twitter_Icon is not DISPLAYED");
						}

						Thread.sleep(1000);

						// -----------------------------------------------------------------------------------------------------------------

						// locate Discord_Icon
						WebElement Discord_Icon = driver.findElement(
								By.xpath("//body/div[@id='__next']/footer[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/a[1]/*[1]"));
						Thread.sleep(1000);

						// to highlight the Discord_Icon
						JavascriptExecutor jse65 = (JavascriptExecutor) driver;
						jse65.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')",
								Discord_Icon);

						// Discord_Icon is DISPLAYED or not
						boolean res45 = Discord_Icon.isDisplayed();

						if (res45 == true) {
							System.out.println("Discord_Icon is DISPLAYED");
						} else {
							System.out.println("Discord_Icon is not DISPLAYED");
						}
						Thread.sleep(1000);

						driver.close();
						driver.quit();

		
	}
	@AfterMethod
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
