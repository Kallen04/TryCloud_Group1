package com.TryCloud_Group1.pages;

import com.TryCloud_Group1.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPage_KA {

    public DashboardPage_KA(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//ul[@id='appmenu']/li[@data-id]/a")
    public List<WebElement> allActualModulesWE;

    @FindBy(xpath = "//div[@class='avatardiv avatardiv-shown']")
    public WebElement usernameIcon;

    @FindBy(xpath = "//*[@id=\"expanddiv\"]/ul/li[1]/div/span")
    public WebElement userName;

    @FindBy(xpath = "//a[.='Customize']")
    public WebElement customizeButton;

    @FindBy(xpath = "//li[@data-v-d8d86ca2]")
    public List<WebElement> allActualWidgetsWE;

    @FindBy(xpath = "//input[contains(@id, 'checkbox')]")
    public List<WebElement>allCheckboxes;

    @FindBy(xpath = "//a[@data-v-30c75648]")
    public WebElement statusSelection;

    @FindBy(xpath = "//div[@data-v-d5c541dc]")
    public List<WebElement> allActualStatusOptionsWE;

    @FindBy(xpath = "//input[@type='radio']")
    public List<WebElement>allRadioButtons;

}
