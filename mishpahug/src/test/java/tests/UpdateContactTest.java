package tests;

import com.telran.addressbook.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UpdateContactTest extends TestBase {

    @Test
    public void contactTestUpdate() {
        app.getNavigationHelper().returnHome();
        if (!app.getContactHelper().isThereAContact()) {
            app.getContactHelper().addContact();
        }
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().editContact();
        app.getContactHelper().fillContactForm(new ContactData()
                .withFirstname("Mary")
                .withLastname("Koru")
                .withCompany("Google")
                .withMobile("555555"));
        app.getContactHelper().updateContact();
        app.getNavigationHelper().returnHome();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before);
    }
}

