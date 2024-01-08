import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWork {

    WebDriver wd;
    @BeforeClass
    public void setUp(){
        wd=new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }

    @Test
    public void cssLocators(){
        //by tag name
        WebElement tag1=wd.findElement(By.xpath("//h1"));
        WebElement tag2=wd.findElement(By.tagName("a"));
        WebElement tag3=wd.findElement(By.cssSelector("a"));
        WebElement tag4=wd.findElement(By.xpath("//a"));
        WebElement tag5=wd.findElement(By.tagName("button"));
        WebElement tag6=wd.findElement(By.cssSelector("button"));
        WebElement tag7=wd.findElement(By.xpath("//button"));

        List<WebElement> lTag1=wd.findElements(By.tagName("a"));
        List<WebElement> lTag2=wd.findElements(By.cssSelector("a"));
        List<WebElement> lTag3=wd.findElements(By.xpath("//a"));
        List<WebElement> lTag4=wd.findElements(By.tagName("button"));
        List<WebElement> lTag5=wd.findElements(By.cssSelector("button"));
        List<WebElement> lTag6=wd.findElements(By.xpath("//button"));

        //by id
        WebElement id1=wd.findElement(By.xpath("//*[@id='root']"));
        WebElement id2=wd.findElement(By.id("root"));
        WebElement id3=wd.findElement(By.cssSelector("#root"));


        //by class
        WebElement class1=wd.findElement(By.xpath("//div[@class='container']"));
        WebElement class2=wd.findElement(By.className("container"));
        WebElement class3=wd.findElement(By.cssSelector(".container"));
        WebElement class4=wd.findElement(By.xpath("//*[@class='login_login__3EHKB']"));
        WebElement class5=wd.findElement(By.className("login_login__3EHKB"));
        WebElement class6=wd.findElement(By.cssSelector(".login_login__3EHKB"));

        //by attribute
        WebElement atr1=wd.findElement(By.cssSelector("[id='root']"));
        WebElement atr2=wd.findElement(By.xpath("//*[@id='root']"));
        WebElement atr3=wd.findElement(By.cssSelector("[href='/home']"));
        WebElement atr4=wd.findElement(By.xpath("//*[@href='/home']"));

        //one of elements find by attribute===>start end contains
        WebElement attr1=wd.findElement(By.cssSelector("[placeholder='Email']"));
        WebElement attr2=wd.findElement(By.xpath("//input[@placeholder='Email']"));
        WebElement attr3=wd.findElement(By.cssSelector("[href='/about']"));
        WebElement attr4=wd.findElement(By.xpath("//a[@href='/about']"));
        WebElement attr5=wd.findElement(By.cssSelector("[href='/home']"));
        WebElement attr6=wd.findElement(By.xpath("//*[@href='/home']"));
        WebElement attr7=wd.findElement(By.cssSelector("[aria-current='page']"));
        WebElement attr8=wd.findElement(By.xpath("//*[@aria-current='page']"));

        //start
        WebElement start1=wd.findElement(By.cssSelector("[href^='/h']"));
        WebElement start2=wd.findElement(By.xpath("//a[starts-with(@href,'/h')]"));
        WebElement start3=wd.findElement(By.cssSelector("[placeholder^='Em']"));
        WebElement start4=wd.findElement(By.xpath("//input[starts-with(@placeholder,'Em')]"));
        WebElement start5=wd.findElement(By.cssSelector("[type^='sub']"));
        WebElement start6=wd.findElement(By.xpath("//*[starts-with(@type,'sub')]"));


        //end
        WebElement end1=wd.findElement(By.cssSelector("[placeholder$='il']"));
        WebElement end2=wd.findElement(By.xpath("//input[contains(@placeholder,'il')]"));
        WebElement end3=wd.findElement(By.cssSelector("[href$='me']"));
        WebElement end4=wd.findElement(By.xpath("//a[contains(@href,'me')]"));
        WebElement end5=wd.findElement(By.cssSelector("[type$='mit']"));
        WebElement end6=wd.findElement(By.xpath("//*[contains(@type,'mit')]"));

        //contains
        WebElement cont1=wd.findElement(By.cssSelector("[placeholder*='ma']"));
        WebElement cont2=wd.findElement(By.xpath("//input[contains(@placeholder,'ma')]"));
        WebElement cont3=wd.findElement(By.cssSelector("[href*='om']"));
        WebElement cont4=wd.findElement(By.xpath("//a[contains(@href,'om')]"));
        WebElement cont5=wd.findElement(By.cssSelector("[type*='ubm']"));
        WebElement cont6=wd.findElement(By.xpath("//*[contains(@type,'ubm')]"));
        WebElement cont7=wd.findElement(By.xpath("//a[3]"));
    }

    @Test
    public void classWork(){
        //parent
        WebElement par1=wd.findElement(By.xpath("//h1/parent::*"));
        WebElement par2=wd.findElement(By.xpath("//h1/parent::div"));
        WebElement par3=wd.findElement(By.xpath("//h1/.."));

        //ancestor
        WebElement anc1=wd.findElement(By.xpath("//h1/ancestor::div"));//two options
        WebElement anc2=wd.findElement(By.xpath("//h1/ancestor::*"));//all
        WebElement anc3=wd.findElement(By.xpath("//h1/ancestor::div[2]"));//one options

        //ancestor or self
        WebElement ancOrS1=wd.findElement(By.xpath("//h1/ancestor-or-self::*"));
        List<WebElement>list1=wd.findElements(By.xpath("//h1/ancestor-or-self::*"));

        //following-sibling
        List<WebElement>list2=wd.findElements(By.xpath("//h1/following-sibling::a"));

        //preceding-sibling
        WebElement pres=wd.findElement(By.xpath("//a[last()]/preceding-sibling::h1"));
        List<WebElement>list3=wd.findElements(By.xpath("//a[last()]/preceding-sibling::a"));
    }

    @Test
    public void classwork2(){
        WebElement element = wd.findElement(By.name("login"));
        String text= element.getText();
        System.out.println(text);

        WebElement form = wd.findElement(By.xpath("//form"));
        String textForm = form.getText();
        System.out.println("*********************");
        System.out.println(textForm);


        WebElement html = wd.findElement(By.tagName("html"));
        String textAll = html.getText();
        System.out.println("*********************");
        System.out.println(textAll);
    }

    @AfterClass
    public void stop(){
        wd.close();
    }
}
