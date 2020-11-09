import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ICanWin {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://pastebin.com");
        WebElement newPasteInput = driver.findElement(By.id("postform-text"));
        newPasteInput.sendKeys("Hello from WebDriver");

        WebElement pasteExpirationSelector = driver.findElement(By.xpath("//*[@id='select2-postform-expiration-container'] [text()='Never']"));
        pasteExpirationSelector.click();

        WebElement pasteExpirationButton = driver.findElement(By.xpath("//*[@class='select2-results__option'][text()='10 Minutes']"));
        pasteExpirationButton.click();

        WebElement pasteNameInput = driver.findElement(By.id("postform-name"));
        pasteNameInput.sendKeys("helloweb");

        WebElement createNewPasteButton = driver.findElement(By.xpath("//*[@id='w0']/div[5]/div[1]/div[8]/button"));
        createNewPasteButton.click();

        Thread.sleep(10000);
        driver.quit();
    }
}
