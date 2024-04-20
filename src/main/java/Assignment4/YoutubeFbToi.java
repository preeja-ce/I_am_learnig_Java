package Assignment4;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;
import java.util.List;

public class YoutubeFbToi {


    public static void main(String[] args){


        //driver.navigate().to("https://www.youtube.com");

        YoutubeFbToi YFT = new YoutubeFbToi();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        YFT.Youtube(driver);
        YFT.Facebook(driver);
        System.out.println("Selenium could find "+YFT.TOI(driver)+" <a> tags");
    }

    public void Youtube(WebDriver wd) {
        wd.navigate().to("https://www.youtube.com");

            wd.findElement(By.xpath("//input[@id='search']")).sendKeys("podtest");
            wd.findElement(By.id("search-icon-legacy")).click();
    }

    public void Facebook(WebDriver wd){
        wd.get("https://www.facebook.com");
        wd.findElement(By.id("email")).sendKeys("pree.cyzma@gmail.com");
        wd.findElement(By.id("pass")).sendKeys("");
        wd.findElement(By.name("login")).click();


    }

    public long TOI(WebDriver wd){
        wd.get("https://timesofindia.indiatimes.com");
        List<WebElement> aTags = wd.findElements(By.tagName("a"));
        return (aTags.stream().count());
    }
}
