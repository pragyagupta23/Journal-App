# 📓 Journal App

A RESTful backend application for managing personal journal entries, built with **Java**, **Spring Boot**, and **MongoDB**. Designed with a clean layered architecture and fully tested REST endpoints.

---

## 🚀 Features

- Create, read, update, and delete journal entries
- RESTful API design following standard HTTP conventions
- Document-based storage with MongoDB for flexible data management
- Clean separation of concerns via Controller → Service → Repository layers
- Input validation and structured error responses
- API tested and documented using Postman

---

## 🛠️ Tech Stack

| Layer | Technology |
|---|---|
| Language | Java 17 |
| Framework | Spring Boot 3.x |
| Database | MongoDB |
| ORM | Spring Data MongoDB |
| Build Tool | Maven |
| API Testing | Postman |
| Version Control | Git & GitHub |

---

## 📁 Project Structure

```
src/
└── main/
    └── java/
        └── com/pragya/journalapp/
            ├── controller/       # Handles HTTP requests and responses
            ├── service/          # Business logic layer
            ├── entity/           # MongoDB document models
            └── repository/       # Data access layer (Spring Data MongoDB)
```

---

## ⚙️ Getting Started

### Prerequisites

- Java 17 or above
- MongoDB running locally (default port `27017`)
- Maven 3.x

### Setup & Run

```bash
# 1. Clone the repository
git clone https://github.com/pragyagupta23/Journal-App.git
cd Journal-App

# 2. Configure MongoDB connection in src/main/resources/application.properties
spring.data.mongodb.uri=mongodb://localhost:27017/journaldb

# 3. Build and run the application
./mvnw spring-boot:run
```

The server will start at `http://localhost:8080`.

---

## 📡 API Endpoints

Base URL: `http://localhost:8080/journal`

| Method | Endpoint | Description |
|--------|----------|-------------|
| `GET` | `/journal` | Fetch all journal entries |
| `POST` | `/journal` | Create a new journal entry |
| `GET` | `/journal/{id}` | Get a specific entry by ID |
| `PUT` | `/journal/{id}` | Update an existing entry |
| `DELETE` | `/journal/{id}` | Delete an entry by ID |

### Sample Request — Create Entry

**POST** `/journal`

```json
{
  "title": "My First Entry",
  "content": "Today I started building this journal app using Spring Boot."
}
```

### Sample Response

```json
{
  "id": "664f1a2b3c4d5e6f7a8b9c0d",
  "title": "My First Entry",
  "content": "Today I started building this journal app using Spring Boot.",
  "date": "2026-05-15T10:30:00"
}
```

---

## 🗄️ MongoDB Document Structure

```json
{
  "_id": ObjectId,
  "title": "String",
  "content": "String",
  "date": "DateTime"
}
```

---

## 🔍 Design Decisions

**Why MongoDB?**  
Journal entries are unstructured by nature — they vary in length and don't need a rigid schema. MongoDB's document model is a natural fit here compared to a relational database.

**Why a layered architecture?**  
Keeping the Controller, Service, and Repository layers separate makes the code easier to test, debug, and extend. For example, swapping MongoDB for a different database would only require changes in the Repository layer.

---

## 🔮 Planned Enhancements

- [ ] User authentication and authorization using Spring Security + JWT
- [ ] Per-user journal isolation (each user sees only their own entries)
- [ ] Search and filter entries by date or keyword
- [ ] Pagination support for large datasets

---



