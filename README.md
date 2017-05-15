# SimpleBot

It is a basic chat bot application which is created using a SpringBoot and Program Ab. 
The Program Ab is an AIML 2.0 implementation


### Prerequisites

* JDK
* Maven

### How to Run

Step 1: Clone the project

Step 2: Edit the application.properties(src/main/resource) file and add your project base directory in simplebot.data.dir.


Exmple:

simplebot.data.dir=e:/bot


Step 3: Add your AIML files in the directory bots/simplebot/aiml/ 


The example 'test.aiml' exists in the directory.  


Step 4: Run SpringBootApplication using main method com.techforwarder.bot.simplebot.SimplebotApplication or mvn spring-boot:run

Step 5: Access the URL http://localhost:8080/index.html

Step 6: Enter the text in given text box and get the response from bot.

## Built With

* [SpringBoot](https://projects.spring.io/spring-boot/) - The SpringBoot
* [Maven](https://maven.apache.org/) - Dependency Management
* [AIML](http://www.alicebot.org/aiml.html) - Artificial Intelligence Markup Language for train the Bot
* [Program Ab](https://code.google.com/archive/p/program-ab/) - The AIML 2.0 implementation

