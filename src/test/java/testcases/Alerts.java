package testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alerts {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome to Alerts Validation");
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);

        driver.get("https://www.lambdatest.com/selenium-playground/javascript-alert-box-demo");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//body/div[@id='__next']/section[3]/div[1]/div[1]/div[2]/div[1]/button[1]")).click();
        Alert alert1 = driver.switchTo().alert();
        String text1 = alert1.getText();
        System.out.println("Alert1 Text Message is "+text1);
        Thread.sleep(3000);
        alert1.accept();

        driver.findElement(By.xpath("//body/div[@id='__next']/section[3]/div[1]/div[1]/div[2]/div[2]/div[2]/p[3]/button[1]")).click();
        Alert alert2 = driver.switchTo().alert();
        String text2 = alert2.getText();
        System.out.println("Alert2 Text Message is "+text2);
        Thread.sleep(3000);
        alert2.dismiss();

        driver.findElement(By.xpath("//body/div[@id='__next']/section[3]/div[1]/div[1]/div[2]/div[2]/div[2]/p[3]/button[1]")).click();
        Alert alert3 = driver.switchTo().alert();
        String text3 = alert3.getText();
        System.out.println("Alert3 Text Message is "+text3);
        Thread.sleep(3000);
        alert3.sendKeys("Alerts Validation");
        Thread.sleep(3000);
        alert3.accept();



    }


}
