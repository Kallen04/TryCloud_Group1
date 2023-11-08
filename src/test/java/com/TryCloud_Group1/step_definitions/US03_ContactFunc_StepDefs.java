package com.TryCloud_Group1.step_definitions;

import com.TryCloud_Group1.pages.BasePage;
import com.TryCloud_Group1.pages.ContactPage_BD;
import com.TryCloud_Group1.utilities.BrowserUtils;
import com.TryCloud_Group1.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US03_ContactFunc_StepDefs extends BasePage {



    @When("user click Contacts module")
    public void user_click_contacts_module() {
        clickOnModule("Contacts");
    }
    @Then("user should be able to see Contact page")
    public void user_should_be_able_to_see_contact_page() {
        BrowserUtils.verifyTitle("Contacts - Trycloud QA");
    }

        //------------AC01---------------------

    ContactPage_BD contactPage = new ContactPage_BD();


    @When("user click New contact")
    public void user_click_new_contact() {
        contactPage.newContactBtn.click();
    }

    String actualNameAdded = "";
    @Then("user enter name and last name")
    public void user_enter_name_and_last_name() {
        contactPage.contactFullNameInput.clear();
        actualNameAdded = faker.name().fullName();
        contactPage.contactFullNameInput.sendKeys(actualNameAdded);
    }

    Faker faker = new Faker();
    @Then("user enter Phone number")
    public void user_enter_phone_number() {
        contactPage.phoneInput.sendKeys(faker.numerify("###-###-####"));
    }
    @Then("user enter Email")
    public void user_enter_email() {
        contactPage.emailInput.sendKeys(actualNameAdded.toLowerCase().substring(0,actualNameAdded.indexOf(" "))+"@gmail.com");
    }
    @Then("user enter Post Office box")
    public void user_enter_post_office_box() {
        contactPage.poBoxInput.sendKeys(faker.numerify("####"));
    }
    @Then("user enter address")
    public void user_enter_address() {
        contactPage.addressInput.sendKeys(faker.address().streetAddress());
    }
    @Then("user enter Extended address")
    public void user_enter_extended_address() {
        contactPage.extendAddressInput.sendKeys(faker.address().buildingNumber());
    }
    @Then("user enter Postal code")
    public void user_enter_postal_code() {
        contactPage.postalInput.sendKeys(faker.address().zipCode());
    }
    @Then("user enter City")
    public void user_enter_city() {
        contactPage.cityInput.sendKeys(faker.address().city());
    }
    @Then("user enter State")
    public void user_enter_state() {
        contactPage.stateInput.sendKeys(faker.address().state());
    }
    @Then("user enter country")
    public void user_enter_country() {
        contactPage.countryInput.sendKeys(faker.address().country());
    }


    @Then("user should be able to see on the list")
    public void user_should_be_able_to_see_on_the_list() {

        for (WebElement each : contactPage.contactlist) {
            if(each.getText().equals(actualNameAdded)){

                Assert.assertEquals(actualNameAdded, each.getText());
                break;
            }
        }

    }


    //------------AC02---------------------
    @When("user click all contacts")
    public void user_click_all_contacts() {
        contactPage.allContactLink.click();
    }
    @When("user see total number of list")
    public void user_see_total_number_of_list() {
        Assert.assertTrue(contactPage.totalContactNumber.isDisplayed());
    }
    @Then("user should be able to see whole list matching with total number of the list")
    public void user_should_be_able_to_see_whole_list_matching_with_total_number_of_the_list() {
        Assert.assertEquals(
                contactPage.totalContactNumber.getText(),
                Integer.toString(contactPage.contactlist.size())
        );
    }

    //------------AC03---------------------

    @When("user click photo icon")
    public void user_click_photo_icon() {
        contactPage.photoIcon.click();
    }

    @When("user click Choose from Files")
    public void user_click_choose_from_files() {
        contactPage.chooseFromFileLink.click();
    }

    @And("user choose file name {string} file")
    public void userChooseFileNameFile(String fileName) {

        WebElement photoFile = Driver.getDriver().findElement(By.xpath("//tr[@data-entryname='" + fileName +"']"));
        photoFile.click();
        contactPage.chooseButton.click();

    }

    @Then("user should be able to see photo on profile")
    public void user_should_be_able_to_see_photo_on_profile() {
        Assert.assertTrue(contactPage.profilePhoto.isEnabled());
    }



    //------------AC04---------------------

    @When("user click name from list contact")
    public void user_click_from_list_contact() {
        //delete 1st contact on the list
        contactPage.contactlist.get(0).click();
    }
    @When("user click three dots icon")
    public void user_click_three_dots_icon() {
        contactPage.threeDotsIcon.get(contactPage.threeDotsIcon.size()-1).click();
    }
    @When("user click Delete menu")
    public void user_click_delete_menu() {
        contactPage.deleteLink.click();
    }
    @Then("user should be able to see {string} on the page")
    public void user_should_be_able_to_see_on_the_page(String expectText) {
        String actualText = contactPage.textAfterDelete.getText();
        Assert.assertEquals(expectText,actualText);
    }





}
