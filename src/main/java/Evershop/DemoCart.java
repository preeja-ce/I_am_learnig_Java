package Evershop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

public class DemoCart {

        public static WebDriver driver;
        private List<WebElement> Rows;

            public static void main(String[] args) throws InterruptedException{

                driver = new ChromeDriver();
                DemoCart Shop = new DemoCart();
                Shop.navigateToPage("https://demo.evershop.io/account/login");
                Shop.Login();
                Shop.addToCart();
                Shop.navigateToCart();
                Thread.sleep(5000);

                Shop.printCartValue();
                System.out.println( "************************************************************************************************************************");
                Shop.removeCartByIndex(1);
                System.out.println( "************************************************************************************************************************");
                Shop.removeCartByName("Edge gameday shoes");



                driver.quit();
            }

            public void Login(){
                driver.findElement(By.name("email")).sendKeys("preejace@gmail.com");
                driver.findElement(By.name("password")).sendKeys("Test@124");
                driver.findElement(By.xpath("//button[@class='button primary']")).click();
            }

            public void navigateToPage(String url){
                driver.navigate().to(url);
                driver.manage().window().maximize();
            }

            public void navigateToCart() {
                try {
                    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
                    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='mini-cart-icon']/span")));
                    driver.findElement(By.xpath("//a[@class='mini-cart-icon']")).click();

                }
                catch (Exception ex) {
                    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
                    wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[@class='mini-cart-icon']"))));
                    driver.findElement(By.xpath("//a[@class='mini-cart-icon']")).click();

                }
            }

            public void addToCart() throws InterruptedException {
                driver.findElement(By.xpath("//a[text()='Women']")).click();

                for (int i = 1; i <= 4; i++) {
                    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
                    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'product-list-name')][1]/a")));
                    String first = "(//div[contains(@class,'product-list-name')])[";
                    String end = "]/a";
                    driver.findElement(By.xpath(first + i + end)).click();
                    driver.findElement(By.xpath("//ul[contains(@class,'variant-option-list')]/li[1]/a")).click();
                    Thread.sleep(3000);
                    driver.findElement(By.xpath("(//ul[contains(@class,'variant-option-list')])[2]/li/a")).click();
                    Thread.sleep(3000);
                    driver.findElement(By.xpath("//button[@class='button primary outline']")).click();
                    driver.navigate().back();
                    driver.findElement(By.xpath("//a[text()='Women']")).click();

                }
            }

            public List<WebElement> fetchRowData(){ //Fetches the cart item Rows

                if ( this.Rows != null)
                    Rows.clear();

                Rows = driver.findElements(By.xpath("//table[contains(@class,'items-table listing')]/tbody/tr"));

                return Rows;
            }

            public void printCartValue(){ //Prints all the cart values


                Rows = fetchRowData();


                for (int p=1;p<=Rows.size();p++){

                        String itemName = "//table[contains(@class,'items-table listing')]/tbody/tr["+p+"]/td//div[@class='cart-tem-info']/a";
                        System.out.print( driver.findElement(By.xpath(itemName)).getText()+" "); //prints the name of item


                        for (int i=1;i<=2;i++){

                            for (int j=1;j<=2;j++){ //prints Size and color
                            String element = "//table[contains(@class,'items-table listing')]/tbody/tr["+p+"]/td//div[@class='cart-item-variant-options mt-05']/ul/li["+i+"]/span["+j+"]";
                            System.out.print( driver.findElement(By.xpath(element)).getText());

                            }
                            System.out.print(" ");
                        }

                        for (int k=2;k<=4;k++){//prints price quantity and total, so it starts from column 2
                            String element = "//table[contains(@class,'items-table listing')]/tbody/tr["+p+"]/td["+k+"]";
                            System.out.print( driver.findElement(By.xpath(element)).getText()+" ");
                        }
                        System.out.println("");

                }


            }

            public void removeCartByIndex(int index) throws InterruptedException {

                Rows.get(index).findElement(By.xpath("//a[contains(@class,'text-textSubdued')]")).click();
                System.out.println("Removed item at row: "+index );
                Thread.sleep(5000);
                printCartValue();


            }

            public void removeCartByName(String Name) throws InterruptedException {
                Iterator<WebElement> itr = Rows.iterator();
                int index = 0;
                int row = index+1;
                while (itr.hasNext()){

                    if(Rows.get(index).getText().contains(Name)){
                        WebElement elementToRemove =driver.findElement(By.xpath("//table[contains(@class,'items-table listing')]/tbody/tr["+(row)+"]/td//div[@class='cart-tem-info']"));

                        elementToRemove.findElement(By.xpath(".//a[contains(@class,'text-textSubdued')]")).click();
                        System.out.println("");
                        System.out.print("Deleted item "+Name);
                        System.out.println("");

                        Thread.sleep(5000);
                        printCartValue();
                        break;
                    }

                    else {
                        index++;row++;
                    }

                }

            }
        }
