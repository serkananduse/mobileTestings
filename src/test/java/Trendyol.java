import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Trendyol {


    @Test
    public void app() throws MalformedURLException, InterruptedException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "9.0");
        desiredCapabilities.setCapability("deviceName", "PIXEL");
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
        desiredCapabilities.setCapability("app", "C:\\Users\\User\\AppiumWise-\\src\\Apps\\Trendyol.apk");
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http:localhost:4723/wd/hub"), desiredCapabilities);
        Actions actions = new Actions(driver);
        Thread.sleep(6000);
        String email = "serkanandserkan@yandex.com";
        String password = "Newtrend09052017.";
        //1.Select Country
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView")).click();
        Thread.sleep(6000);
        //2.Click to Log in
        driver.findElement(By.id("trendyol.com:id/buttonLogin")).click();
        Thread.sleep(1000);
        //3.Enter the credentials and make login
        driver.findElement(By.id("trendyol.com:id/editTextEmail")).sendKeys(email);
        driver.findElement(By.id("trendyol.com:id/editTextPassword")).sendKeys(password);
        driver.findElement(By.id("trendyol.com:id/buttonLogin")).click();
        Thread.sleep(5000);
        //4.Select Product and size
        WebElement element = driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id='trendyol.com:id/textView'])[1]"));
        actions.moveToElement(element).click().perform();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//android.view.ViewGroup[@class='android.view.ViewGroup'])[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id='trendyol.com:id/imageViewProduct'])[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("trendyol.com:id/buttonAddToBag")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//android.widget.TextView[@class='android.widget.TextView'])[9]")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("trendyol.com:id/buttonAddToBasket")).click();
        Thread.sleep(3000);
        //5.Proceed to payment
        driver.findElement(By.id("trendyol.com:id/buttonApproveBasket")).click();
        Thread.sleep(3000);
        //6.Select the Payment Type and enter the card details
        driver.findElement(By.xpath("(//android.widget.RadioButton[@class='android.widget.RadioButton'])[3]")).click();
        WebElement cardNumber = driver.findElement(By.id("trendyol.com:id/viewPaymentCardInformationNewCardBackground"));
        actions.moveToElement(cardNumber).sendKeys("1111222233334444").perform();
        actions.sendKeys(Keys.TAB).perform();
        Thread.sleep(2000);
        driver.findElement(By.id("trendyol.com:id/editTextPaymentCardInformationCVV")).sendKeys("233");
        driver.findElement(By.id("trendyol.com:id/textViewPaymentCardInformationMonth")).click();
        driver.findElement(By.xpath("(//android.widget.RelativeLayout[@class='android.widget.RelativeLayout'])[2]")).click();








    }

}
