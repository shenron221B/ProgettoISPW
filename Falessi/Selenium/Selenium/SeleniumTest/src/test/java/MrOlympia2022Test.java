import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MrOlympia2022Test {

    public static WebDriver driver;

    @BeforeMethod
    public static void setUp(){
        FirefoxOptions options = new FirefoxOptions();
        // accept cookies
        options.addPreference("network.cookie.cookieBehavior", 0);
        System.setProperty("webdriver.gecko.driver", "/Users/Leonardo/IdeaProjects/SeleniumTest/src/test/resources/geckodriver.exe");
        driver = new FirefoxDriver(options);
    }

    @Test
    void MrOlympiaTest() throws InterruptedException {
        driver.get("https://www.google.com/search?client=firefox-b-d&q=classifica+mr+olympia+2022");
        // wait 3 second
        Thread.sleep(3000);
        // take name of mr olympia 2022
        WebElement box= driver.findElement(By.xpath("/html/body/div[7]/div/div[12]/div/div[2]/div[2]/div/div/div[1]/div/block-component/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div[1]/div/div[2]/table/tbody/tr[2]/td[3]"));
        // verify name
        Assert.assertEquals(box.getText(), "Hadi Choopan");
    }

    @AfterMethod
    public void cleanUp(){
        // close driver
        driver.close();
    }

}
