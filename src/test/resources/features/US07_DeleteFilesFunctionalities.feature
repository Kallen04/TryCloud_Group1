Feature: Delete/Restore files

  Background:
    Given the user is on the login page
    When user enters the user information
    Then user should be able to login

    When user clicks on the "Files" Module
    And user clicks on the Deleted files tab


 #As a user, I should be able to see all deleted files and delete/restore them permanently under the Deleted Files tab.
  @B30G3-195
  Scenario: US7AC1 Verify user can sort deleted files
    When user clicks on the Deleted button
    Then user should see file list sorted from newest to oldest


  @B30G3-196
  Scenario: US7AC2 Verify user can delete file permanently
    When user clicks the three dots icon in the file's line
    And user clicks on Delete permanently option
    Then file should be permanently deleted


  @B30G3-197
  Scenario: US7AC3 Verify user can restore any deleted file
    When user clicks the Restore button in the files line
    Then user should see the restored file under the All Files tab