# Java Even-Odd Checker with Maven and GitHub Actions

## Project Overview

This project is a simple Java application that checks whether a given integer is even or odd. It uses Apache Maven for project management, JUnit 5 for automated unit testing, and GitHub Actions for Continuous Integration (CI).

## Features

- Checks whether a number is even or odd.
- Implements the logic using Java.
- Includes automated unit tests using JUnit 5.
- Automatically builds and tests the project using GitHub Actions.
- Uses Git and GitHub for version control.

## Technologies Used

- Java
- Apache Maven
- JUnit 5
- Git
- GitHub
- GitHub Actions

## Project Structure

```text
even-odd-ci/
├── .github/
│   └── workflows/
│       └── maven.yml
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── example/
│   │               └── EvenOdd.java
│   └── test/
│       └── java/
│           └── com/
│               └── example/
│                   └── EvenOddTest.java
├── .gitignore
└── pom.xml
```

## How to Run the Project

### Prerequisites

- Java Development Kit (JDK)
- Apache Maven
- Git

### Build and Test

Open a terminal in the project directory and execute:

```bash
mvn clean verify
```

This command compiles the Java source code and runs the configured automated tests.

## Example

| Input | Expected Result |
|---:|---|
| 2 | Even |
| 7 | Odd |
| 10 | Even |
| 15 | Odd |

## Continuous Integration with GitHub Actions

This project uses GitHub Actions to automate the build and testing process.

The workflow is configured to run when code is pushed to the `main` branch or when a pull request targets the `main` branch.

The workflow performs the following steps:

1. Checks out the repository.
2. Sets up the Java environment.
3. Configures Maven caching.
4. Builds the project and runs the automated tests using `mvn --batch-mode clean verify`.

A green check mark in the GitHub Actions tab indicates that the workflow completed successfully.

## Learning Objectives

- Understand basic Java programming.
- Learn Maven project structure and build commands.
- Write unit tests using JUnit 5.
- Manage source code using Git and GitHub.
- Implement Continuous Integration using GitHub Actions.

## Conclusion

This project demonstrates how a simple Java application can be developed, tested, version-controlled, and automatically validated using Maven, JUnit 5, Git, GitHub, and GitHub Actions.
