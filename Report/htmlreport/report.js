$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles/forgotfunction.feature");
formatter.feature({
  "name": "To validate forgotten password functionality in facebook application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.scenario({
  "name": "To  validate forgotten password with email or mobile no",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "launch the browser and url",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.launch_the_browser_and_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Maximize the window",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click forgotten password buttton",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_click_forgotten_password_buttton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to enter email or mobiloe no",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_have_to_enter_email_or_mobiloe_no()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "then click the search button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.then_click_the_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});