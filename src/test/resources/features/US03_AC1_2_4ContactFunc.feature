@B30G3-173
Feature: Default
	As a user, I should be able to create a new contact and edit/delete any contact under Contacts module

	Background:
		#@B30G3-175
		  Given the user is on the login page
		  When user enters the username "user_username" and password "user_password"
		  Then user should be able to login
		#@B30G3-174
		When user click Contacts module
		Then user should be able to see Contact page
		


	@B30G3-169
	Scenario: US03 AC01 Verify User create a new contact
		When user click New contact
		Then user enter name and last name
		And user enter Phone number
		And user enter Email
		And user enter Post Office box
		And user enter address
		And user enter Extended address
		And user enter Postal code
		And user enter City
		And user enter State
		And user enter country
		Then user should be able to see on the list


	@B30G3-170
	Scenario: US03 AC02 Verify user see all the contact as a list
		When user click all contacts
		And user see total number of list
		Then user should be able to see whole list matching with total number of the list	


	@B30G3-172
	Scenario: US03 AC04 Verify user can delete any selected contact
		When user click name from list contact
		And user click three dots icon
		And user click Delete menu
		Then user should be able to see "No contact selected" on the page