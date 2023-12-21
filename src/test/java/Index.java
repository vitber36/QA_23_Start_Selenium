import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
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
    public void tableTest(){
        WebElement canada=wd.findElement(By.cssSelector("tr:nth-child(3) td:last-child"));
        Assert.assertEquals(canada.getText(),"Canada");
    }

    @Test
    public void cssLocators(){
        //by tag name
        WebElement element1=wd.findElement(By.tagName("button"));
        WebElement el1=wd.findElement(By.cssSelector("button"));
        WebElement element2=wd.findElement(By.tagName("ul"));
        WebElement element3=wd.findElement(By.tagName("table"));
        WebElement element4=wd.findElement(By.tagName("tbody"));
        WebElement element5=wd.findElement(By.tagName("p"));
        WebElement element6=wd.findElement(By.tagName("script"));
        WebElement element7=wd.findElement(By.tagName("body"));
        WebElement element8=wd.findElement(By.tagName("form"));

        List<WebElement> list1=wd.findElements(By.tagName("a"));
        List<WebElement> list2=wd.findElements(By.cssSelector("li"));
        List<WebElement> list3=wd.findElements(By.tagName("div"));
        List<WebElement> list4=wd.findElements(By.tagName("hr"));
        List<WebElement> list5=wd.findElements(By.tagName("input"));
        List<WebElement> list6=wd.findElements(By.tagName("tr"));
        List<WebElement> list7=wd.findElements(By.tagName("th"));
        List<WebElement> list8=wd.findElements(By.tagName("td"));


        //by class
        WebElement elem1=wd.findElement(By.className("container"));
        WebElement elem2=wd.findElement(By.cssSelector(".container"));
        List<WebElement> list9=wd.findElements(By.className("nav-item"));
        List<WebElement> list10=wd.findElements(By.cssSelector(".nav-item"));

        //by id
        WebElement elem3=wd.findElement(By.id("nav"));
        WebElement elem4=wd.findElement(By.id("#nav"));


        //by attribute
        WebElement elem5=wd.findElement(By.cssSelector("[href='#item3']"));

        //by name
        WebElement elem6=wd.findElement(By.name("name"));


        //by linkText and partialLinkText
        WebElement a1=wd.findElement(By.linkText("Item 1"));
        WebElement a2=wd.findElement(By.partialLinkText("em 1"));


        WebElement inp1=wd.findElement(By.cssSelector("[placeholder='Type your name']"));

        //start
        WebElement inp2=wd.findElement(By.cssSelector("[placeholder^='Type']"));

        //end
        WebElement inp3=wd.findElement(By.cssSelector("[placeholder$='name']"));

        //contains
        WebElement inp4=wd.findElement(By.cssSelector("[placeholder*='your']"));



    }

    @AfterClass
    public void stop(){
        wd.close();
    }
}
