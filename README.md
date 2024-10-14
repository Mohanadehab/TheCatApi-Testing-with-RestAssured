TheCatAPI - Testing with RestAssured
Overview
This project is an API testing framework built using RestAssured to test the functionality of TheCatAPI. It focuses on validating the responses from various API endpoints, ensuring the correctness of data and response structures.

Project Structure
src/main/java: Contains the main classes and test cases.
src/test/java: Holds the test files, organized according to the API features being tested.
Features
GET /breeds:
Retrieves a list of all cat breeds.
Verifies the status code and structure of the response.
GET /categories:
Fetches the available categories for cat images.
Ensures the response data is correct and checks for the presence of specific categories.
GET /images/search:
Searches and retrieves cat images based on breed or category.
Tests the response to validate that the correct images are returned according to the search parameters.
Tools & Technologies
RestAssured: For API test automation.
Java: Programming language used.
JUnit: For running test cases and assertions.
Maven: Build and dependency management tool.
How to Run
Clone the repository:
bash
Copy code
git clone https://github.com/Mohanadehab/TheCatApi-Testing-with-RestAssured.git
Import the project into your favorite IDE (e.g., IntelliJ or Eclipse).
Ensure Maven is set up correctly to handle dependencies.
Run the test cases using JUnit or Maven commands:
bash
Copy code
mvn test
Test Cases
The test cases include assertions for:

Response status codes (e.g., 200 OK).
Correctness of JSON response data (e.g., breed names, image URLs).
Response time validation to ensure performance.
Future Enhancements
Add more test cases for POST, PUT, DELETE operations (if applicable).
Expand validation of error responses and edge cases.
