package seleniumElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.UINT16;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class UpdatedDropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000L);


        /*//driver.findElement(By.id("hrefIncAdt")).click();
        //driver.findElement(By.id("btnclosepaxoption")).click();
        int i=1;
        while (i<5){
            driver.findElement(By.id("hrefIncAdt")).click();
            i++;
        }*/

        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        for (int i = 1; i < 5; i++){
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
    }
}
