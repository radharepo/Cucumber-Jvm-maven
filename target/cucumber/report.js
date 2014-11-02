$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "id": "s195-login",
  "description": "",
  "name": "s195 Login",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "s195-login;verify-the-s195-login-process",
  "tags": [
    {
      "name": "@Login",
      "line": 3
    }
  ],
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
  "location": "LoginPage_Steps.I_am_on_home_page()"
});
formatter.result({
  "duration": 13179808634,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage_Steps.I_click_on_Login_button()"
});
formatter.result({
  "duration": 311901024,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage_Steps.I_Log_into_the_site()"
});
formatter.result({
  "duration": 6164719270,
  "status": "passed"
});
formatter.after({
  "duration": 344377231,
  "status": "passed"
});
});