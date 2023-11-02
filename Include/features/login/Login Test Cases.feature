#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login feature
  I want to verify the login feature for the CURA web page
  @tag1
  Scenario Outline: Login with correct details
    Given User visits the CURA healthcare website
    When User try to login with a valid username and password
    Then User is logged in to the website
  
  Scenario Outline: Login with incorrect username
    Given User visits the CURA healthcare website
    When User try to login with an invalid username
    Then User gets a login error message
  
  Scenario Outline: Login with incorrect password
    Given User visits the CURA healthcare website
    When User try to login with a valid username but invalid password
    Then User gets a login error message