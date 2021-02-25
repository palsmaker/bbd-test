$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/features/login.feature");
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
    },
    {
      "line": 1,
      "name": "@Smoke"
    }
  ]
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 5,
      "value": "#\tScenario: Valid users should be able to login"
    },
    {
      "line": 6,
      "value": "#\tGiven I am on Techfios site"
    },
    {
      "line": 7,
      "value": "#\tWhen I enter username and password"
    },
    {
      "line": 8,
      "value": "#\tAnd I click on sign in button"
    },
    {
      "line": 9,
      "value": "#\tThen Dashboard page should display"
    }
  ],
  "line": 12,
  "name": "Valid users should be able to login",
  "description": "",
  "id": "as-a-user-i-want-a-login-page-so-that-only-authentic;valid-users-should-be-able-to-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 13,
  "name": "I am on Techfios site",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I click on sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Dashboard page should display",
  "keyword": "Then "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "as-a-user-i-want-a-login-page-so-that-only-authentic;valid-users-should-be-able-to-login;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 19,
      "id": "as-a-user-i-want-a-login-page-so-that-only-authentic;valid-users-should-be-able-to-login;;1"
    },
    {
      "cells": [
        "demo@techfios",
        "abc123"
      ],
      "line": 20,
      "id": "as-a-user-i-want-a-login-page-so-that-only-authentic;valid-users-should-be-able-to-login;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4655390016,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Valid users should be able to login",
  "description": "",
  "id": "as-a-user-i-want-a-login-page-so-that-only-authentic;valid-users-should-be-able-to-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
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
formatter.step({
  "line": 13,
  "name": "I am on Techfios site",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I enter \"demo@techfios\" and \"abc123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I click on sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Dashboard page should display",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.I_am_on_Techfios_site()"
});
formatter.result({
  "duration": 148401730,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios",
      "offset": 9
    },
    {
      "val": "abc123",
      "offset": 29
    }
  ],
  "location": "LoginSteps.I_enter_and(String,String)"
});
formatter.result({
  "duration": 235434765,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.I_click_on_sign_in_button()"
});
formatter.result({
  "duration": 2060063926,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.dashboard_page_should_display()"
});
formatter.result({
  "duration": 10807657,
  "status": "passed"
});
formatter.after({
  "duration": 655627363,
  "status": "passed"
});
});