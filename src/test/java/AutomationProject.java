/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Tiff's PC
 */
public class AutomationProject {

    private String h1;
    
    public AutomationProject() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void accountCreation() throws InterruptedException{
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();    
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.get("http://www.target.com");
    driver.findElement(By.partialLinkText("Sign in")).click();
    driver.findElement(By.partialLinkText("Create Account")).click();
    driver.findElement(By.id("username")).sendKeys("tiffq6890@btpartners.com");
    driver.findElement(By.id("firstname")).sendKeys("automation");
    driver.findElement(By.id("lastname")).sendKeys("project");
    driver.findElement(By.id("phone")).sendKeys("3145411924");
    driver.findElement(By.id("password")).sendKeys("Automationproject");
    driver.findElement(By.id("createAccount")).click();
    Thread.sleep(2000);
    driver.close();
    }
    
    
    @Test
    public void accountSignin() throws InterruptedException{
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();    
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.navigate().to("http://www.target.com");
    driver.navigate().to("http://www.bestbuy.com");
    driver.navigate().back();
    driver.findElement(By.partialLinkText("Sign in")).click();
    Thread.sleep(500);
    driver.findElement(By.id("listaccountNav-signIn")).click();
    driver.findElement(By.id("username")).sendKeys("tiffq6890@gmail.com");
    driver.findElement(By.id("password")).sendKeys("Bubblegum4321");
    driver.findElement(By.id("login")).click();
    Thread.sleep(3500);
    driver.close();

    
    }
    
    public class SearchBarTestAutomation {

    ChromeDriver driver;

    @BeforeEach
    public void initializeWebDriver() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");

        System.out.println("STEP-1 : Open new browser window.");
        driver = new ChromeDriver();

        System.out.println("STEP-2 : Enter http://www.target.com in the browser address bar.");
        driver.get("http://www.target.com");
    }
   
    @Test
    public void testSearchBarUsingProductName() {
        System.out.println("STEP-3 : Enter â€œiphone 13 proâ€ in the search bar");
        WebElement searchBar = driver.findElement(By.id("search"));
        searchBar.sendKeys("iphone 13 pro");
        System.out.println("STEP-4 : Click search icon");
        WebElement searchIcon = driver.findElement(By.className("SearchButtons__SearchButton-sc-sj12sv-1"));
        searchIcon.click();
        //wait for the elements to load
        WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@aria-label='Apple iPhone 13 Pro']")));
        System.out.println("STEP-5 :Verify page shows results containing at least one iphone 13 pro");
        List<WebElement> elements = driver.findElements(By.xpath("//*[@aria-label='Apple iPhone 13 Pro']"));
        Assertions.assertTrue(elements.size() > 0, "No result shown that matches search");
    }
    
     @Test
    public void testSearchBarUsingProductUPC() {

        System.out.println("STEP-3 : Enter UPC Number in search bar");
        WebElement searchBar = driver.findElement(By.id("search"));
        searchBar.sendKeys("194253118831");
        System.out.println("STEP-4 : Click search icon");
        WebElement searchIcon = driver.findElement(By.className("SearchButtons__SearchButton-sc-sj12sv-1"));
        searchIcon.click();
        System.out.println("STEP-5 Verify that search result shows a product matching UPC number");
        //wait for the elements to load
        WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@aria-label='Apple iPhone 13 Pro']")));
        List<WebElement> elements = driver.findElements(By.xpath("//*[@aria-label='Apple iPhone 13 Pro']"));
        Assertions.assertTrue(elements.size() == 1, "No result shown that matches search");

    }

    

    @AfterEach
    public void cleanWebdriver() {
        driver.close();
    }

}

   
        
    }
