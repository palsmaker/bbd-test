$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "As a user I want a login page so that only authentic",
  "description": "users will be able to login",
  "id": "as-a-user-i-want-a-login-page-so-that-only-authentic",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Valid users should be able to login",
  "description": "",
  "id": "as-a-user-i-want-a-login-page-so-that-only-authentic;valid-users-should-be-able-to-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on Techfios site",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter username and password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Dashboard page should display",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.I_am_on_Techfios_site()"
});
formatter.result({
  "duration": 10529324473,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.I_enter_username_and_password()"
});
formatter.result({
  "duration": 6460501630,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.I_click_on_sign_in_button()"
});
formatter.result({
  "duration": 2872311818,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat steps.LoginSteps.I_click_on_sign_in_button(LoginSteps.java:37)\r\n\tat ✽.And I click on sign in button(./src/test/java/features/login.feature:7)\r\n",
  "status": "pending"
});
formatter.match({
  "location": "LoginSteps.dashboard_page_should_display()"
});
formatter.result({
  "status": "skipped"
});
});