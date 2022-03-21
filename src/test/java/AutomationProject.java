/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
    
   
        
    }
