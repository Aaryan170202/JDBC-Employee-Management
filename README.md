# 🏢 Employee Management System (Java + JDBC)

A **Java console application** for managing employee records using **MySQL database** and **JDBC**.  
This project follows a **DAO (Data Access Object)** pattern to perform basic CRUD operations.  

---

## 📌 Features
- **Create** a new employee
- **Read** all employees
- **Update** an employee’s name
- **Delete** an employee
- Continuous menu until the user exits

---

## 🛠️ Tech Stack
- **Java** (JDK 8+)
- **MySQL** (as database)
- **JDBC** (Java Database Connectivity)
- **DAO Pattern**

---

## 📂 Project Structure
```
com.aaryan.employeemanagement
│
├── App.java           # Main menu & user interaction
├── DB.java            # Database connection utility
├── Employee.java      # Employee entity/model
├── EmployeeDao.java   # CRUD logic using JDBC
├── Query.java         # SQL queries
└── (MySQL database setup required)
```

---

## 🗄 Database Setup

1️⃣ **Create MySQL Database**
```sql
CREATE DATABASE employee;
```

2️⃣ **Create Table**
```sql
USE employee;

CREATE TABLE employee (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
    salary INT
);
```

3️⃣ **Update DB.java with your MySQL credentials**
```java
String url = "jdbc:mysql://localhost:3306/employee";
String userName = "root";        // your MySQL username
String password = "abc000";      // your MySQL password
```

---

## 🚀 How to Run

### 1️⃣ Clone the repository
```bash
git clone https://github.com/<your-username>/<repo-name>.git
cd <repo-name>
```

### 2️⃣ Compile the program
```bash
javac -cp .:mysql-connector-java-8.0.xx.jar com/aaryan/employeemanagement/*.java
```

### 3️⃣ Run the program
```bash
java -cp .:mysql-connector-java-8.0.xx.jar com.aaryan.employeemanagement.App
```

⚠ **Note:** Replace `mysql-connector-java-8.0.xx.jar` with your JDBC driver jar filename.

---

## 📸 Example Usage
```
 Employee Management
1 = Create , 2 = Read, 3 = Update, 4 = Delete 
1
 id, name, email, salary
101
John Doe
john@example.com
50000
✅ Employee created successfully!
```

---

## 💡 Future Improvements
- Input validation for email & salary
- Search employee by ID or name
- Pagination for large datasets
- Convert to GUI (JavaFX) or web app (Spring Boot)

---

## 📜 License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
