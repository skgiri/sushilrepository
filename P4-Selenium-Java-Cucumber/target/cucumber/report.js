$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/Feature Folder/Login.feature");
formatter.feature({
  "line": 2,
  "name": "My feature",
  "description": "Feature Description:This Demo feature contains smoke and functional scenarios",
  "id": "my-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.background({
  "comments": [
    {
      "line": 4,
      "value": "#Above feature tag takes the priority. It will execute all the scenarios"
    }
  ],
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "Login to application",
  "keyword": "Given "
});
formatter.match({
  "location": "Step_Def.login_to_application()"
});
formatter.result({
  "duration": 28847954771,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "login scenario - scenario 1",
  "description": "",
  "id": "my-feature;login-scenario---scenario-1",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@p1"
    },
    {
      "line": 9,
      "name": "@smoke"
    }
  ]
});
formatter.background({
  "comments": [
    {
      "line": 4,
      "value": "#Above feature tag takes the priority. It will execute all the scenarios"
    }
  ],
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "Login to application",
  "keyword": "Given "
});
formatter.match({
  "location": "Step_Def.login_to_application()"
});
formatter.result({
  "duration": 27079837361,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 11,
      "value": "#Given Login to application"
    }
  ],
  "line": 14,
  "name": "login scenario - scenario 1",
  "description": "",
  "id": "my-feature;login-scenario---scenario-1",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@p1"
    },
    {
      "line": 13,
      "name": "@smoke"
    }
  ]
});
formatter.background({
  "comments": [
    {
      "line": 4,
      "value": "#Above feature tag takes the priority. It will execute all the scenarios"
    }
  ],
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "Login to application",
  "keyword": "Given "
});
formatter.match({
  "location": "Step_Def.login_to_application()"
});
formatter.result({
  "duration": 36661156613,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 15,
      "value": "#Given Login to application"
    }
  ],
  "line": 18,
  "name": "login scenario - scenario 1",
  "description": "",
  "id": "my-feature;login-scenario---scenario-1",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@p1"
    },
    {
      "line": 17,
      "name": "@functional"
    }
  ]
});
});