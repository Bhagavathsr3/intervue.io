This project showcases web automation testing built using Java, Selenium WebDriver, TestNG, and Maven. The test cases are designed for the INTERVUE QA Intern Assessment, focusing on functional flow.

Tech Stack

Programming Language: Java
Testing Framework: TestNG
Build Tool: Maven
Automation Tool: Selenium WebDriver
Browser: Chrome (via ChromeDriver)


Project Structure

src/
├── test/
│   ├── java/
│   │   ├── test/       # Contains all test classes
│   │   └── utility/    # Contains reusable utility methods
│
|——Test-Report # Contains the result of passed & failed test cases(open with webBrowser)
├── testng.xml # TestNG suite File to run test cases
└── pom.xml

How to Run the Project

1. First, clone the repository to your local machine
2. Move into the project directory
3. Run the test suite
Right-click on testng.xml and select Run 'testng.xml' (or similar, depending on your IDE).
This will execute all the test cases defined in the testng.xml suite file.

Key Features

Execution using TestNG suite file
Modular utility methods for reusability
Functional UI automation
Validations with assertions
Organized test classes in the test package


Prerequisites

JDK 8 or higher
Maven
Chrome browser
ChromeDriver (path must be set if not globally available)


GitHub Repository
GitHub Link:

Author
Bhagavath Shankar
