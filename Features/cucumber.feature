Feature: facebook login 
Scenario Outline: login with credentials 
	Given open chrome 
	Then Enter URl 
	When "<username>" and "<password>" correct 
	Then opens fb Homepage 
	Then close window 
	
	Examples: 
		|username|password|
		|sj4udj@gmail.com|$rinubilla.25$$|
