package com.TryCloud_Group1.pages;

import com.TryCloud_Group1.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DeletedFilesPage_GD {

    public DeletedFilesPage_GD(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.='Deleted files']")
    public WebElement deletedFilesTab;
    @FindBy(xpath = "//a[.='Deleted']")
    public WebElement deletedFilter;
    @FindBy(xpath = "(//tbody[@id='fileList'])[12]//tr")
    public List<WebElement> deletedFileList;
    @FindBy(xpath = "//div[@id='app-content-trashbin']//span[@class='innernametext']")
    public List<WebElement> deletedFilesListName;
    @FindBy(xpath = "(//table[@id='filestable']//tbody)[12]/tr/td/a/span/a[2]")
    public List<WebElement> threeDotsButton;
    @FindBy(xpath = "(//span[.='Delete permanently'])[2]")
    public WebElement deletePermanently;
    @FindBy(linkText = "All files")
    public WebElement allFilesTab;
    @FindBy(xpath = "//div[@id='app-content-files']//span[@class='innernametext']")
    public List<WebElement> allFilesListName;
    @FindBy(xpath = "(//table[@id='filestable']//tbody)[12]/tr/td/a/span/a[1]")
    public List<WebElement> restoreButton;


    //methods using above locators
    public WebElement selectFileToDeleteXPath(int index) {
        return threeDotsButton.get(index);
    }

    public WebElement selectFileToRestore(int index) {
        return restoreButton.get(index);
    }
}
