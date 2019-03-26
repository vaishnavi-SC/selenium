$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/LoginFeature/LoginFile.feature");
formatter.feature({
  "name": "Facebook Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "FB login with username and password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Enter the Url",
  "keyword": "Given "
});
formatter.step({
  "name": "Enter the username\"\u003cusername\u003e\" and password \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user click login button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "mercury",
        "mer"
      ]
    },
    {
      "cells": [
        "mer",
        "mer"
      ]
    },
    {
      "cells": [
        "mercury",
        "mercury"
      ]
    }
  ]
});
formatter.scenario({
  "name": "FB login with username and password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Enter the Url",
  "keyword": "Given "
});
formatter.match({
  "location": "Loginstep.enter_the_Url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the username\"mercury\" and password \"mer\"",
  "keyword": "When "
});
formatter.match({
  "location": "Loginstep.enter_the_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click login button",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginstep.user_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "FB login with username and password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Enter the Url",
  "keyword": "Given "
});
formatter.match({
  "location": "Loginstep.enter_the_Url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the username\"mer\" and password \"mer\"",
  "keyword": "When "
});
formatter.match({
  "location": "Loginstep.enter_the_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click login button",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginstep.user_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "FB login with username and password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Enter the Url",
  "keyword": "Given "
});
formatter.match({
  "location": "Loginstep.enter_the_Url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the username\"mercury\" and password \"mercury\"",
  "keyword": "When "
});
formatter.match({
  "location": "Loginstep.enter_the_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click login button",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginstep.user_click_login_button()"
});
formatter.result({
  "status": "passed"
});
});