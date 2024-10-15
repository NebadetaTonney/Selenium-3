package xpath16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath {

    public static void main(String[] args) {
    	
        // Setup WebDriver for Chrome
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // URL of the login page
        String url = "https://www.saucedemo.com/";
        driver.get(url);
        driver.manage().window().maximize();

        // Username and password
        String username = "standard_user";
        String password = "secret_sauce"; 
        
        try {
            // Locate the username and password fields
            WebElement usernameField = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input"));
            WebElement passwordField = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[2]/input"));
            
            // Enter the username and password
            usernameField.sendKeys(username);
            passwordField.sendKeys(password);
            
            // Wait for 3 seconds
            Thread.sleep(3000);
            
            // Locate and click the login button
            WebElement loginButton = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input"));
            loginButton.click();
            
            // Wait for 3 seconds
            Thread.sleep(3000);
            
            // Locate and click the add to cart button
            WebElement addtocartbutton = driver.findElement(By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]"));
            addtocartbutton.click();
            
            // Wait for 3 seconds
            Thread.sleep(3000);
            
            // Locate and click the cart button
            WebElement cartbutton = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a"));
            cartbutton.click();
            
            // Wait for 3 seconds
            Thread.sleep(3000);
            
            // Locate and click the checkout button
            WebElement checkoutbutton  = driver.findElement(By.xpath("//*[@id=\"checkout\"]"));
            checkoutbutton.click();
            
            // Wait for 3 seconds
            Thread.sleep(3000);
            
            // Firstname, Lastname and Zipcode
            String firstname = "Nebadeta";
            String lastname = "Tonney";
            int zipcode = 2100;
            String number = Integer.toString(zipcode);
            
            // Filling information and continue button
            WebElement firstnamefield  = driver.findElement(By.xpath("//*[@id=\"first-name\"]"));
            WebElement lastnamefield  = driver.findElement(By.xpath("//*[@id=\"last-name\"]"));
            WebElement zipcodefield  = driver.findElement(By.xpath("//*[@id=\"postal-code\"]"));
            firstnamefield.sendKeys(firstname);
            lastnamefield.sendKeys(lastname);
            zipcodefield.sendKeys(number);
            
            // Wait for 3 seconds
            Thread.sleep(3000);
            
            WebElement continuebutton  = driver.findElement(By.xpath("//*[@id=\"continue\"]"));
            continuebutton.click();
            
            // Wait for 3 seconds
            Thread.sleep(3000);
            
            // Clicking finish button
            WebElement finishbutton  = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div[9]/button[2]"));
            finishbutton.click();
            
            // Wait for 3 seconds
            Thread.sleep(3000);
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Optional: close the browser
           driver.quit();
        }
    }
}
