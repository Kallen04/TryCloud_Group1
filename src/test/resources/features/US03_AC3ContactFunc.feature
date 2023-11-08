@B30G3-173
Feature: Default
	As a user, I should be able to create a new contact and edit/delete any contact under Contacts module
	Background:
		#@B30G3-175
		Given the user is on the login page
		When user enters the username "user_username" and password "user_password"
		Then user should be able to login
		#@B30G3-176
		When user click Files module
		And user click + icon
		And user click Upload and Upload file
		Then user should be able to see file photo "profilePic.jpeg" on the list
		#@B30G3-174
		When user click Contacts module
		Then user should be able to see Contact page

		


	@B30G3-171
	Scenario: US03 AC03 Verify user change profile picture with previously picture
		When user click name from list contact
		And user click photo icon
		And user click Choose from Files
		And user choose file name "profilePic.jpeg" file
		Then user should be able to see photo on profile