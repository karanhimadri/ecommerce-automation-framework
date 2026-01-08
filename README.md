# E-Commerce Web Automation Framework (Selenium + TestNG)

A Java-based Selenium automation testing framework built using **TestNG, Maven, and Page Object Model (POM)** to automate core functional flows of an e-commerce web application.

This project focusing on **clean framework design, stability and future scalability.

---

## 🚀 Project Overview

The framework automates critical user workflows of an e-commerce application using Selenium WebDriver.  
The target application used for automation is **SauceDemo**, a stable and widely used demo site for automation testing.

🔗 Website under test: https://www.saucedemo.com/

---

## 🛠 Tech Stack

- **Language:** Java  
- **Automation Tool:** Selenium WebDriver  
- **Test Framework:** TestNG  
- **Build Tool:** Maven  
- **Design Pattern:** Page Object Model (POM)  
- **IDE:** VS Code  
- **Version Control:** Git & GitHub  

---

## 📂 Project Structure
```bash
src
├── main
│ └── java
│ └── config
│   └── ConfigReader.java
├── test
│     └── java
│       ├── base
│       │ └── BaseTest.java
│       ├── pages
│       │ ├── LoginPage.java
│       │ ├── HomePage.java
│       │ └── CartPage.java
│       ├── tests
│       │ ├── LoginTest.java
│       │ └── AddToCartTest.java
│       └── utils
│         └── TestDataProvider.java
└── resources
  ├── config.properties
  └── testng.xml
```

---

## ✅ Automated Test Scenarios

### 🔹 Login Tests
- Valid login using standard user credentials
- Invalid login with incorrect username/password
- Verification using error message and URL assertion

### 🔹 Add to Cart Test
- Login with valid credentials
- Add a specific product to the cart
- Verify cart count increment

> **Note:**  
> The test scope is intentionally kept minimal to ensure **stability, clarity, and depth**, which is ideal for fresher-level automation roles.

---

## ⚙️ Configuration Management

All environment-related data is externalized in `config.properties`:

```properties
url=https://www.saucedemo.com/
valid_username=standard_user
valid_password=secret_sauce
invalid_username=invalid_user
invalid_password=wrong_password

# This improves maintainability and avoids hardcoding values in test scripts.
```

## ▶️ How to Run the Tests
Prerequisites
```
Java (JDK 11 or above)
Maven
Google Chrome browser
ChromeDriver compatible with Chrome version
```
Run using Maven
```bash
mvn test
```

---

## 🧠 Key Automation Concepts Used
- Page Object Model (POM)  
- TestNG annotations (@BeforeMethod, @Test, @AfterMethod)  
- Maven dependency management  
- Configuration-driven testing  
- Assertion-based validation  
- Clean separation of test logic and page logic

---

## 📌 Why This Project?
- Interview-oriented framework design  
- Easy to explain and extend  
- Realistic automation scenarios  
- Follows industry-standard practices  
- Ideal for QA Automation / SDET fresher roles  

---

## 📈 Future Enhancements (Optional)
- Data-driven testing using TestNG DataProvider  
- Extent Reports integration  
- Cross-browser testing  
- CI integration (Jenkins)  

---

## 👤 Author
**Himadri Karan**  
B.Tech CSE | Aspiring QA Automation Engineer  
🔗 GitHub: [Ecommerce-Automation-Framework](https://github.com/karanhimadri/ecommerce-automation-framework)  
🔗 Linkedin: [/in/himadrikaran](https://linkedin.com/in/himadrikaran)  
🔗 Portfolio: [himadri.me](https://himadri.me)  
