# Serenity BDD Test Automation Framework

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white)
![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=flat&logo=selenium&logoColor=white)
![Cucumber](https://img.shields.io/badge/Cucumber-23D96C?style=flat&logo=cucumber&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=flat&logo=apache-maven&logoColor=white)
![GitHub Actions](https://img.shields.io/badge/GitHub_Actions-2088FF?style=flat&logo=github-actions&logoColor=white)

A scalable BDD test automation framework built with **Serenity BDD**, **Cucumber**, and **Selenium WebDriver** for end-to-end web application testing.

---

## 🎯 Features

- **BDD Approach** – Write tests in Gherkin syntax for clear business requirements
- **Serenity Reports** – Rich, narrative-style HTML reports with screenshots
- **Page Object Model** – Maintainable and reusable test architecture
- **CI/CD Ready** – GitHub Actions workflow included
- **Cross-Browser Support** – Chrome, Firefox, Edge

---

## 🏗️ Project Structure

```
├── src/
│   ├── main/java/
│   │   └── pages/              # Page Object classes
│   └── test/
│       ├── java/
│       │   ├── steps/          # Step definitions
│       │   └── runners/        # Test runners
│       └── resources/
│           └── features/       # Gherkin feature files
├── .github/workflows/          # CI/CD pipeline
├── pom.xml                     # Maven dependencies
└── serenity.properties         # Serenity configuration
```

---

## 🚀 Quick Start

### Prerequisites
- Java 11+
- Maven 3.6+

### Run Tests

```bash
# Clone the repository
git clone https://github.com/andreeamiut/serenity-bdd-test.git
cd serenity-bdd-test

# Run all tests
./mvnw clean verify

# Run specific tags
./mvnw clean verify -Dcucumber.filter.tags="@smoke"
```

### View Reports

After test execution, open the Serenity report:
```
target/site/serenity/index.html
```

---

## 📝 Writing Tests

### Feature File Example
```gherkin
Feature: User Login

  @smoke
  Scenario: Successful login with valid credentials
    Given the user is on the login page
    When the user enters valid credentials
    Then the user should see the dashboard
```

### Step Definition Example
```java
@Given("the user is on the login page")
public void userIsOnLoginPage() {
    loginPage.open();
}
```

---

## ⚙️ Configuration

Edit `serenity.properties` to customize:
```properties
webdriver.driver = chrome
webdriver.autodownload = true
serenity.browser.maximized = true
```

---

## 🔄 CI/CD

Tests run automatically on push via GitHub Actions. See `.github/workflows/` for pipeline configuration.

---

## 📊 Tech Stack

| Component | Technology |
|-----------|------------|
| Language | Java 11+ |
| BDD Framework | Cucumber |
| Test Framework | Serenity BDD, JUnit 5 |
| Browser Automation | Selenium WebDriver |
| Build Tool | Maven |
| CI/CD | GitHub Actions |
| Reporting | Serenity Reports |

---

## 👤 Author

**Andreea Miut** – Senior QA Automation Architect

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=flat&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/andreeamiut/)
[![GitHub](https://img.shields.io/badge/GitHub-100000?style=flat&logo=github&logoColor=white)](https://github.com/andreeamiut)

---

## 📄 License

This project is licensed under the Apache 2.0 License - see the [LICENSE](LICENSE) file for details.
