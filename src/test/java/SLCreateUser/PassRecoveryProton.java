package SLCreateUser;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

public class PassRecoveryProton {

    @Test

    public void PassRecovery() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/windows10/ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 15);
        driver.manage().window().maximize();

        driver.get("https://smartlifepath-client-qa.herokuapp.com/web-site/home");
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/app-root/section/app-slp-website/section/app-home/div/div/section[1]/div[2]/div[2]/div/mat-tab-group/div/mat-tab-body[1]/div/form/div[3]/div[1]/a")));
        driver.findElement(By.xpath("/html/body/app-root/section/app-slp-website/section/app-home/div/div/section[1]/div[2]/div[2]/div/mat-tab-group/div/mat-tab-body[1]/div/form/div[3]/div[1]/a")).click(); //click to Forgot password button

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/app-root/section/app-slp-website/section/app-reset-password/div/div/section/div/div[2]/div/div/form/input")));
        driver.findElement(By.xpath("/html/body/app-root/section/app-slp-website/section/app-reset-password/div/div/section/div/div[2]/div/div/form/input")).sendKeys("Tesst_121212@protonmail.com"); //enter email
        driver.findElement(By.xpath("/html/body/app-root/section/app-slp-website/section/app-reset-password/div/div/section/div/div[2]/div/div/form/button/span")).click(); // click to Reset password button

        ((JavascriptExecutor) driver).executeScript("window.open()");
        Thread.sleep(1000);
        ArrayList tabs2 = new ArrayList(driver.getWindowHandles()); //переключение по вкладкам
        driver.switchTo().window((String) tabs2.get(1));
        Thread.sleep(1000);

        // 2 Tabs

        driver.get("https://mail.protonmail.com/login");
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[@id=\"login_btn\"]")));
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Tesst_121212@protonmail.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Qwerty123Qwerty");
        driver.findElement(By.xpath("//button[@id=\"login_btn\"]")).click();
        Thread.sleep(5000);

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"pm_sidebar\"]")));
        driver.findElement(By.xpath("//*[@id=\"conversation-list-columns\"]/section/div[1]/div[2]/div[1]/h4/span[2]")).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"message0\"]/div[2]/div[3]/div/table/tbody/tr/td/table[2]/tbody/tr[3]/td/a")));
        driver.findElement(By.xpath("//*[@id=\"message0\"]/div[2]/div[3]/div/table/tbody/tr/td/table[2]/tbody/tr[3]/td/a")).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"secured-inbox-element\"]/div[1]/form/footer/a")));
        driver.findElement(By.xpath("//*[@id=\"secured-inbox-element\"]/div[1]/form/footer/a")).click();
        Thread.sleep(3000);


        ArrayList tabs3 = new ArrayList(driver.getWindowHandles()); //переключение по вкладкам
        driver.switchTo().window((String) tabs3.get(2));

        // 3 Tabs

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"mat-input-0\"]")));
        driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("Qwerty123Qwerty");
        driver.findElement(By.xpath("/html/body/app-root/section/app-slp-website/section/app-reset-password/div/div/section/div/div[2]/div/div/form/button/span")).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"mat-input-1\"]")));
        driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("Tesst_121212@protonmail.com");
        driver.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).sendKeys("Qwerty123Qwerty");
        driver.findElement(By.xpath("//*[@id=\"mat-tab-content-0-0\"]/div/form/div[3]/div[2]/button/span")).click();

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/app-root/section/app-slp-platform/section/app-slp-my-stream/div/slp-user-menu/div[2]/div/div[1]")));
        assertTrue(driver.findElement(By.xpath("/html/body/app-root/section/app-slp-platform/section/app-slp-my-stream/div/slp-user-menu/div[2]/div/div[1]")).getText().contains("Test_protonmail"));
    }
}
//*[@id="message3"]/div[2]/div[3]/div/table/tbody/tr/td/table[2]/tbody/tr[3]/td/a
//*[@id="message0"]/div[2]/div[3]/div/table/tbody/tr/td/table[2]/tbody/tr[3]/td/a