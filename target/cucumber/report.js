$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "id": "s195-login",
  "tags": [
    {
      "name": "@login",
      "line": 1
    }
  ],
  "description": "",
  "name": "s195 Login",
  "keyword": "Feature",
  "line": 2
});
formatter.scenario({
  "id": "s195-login;verify-the-s195-login-process",
  "description": "",
  "name": "Verify the s195 login process",
  "keyword": "Scenario",
  "line": 4,
  "type": "scenario"
});
formatter.step({
  "name": "I am on home page",
  "keyword": "When ",
  "line": 5
});
formatter.step({
  "name": "I click on Login button",
  "keyword": "Then ",
  "line": 6
});
formatter.step({
  "name": "I Log into the site",
  "keyword": "And ",
  "line": 7
});
formatter.match({
  "location": "LoginSteps.I_am_on_home_page()"
});
formatter.result({
  "duration": 162047193,
  "status": "pending",
  "error_message": "cucumber.api.PendingException: TODO: implement me\n\tat com.cucumber.test.LoginSteps.I_am_on_home_page(LoginSteps.java:11)\n\tat ✽.When I am on home page(Login.feature:5)\n"
});
formatter.match({
  "location": "LoginSteps.I_click_on_Login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.I_Log_into_the_site()"
});
formatter.result({
  "status": "skipped"
});
});