package SLCreateUser;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class TestCartActions {
    @Test
    public void CreateEvent() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/windows10/ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        driver.manage().window().maximize();

        driver.get("https://smartlifepath-client-qa.herokuapp.com/web-site/home");
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/app-root/section/app-slp-website/section/app-home/div/div/section[1]/div/div[2]/div[2]/div/mat-tab-group/div/mat-tab-body[1]/div/form/div[1]/div/mat-form-field/div/div[1]/div[3]/input")));
        driver.findElement(By.xpath("/html/body/app-root/section/app-slp-website/section/app-home/div/div/section[1]/div/div[2]/div[2]/div/mat-tab-group/div/mat-tab-body[1]/div/form/div[1]/div/mat-form-field/div/div[1]/div[3]/input")).sendKeys("test1234567898711@yahoo.com"); // enter Email
        driver.findElement(By.xpath("/html/body/app-root/section/app-slp-website/section/app-home/div/div/section[1]/div/div[2]/div[2]/div/mat-tab-group/div/mat-tab-body[1]/div/form/div[2]/div/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Qwerty123"); // enter password
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/app-root/section/app-slp-website/section/app-home/div/div/section[1]/div/div[2]/div[2]/div/mat-tab-group/div/mat-tab-body[1]/div/form/div[3]/div/button/span")).click(); // click to Login button

        //Open Find menu

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/app-root/section/app-slp-platform/section/app-slp-header/div/div[2]/button[3]/span")));
        driver.findElement(By.xpath("//*[contains(text(),' Find ')]")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Market Place ')]")));
        driver.findElement(By.xpath("//button[contains(text(),'Market Place ')]")).click();

        //Enter location
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"mat-input-0\"]")));
        driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys(Keys.DOWN);
        driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);

        //Select the product
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/app-root/section/app-slp-platform/section/ng-component/section/slp-store-search-results/section/div/div[2]/div/slp-product-card[3]/div/div[2]/h6")));
        driver.findElement(By.xpath("/html/body/app-root/section/app-slp-platform/section/ng-component/section/slp-store-search-results/section/div/div[2]/div/slp-product-card[3]/div/div[2]/div[2]/mat-icon")).click(); //add product 1
        Thread.sleep(500);
        driver.findElement(By.xpath("/html/body/app-root/section/app-slp-platform/section/ng-component/section/slp-store-search-results/section/div/div[2]/div/slp-product-card[4]/div/div[2]/div[2]/mat-icon")).click(); //add product 2
        Thread.sleep(500);

        // Go to Cart
        driver.findElement(By.xpath("/html/body/app-root/section/app-slp-platform/section/app-slp-header/div/div[2]/a[1]/span/mat-icon")).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"mat-select-9\"]/div/div[2]")));
        driver.findElement(By.xpath("//*[@id=\"mat-select-9\"]/div/div[2]")).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"mat-option-1386\"]/span"))); //edit the quantity of the product
        driver.findElement(By.xpath("//*[@id=\"mat-option-1386\"]/span")).click(); // edit the quantity of the product
        assertTrue(driver.findElement(By.xpath("//*[@id=\"mat-select-12\"]/div/div[1]/span/span")).getText().contains("3"));
        driver.findElement(By.xpath("/html/body/app-root/section/app-slp-platform/section/slp-cart/div/div/div[1]/slp-product-in-cart[2]/div/div[2]/div[1]/div[2]/a/span")).click(); // delete product #2
        Thread.sleep(500);
        driver.findElement(By.xpath("/html/body/app-root/section/app-slp-platform/section/slp-cart/div/div/div[2]/button/span")).click(); // click to Proceed to Checkout button

        Thread.sleep(1500);

        // Continue to Payment
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/app-root/section/app-slp-platform/section/slp-checkout/div/div[2]/div[1]/mat-horizontal-stepper/div[2]/div[1]/slp-checkout-shipping/div/button")));
        driver.findElement(By.xpath("/html/body/app-root/section/app-slp-platform/section/slp-checkout/div/div[2]/div[1]/mat-horizontal-stepper/div[2]/div[1]/slp-checkout-shipping/div/button")).click();

        // REVIEW YOUR ORDER
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"cdk-step-content-1-1\"]/slp-checkout-payment/div/div[3]/button[2]/span")));
        driver.findElement(By.xpath("//*[@id=\"cdk-step-content-1-1\"]/slp-checkout-payment/div/div[3]/button[2]/span")).click();

        //  CHECKOUT
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/app-root/section/app-slp-platform/section/slp-checkout/div/div[2]/div[2]/button/span")));
        driver.findElement(By.xpath("/html/body/app-root/section/app-slp-platform/section/slp-checkout/div/div[2]/div[2]/button/span")).click();
        assertTrue(driver.findElement(By.xpath("//*[@id=\"cdk-step-content-1-2\"]/slp-checkout-review/div/h1")).getText().contains("Thank you for your contribution"));

        driver.quit();


    }
}