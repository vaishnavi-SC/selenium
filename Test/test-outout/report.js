$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Features/GoogleFeatures.feature");
formatter.feature({
  "name": "Google Homepage",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Check that main elements on Google Homepage are displayed",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I launch Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "name": "I open Google Homepage",
  "keyword": "When "
});
formatter.step({
  "name": "I verify that the page displays \"\u003csearch\u003e\" search text box",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "search"
      ]
    },
    {
      "cells": [
        "java"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Check that main elements on Google Homepage are displayed",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I launch Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "GoogleSteps.i_launch_Chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I open Google Homepage",
  "keyword": "When "
});
formatter.match({
  "location": "GoogleSteps.i_open_Google_Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify that the page displays \"java\" search text box",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSteps.i_verify_that_the_page_displays_search_text_box(String)"
});
formatter.result({
  "status": "passed"
});
});