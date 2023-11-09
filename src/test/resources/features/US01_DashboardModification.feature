@B30G3-200
Feature: Default

	Background:
		#@B30G3-175
		  Given the user is on the login page
		  When user enters the user information
		  Then user should be able to login
		

	#{color:#de350b}*User Story :*{color}
	#
	#As a user I should be able to modify *+Dashboard+* page
	#
	#{color:#de350b}*Acceptance Criteria*{color}
	#
	#1 - After Login user can see all modules and Username.
	#2 - User can click on Customize button and select any of the Widgets.
	#3 - User can click on Set Status button and select any of the Status options.
	@B30G3-178
	Scenario: US01AC01TC01 Dashboard modules verification
		Then user can see below modules
		|Dashboard|
		|Files|
		|Photos|
		|Activity|
		|Talk|
		|Mail|
		|Contacts|
		|Circles|
		|Calendar|
		|Deck|	

	#{color:#de350b}*User Story :*{color}
	#
	#As a user I should be able to modify *+Dashboard+* page
	#
	#{color:#de350b}*Acceptance Criteria*{color}
	#
	#{color:#0747a6}*1 - After Login user can see all modules and Username.*{color}
	#2 - User can click on Customize button and select any of the Widgets.
	#3 - User can click on Set Status button and select any of the Status options.
	@B30G3-179
	Scenario: US01AC01TC02 Username verification
		When user clicks username icon
		Then user should see "username" on top of the dropdown	

	#{color:#de350b}*User Story :*{color}
	#
	#As a user I should be able to modify *+Dashboard+* page
	#
	#{color:#de350b}*Acceptance Criteria*{color}
	#
	#1 - After Login user can see all modules and Username.
	#{color:#0747a6}*2 - User can click on Customize button and select any of the Widgets.*{color}
	#3 - User can click on Set Status button and select any of the Status options.
	#h4.
	@B30G3-180
	Scenario: US01AC02TC01 Dashboard customization verification
		When user clicks customize button
		And user sees below widgets
		|Status|
		|Weather|
		|Upcoming events|
		|Important mail|
		|Talk mentions|
		|Upcoming cards|
		|Unread mail|
		|Recommended files|
		|Recent statuses|
		Then user should be able to select any widget	

	#{color:#de350b}*User Story :*{color}
	#
	#As a user I should be able to modify *+Dashboard+* page
	#
	#{color:#de350b}*Acceptance Criteria*{color}
	#
	#1 - After Login user can see all modules and Username.
	#2 - User can click on Customize button and select any of the Widgets.
	#{color:#0747a6}*3 - User can click on Set Status button and select any of the Status options.*{color}
	#h4.  
	@B30G3-199
	Scenario: US01AC03TC01 Status functionality verification
		When user clicks username icon
		And user clicks set status option
		And user should see below status options
		|Online|
		|Away|
		|Do not disturb|
		|Invisible|
		Then user should be able to select any option