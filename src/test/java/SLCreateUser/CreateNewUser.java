package SLCreateUser;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertTrue;

public class CreateNewUser {

    @Test
    public void CreateUser1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/windows10/ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 15);
        driver.manage().window().maximize();

        driver.get("https://smartlifepath-client-qa.herokuapp.com/web-site/home");
        driver.findElement(By.xpath("/html/body/app-root/section/app-slp-website/section/app-home/div/div/section[1]/div/div[2]/div[2]/div/mat-tab-group/mat-tab-header/div[2]/div/div/div[2]/div")).click(); //click Sign Up button

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/app-root/section/app-slp-website/section/app-home/div/div/section[1]/div/div[2]/div[2]/div/mat-tab-group/div/mat-tab-body[2]/div/form/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/input")));
        driver.findElement(By.xpath("/html/body/app-root/section/app-slp-website/section/app-home/div/div/section[1]/div/div[2]/div[2]/div/mat-tab-group/div/mat-tab-body[2]/div/form/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Test_protonmail"); //enter name
        driver.findElement(By.xpath("/html/body/app-root/section/app-slp-website/section/app-home/div/div/section[1]/div/div[2]/div[2]/div/mat-tab-group/div/mat-tab-body[2]/div/form/div[2]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Tesst_121212@protonmail.com"); //enter email
        driver.findElement(By.xpath("/html/body/app-root/section/app-slp-website/section/app-home/div/div/section[1]/div/div[2]/div[2]/div/mat-tab-group/div/mat-tab-body[2]/div/form/div[3]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("KT100NE"); //enter postcode
        driver.findElement(By.xpath("/html/body/app-root/section/app-slp-website/section/app-home/div/div/section[1]/div/div[2]/div[2]/div/mat-tab-group/div/mat-tab-body[2]/div/form/div[4]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Qwerty123"); //enter password
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/app-root/section/app-slp-website/section/app-home/div/div/section[1]/div/div[2]/div[2]/div/mat-tab-group/div/mat-tab-body[2]/div/form/div[5]/div/button/span")).click(); //click Sign Up button

        assertTrue(driver.findElement(By.xpath("/html/body/app-root/section/app-slp-platform/section/app-slp-my-stream/div/div[2]/slp-todo/div/div/div[1]")).getText().contains("Getting Started"));


    }

    @Test
    public void CreateUser2() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/windows10/ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 15);
        driver.manage().window().maximize();

        driver.get("https://smartlifepath-client-qa.herokuapp.com/web-site/home");
        driver.findElement(By.xpath("/html/body/app-root/section/app-slp-website/section/app-home/div/div/section[1]/div/div[2]/div[2]/div/mat-tab-group/mat-tab-header/div[2]/div/div/div[2]/div")).click(); //click Sign Up button

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/app-root/section/app-slp-website/section/app-home/div/div/section[1]/div/div[2]/div[2]/div/mat-tab-group/div/mat-tab-body[2]/div/form/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/input")));
        driver.findElement(By.xpath("/html/body/app-root/section/app-slp-website/section/app-home/div/div/section[1]/div/div[2]/div[2]/div/mat-tab-group/div/mat-tab-body[2]/div/form/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Test_protonmail"); //enter name
        driver.findElement(By.xpath("/html/body/app-root/section/app-slp-website/section/app-home/div/div/section[1]/div/div[2]/div[2]/div/mat-tab-group/div/mat-tab-body[2]/div/form/div[2]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Tesst_121212@protonmail.com"); //enter email
        driver.findElement(By.xpath("/html/body/app-root/section/app-slp-website/section/app-home/div/div/section[1]/div/div[2]/div[2]/div/mat-tab-group/div/mat-tab-body[2]/div/form/div[3]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("KT100NE"); //enter postcode
        driver.findElement(By.xpath("/html/body/app-root/section/app-slp-website/section/app-home/div/div/section[1]/div/div[2]/div[2]/div/mat-tab-group/div/mat-tab-body[2]/div/form/div[4]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Qwerty123"); //enter password
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/app-root/section/app-slp-website/section/app-home/div/div/section[1]/div/div[2]/div[2]/div/mat-tab-group/div/mat-tab-body[2]/div/form/div[5]/div/button/span")).click(); //click Sign Up button

        assertTrue(driver.findElement(By.xpath("/html/body/app-root/section/app-slp-platform/section/app-slp-my-stream/div/div[2]/slp-todo/div/div/div[1]")).getText().contains("Getting Started"));

        driver.quit();

    }

}
