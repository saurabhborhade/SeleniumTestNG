package Pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.testng.Assert;

import static Tests.SeleniumTest.driver;
import static Tests.SeleniumTest.test;

public class ProductPages
{
    public static String formalShoes_xpath = "/html/body/div[2]/center/h2";

    public static String sportShoes_xpath = "/html/body/div[3]/center/h2";

    public static String sneakers_xpath = "/html/body/div[4]/center/h2";

    public static String formalShoesDropdown_xpath = "/html/body/div[2]/center/div/i[1]";

    public static String sportShoesDropdown_xpath = "/html/body/div[3]/center/div/i[1]";

    public static String sneakersDropdown_xpath = "/html/body/div[4]/center/div/i[1]";

    public static String formalShoes_firstname = "/html/body/div[2]/table/tbody/tr[1]/td[1]";

    public static String sportShoes_firstname = "/html/body/div[3]/table/tbody/tr[1]/td[1]";


    public static void formalShoes_verifyTitle()
    {
        String expectedTitleFS = "Formal Shoes";
        String actualTitleFS = driver.findElement(By.xpath(formalShoes_xpath)).getText();
        Assert.assertEquals(expectedTitleFS, actualTitleFS);
        if (expectedTitleFS.equals(actualTitleFS))
            test.log(Status.PASS, "Test Passed for title verification of Formal Shoes");
        else
        {
            test.log(Status.FAIL, "Test Failed for title verification of Formal Shoes");
        }

    }

    public static void sportShoes_verifyTitle()
    {
        String expectedTitleSS = "Sports Shoes";
        String actualTitleSS = driver.findElement(By.xpath(sportShoes_xpath)).getText();
        Assert.assertEquals(expectedTitleSS, actualTitleSS);
        if (expectedTitleSS.equals(actualTitleSS))
        {
            test.log(Status.PASS, "Test Passed for title verification of Sport Shoes");
        }
    }


    public static void sneakers_verifyTitle()
    {
        String expectedTitleSN = "Sneakers";
        String actualTitleSN = driver.findElement(By.xpath(sneakers_xpath)).getText();
        Assert.assertEquals(expectedTitleSN, actualTitleSN);
        if (expectedTitleSN.equals(actualTitleSN))
        {
            test.log(Status.PASS, "Test Passed for title verification of Sneakers");
        }
    }

    public static void formal_firstshoes_Verify()
    {
        String expectedFirstFormalShoe = "   Classic Cheltenham";
        driver.findElement(By.xpath(formalShoesDropdown_xpath)).click();
        String actualFirstFormalShoes = driver.findElement(By.xpath(formalShoes_firstname)).getText();
        Assert.assertEquals(expectedFirstFormalShoe,actualFirstFormalShoes);
        if (expectedFirstFormalShoe.equals(actualFirstFormalShoes))
        {
            test.log(Status.PASS, "Test Passed for first shoe name of Formal shoe i.e Classic Cheltenham");
        }
    }

    public static void sport_firstshoes_Verify()
    {
        String expectedFirstSportShoe = "   Ultimate";
        driver.findElement(By.xpath(sportShoesDropdown_xpath)).click();
        String actualFirstFormalSportShoes = driver.findElement(By.xpath(sportShoes_firstname)).getText();
        Assert.assertEquals(expectedFirstSportShoe, actualFirstFormalSportShoes);
        if (expectedFirstSportShoe.equals(actualFirstFormalSportShoes))
        {
            test.log(Status.PASS, "Test Passed for first shoe name of Formal shoe i.e Ultimate");
        }
    }

}
