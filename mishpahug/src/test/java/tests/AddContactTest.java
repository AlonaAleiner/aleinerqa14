package tests;

import com.telran.addressbook.model.ContactData;
import org.testng.Assert;

import java.io.File;

public class AddContactTest extends TestBase {

    @Test
    public void testAddContact1() throws Exception {
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().addContact();
        File photo = new File("src/test/resources/Photo.jpg");

        app.getContactHelper().fillContactForm(new ContactData()
                .withFirstname("A")
                .withMiddlename("")
                .withLastname("")
                .withNickname("")
                .withTitle("")
                .withCompany("")
                .withAddress("")
                .withHome("")
                .withMobile("")
                .withWork("")
                .withFax("")
                .withEmail("")
                .withHomepage("")
                .withPhoto(photo).withGroup("Name"));
        app.getGroupHelper().selectGroupToAdding();
        app.getContactHelper().submitContactAdding();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before + 1);
    }

    @Test
    public void testAddContact2() throws Exception {
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().addContact();
        app.getContactHelper().fillContactForm(new ContactData()
                .withFirstname("")
                .withLastname(""));
        // app.getGroupHelper().selectGroupToAdding();
        app.getContactHelper().submitContactAdding();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before + 1);
    }
}