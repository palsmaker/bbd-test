$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/features/login.feature");
formatter.feature({
  "line": 2,
  "name": "As a user I want a login page so that only authentic",
  "description": "users will be able to login\r\n   \r\n//Scenario: Valid users should be able to login \r\n//Given I am on Techfios site\r\n//When I enter username and password\r\n//And I click on sign in button \r\n//Then Dashboard page should display",
  "id": "as-a-user-i-want-a-login-page-so-that-only-authentic",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@dashboard"
    },
    {
      "line": 1,
      "name": "@Smoke"
    }
  ]
});
formatter.scenario({
  "line": 11,
  "name": "Valid users should be able to login",
  "description": "",
  "id": "as-a-user-i-want-a-login-page-so-that-only-authentic;valid-users-should-be-able-to-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "I am on Techfios site",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I enter \"\u003cusename\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I click on sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Dashboard page should display",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.I_am_on_Techfios_site()"
});
formatter.result({
  "duration": 4912857486,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cusename\u003e",
      "offset": 9
    },
    {
      "val": "\u003cpassword\u003e",
      "offset": 25
    }
  ],
  "location": "LoginSteps.I_enter_and(String,String)"
});
formatter.result({
  "duration": 318514999,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.I_click_on_sign_in_button()"
});
formatter.result({
  "duration": 2046018076,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.dashboard_page_should_display()"
});
formatter.result({
  "duration": 13000237,
  "status": "passed"
});
formatter.after({
  "duration": 924630358,
  "status": "passed"
});
});