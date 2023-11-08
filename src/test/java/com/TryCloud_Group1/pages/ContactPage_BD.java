package com.TryCloud_Group1.pages;

import com.TryCloud_Group1.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ContactPage_BD {


    public ContactPage_BD(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "new-contact-button")
    public WebElement newContactBtn;

    @FindBy(id = "contact-fullname")
    public WebElement contactFullNameInput;

    @FindBy(xpath = "//input[@inputmode='tel']")
    public WebElement phoneInput;

    @FindBy(xpath = "//input[@inputmode='email']")
    public  WebElement emailInput;

    @FindBy(xpath = "(//div[@class='property__label']/following-sibling::input)[1]")
    public WebElement poBoxInput;

    @FindBy(xpath = "(//div[@class='property__label']/following-sibling::input)[2]")
    public WebElement addressInput;

    @FindBy(xpath = "(//div[@class='property__label']/following-sibling::input)[3]")
    public WebElement extendAddressInput;

    @FindBy(xpath = "(//div[@class='property__label']/following-sibling::input)[4]")
    public WebElement postalInput;

    @FindBy(xpath = "(//div[@class='property__label']/following-sibling::input)[5]")
    public WebElement cityInput;

    @FindBy(xpath = "(//div[@class='property__label']/following-sibling::input)[6]")
    public WebElement stateInput;

    @FindBy(xpath = "(//div[@class='property__label']/following-sibling::input)[7]")
    public WebElement countryInput;


    @FindBy(xpath = "//span[@title='All contacts']")
    public WebElement allContactLink;

    @FindBy(xpath = "(//div[@class='app-navigation-entry__counter'])[1]")
    public WebElement totalContactNumber;

    @FindBy(xpath = "//div[@class='app-content-list-item-line-one']")
    public List<WebElement> contactlist;

    @FindBy(xpath = "//button[@aria-label='Actions']")
    public List<WebElement> threeDotsIcon;

    @FindBy(xpath = "(//span[@class='action-button__text'])[6]")
    public WebElement deleteLink;

    @FindBy(xpath = "//h2[@class='empty-content__title']")
    public WebElement textAfterDelete;

    @FindBy(xpath = "//button[@class='icon action-item__menutoggle icon-picture-force-white']")
    public WebElement photoIcon;

    @FindBy(xpath = "(//span[@class='action-button__text'])[6]")
    public WebElement chooseFromFileLink;



    @FindBy(xpath = "//button[@class='primary']")
    public WebElement chooseButton;

    @FindBy(xpath = "//div[@class='contact-header-avatar__photo']")
    public WebElement profilePhoto;


}
