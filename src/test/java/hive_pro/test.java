package hive_pro;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

public class test {
    private WebDriver driver;

    @Test
    public void test1() throws InterruptedException {

    	System.setProperty("webdriver.edge.driver","C:\\Users\\praka\\Downloads\\edgedriver_win64 (3)\\msedgedriver.exe");
    	//"C:\Users\praka\Downloads\edgedriver_win64 (3)\msedgedriver.exe"

        driver = new EdgeDriver();

        driver.get("https://www.hivepro.com/");

        driver.manage().window().maximize();
        
        driver.manage().deleteAllCookies();

        Thread.sleep(1000);

        WebElement logo = driver.findElement(By.xpath("//header/div[@id='page-header-inner']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]"));

        Thread.sleep(3000);

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", logo);

        
        Thread.sleep(3000);
        // Element is displayed or not
        boolean res = logo.isDisplayed();
        if (res) {
            System.out.println("digitali_logo is DISPLAYED");
        } else {
            System.out.println("digitali_logo is not DISPLAYED");
        }
    }
    
    @Test
    public void test2() throws InterruptedException {
    	
    	System.setProperty("webdriver.edge.driver","C:\\Users\\praka\\Downloads\\edgedriver_win64 (3)\\msedgedriver.exe");
    	//"C:\Users\praka\Downloads\edgedriver_win64 (3)\msedgedriver.exe"

        driver = new EdgeDriver();

        driver.get("https://www.hivepro.com/");

        driver.manage().window().maximize();
        
        driver.manage().deleteAllCookies();

        Thread.sleep(1000);

        WebElement dd = driver.findElement(By.xpath("//header/div[@id='page-header-inner']/div[1]/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[1]/a[1]/div[1]/span[2]"));

        Thread.sleep(3000);
        
      
        
        
        

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", dd);

        dd.click();
        
        Thread.sleep(3000);
        
        WebElement dd1 = driver.findElement(By.xpath("//li[@id='menu-item-15399']//span[@class='menu-item-title'][normalize-space()='Uni5 Xposure']"));
        
        Thread.sleep(3000);
        
        JavascriptExecutor jse1 = (JavascriptExecutor) driver;
        jse1.executeScript("arguments[0].setAttribute('style','background: red; border: 4px solid red;')", dd1);
        Thread.sleep(1000);
        
        dd1.click();
        // Element is displayed or not
        boolean res = dd.isDisplayed();
        if (res) {
            System.out.println("digitali_logo is DISPLAYED");
        } else {
            System.out.println("digitali_logo is not DISPLAYED");
        }
    }
    
    
    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
























      
    		     
       
       


