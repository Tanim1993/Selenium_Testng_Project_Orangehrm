# Selenium TestNG Project for OrangeHRM

This project contains automated test scripts developed using Selenium WebDriver and TestNG for testing the OrangeHRM website

## Project Structure

The project is organized as follows:

- **src:** This directory contains the source code files for the automated test scripts.
- **.gitignore:** This file specifies which files and directories should be ignored by Git version control.
- **build.gradle:** The Gradle build configuration file for the project.
- **gradlew:** Gradle wrapper script for Unix-like systems.
- **gradlew.bat:** Gradle wrapper script for Windows systems.
- **settings.gradle:** The Gradle settings file for the project.

## Prerequisites

To run the test scripts in this project, you need to have the following software installed:

- Java Development Kit (JDK)
- Gradle Build Tool
- Selenium WebDriver
- TestNG Testing Framework

## Running the Tests

1. Clone this repository to your local machine.
2. Navigate to the project directory using the command line.
3. Open a terminal and run the following command to execute the tests:

   ```
   gradlew clean test
   ```

   This command will compile the project, execute the test scripts, and generate test reports.

## Configuration

Before running the tests, make sure to configure the following settings:

- Update the test data and configuration parameters in the test scripts located in the `src` directory.
- Modify the `build.gradle` file to include any necessary dependencies and plugins.

## Test Reports

After running the tests, you can find the test reports in the `build/reports/tests/test` directory. Open the HTML report to view the test results.
