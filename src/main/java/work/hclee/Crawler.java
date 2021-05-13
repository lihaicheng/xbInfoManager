package work.hclee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

/**
 * @author hclee
 * @Date 2021/5/12 19:43
 * @Description
 */
public class Crawler {
    public static void main(String[] args) throws IOException, InterruptedException {

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("黄色网站url");
        WebElement webElement = webDriver.findElement(By.id("__nuxt"));
        Thread.sleep(2000);
        System.out.println("内容："+webElement.getText());
    }
}