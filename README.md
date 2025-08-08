# 🛒 Daraz Automation Using Selenium

## 🌟 Overview
This project offers an automated testing solution for the **Daraz.pk** e-commerce platform. Built using **Java**, **Selenium WebDriver**, and **TestNG**, it follows the **Page Object Model (POM)** design pattern for better modularity, scalability, and maintainability. The automation suite targets essential features like **product search**, **brand & price filtering**, and **result verification**.


## ✨ Features

- 🔄 **Robust Page Object Model (POM)**  
  Separates UI elements and business logic to maximize code reuse and maintainability.

- 🔍 **Product Search Automation**  
  Automatically performs item searches on Daraz using provided keywords.

- 🏷️ **Advanced Filtering Capabilities**  
  Supports brand-based filters and dynamic price range inputs to narrow down search results.

- 🔢 **Product Count Verification**  
  Retrieves and verifies the number of visible products after applying selected filters.

- 🧪 **TestNG Integration**  
  Uses TestNG for structured test execution, configuration, and reporting.

- 🧰 **WebDriverManager Support**  
  Manages browser drivers automatically—no need to manually download or configure ChromeDriver.


## 🛠️ Technologies Used

- ☕ **Java 11+**
- 🌐 **Selenium WebDriver**
- ✅ **TestNG**
- 🧩 **WebDriverManager** (for Chrome browser automation)
- 📦 **Maven** (for build & dependency management)


## 🚀 Getting Started

### 🔧 Prerequisites

Ensure the following tools are installed on your system:

- ☕ **Java Development Kit (JDK) 11 or above**  
  [Download JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)

- 🧰 **Maven**  
  [Download Maven](https://maven.apache.org/download.cgi)

- 🌍 **Google Chrome Browser**  
  The project uses **ChromeDriver** via **WebDriverManager** for browser automation.


### 📦 Installation & Setup

#### 1️⃣ Clone the Repository:

```bash
git clone git@github.com:EshaIsrarX01/DarazAutomationUsingSelinium.git
cd DarazAutomationUsingSelinium
```

#### 2️⃣ Build and Run the Project:

In the root directory of the project, execute the following command:

```bash
mvn clean install
```

This command will:
- Download all required dependencies
- Compile the codebase
- Run all defined **TestNG** test cases


## 🧪 Test Cases

### ✅ `testProductSearchAndFilterWithNoResults()`

- **Description:**  
  Automates the flow to:
  - Navigate to [Daraz.pk](https://www.daraz.pk/)
  - Search for **"Laptops"**
  - Apply the following filters:
    - **Brand:** `speedx`
    - **Price Range:** `500 - 5000`
    - **Free Delivery** `Free Shipment`

- **Expected Result:**  
  Asserts that **0 products** are displayed, validating the case when no search results match the applied filters.

- **Purpose:**  
  This test ensures that the system handles "no result found" scenarios gracefully and accurately reflects filtered data.


## 🙌 Contributions

Pull requests, issues, and suggestions are welcome! Feel free to fork the project and enhance it with additional test scenarios or browser support.

## 📃 License
This project is licensed under the [MIT License](https://opensource.org/licenses/MIT).

