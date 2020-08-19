package SLCreateUser;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class TestDeleteUserProfile {

    @Test
    public void TestDeleteProfile() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/windows10/ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 15);
        driver.manage().window().maximize();

        driver.get("https://smartlifepath-client-qa.herokuapp.com/home");
        driver.findElement(By.xpath("/html/body/app-root/section/app-slp-website/section/app-home/div/div/section[1]/div/div[2]/div[2]/div/mat-tab-group/mat-tab-header/div[2]/div/div/div[2]/div")).click(); //click Sign Up button

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/app-root/section/app-slp-website/section/app-home/div/div/section[1]/div/div[2]/div[2]/div/mat-tab-group/div/mat-tab-body[2]/div/form/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/input")));
        driver.findElement(By.xpath("/html/body/app-root/section/app-slp-website/section/app-home/div/div/section[1]/div/div[2]/div[2]/div/mat-tab-group/div/mat-tab-body[2]/div/form/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Test12"); //enter name
        driver.findElement(By.xpath("/html/body/app-root/section/app-slp-website/section/app-home/div/div/section[1]/div/div[2]/div[2]/div/mat-tab-group/div/mat-tab-body[2]/div/form/div[2]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("123456@gmail.com"); //enter email
        driver.findElement(By.xpath("/html/body/app-root/section/app-slp-website/section/app-home/div/div/section[1]/div/div[2]/div[2]/div/mat-tab-group/div/mat-tab-body[2]/div/form/div[3]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("KT100NE"); //enter postcode
        driver.findElement(By.xpath("/html/body/app-root/section/app-slp-website/section/app-home/div/div/section[1]/div/div[2]/div[2]/div/mat-tab-group/div/mat-tab-body[2]/div/form/div[4]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Qwerty123"); //enter password
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/app-root/section/app-slp-website/section/app-home/div/div/section[1]/div/div[2]/div[2]/div/mat-tab-group/div/mat-tab-body[2]/div/form/div[5]/div/button/span")).click(); //click Sign Up button

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/app-root/section/app-slp-platform/section/app-slp-my-stream/div/slp-stream-header/div/slp-avatar/div")));
        assertTrue(driver.findElement(By.xpath("/html/body/app-root/section/app-slp-platform/section/app-slp-my-stream/div/slp-getting-started/div/div[1]/h4")).getText().contains("Lets get your started. What do you want to do?"));

        //Open Profile Menu

        driver.findElement(By.xpath("/html/body/app-root/section/app-slp-platform/section/app-slp-header/div/div[2]/div[9]")).click();
        wait.until((ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"mat-menu-panel-7\"]/div/button[1]"))));
        driver.findElement(By.xpath("//*[@id=\"mat-menu-panel-7\"]/div/button[1]")).click();

        //Open Account Menu and Delete Profile

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"mat-tab-content-2-0\"]/div/div/form[1]/div[3]/button[1]/span")));
        driver.findElement(By.xpath("//*[@id=\"mat-tab-content-2-0\"]/div/div/form[1]/div[3]/button[1]/span")).click();
        Thread.sleep(3000);

        //Accept pop-up window

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"mat-dialog-0\"]/slp-confirm-dialog/slp-dialog-wrapper/div[2]/div[2]/button[2]/span")));
        driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/slp-confirm-dialog/slp-dialog-wrapper/div[2]/div[2]/button[2]/span")).click();

    }
}