package BT_WebElement_WebDriver;

import BT_Locators.XpathTuongDoi.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
public class BT_WebElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");

        boolean checkSelected = driver.findElement(By.xpath(Locators.checkboxRemember)).isSelected();
        System.out.println("Check checkSelected():" + checkSelected);

        driver.findElement(By.xpath("//label[normalize-space()='Remember me']")).click();
        boolean checkSelected2 = driver.findElement(By.xpath(Locators.checkboxRemember)).isSelected();
        System.out.println("Check checkSelected():" + checkSelected2);


        driver.findElement(By.xpath(Locators.inputEmail)).clear();
        driver.findElement(By.xpath(Locators.inputPassword)).clear();

        driver.findElement(By.xpath(Locators.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(Locators.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(Locators.buttonLogin)).click();


        Thread.sleep(2000);
        driver.findElement(By.xpath(Locators.menuCustomers)).click();

        Thread.sleep(2000);
        Dimension dimension = driver.findElement(By.xpath(Locators.buttonAddNewCustomer)).getSize();
        System.out.println("Height: " + dimension.getHeight());
        System.out.println("Width: " + dimension.getWidth());

        Thread.sleep(2000);
        String tagName = driver.findElement(By.xpath(Locators.buttonAddNewCustomer)).getTagName();
        System.out.println("Name add customer: " + tagName);


        Thread.sleep(2000);
        driver.findElement(By.xpath(Locators.buttonAddNewCustomer)).click();


        Thread.sleep(2000);
        driver.quit();
    }
}

