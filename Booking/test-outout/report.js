$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/FeatureFile/BusFile.feature");
formatter.feature({
  "name": "RedBus Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "RedBus Login with Chennai to Hyd",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user lanches RedBus Url",
  "keyword": "Given "
});
formatter.match({
  "location": "RB.the_user_lanches_RedBus_Url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Select from Soruce Dropdown",
  "rows": [
    {
      "cells": [
        "che"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "RB.user_Select_from_Soruce_Dropdown(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Select from Distination Dropdown",
  "rows": [
    {
      "cells": [
        "ban"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "RB.user_Select_from_Distination_Dropdown(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select 25.3.2019 in onward date",
  "keyword": "And "
});
formatter.match({
  "location": "RB.user_select_in_onward_date(Double,Double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click search button",
  "keyword": "And "
});
formatter.match({
  "location": "RB.user_click_search_button()"
});
formatter.result({
  "status": "passed"
});
});