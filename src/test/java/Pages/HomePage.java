package Pages;

import org.openqa.selenium.By;

import static Tests.SeleniumTest.driver;

public class HomePage
{

    public static String h_menu_xpath = "//*[@id=\"menuToggle\"]/input";

    public static String Online_Product_Link_xpath = "//*[@id=\"menu\"]/a[3]/li";

    public static void click_h_menu()
    {
        driver.findElement(By.xpath(h_menu_xpath)).click();
    }

    public static void click_orderProducts_link() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(Online_Product_Link_xpath)).click();
    }

}
