# Static Elements

## Overview
This repository contains code for verifying static elements within an application using Cypress. It follows a structured approach to maintain and verify elements across various application pages.

## Repository Structure
The repository is organized as follows:

- `pages` folder: Contains the Page Object Model (POM) class for static elements. The `staticElementPage.js` file describes element selectors and methods for interacting with these elements.

- `cypress/integration` folder: Contains the Cypress test specification file, `staticElements.cy.js`, where the static elements are verified. This file imports the `staticElementPage` for element interactions.

## Description
### Page Object Model (POM)
We have structured the code with a POM approach to enhance maintainability. The POM class, `staticElementPage.js`, encapsulates methods for interacting with static elements on various application pages.

### Generic Verification Function
To reduce code repetition, we've created a single generic function within the POM class to verify elements and their expected text. This function simplifies the process of verifying elements across different pages in the application.

### Cypress Test Specification
The `staticElements.cy.js` Cypress test specification file contains scenarios to verify the static elements within the application. It imports the `staticElementPage` to call the methods defined in the POM class.

## Usage
1. Clone this repository to your local environment.

2. Install Cypress by running the following command:
