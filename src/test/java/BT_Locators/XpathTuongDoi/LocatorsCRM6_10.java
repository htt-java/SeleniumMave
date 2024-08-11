package BT_Locators.XpathTuongDoi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LocatorsCRM6_10 {
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


        driver.findElement(By.xpath("//ul[@id='side-menu']//span[normalize-space()='Projects']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='New Project']")).click();

        driver.findElement(By.xpath("//input[@id='name']"));
        driver.findElement(By.xpath("//input[@aria-controls='bs-select-6']/parent::div"));
        driver.findElement(By.xpath("//label[normalize-space()='Calculate progress through tasks']"));
        driver.findElement(By.xpath("//button[@aria-owns='bs-select-1']/following-sibling::div"));
        driver.findElement(By.xpath("//button[@title='In Progress']/following-sibling::div"));
        driver.findElement(By.xpath("//input[@id='project_rate_per_hour']"));
        driver.findElement(By.xpath("//input[@id='estimated_hours']"));
        driver.findElement(By.xpath("//button[@data-id='project_members[]']/following::input[@aria-controls='bs-select-3']"));
        driver.findElement(By.xpath("//input[@id='start_date']/following-sibling::div"));
        driver.findElement(By.xpath("//input[@id='deadline']/parent::div"));
        driver.findElement(By.xpath("//input[@placeholder='Tag']"));



        Thread.sleep(2000);
        driver.quit();
    }
}
