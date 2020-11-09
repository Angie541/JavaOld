package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class WebDriverSeleniumTest {

    @Test
    public void checkingForDetails() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://pastebin.com");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement newPasteInput = driver.findElement(By.id("postform-text"));
        newPasteInput.sendKeys("git config --global user.name  \"New Sheriff in Town\"\n"
                + "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" + "git push origin master --force");

        WebElement syntaxHighlightingDropdownMenu = driver
                .findElement(By.xpath("//*[@id='select2-postform-format-container'][text()='None']"));
        syntaxHighlightingDropdownMenu.click();

        WebElement syntaxHighlightingIsSelected = driver
                .findElement(By.xpath("//*[@class='select2-results__option'][text()='Bash']"));
        syntaxHighlightingIsSelected.click();

        WebElement pasteExpirationDropdownMenu = driver
                .findElement(By.xpath("//*[@id='select2-postform-expiration-container'][text()='Never']"));
        pasteExpirationDropdownMenu.click();

        WebElement pasteExpirationIsSelected = driver
                .findElement(By.xpath("//*[@class='select2-results__option'][text()='10 Minutes']"));
        pasteExpirationIsSelected.click();

        WebElement pasteNameInput = driver.findElement(By.id("postform-name"));
        pasteNameInput.sendKeys("how to gain dominance among developers");

        WebElement createNewPasteButton = driver.findElement(By.xpath("//*[@id='w0']/div[5]/div[1]/div[8]/button"));
        createNewPasteButton.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.navigate().to("https://pastebin.com/HPT5icpc");

        String extrasInTitle = " - Pastebin.com";
        String browserTitle = driver.getTitle();

        Assert.assertEquals(browserTitle, "how to gain dominance among developers" + extrasInTitle);

        Assert.assertEquals(driver.findElement(By.xpath("/html/body//ol")).getAttribute("class"), "bash");

        Assert.assertEquals(driver.findElement(By.xpath("/html/body//textarea")).getAttribute("value"),
                "git config --global user.name  \"New Sheriff in Town\"\n"
                        + "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n"
                        + "git push origin master --force");
        driver.quit();
    }
}
