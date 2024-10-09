# The Cat API Testing with RestAssured

This project provides automated API testing for [TheCatAPI](https://thecatapi.com/) using the RestAssured library. The framework follows a modular design, making it easy to scale and maintain.

## Table of Contents
- [Overview](#overview)
- [Project Structure](#project-structure)
- [Test Descriptions](#test-descriptions)
- [Setup and Configuration](#setup-and-configuration)
- [Running the Tests](#running-the-tests)
- [Testing Approach](#testing-approach)
- [Dependencies](#dependencies)
- [Future Enhancements](#future-enhancements)
- [Troubleshooting](#troubleshooting)
- [Contributing](#contributing)
- [License](#license)

## Overview

This project focuses on testing the following endpoints of TheCatAPI:
- **Breeds**: Retrieve details of various cat breeds.
- **Favorites**: Add, retrieve, and remove favorite cats.
- **Images**: Fetch, upload, and vote on images.
- **Votes**: Cast and retrieve votes on images.

The framework leverages:
- **RestAssured**: For HTTP requests and validation.
- **TestNG**: For organizing and running test cases.
- **Maven**: For dependency management and build lifecycle.

## Project Structure

```plaintext
.
├── pom.xml                              # Maven configuration and dependencies
├── src
│   └── test
│       └── java
│           └── com
│               └── example
│                   ├── BaseTest.java                # Base class for common setup and utilities
│                   ├── breeds
│                   │   └── GetBreedsTest.java       # Tests for the Breeds endpoint
│                   ├── favorites
│                   │   └── AddFavoriteTest.java     # Tests for the Favorites endpoint
│                   └── images
│                       └── GetImageTest.java        # Tests for the Images endpoint
└── target                                # Maven build output directory
