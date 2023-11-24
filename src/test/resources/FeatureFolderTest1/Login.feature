Feature: This feature is for login functionality

@LoginTest1

Scenario: verify user can successfully login

Given Launch "<URL>"
When I click loginLink,enter user name, password and click login button
Then verify user can successfully login