import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {

    public static void main(String[] args) {

        WebDriver wd = new ChromeDriver();
        wd.navigate().to("https://www.google.com");
        //.get("www.google.com");

        wd = new FirefoxDriver();
        wd.navigate().to("https://www.google.com");

        //wd.openDevtools();



    }
}
