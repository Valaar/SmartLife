package SLCreateUser;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class LoginUsers {
    /*
    @Test

    public void LogInUser1() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/windows10/ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 15);
        driver.manage().window().maximize();

        driver.get("https://smartlifepath-client-qa.herokuapp.com/web-site/home");
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/app-root/section/app-slp-website/section/app-home/div/div/section[1]/div/div[2]/div[2]/div/mat-tab-group/div/mat-tab-body[1]/div/form/div[1]/div/mat-form-field/div/div[1]/div[3]/input")));
        driver.findElement(By.xpath("/html/body/app-root/section/app-slp-website/section/app-home/div/div/section[1]/div/div[2]/div[2]/div/mat-tab-group/div/mat-tab-body[1]/div/form/div[1]/div/mat-form-field/div/div[1]/div[3]/input")).sendKeys("polezniybess@gmail.com"); //enter login
        driver.findElement(By.xpath("/html/body/app-root/section/app-slp-website/section/app-home/div/div/section[1]/div/div[2]/div[2]/div/mat-tab-group/div/mat-tab-body[1]/div/form/div[2]/div/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Qwerty123"); //enter password
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/app-root/section/app-slp-website/section/app-home/div/div/section[1]/div/div[2]/div[2]/div/mat-tab-group/div/mat-tab-body[1]/div/form/div[3]/div/button/span")).click(); //click LogIn button
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/app-root/section/app-slp-platform/section/app-slp-my-stream/div/div[2]/slp-todo/div/div/div[1]")));
        assertTrue(driver.findElement(By.xpath("/html/body/app-root/section/app-slp-platform/section/app-slp-my-stream/div/div[2]/slp-todo/div/div/div[1]")).getText().contains("Getting Started"));

        Thread.sleep(3000);

        driver.quit();

    }
*/
}
