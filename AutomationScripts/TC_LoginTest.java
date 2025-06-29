import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_LoginTest {

    @Test
    public void verifyValidLogin() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://your-permit-app-url.com/login");

        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginBtn = driver.findElement(By.id("login"));

        username.sendKeys("validUser");
        password.sendKeys("validPassword");
        loginBtn.click();

        // Add assertion here
        driver.quit();
    }
}
