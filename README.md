# E-Commerce Automation Testing Framework

This is an automation testing framework built using **Java**, **Selenium WebDriver**, **Cucumber BDD**, **TestNG**, and follows the **Page Object Model (POM)** design pattern. It is designed to automate and validate the functionalities of the [Automation Exercise](https://automationexercise.com/) website.

This project serves both as a structured learning experience and as a demonstration of best practices in automation testing, version control, and code organization.

---

## 📖 Project Overview

The framework currently covers the **Signup / Login feature**, verifying the entire registration flow, including account creation, validations, and navigation through the website.

As I progress, I will add more test cases covering end-to-end scenarios such as login, product browsing, checkout, and account management.

The main purpose of this project is to:
- Gain hands-on experience with automation tools and techniques
- Implement scalable and maintainable test automation code
- Showcase my skills through consistent GitHub commits and clean architecture

---

## ✅ Technologies Used

- **Java 8+** – Programming language
- **Selenium WebDriver** – Browser automation tool
- **Cucumber BDD** – Behavior-driven development framework
- **TestNG** – Test execution and reporting framework
- **Maven** – Build and dependency management tool
- **Page Object Model (POM)** – Design pattern for separating UI elements and logic
- **Git/GitHub** – Version control and collaboration platform

---

## 📂 Project Structure

```
src/
├── main/
│   └── java/
│       ├── pages/                 # Contains methods with test steps and assertions
│       ├── pageobjectfactory/     # Contains locators and element getters
├── test/
│   └── java/
│       └── stepdefinitions/      # Contains Cucumber step definition classes
src/test/resources/
├── features/                     # Contains Gherkin-based feature files
├── testng.xml                    # TestNG test configuration file
├── log4j.properties              # Logging configuration (adding soon)
```

---

## 🚀 Getting Started

### ✅ Prerequisites

- Install **Java 8 or higher**
- Install **Maven**
- Install **Google Chrome** or another supported browser
- Install **IntelliJ IDEA** or another Java IDE

---

### ✅ How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/your-repo-name.git
   ```
2. Navigate into the project folder:
   ```bash
   cd your-repo-name
   ```
3. Build the project with Maven:
   ```bash
   mvn clean install
   ```
4. Run the tests using Maven:
   ```bash
   mvn test
   ```
   or by running the `TestRunner` class from IntelliJ

---

## ✅ Branching and Version Control

- The `main` branch holds the stable codebase
- Features are developed in branches like `feature/signup-login`
- Each feature branch focuses on specific functionalities
- Daily commits with descriptive messages are made to ensure progress tracking and code clarity

Example workflow:

```bash
git checkout -b feature/signup-login
git add .
git commit -m "Implement signup and login functionality"
git push -u origin main
```

---

## 📋 Test Cases Implemented

### ✅ Test Case 1 – User Registration Flow
- Launch browser and navigate to Automation Exercise
- Verify homepage visibility
- Click on Signup/Login
- Verify Signup form
- Enter user details (name, email)
- Click Signup
- Fill account information including Title, Name, Password, DOB
- Select newsletter and offers checkboxes
- Enter address details
- Click Create Account
- Verify account creation
- Click Continue
- Verify login success
- Delete account
- Verify account deletion

*(More test cases will be added in the coming days as I progress through the project.)*

---

## ✅ Best Practices Followed

✔ Separation of locators and actions using Page Object Factory  
✔ Business logic and validations kept in Page classes  
✔ Step definitions are clean, readable, and reusable  
✔ Meaningful commit messages and structured branching  
✔ Assertions used to ensure test reliability  
✔ Organized folder structure and code readability

---

## 📂 Future Enhancements

- Add more end-to-end test cases such as:
  - Login with valid/invalid credentials
  - Product search and checkout process
  - Cart management
  - Account updates and deletions
- Integrate advanced reporting tools like Allure or ExtentReports
- Implement parallel execution and CI/CD pipeline with GitHub Actions or Jenkins
- Add data-driven tests and configuration management

---

## 📞 Contact

For feedback or questions, feel free to reach out:

- **GitHub**: https://github.com/PrasadTestAutomation/
- **Email**: ramachandra.prasad973@gmail.com

---

### ✅ Let’s learn, grow, and build scalable test automation frameworks together!
