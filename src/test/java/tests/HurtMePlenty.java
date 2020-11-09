package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HurtMePlenty {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://cloud.google.com/");
        // risky point here
        new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.devsite-search-container")));


        WebElement searchButton = driver.findElement(By.cssSelector("div.devsite-search-container"));
        searchButton.click();

        WebElement searchInput = driver.findElement(By.xpath("//*[@class='devsite-search-field devsite-search-query']"));
        searchInput.sendKeys("Google Cloud Platform Pricing Calculator");
        searchInput.sendKeys(Keys.ENTER);

        driver.navigate().to("https://cloud.google.com/products/calculator");
        // risky point here
        new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='input-0']")));
        WebElement input = waitForElementLocatedBy(driver, By.xpath("//*[@id='input-0']"));
        input.click();


        WebElement computeEngine= driver.findElement(By.xpath("//span[@class='highlight'][text()='Compute Engine']"));
        computeEngine.click();

        WebElement numberOfInstances = driver.findElement(By.xpath("//*[@id='input_61' and @name='quantity']"));
        numberOfInstances.click();
        numberOfInstances.sendKeys(("4"));

        WebElement machineType = driver.findElement(By.xpath("//*[@id='select_value_label_58']"));
        machineType.click();
        WebElement machineTypeSelected = driver.findElement(By.xpath("//*[@id='select_option_232']"));
        machineTypeSelected.click();

        WebElement  checkboxAddGPUs = driver.findElement(By.xpath("//*[@class='ng-valid ng-touched ng-dirty ng-valid-parse ng-empty']"));
        checkboxAddGPUs.click();

        WebElement  numberOfGPUs = driver.findElement(By.xpath("//*[@id='select_value_label_350']"));
        numberOfGPUs.click();

        WebElement  numberOfGPUsSelected = driver.findElement(By.xpath("//*[@id='select_option_356']"));
        numberOfGPUsSelected.click();

        WebElement  typeOfGPUs = driver.findElement(By.xpath("//*[@id='select_value_label_351']"));
        typeOfGPUs.click();

        WebElement  typeOfGPUsSelected = driver.findElement(By.xpath("//*[@id='select_option_362']"));
        typeOfGPUsSelected.click();

        WebElement  localSSD = driver.findElement(By.xpath("//*[@id='select_value_label_99']"));
        localSSD.click();

        WebElement  localSSDSelected = driver.findElement(By.xpath("//*[@id='select_option_114']"));
        localSSDSelected.click();

        WebElement  datacenterLocation= driver.findElement(By.xpath("//*[@id='select_value_label_100']"));
        datacenterLocation.click();

        WebElement  datacenterLocationSelected = driver.findElement(By.xpath("//*[@id='select_option_255']"));
        datacenterLocationSelected.click();

        WebElement  commitedUsage = driver.findElement(By.xpath("//*[@id='select_value_label_101']"));
        commitedUsage.click();

        WebElement  commitedUsageSelected = driver.findElement(By.xpath("//*[@id='select_option_121']"));
        commitedUsageSelected.click();

        WebElement  addToEstimate = driver.findElement(By.xpath("//*[@class='main-content layout-padding ng-scope layout-column'][@layout='column']"));
        addToEstimate.click();

        Thread.sleep(10000);
        driver.quit();
    }

    private static WebElement waitForElementLocatedBy(WebDriver driver, By by) {
        return (WebElement) new WebDriverWait(driver,10);
    }
}