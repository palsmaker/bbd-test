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
    },
    {
      "line": 1,
      "name": "@smoke"
    },
    {
      "line": 1,
      "name": "@sprint1"
    },
    {
      "line": 1,
      "name": "@endtoend"
    }
  ]
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 5,
      "value": "#\tmanaging number of test cases in test suite, we can tag them to invoke them as and when reqd eg,smoke,sanity test help organize"
    },
    {
      "line": 6,
      "value": "#\tScenario: Valid users should be able to login"
    },
    {
      "line": 7,
      "value": "#\tGiven I am on Techfios site"
    },
    {
      "line": 8,
      "value": "#\tWhen I enter username and password"
    },
    {
      "line": 9,
      "value": "#\tAnd I click on sign in button"
    },
    {
      "line": 10,
      "value": "#\tThen Dashboard page should display"
    },
    {
      "line": 12,
      "value": "#\twhen there is more than one scenario or test cases we use scenario outline with examples for data parameterization with tags"
    }
  ],
  "line": 13,
  "name": "Valid users should be able to login",
  "description": "",
  "id": "as-a-user-i-want-a-login-page-so-that-only-authentic;valid-users-should-be-able-to-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 14,
  "name": "I am on Techfios site",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I click on sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Dashboard page should display",
  "keyword": "Then "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "as-a-user-i-want-a-login-page-so-that-only-authentic;valid-users-should-be-able-to-login;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 20,
      "id": "as-a-user-i-want-a-login-page-so-that-only-authentic;valid-users-should-be-able-to-login;;1"
    },
    {
      "cells": [
        "demo@techfios",
        "abc123"
      ],
      "line": 21,
      "id": "as-a-user-i-want-a-login-page-so-that-only-authentic;valid-users-should-be-able-to-login;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4852855570,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Valid users should be able to login",
  "description": "",
  "id": "as-a-user-i-want-a-login-page-so-that-only-authentic;valid-users-should-be-able-to-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@smoke"
    },
    {
      "line": 1,
      "name": "@dashboard"
    },
    {
      "line": 1,
      "name": "@sprint1"
    },
    {
      "line": 1,
      "name": "@endtoend"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "I am on Techfios site",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I enter \"demo@techfios\" and \"abc123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I click on sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Dashboard page should display",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.I_am_on_Techfios_site()"
});
formatter.result({
  "duration": 150190605,
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
  "duration": 761873584,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.I_click_on_sign_in_button()"
});
formatter.result({
  "duration": 2010568172,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.dashboard_page_should_display()"
});
formatter.result({
  "duration": 9952351,
  "status": "passed"
});
formatter.after({
  "duration": 799284707,
  "status": "passed"
});
formatter.uri("login3.feature");
formatter.feature({
  "line": 2,
  "name": "As a user I want a login page so that only authentic",
  "description": "users will be able to login",
  "id": "as-a-user-i-want-a-login-page-so-that-only-authentic",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@smoke"
    }
  ]
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 5,
      "value": "#\tmanaging number of test cases in test suite, we can tag them to invoke them as and when reqd eg,smoke,sanity test help organize"
    },
    {
      "line": 6,
      "value": "#\tScenario: Valid users should be able to login"
    },
    {
      "line": 7,
      "value": "#\tGiven I am on Techfios site"
    },
    {
      "line": 8,
      "value": "#\tWhen I enter username and password"
    },
    {
      "line": 9,
      "value": "#\tAnd I click on sign in button"
    },
    {
      "line": 10,
      "value": "#\tThen Dashboard page should display"
    },
    {
      "line": 12,
      "value": "#\twhen there is more than one scenario or test cases we use scenario outline with examples for data parameterization with tags"
    }
  ],
  "line": 13,
  "name": "Valid users should be able to login",
  "description": "",
  "id": "as-a-user-i-want-a-login-page-so-that-only-authentic;valid-users-should-be-able-to-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 14,
  "name": "I am on Techfios site",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I click on sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Dashboard page should display",
  "keyword": "Then "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "as-a-user-i-want-a-login-page-so-that-only-authentic;valid-users-should-be-able-to-login;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 20,
      "id": "as-a-user-i-want-a-login-page-so-that-only-authentic;valid-users-should-be-able-to-login;;1"
    },
    {
      "cells": [
        "demo@techfios",
        "abc123"
      ],
      "line": 21,
      "id": "as-a-user-i-want-a-login-page-so-that-only-authentic;valid-users-should-be-able-to-login;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4179773104,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Valid users should be able to login",
  "description": "",
  "id": "as-a-user-i-want-a-login-page-so-that-only-authentic;valid-users-should-be-able-to-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "I am on Techfios site",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I enter \"demo@techfios\" and \"abc123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I click on sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Dashboard page should display",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.I_am_on_Techfios_site()"
});
formatter.result({
  "duration": 26942,
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
  "duration": 911013873,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.I_click_on_sign_in_button()"
});
formatter.result({
  "duration": 2335424844,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.dashboard_page_should_display()"
});
formatter.result({
  "duration": 8485499,
  "status": "passed"
});
formatter.after({
  "duration": 684297678,
  "status": "passed"
});
});