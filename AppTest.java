package prueba_CHOUCAIR;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

import static org.junit.Assert.assertTrue;

class test_webdriver{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("WebDriver.chrome.driver", "C:\\Users\\sebas\\OneDrive\\Escritorio\\prueba_CHOUCAIR\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://utest.com/signup/personal");
        Thread.sleep(2000);
        try {
            WebDriverWait wait = new WebDriverWait (driver, 20);
            driver.findElement(By.id("firstName"));
        }
        catch(Exception e) {
            System.out.print("No cargo el Input que ingresa el nombre");
        }
        driver.findElement(By.id("firstName")).sendKeys("Cristian");
        try {
            WebDriverWait wait = new WebDriverWait (driver, 20);
            driver.findElement(By.id("lastName"));
        }
        catch(Exception e) {
            System.out.print("No cargo el Input que ingresa el segundo Nombre");
        }
        driver.findElement(By.id("lastName")).sendKeys("Camilo");
        try {
            WebDriverWait wait = new WebDriverWait (driver, 20);
            driver.findElement(By.id("email"));
        }
        catch(Exception e) {
            System.out.print("No cargo el Input que ingresa el correo");
        }
        driver.findElement(By.id("email")).sendKeys("cristian131411@gmail.com");

        try {
            WebDriverWait wait = new WebDriverWait (driver, 20);
            driver.findElement(By.id("birthMonth"));
        }
        catch(Exception e) {
            System.out.print("No cargo el Input que ingresa la fecha");
        }
        driver.findElement(By.id("birthMonth")).sendKeys("December");
        driver.findElement(By.id("birthDay")).sendKeys("11");
        driver.findElement(By.id("birthYear")).sendKeys("1994");
        Thread.sleep(4000);
        driver.findElement(By.cssSelector(".btn.btn-blue")).sendKeys(Keys.ENTER);
        Thread.sleep(4000);
        driver.findElement(By.cssSelector(".btn.btn-blue")).sendKeys(Keys.ENTER);
        Thread.sleep(4000);
        try {
            WebDriverWait wait = new WebDriverWait (driver, 20);
            driver.findElement(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span"));
        }
        catch(Exception e) {
            System.out.print("No cargo el Input que ingresa el marca del celular");
        }
        driver.findElement(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]")).sendKeys("Apple");
        driver.findElement(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]")).sendKeys(Keys.ENTER);
        Thread.sleep(4000);
        try {
            WebDriverWait wait = new WebDriverWait (driver, 30);
            driver.findElement(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span"));
        }
        catch(Exception e) {
            System.out.print("No cargo el Input que ingresa el nombre del celular");
        }
        driver.findElement(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]")).sendKeys("iPhone");
        driver.findElement(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]")).sendKeys(Keys.ENTER);
        Thread.sleep(4000);
        try {
            WebDriverWait wait = new WebDriverWait (driver, 30);
            driver.findElement(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span"));
        }
        catch(Exception e) {
            System.out.print("No cargo el Input que ingresa el os del celular");
        }
        driver.findElement(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]")).sendKeys("iOS 15.1");
        driver.findElement(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]")).sendKeys(Keys.ENTER);
        Thread.sleep(4000);
        driver.findElement(By.cssSelector(".btn.btn-blue")).sendKeys(Keys.ENTER);
        Thread.sleep(4000);
        try {
            WebDriverWait wait = new WebDriverWait (driver, 30);
            driver.findElement(By.id("password"));
        }
        catch(Exception e) {
            System.out.print("No cargo el Input que ingresa contraseña");
        }
        driver.findElement(By.id("password")).sendKeys("Cristian1920*");
        Thread.sleep(4000);
        try {
            WebDriverWait wait = new WebDriverWait (driver, 30);
            driver.findElement(By.id("confirmPassword"));
        }
        catch(Exception e) {
            System.out.print("No cargo el Input que confirma la contraseña");
        }
        driver.findElement(By.id("confirmPassword")).sendKeys("Cristian1920*");
        Thread.sleep(4000);
        driver.findElement(By.id("termOfUse")).click();
        driver.findElement(By.id("privacySetting")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector(".btn.btn-blue")).sendKeys(Keys.ENTER);
        Thread.sleep(4000);
        driver.close();
    }
}
/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
