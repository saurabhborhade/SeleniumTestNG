package Tests;

import Pages.HomePage;
import Pages.ProductPages;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class SeleniumTest
{
    public static WebDriver driver;

    static ExtentReports report;

    public static ExtentTest test;

    static ExtentReports extent = new ExtentReports();

    @BeforeSuite
    public static void Setup() throws InterruptedException
    {
        driver = new ChromeDriver();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        ExtentSparkReporter spark  = new ExtentSparkReporter( "target/Spark.html");
        extent.attachReporter(spark);
        HomePage.click_h_menu();
        HomePage.click_orderProducts_link();
    }

    @Test
    void validateTitle_OnlineProducts() throws InterruptedException
    {
        test = extent.createTest("Validate shoe title On Product Page", "This test validate that the different ShoeType are correct on Online Product Page");
        ProductPages.formalShoes_verifyTitle();
        ProductPages.sportShoes_verifyTitle();
        ProductPages.sneakers_verifyTitle();
        extent.flush();
    }

    @Test
    void validateFirstFormalShoes()
    {
        test = extent.createTest("Validate first Forlmal shoe", "This test cas evalidate frist formal shoes on Product page");
        ProductPages.formal_firstshoes_Verify();
    }

    @Test
    void validateFirstSportShoes()
    {
        test = extent.createTest("Validate first Sport shoe", "This test cas evalidate frist sport shoes on Product page");
        ProductPages.sport_firstshoes_Verify();

    }

    @AfterSuite

    public static void Cleanup()
    {
        extent.flush();
    }


}
