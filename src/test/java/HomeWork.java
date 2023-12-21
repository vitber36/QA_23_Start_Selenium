import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

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
        WebElement h1=wd.findElement(By.xpath("//h1"));

        //by id
        WebElement div1=wd.findElement(By.xpath("//*[@id='root']"));

        //by class
        WebElement div2=wd.findElement(By.xpath("//div[@class='container']"));

        //by attribute

        //one of elements find by attribute===>start end contains
        WebElement input1=wd.findElement(By.cssSelector("[placeholder='Email']"));
        WebElement input2=wd.findElement(By.xpath("//input[@placeholder='Email']"));

        //start
        WebElement input3=wd.findElement(By.cssSelector("[placeholder^='Em']"));
        WebElement input4=wd.findElement(By.xpath("//input[starts-with(@placeholder,'Em')]"));


        //end
        WebElement input5=wd.findElement(By.cssSelector("[placeholder$='il']"));
        WebElement input6=wd.findElement(By.xpath("//input[contains(@placeholder,'il')]"));

        //contains
        WebElement input7=wd.findElement(By.cssSelector("[placeholder*='ma']"));
        WebElement input8=wd.findElement(By.xpath("//input[contains(@placeholder,'ma')]"));
    }

    @AfterClass
    public void stop(){
        wd.close();
    }
}
