import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxDriver{

    public static void main(String[] args) {



        WebDriver wd2 = new FirefoxDriver();
        wd2.navigate().to("https://www.google.com");

    //.get("www.google.com");


}
}

