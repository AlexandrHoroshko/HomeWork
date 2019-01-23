package Driver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoTestGitHub {

    @Test
    public void testGitLogin() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://github.com/login");

        WebElement Password = driver.findElement(By.id("password"));
        WebElement Login = driver.findElement(By.cssSelector("#login_field"));


        Login.sendKeys("AlexandrHoroshko");
        Password.sendKeys("asdlkfj");


        Thread.sleep(5000);

        driver.close();
        driver.quit();
}


}
