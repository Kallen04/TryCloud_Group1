package com.TryCloud_Group1.step_definitions;

import com.TryCloud_Group1.pages.BasePage;
import com.TryCloud_Group1.pages.DeletedFilesPage_GD;
import com.TryCloud_Group1.utilities.BrowserUtils;
import com.TryCloud_Group1.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class US07_DeleteFilesStepDefinitions extends BasePage {

    DeletedFilesPage_GD deleteFiles = new DeletedFilesPage_GD();
    List<String> beforeSortingFileList = new ArrayList<>();
    List<String> beforeDeleting = new ArrayList<>();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    String fileName;

    @When("user clicks on the {string} Module")
    public void userClicksOnThe(String moduleName) {
        clickOnModule(moduleName);
    }

    @And("user clicks on the Deleted files tab")
    public void userClicksOnTheDeletedFilesTab() {
        deleteFiles.deletedFilesTab.click();
    }

    @When("user clicks on the Deleted button")
    public void userClicksOnTheDeletedButton() {
        for (WebElement each : deleteFiles.deletedFileList) {
            beforeSortingFileList.add(each.getText());
        }
        BrowserUtils.doubleClick(deleteFiles.deletedFilter);
    }

    @Then("user should see file list sorted from newest to oldest")
    public void userShouldSeeFileListSortedFromNewestToOldest() {
        List<String> afterSortingFileList = new ArrayList<>();
        for (WebElement each : deleteFiles.deletedFileList) {
            afterSortingFileList.add(each.getText());
        }
        Collections.reverse(afterSortingFileList);
        Assert.assertEquals(beforeSortingFileList, afterSortingFileList);
    }

    @When("user clicks the three dots icon in the file's line")
    public void userClicksTheThreeDotsIconInTheFileSLine() {
        for (WebElement each : deleteFiles.deletedFileList) {
            beforeDeleting.add(each.getText());
        }
        deleteFiles.selectFileToDeleteXPath(0).click();
    }

    @And("user clicks on Delete permanently option")
    public void userClicksOnDeletePermanentlyOption() {
        deleteFiles.deletePermanently.click();
    }

    @Then("file should be permanently deleted")
    public void fileShouldBePermanentlyDeleted() {
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("(//tbody[@id=\"fileList\"])[12]//tr"), deleteFiles.deletedFileList.size() - 1));
        List<String> afterDeleting = new ArrayList<>();
        for (WebElement each : deleteFiles.deletedFileList) {
            afterDeleting.add(each.getText());
        }

        Assert.assertNotEquals(beforeDeleting, afterDeleting);
    }

    @When("user clicks the Restore button in the files line")
    public void userClicksTheRestoreButtonInTheFilesLine() {
        fileName = deleteFiles.deletedFilesListName.get(1).getText();
        deleteFiles.selectFileToRestore(1).click();
    }

    @Then("user should see the restored file under the All Files tab")
    public void userShouldSeeTheRestoredFileUnderTheAllFilesTab() {
        deleteFiles.allFilesTab.click();
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//div[@id='app-content-files']//span[@class='innernametext']"), deleteFiles.allFilesListName.size() + 1));
        List<String> finalFileNameList = new ArrayList<>();
        for (WebElement element : deleteFiles.allFilesListName) {
            finalFileNameList.add(element.getText());
        }
        Assert.assertTrue(finalFileNameList.contains(fileName));
    }

}
