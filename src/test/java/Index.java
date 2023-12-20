import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Index {

    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd=new ChromeDriver();
        wd.get("file:///C:/Users/User/Downloads/21.index%20(1).html");
    }

    @Test
    public void cssLocators(){
        //by tag name
        WebElement element1=wd.findElement(By.tagName("button"));
        WebElement element2=wd.findElement(By.tagName("ul"));
        WebElement element3=wd.findElement(By.tagName("table"));
        WebElement element4=wd.findElement(By.tagName("tbody"));
        WebElement element5=wd.findElement(By.tagName("p"));
        WebElement element6=wd.findElement(By.tagName("script"));
        WebElement element7=wd.findElement(By.tagName("body"));

        List<WebElement> list1=wd.findElements(By.tagName("a"));
        List<WebElement> list2=wd.findElements(By.tagName("li"));
        List<WebElement> list3=wd.findElements(By.tagName("div"));
        List<WebElement> list4=wd.findElements(By.tagName("hr"));
        List<WebElement> list5=wd.findElements(By.tagName("input"));
        List<WebElement> list6=wd.findElements(By.tagName("tr"));
        List<WebElement> list7=wd.findElements(By.tagName("th"));
        List<WebElement> list8=wd.findElements(By.tagName("td"));


    }

    @AfterClass
    public void stop(){
        wd.close();
    }
}
