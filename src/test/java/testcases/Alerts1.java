package testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alerts1 {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome to Alerts Validation");
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);

        driver.get("https://demo.guru99.com/test/delete_customer.php");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("432561");
        driver.findElement(By.xpath("//input[@name='submit']")).click();
        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        System.out.println("Alert3 Text Message is "+text);
        alert.accept();
        Thread.sleep(5000);
        alert.accept();


    }
}
