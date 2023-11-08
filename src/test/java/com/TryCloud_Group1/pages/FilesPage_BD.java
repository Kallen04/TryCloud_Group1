package com.TryCloud_Group1.pages;

import com.TryCloud_Group1.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FilesPage_BD {

    public FilesPage_BD(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='icon icon-add']")
    public WebElement plusIcon;

    @FindBy(xpath = "//input[@type='file']")
    public WebElement uploadFileLink;

    @FindBy(xpath = "//span[@class='nametext']")
    public List<WebElement> listOfFile;

}
