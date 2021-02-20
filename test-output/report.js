$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "As a user I want a login page so that only authentic",
  "description": "users will be able to login",
  "id": "as-a-user-i-want-a-login-page-so-that-only-authentic",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@dashboard"
    }
  ]
});
formatter.before({
  "duration": 8762332803,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Valid users should be able to login",
  "description": "",
  "id": "as-a-user-i-want-a-login-page-so-that-only-authentic;valid-users-should-be-able-to-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on Techfios site",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter username and password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Dashboard page should display",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.I_am_on_Techfios_site()"
});
formatter.result({
  "duration": 163601312,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.I_enter_username_and_password()"
});
formatter.result({
  "duration": 749263686,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.I_click_on_sign_in_button()"
});
formatter.result({
  "duration": 2790629409,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.dashboard_page_should_display()"
});
formatter.result({
  "duration": 28653,
  "status": "passed"
});
formatter.after({
  "duration": 887084710,
  "status": "passed"
});
});