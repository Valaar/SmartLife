package SLCreateUser;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

import static org.junit.Assert.assertTrue;

public class FriendRequestAndMessage {

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

        driver.findElement(By.xpath("/html/body/app-root/section/app-slp-platform/section/app-slp-header/div/div[2]/button[1]/span/mat-icon[2]")).click(); //open Find Menu
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/button[6]")).click(); //find friends
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/div/div[2]/div/mat-dialog-container/slp-find-friends/slp-dialog-wrapper/div[2]/div[1]/mat-form-field/div/div[1]/div[4]/input")));
        driver.findElement(By.xpath("/html/body/div/div[2]/div/mat-dialog-container/slp-find-friends/slp-dialog-wrapper/div[2]/div[1]/mat-form-field/div/div[1]/div[4]/input")).sendKeys("tester09876543210@yahoo.com"); //enter email friend
        Thread.sleep(500);
        driver.findElement(By.xpath("/html/body/div/div[2]/div/mat-dialog-container/slp-find-friends/slp-dialog-wrapper/div[2]/div[1]/mat-form-field/div/div[1]/div[5]/button/span")).click(); //click Search button
        Thread.sleep(500);
        driver.findElement(By.xpath("/html/body/div/div[2]/div/mat-dialog-container/slp-find-friends/slp-dialog-wrapper/div[2]/button/span")).click(); //click Send button
        Thread.sleep(500);
        assertTrue(driver.findElement(By.xpath("/html/body/app-root/section/app-slp-platform/section/app-slp-my-stream/div/div[2]/slp-todo/div/div/div[1]")).getText().contains("Getting Started"));


    }

    @Test

    public void LogInUser2() throws InterruptedException {

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

        driver.findElement(By.xpath("/html/body/app-root/section/app-slp-platform/section/app-slp-header/div/div[2]/a[2]/span/mat-icon")).click(); //open friends list
        Thread.sleep(500);
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/slp-friend-list/div[1]/div/div/span[1]")).click(); //accept request
        Thread.sleep(500);
        driver.findElement(By.xpath("/html/body/app-root/section/app-slp-platform/section/app-slp-header/div/div[2]/a[2]/span/mat-icon")).click(); //open friends list
        Thread.sleep(500);
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/slp-friend-list/div[1]/div/div/div[2]/div[2]/span")).click(); //ckick to Direct message
        Thread.sleep(500);
        driver.findElement(By.xpath("/html/body/div/div[2]/div/mat-dialog-container/slp-send-message-dialog/slp-dialog-wrapper/div[2]/div/div[3]/div/textarea")).sendKeys("Test message"); //message
        driver.findElement(By.xpath("/html/body/div/div[2]/div/mat-dialog-container/slp-send-message-dialog/slp-dialog-wrapper/div[3]/div/button/span")).click(); //click Send button

        driver.quit();


    }

}
