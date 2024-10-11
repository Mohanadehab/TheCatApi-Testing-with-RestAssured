
# API Testing Project with TheCatAPI

This project demonstrates API testing techniques using TheCatAPI. The project involves various tools such as Postman for API requests, testing automation, and other methodologies, aimed at ensuring the functionality and reliability of the API.

## Table of Contents

- [Project Overview](#project-overview)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [Contributing](#contributing)
- [License](#license)

## Project Overview

This project focuses on API testing for TheCatAPI, a public API that provides data related to cats (such as breeds, images, votes, etc.). The project utilizes Postman to document the API endpoints and automate tests. The goal is to ensure that the API behaves as expected, including handling edge cases and invalid inputs.

## Features

- **Automated API Testing**: Various tests are automated to validate the behavior of the API.
- **Postman Collection**: Well-structured Postman documentation and collection for testing.
- **Basic API Requests**: GET, POST, and DELETE requests are demonstrated.
- **Error Handling**: Tests for invalid inputs and error scenarios.
- **Assertion Checks**: Ensure correct responses and behavior based on API specifications.

## Installation

To run this project locally, follow these steps:

1. Clone the repository to your local machine:
   ```bash
   git clone https://github.com/yourusername/APIProject.git
   ```

2. Navigate to the project directory:
   ```bash
   cd APIProject
   ```

3. Install the required dependencies for testing:
   - Install Postman if you haven’t already: [Download Postman](https://www.postman.com/downloads/)
   - Open the Postman collection provided within the project.

## Usage

To test the API:

1. Open Postman and import the provided Postman collection:
   - Go to **File > Import**, then select the Postman collection (`API_Testing_Collection.postman_collection.json`) from the project directory.

2. Run the collection in Postman:
   - Click on the **Runner** tab in Postman.
   - Select the collection and start the test runner to execute the tests.

3. Review the test results:
   - After the tests are completed, view the test results for each endpoint, including passed and failed tests, along with detailed error information if applicable.

## Project Structure

- `API_Testing_Collection.postman_collection.json`: The Postman collection containing all the API requests and tests.
- `README.md`: The project README file.
- Other relevant files and folders necessary for testing are included.

## Contributing

Contributions are welcome! If you'd like to contribute, please fork the repository and submit a pull request with your changes.

1. Fork the Project.
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`).
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`).
4. Push to the Branch (`git push origin feature/AmazingFeature`).
5. Open a Pull Request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
