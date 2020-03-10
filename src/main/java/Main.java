import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {


    public static void main(String[] args) {

        // set up web-driver
        System.setProperty("webdriver.chrome.driver","chromedriver");
        WebDriver driver = new ChromeDriver();

        // url
        String baseUrl = "https://www.veroxos.com/";

        // launch webdriver and direct it to the Base URL
        driver.get(baseUrl);

        // click on contact button
        driver.findElements(By.linkText("Contact")).get(0).click();

        // fill in form
        driver.findElement(By.id("form-field-name")).sendKeys("Nathan Liu");
        driver.findElement(By.id("form-field-email")).sendKeys("hello@outlook.com");
        driver.findElement(By.id("form-field-phone")).sendKeys("123456789");
        driver.findElement(By.id("form-field-organisation")).sendKeys("Veroxos");
        driver.findElement(By.id("form-field-message")).sendKeys("Hello 123");

        //close Fire fox
        driver.close();

    }

}