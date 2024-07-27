package BT_Locators.XpathTuongDoi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LocatorsCRM {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //login crm
        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.id("email")).sendKeys("admin@example.com");
        driver.findElement(By.name("password")).sendKeys("123456");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        Thread.sleep(3000);

        //xpath menu Customer
        //cách xđ bằng thuộc tính @
        driver.findElement(By.xpath("//a[@href='https://crm.anhtester.com/admin/clients']")).click();
        driver.findElement(By.xpath("//a[@class='btn btn-primary mright5 test pull-left display-block']")).click();
        driver.findElement(By.xpath("//div[@class='panel_s']")).click();

        //cách xđ bằng text()
        //driver.findElement(By.xpath("//span[normalize-space()='Customers']")).click();
        //driver.findElement(By.xpath("//a[normalize-space()='New Customer']")).click();

        //cách xđ bằng hàm contains()
       //driver.findElement(By.xpath("//span[contains(text(),'Customers')]")).click();
       //driver.findElement(By.xpath("//a[contains(@class,'btn btn-primary mright5 test pull-left display-block')]")).click();

        Thread.sleep(2000);

        driver.quit();
    }
}
