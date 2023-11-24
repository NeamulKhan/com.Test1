Feature: This feature is for login functionality

@LoginTest1

Scenario: verify user can successfuylly log in

Given Launch "<URL>"
When I click loginLink, enter user name, password and click login button
Then verufy user can successfully log in