package Create_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;

    public static void createBrowser(){
        //Khởi tạo browser
        driver =new ChromeDriver();

        //*****2 hàm chờ đợi
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));  //thời gian chờ đợi tối đa trang đang load

        //***** 2 hàm để maximize/minmize cửa số trình duyệt
        driver.manage().window().maximize();
    }


    public static void createBrowser(String browserName){
        if(browserName.trim().toLowerCase().equals("chrome")){
            driver = new ChromeDriver();
        }

        if(browserName.trim().toLowerCase().equals("firefox")){
            driver = new FirefoxDriver();
        }

        if(browserName.trim().toLowerCase().equals("edge")){
            driver = new EdgeDriver();
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().window().maximize();
    }

    public static void closeBrowser(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //Đóng browser
        driver.quit();
    }
}
