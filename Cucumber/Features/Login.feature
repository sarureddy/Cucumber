
Feature:Login feature
Scenario: positive login scenario
Given  user is on login page
When user enters "abc@gmail.com" and "saraswathi"
And user clicks on submit button
Then user is on regis page

#Scenario Outline: Negative login scenario
#Given  user is on login page
#When user enters "<username>" and "<password>"
#And user clicks on submit button
#Then user is on regis page
#
#Examples:
#|username|password|
#|abc@gmail.com|abc@123|
#|xyz@yahoo.com|abc@123|
#|res@capgemini.com|abc@123|
#
#@smoke
#Scenario: positive login scenario
#Given  user is on login page
#When user enters un and pw
#|xyz@gmail.com|sarswathi|
#And user clicks on submit button
#Then user is on regis page