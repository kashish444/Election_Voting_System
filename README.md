# 🗳️ Election Voting System - Java Swing & MySQL

A **Java Swing-based Voting System** that allows voter registration, vote casting, and result calculation. It uses **MySQL** for backend storage and provides a GUI for easy interaction.

---

 # Project documentation

---

## 🚀 Features
✔️ **Voter Registration** – Users can register with personal details  
✔️ **Booth Management** – Admin can configure polling booths  
✔️ **Vote Casting** – Secure and authenticated voting system  
✔️ **Results Calculation** – Displays vote counts per candidate  
✔️ **Admin Panel** – Manage booths and voter details  

---

## 🔧 Prerequisites
Before running the project, ensure you have the following installed:  

- **JDK 17 or later**  
- **MySQL Server** (For database)  
- **MySQL Connector/J** (JDBC driver)  
- **NetBeans/VS Code** (For running the project)  

---

## ⚙️ Setup & Installation
### 1️⃣ Clone the Repository
```sh
git clone https://github.com/kashish444/Election_Voting_System.git
cd Election_Voting_System
```

### 2️⃣ Configure the MySQL Database
1. Start **MySQL Server**  
2. Create the database manually:
   ```sql
   CREATE DATABASE votingsystem;
   ```
3. Import the provided SQL file:
   ```sh
   mysql -u root -p votingsystem < database.sql
   ```
4. Update `Form2.java` and other database files with **your MySQL credentials**:
   ```java
   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/votingsystem", "root", "yourpassword");
   ```

### 3️⃣ Add MySQL Connector to Project
If using VS Code:  
- Download `mysql-connector-java.jar` from [here](https://dev.mysql.com/downloads/connector/j/)  
- Add it to the project:  
  ```sh
  mv mysql-connector-java-X.X.X.jar lib/
  ```

If using NetBeans:  
- Right-click project → **Properties** → **Libraries** → **Add JAR** → Select the JAR file  

---

## ▶️ Running the Project
### In NetBeans
1. Open the project  
2. Click **Run > Run Project**  

### In VS Code
1. **Compile the project**:
   ```sh
   javac -cp ".;lib/mysql-connector-java-X.X.X.jar" -d bin src/com/mycompany/votingsystem/*.java
   ```
2. **Run the application**:
   ```sh
   java -cp ".;lib/mysql-connector-java-X.X.X.jar;bin" com.mycompany.votingsystem.Form2
   ```

---



