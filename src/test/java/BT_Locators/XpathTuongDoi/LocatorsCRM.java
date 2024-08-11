package BT_Locators.XpathTuongDoi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LocatorsCRM {
    public static void main(String[] args) throws InterruptedException {
        //khởi tạo
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //login crm
        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.id("email")).sendKeys("admin@example.com");
        driver.findElement(By.name("password")).sendKeys("123456");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        Thread.sleep(3000);


        driver.findElement(By.xpath("//ul[@id='side-menu']//span[normalize-space()='Customers']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='New Customer']")).click();


        driver.findElement(By.xpath("//input[@id='company']"));
        driver.findElement(By.xpath("//input[@id='vat']"));
        driver.findElement(By.xpath("//input[@id='phonenumber']"));
        driver.findElement(By.xpath("//input[@id='website']"));
        driver.findElement(By.xpath("//button[@data-id='groups_in[]']"));
        driver.findElement(By.xpath("//div[@app-field-wrapper='groups_in[]']//input[@type='search']"));
        driver.findElement(By.xpath("//button[@data-id='default_currency']"));
        driver.findElement(By.xpath("//button[@data-id='default_language']"));
        driver.findElement(By.xpath("//textarea[@id='address']"));
        driver.findElement(By.xpath("//input[@id='city']"));
        driver.findElement(By.xpath("//input[@id='state']"));
        driver.findElement(By.xpath("//input[@id='zip']"));
        driver.findElement(By.xpath("//div[@app-field-wrapper='country']//input[@type='search']"));


        Thread.sleep(2000);

        driver.quit();
    }
}
