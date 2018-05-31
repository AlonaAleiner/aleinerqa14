package appManager;

import com.telran.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver driver) {
        super(driver);
    }

    public void submitContactAdding() {
        click(By.xpath("(//input[@name='submit'])[2]"));
    }

    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"), contactData.getFirstname());
        type(By.name("middlename"), contactData.getMiddlename());
        type(By.name("lastname"), contactData.getLastname());
        type(By.name("nickname"), contactData.getNickname());
        type(By.name("title"), contactData.getTitle());
        type(By.name("company"), contactData.getCompany());
        type(By.name("address"), contactData.getAddress());
        type(By.name("home"), contactData.getHome());
        type(By.name("mobile"), contactData.getMobile());
        type(By.name("work"), contactData.getWork());
        type(By.name("fax"), contactData.getFax());
        type(By.name("email"), contactData.getEmail());
        type(By.name("homepage"), contactData.getHomepage());
        attach(By.name("photo"), contactData.getPhoto());

        if (isElementPresent(By.xpath("//*[@name='new_group']"))) {
            new Select(driver.findElement(By.xpath("//*[@name='new_group']"))).selectByVisibleText(contactData.getGroup());
        }
    }

    public void addContact() {
        click(By.linkText("add new"));
    }

    public int getContactCount() {
        return driver.findElements(By.name("selected[]")).size();
    }

    public void editContact() {
        click(By.xpath("//img[@alt='Edit']"));
    }

    public void deleteContact() {
        click(By.cssSelector("input[value=Delete]"));
    }

    public void updateContact() {
        click(By.cssSelector("input[value=Update]"));
    }

    public void addContact2(By add_new) {
        addContact();
        fillContactForm(new ContactData()
                .withFirstname("name")
                .withMiddlename("middlename")
                .withLastname("lastname")
                .withNickname("nickname")
                .withTitle("title")
                .withCompany("company")
                .withAddress("address")
                .withHome("home")
                .withMobile("mobile")
                .withWork("work")
                .withFax("fax")
                .withEmail("email")
                .withHomepage("homepage"));
        submitContactAdding();
    }

    public boolean isThereAContact() {
        return isElementPresent(By.name("selected[]"));
    }
}