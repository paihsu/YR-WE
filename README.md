[![Build Status](https://travis-ci.org/cpe305Spring17/spring2017-project-paihsu.svg?branch=master)](https://travis-ci.org/cpe305Spring17/spring2017-project-paihsu)

Wedding Weight Planner, (WWP)

Heroku app url: https://wwp-305-project.herokuapp.com

Main Idea:
---------------------------
Helps user set a daily calorie budget and make the full calendar until user hit the goal.

• Effective: Chose goal base on the even, and set it on the proven principles of calorie.

• Personal: Set your goals and achieve them on your terms.

---------------------------
The Formula for Losing Weight:  
  
  Harris Benedict gives a pretty good idea of how many calories you should consume to stay at your current weight. Because a pound of fat equals about 3,500 calories, cutting 500 calories a day will mean one pound lost in a week, a reasonable amount.

  But eating less isn't the only way to slim down. To lose 500 calories a day, you also can cut calories by 250 and add a workout that burns 250 calories.

• The Basic Formula of calculate BMR : 655 + (4.35 x weight in pounds ) + (4.7 x height in inches ) - (4.7 x age).

• In the funture, this app will hope to include active chosing:

Sedentary: BMR x 1.2.

Lightly active (light exercise one to three days a week): BMR x 1.375.

Moderately active (moderate exercise three to five days per week): BMR x 1.55.

Very active (vigorous exercise six to seven days a week): BMR x 1.725.

Extremely active (intense exercise or sports training six to seven days per week): BMR x 1.9.

---------------------------
The Class Diagram:

<img src="https://raw.githubusercontent.com/cpe305Spring17/spring2017-project-paihsu/master/WWP_classDiagram.png" />

Architecture:

<img src="https://raw.githubusercontent.com/cpe305Spring17/spring2017-project-paihsu/master/googleAPIDiagram.png" />

---------------------------
Patterns:
Singleton: The object can only be instantiated one time. Repeated calls to its constructor return the same instance.

Mediator: It useful in the development of complex forms. It provides central authority over a group of objects by encapsulating how these objects interact.

---------------------------
This final release is fully functional following with 4 pages:



<img src="https://raw.githubusercontent.com/cpe305Spring17/spring2017-project-paihsu/master/wwp01.png" />

The weight input page: input page for making valuable input

<img src="https://raw.githubusercontent.com/cpe305Spring17/spring2017-project-paihsu/master/wwp02.png" />

The weight Result page: result page for giving the daily calori allowance, user should check the result witht the image under to see if the number make sense (such as +- 500 calori for daily)

<img src="https://raw.githubusercontent.com/cpe305Spring17/spring2017-project-paihsu/master/wwp03.png" />

The WWP Calendar

<img src="https://raw.githubusercontent.com/cpe305Spring17/spring2017-project-paihsu/master/wwp04.png" />

LogIn to link your Google Calendar and update with it

<img src="https://raw.githubusercontent.com/cpe305Spring17/spring2017-project-paihsu/master/wwp05.png" />

The update result: calendar page: this page is use for login user's own google calender. By follwing the result, user starts their own daily update on thier google calender.

Once user need to do the calculation again, they will have a new result, and when they logIn to the google calendar, the user can still see the whole diet path from the from the beginning. 
WWP start page: home pages to start the web application

<img src="https://raw.githubusercontent.com/cpe305Spring17/spring2017-project-paihsu/master/wwp07.png" />

---------------------------
The Key learn & The best about the design and implementation of this individual project:  work on google API

<img src="https://raw.githubusercontent.com/cpe305Spring17/spring2017-project-paihsu/master/moregoogleapi.png" />

