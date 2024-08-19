package BT_WebElement_WebDriver;

import BT_Locators.XpathTuongDoi.Locators;
import Create_Browser.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;

public class BT_WebDriver extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        createBrowser("chrome");

        driver.navigate().to("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath(Locators.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(Locators.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(Locators.buttonLogin)).click();
        String window1 = driver.getWindowHandle();
        System.out.println("Window1: " + driver.getWindowHandle());

        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://google.com");
        String window= driver.getWindowHandle();
        System.out.println("Mã window: " + driver.getWindowHandle());

        driver.switchTo().window(window1);
        Thread.sleep(1000);

        closeBrowser();
    }
}
