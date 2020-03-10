import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","chromedriver");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://www.veroxos.com/";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        driver.findElements(By.linkText("Contact")).get(0).click();
        driver.findElement(By.id("form-field-name")).sendKeys("Nathan Liu");
        driver.findElement(By.id("form-field-email")).sendKeys("hello@outlook.com");
        driver.findElement(By.id("form-field-phone")).sendKeys("123456789");
        driver.findElement(By.id("form-field-organisation")).sendKeys("Veroxos");
        driver.findElement(By.id("form-field-message")).sendKeys("Hello 123");
        
        //close Fire fox
        driver.close();

    }

}