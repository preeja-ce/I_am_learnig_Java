import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeDriver {



    public static void main(String[] args) {


        WebDriver wd1 = new ChromeDriver() ;
        wd1.navigate().to("www.google.com");

        //.get("www.google.com");
    }


}
