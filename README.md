# FizzBuzz Application
* Author : Chenna Rao
* The project title : FizzBuzz Application
   * The FizzBuzz application is developed using spring boot packages
   * There are two stages in the game
   * Stage One Rules :
     * A number is Fizz if it is divisible by 3
     * A number is Buzz if it is divisible by 5
     * A number is FizzBuzz if it is divisible by both 3 and 5
   * Stage Two Rules :
     * A number is Fizz if it is divisible by 3 or 3 in it.
     * A number is Buzz if it is divisible by 5 or 5 in it.
     * A number is FizzBuzz if it is satisfies above two criterias together.
   * Factory pattern(@link FizzBuzzRulesFactory) is used to create stage one and stage two rules
   * MVC pattern is used to build micro service.
   * application.properties file holds the start and end of sequences.
    
* How to install any dependencies, files or environment variables your code requires:
  * all dependencies are configured in pom file
  
* How to build and run your application: <br/>
  Application is developed using Spring Boot. Please use one of the options
  * Use  mvn clean package spring-boot:run
  * Run FizzBuzzServiceImplTest from IDE.

Notes: 
* application server port is configured as 8080
* URI : http://localhost:8080/fizzbuzz/{ONE|TWO}
 

