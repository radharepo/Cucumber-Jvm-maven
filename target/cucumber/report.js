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
formatter.before({
  "duration": 5678631110,
  "status": "passed"
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
  "location": "LoginPage_Steps.I_am_on_home_page()"
});
formatter.result({
  "duration": 6069746760,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage_Steps.I_click_on_Login_button()"
});
formatter.result({
  "duration": 232775499,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage_Steps.I_Log_into_the_site()"
});
formatter.result({
  "duration": 5704734481,
  "status": "passed"
});
formatter.after({
  "duration": 293139668,
  "status": "passed"
});
});