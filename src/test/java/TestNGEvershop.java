import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import java.time.Duration;


public class TestNGEvershop {

    public static WebDriver driver;
    SoftAssert Test = new SoftAssert();


    public TestNGEvershop() {
        driver = new ChromeDriver();
    }

    @BeforeTest
    public void OpenEvershop() {


        driver.navigate().to("https://demo.evershop.io/account/login");
        driver.manage().window().maximize();
        driver.findElement(By.name("email")).sendKeys("preejace@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Test@124");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }


    @Test
    public void addWomenItemToCart(){
        driver.findElement(By.xpath("//a[text()='Women']")).click();
        int selection=1;
        WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));
        for (int i=1; i<5; i++){//adds 4 items to the cart

            addItemToCart(i,selection);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='self-center'][text()='JUST ADDED TO YOUR CART']")));

            Test.assertTrue(driver.findElement(By.xpath("//div[@class='self-center'][text()='JUST ADDED TO YOUR CART']")).isDisplayed()); // Soft Assert to check if the Just added to cart toast is displayed
            driver.findElement(By.xpath("//a[text()='Women']")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='mini-cart-icon']/span")));


        }

    }

    public void addItemToCart(int i, int selection){
        WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));

            driver.findElement(By.xpath("(//div[@class='product-thumbnail-listing']/a)["+i+"]")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='mini-cart-icon']/span")));
            driver.findElement(By.xpath("((//ul[contains(@class,'variant-option-list')])[1]//li/a)["+selection+"]")).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//ul[contains(@class,'variant-option-list')])[1]//li[@class='selected']")));
            driver.findElement(By.xpath("((//ul[contains(@class,'variant-option-list')])[2]//li/a)["+selection+"]")).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//ul[contains(@class,'variant-option-list')])[2]//li[@class='selected']")));
            driver.findElement(By.xpath("//span[text()='ADD TO CART']/..")).click();

    }
    @Parameters({"item","Qty","Color","size"})
    @Test
    public void addKidsItemToCart(String product, int qty, String color, String size){//adds 1 item to the cart based on the product name, color and size values passed
        WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='mini-cart-icon']/span")));
        driver.findElement(By.xpath("//span[text()='Shop kids']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='mini-cart-icon']/span")));
        driver.findElement(By.xpath("//div[@class='product-thumbnail-listing']/a/img[@alt='"+product+"']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='mini-cart-icon']/span")));
        driver.findElement(By.name("qty")).clear();
        driver.findElement(By.name("qty")).sendKeys(""+qty);
        driver.findElement(By.xpath("//ul[contains(@class,'variant-option-list')]/li/a[text()='"+size+"']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//ul[contains(@class,'variant-option-list')])[1]//li[@class='selected']")));
        driver.findElement(By.xpath("//ul[contains(@class,'variant-option-list')]/li/a[text()='"+color+"']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//ul[contains(@class,'variant-option-list')])[2]//li[@class='selected']")));
        driver.findElement(By.xpath("//span[text()='ADD TO CART']/..")).click();

    }

    @AfterTest
    public void logout(){
        WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));

        driver.findElement(By.xpath("//div[@class='self-center']/a")).click();
        driver.findElement(By.xpath("//a[text()='Logout']")).click();
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='mini-cart-icon']/span")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h2[text()='Discount 20% For All Orders Over $2000']")));
        String ActualText = driver.findElement(By.xpath("//h2[text()='Discount 20% For All Orders Over $2000']")).getText();

        // Soft Assert to check that post logout the page displays certain text
        Test.assertEquals(ActualText, "Discount 20% For All Orders Over $2000");
        Test.assertAll();
        driver.quit();
    }
}
