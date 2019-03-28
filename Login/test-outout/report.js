$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/Users/ADMIN/git/repository/Login/src/test/java/LoginFeature/Tagging.feature");
formatter.feature({
  "name": "tages in cucumber",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "open url",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "name": "verify url test",
  "keyword": "Given "
});
formatter.match({
  "location": "TaggingSteps.verify_url_test()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Close browser",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "name": "this close browser",
  "keyword": "Given "
});
formatter.match({
  "location": "TaggingSteps.this_close_browser()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat stepDef.TaggingSteps.this_close_browser(TaggingSteps.java:20)\r\n\tat ✽.this close browser(file:/C:/Users/ADMIN/git/repository/Login/src/test/java/LoginFeature/Tagging.feature:9)\r\n",
  "status": "failed"
});
});