
# TheCatAPI - Testing with RestAssured

## Overview
This project is an API testing framework built using **RestAssured** to test the functionality of TheCatAPI. It focuses on validating the responses from various API endpoints, ensuring the correctness of data and response structures.

## Project Structure
- **src/main/java**: Contains the main classes and test cases.
- **src/test/java**: Holds the test files, organized according to the API features being tested.


## Tools & Technologies
- **RestAssured**: For API test automation.
- **Java**: Programming language used.
- **JUnit**: For running test cases and assertions.
- **Maven**: Build and dependency management tool.

## How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/Mohanadehab/TheCatApi-Testing-with-RestAssured.git
   ```
2. Import the project into your favorite IDE (e.g., IntelliJ or Eclipse).
3. Ensure Maven is set up correctly to handle dependencies.
4. Run the test cases using JUnit or Maven commands:
   ```bash
   mvn test
   ```

## Test Cases
The test cases include assertions for:
- Response status codes (e.g., 200 OK).
- Correctness of JSON response data (e.g., breed names, image URLs).
- Response time validation to ensure performance.

## Future Enhancements
- Add more test cases for POST, PUT, DELETE operations (if applicable).
- Expand validation of error responses and edge cases.
