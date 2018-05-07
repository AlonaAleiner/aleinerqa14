
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AddContactTest extends TestBase {

    @Test
    public void testAddContact() throws Exception {
        addContact(By.linkText("add new"));
        fillContactForm();
        selectGroupToAdding();
        submitContactAdding();
    }


}