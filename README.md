# QA Automation Engineer – Technical Assessment

## 📌 Project Overview

This project is a UI automation implementation for a QA Automation Technical Assessment using **Java, Selenium WebDriver, TestNG, Maven, and Page Object Model (POM)**.

Since no specific UI or API was provided, I selected **POSnic Demo** from the provided batch options instead of using dummy/mock data, to demonstrate the automation in a more realistic environment.


**Demo Application:** https://demo.posnic.io/

---

## 🔄 Project Evolution

The project was intentionally implemented in two stages:

* **Initial Implementation:** The automation flow was first implemented without POM.
* **Refactoring:** The project was then refactored using **Page Object Model (POM)** to demonstrate the improvements in structure, reusability, and maintainability.

The development process and key changes are documented through **Git commits.**

---

## 🎯 Test Scenario

The automated test covers the following flow:

1. Login as **Store Admin**
2. Navigate to the **Inventory** tab
3. Open the **Items** page
4. Click **Add Items**
5. Select **Standard Item**
6. Enter the **Product Name**
7. Enter the **Selling Price**
8. Click **Save**
9. Verify the **Success Message**

---

## 🛠️ Technologies & Tools

* **Java 17**
* **Selenium WebDriver**
* **TestNG**
* **Maven**
* **Page Object Model (POM)**
* **Chrome WebDriver**
* **Git & GitHub**

---

## 🏗️ Project Structure

```text
StoreAdmin-Technical-Assessment
│
├── pom.xml
├── README.md
│
└── src
    ├── main
    │   └── java
    │       ├── base
    │       │   └── BasePage.java
    │       │
    │       ├── pages
    │           ├── LoginPage.java
    │           └── InventoryPage.java
    │       
    │
    └── test
        ├── java
        │   ├── base
        │   │   └── BaseTest.java
        │   │
        │   ├── data
        │   │   └── TestData.java
        │   │
        │   └── tests
                └── StoreAdminTest.java
       
```

---

## 🧩 Framework Design

### Page Object Model (POM)

The project uses **Page Object Model** to separate:

* Page locators
* Reusable page actions
* Test scenarios and assertions

This improves **maintainability, reusability, readability, and scalability**.

### Base Test

`BaseTest` handles:

* WebDriver initialization
* Browser configuration
* Test setup and teardown

### Base Page

`BasePage` contains common reusable Selenium operations such as locating elements.

### Data-Driven Testing

TestNG `@DataProvider` is used to execute the product creation test with different product data.

Example:

```java
@DataProvider(name = "productData")
public Object[][] productData() {
    return new Object[][] {
        {"Laptop", "35000"},
        {"Keyboard", "2500"},
        {"Mouse", "1200"}
    };
}
```

---

## ⏱️ Synchronization & Stability

The automation uses **Explicit Waits** instead of hardcoded `Thread.sleep()`.

Example:

```java
wait.until(
    ExpectedConditions.visibilityOfElementLocated(locator)
);
```

This helps handle:

* Dynamic elements
* Asynchronous rendering
* Loading delays
* Network-related timing differences

---

## ▶️ How to Run

### 1. Clone the repository

```bash
git clone https://github.com/dinaahmed13/StoreAdmin-Technical-Assessment
```

### 2. Open the project

Open the project using **IntelliJ IDEA** or another Java IDE.

### 3. Install Maven dependencies

```bash
mvn clean install
```

### 4. Run the tests

```bash
mvn test
```



## ✅ Test Verification

The test verifies that the product is successfully created by checking the displayed **success message** after saving the item.

---

## 📋 Assumptions

* No specific UI or API was provided in the assessment.
* POSnic Demo was selected as a public test environment.
* The Store Admin product creation flow was used to demonstrate the requested automation approach.

---

## 🔗 Repository

**GitHub:**
https://github.com/dinaahmed13/StoreAdmin-Technical-Assessment

---

## 👩‍💻 Author

**Dina Ahmed**

QA Automation Engineer | Java | Selenium | TestNG | Maven 
