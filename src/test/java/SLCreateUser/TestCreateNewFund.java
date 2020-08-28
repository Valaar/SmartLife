package SLCreateUser;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class TestCreateNewFund {

    @Test
    public void CreateEvent() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/windows10/ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        driver.manage().window().maximize();

        driver.get("https://smartlifepath-client-qa.herokuapp.com/web-site/home");
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/app-root/section/app-slp-website/section/app-home/div/div/section[1]/div/div[2]/div[2]/div/mat-tab-group/div/mat-tab-body[1]/div/form/div[1]/div/mat-form-field/div/div[1]/div[3]/input")));
        driver.findElement(By.xpath("/html/body/app-root/section/app-slp-website/section/app-home/div/div/section[1]/div/div[2]/div[2]/div/mat-tab-group/div/mat-tab-body[1]/div/form/div[1]/div/mat-form-field/div/div[1]/div[3]/input")).sendKeys("polezniybess@gmail.com"); // enter Email
        driver.findElement(By.xpath("/html/body/app-root/section/app-slp-website/section/app-home/div/div/section[1]/div/div[2]/div[2]/div/mat-tab-group/div/mat-tab-body[1]/div/form/div[2]/div/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Qwerty123"); // enter password
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/app-root/section/app-slp-website/section/app-home/div/div/section[1]/div/div[2]/div[2]/div/mat-tab-group/div/mat-tab-body[1]/div/form/div[3]/div/button/span")).click(); // click to Login button


        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/app-root/section/app-slp-platform/section/app-slp-header/div/div[2]/button[3]/span")));
        driver.findElement(By.xpath("//*[contains(text(),'Create')]")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Fund ')]")));
        driver.findElement(By.xpath("//button[contains(text(),'Fund ')]")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class = 'images']/div[contains(@style, 'charity')]"))); //add image
        driver.findElement(By.xpath("//div[@class = 'images']/div[contains(@style, 'charity')]")).click(); //logo

        driver.findElement(By.xpath("//*[@id=\"mat-button-toggle-2-button\"]/div")).click(); // click to Public

        driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("Autotest Fund"); // enter name Fund

        driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-0\"]/form/slp-category-tree-pills/div/div[1]/input")).click(); // select category
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[contains(text(),'Faith')]")));
        //Thread.sleep(2000);
        driver.findElement(By.xpath("//*[contains(text(),'Faith')]")).click();
        driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).click();

        driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("test test test test test test test test test test test test test test test test test test "); // add Description

        driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-0\"]/form/div[4]/button/span")).click(); // click to Next button
/*
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-create-fund-dialog/div/mat-horizontal-stepper/div[2]/div[2]/form/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/mat-datepicker-toggle/button")));
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-create-fund-dialog/div/mat-horizontal-stepper/div[2]/div[2]/form/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/mat-datepicker-toggle/button")).click(); // open Calendar
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"mat-datepicker-1\"]/div/mat-month-view/table/tbody/tr[6]/td[2]/div")));
        driver.findElement(By.xpath("//*[@id=\"mat-datepicker-1\"]/div/mat-month-view/table/tbody/tr[6]/td[2]/div")).click(); // select date
*/
        driver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys("5"); // select Goal amount

        driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-1\"]/form/div[5]/button[2]/span")).click(); // click Save the Draft button

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/app-root/section/app-slp-platform/section/slp-fund/div/div/div/div[2]/div[2]/div[1]/button[1]/span")));
        assertTrue(driver.findElement(By.xpath("/html/body/app-root/section/app-slp-platform/section/slp-fund/div/div/div/div[2]/div[2]/div[2]/div[1]")).getText().contains("Autotest Fund"));



    }
}

//*[contains(text(),'Faith')]