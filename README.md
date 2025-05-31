# SpringBoot

📚 Student Management System – Spring Boot Project
This is a simple Student Management System built with Spring Boot that provides basic CRUD operations to manage student records. The core functionalities of this RESTful API include:

✅ Features
Register a new student – Add student details to the system.

Get all students – Retrieve a list of all registered students.

Delete a student by ID – Remove a student record using their unique ID.

🛠️ Tech Stack
Spring Boot

Spring Web

Spring Data JPA

H2 Database / MySQL (as per your setup)

Lombok (for cleaner code)

| Method | Endpoint         | Description              |
| ------ | ---------------- | ------------------------ |
| POST   | `/students`      | Register a new student   |
| GET    | `/students`      | Get list of all students |
| DELETE | `/students/{id}` | Delete a student by ID   |

🚀 How to Run
Clone the repository.

Open the project in your preferred IDE.

Make sure you have Java and Maven installed.

Run the application using:

bash
Copy
Edit
mvn spring-boot:run
Test the API using Postman or any REST client.

🔍 Example Student JSON
json
Copy
Edit
{
  "name": "Aniket Mahajan",
  "email": "aniketmahajan@example.com",
  "course": "Computer Science"
}

