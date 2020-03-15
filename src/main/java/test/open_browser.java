package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class open_browser {
// test2
                public static void main(String[] args)
                {
                   System.setProperty("webdriver.chrome.driver", "C:\\Users\\smansoor\\Desktop\\desktop\\Desktop\\Billing\\elmx_new_billing_portal\\TestAssets\\ChromeDriver\\chromedriver.exe");
                    ChromeDriver driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.get("http://google.com");
                    driver.quit();
                    driver.quit();
                }
            }


