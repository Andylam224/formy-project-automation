import Pages.ConfirmationPage;
import Pages.FormPage;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class SeleniumDemo2 {

public static void main(String[]args){

    System.setProperty("webdriver.chrome.driver","/Selenium jars and drivers/drivers/chromedriver/chromedriver.exe");

    WebDriver driver=new ChromeDriver();

    driver.get("https://formy-project.herokuapp.com/form");

    FormPage formPage=new FormPage();
   formPage.submitForm(driver);

    //add explicit wait
    ConfirmationPage confirmationPage=new ConfirmationPage();
    confirmationPage.waitForAlertBanner(driver);
    //add assertion text displayed is equal to the expected text with Junit
    assertEquals("The form was successfully submitted!",confirmationPage.getAlertBannerText(driver));

    driver.quit();

}




/*
Page objects
allows functionality to be separated into different classes basked on area of functionality
Benefits: organize test code and keep test clean
 */

    /*

git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/Andylam224/formy-project-automation.git
git push -u origin main
…or push an existing repository from the command line
git remote add origin https://github.com/Andylam224/formy-project-automation.git
git branch -M main
git push -u origin main
     */
}
