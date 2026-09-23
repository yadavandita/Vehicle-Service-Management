# Vehicle Service Management System

**Presented By: Vandita Yadav**

A Spring Boot REST API for managing vehicle owners, vehicles and service records.

## Technologies
- Java 17
- Spring Boot
- Spring Data JPA / Hibernate
- MySQL
- Maven
- REST API
- Postman

## Main APIs

### Authentication
POST `/api/auth/register`
POST `/api/auth/login`

### Vehicles
GET `/api/vehicles`
GET `/api/vehicles/{id}`
GET `/api/vehicles/owner/{owner}`
POST `/api/vehicles`
PUT `/api/vehicles/{id}`
DELETE `/api/vehicles/{id}`

### Service Records
GET `/api/services`
GET `/api/services/vehicle/{vehicleId}`
POST `/api/services`
PUT `/api/services/{id}`
DELETE `/api/services/{id}`

## Setup
1. Create MySQL database `vehicle_service_db`.
2. Open `src/main/resources/application.properties`.
3. Replace `YOUR_MYSQL_PASSWORD` with your MySQL password.
4. Import the project as a Maven project in Eclipse/STS/IntelliJ.
5. Run `VehicleServiceManagementApplication`.
6. API runs on `http://localhost:9092`.

## Demo User
Name: Vandita Yadav
Email: vandita.yadav@example.com


The password is hashed with BCrypt before storage.

## Postman
Import `postman/Vehicle_Service_Management_Vandita_Yadav.postman_collection.json`.
