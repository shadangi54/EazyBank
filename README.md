# EazyBank Microservices Project

A comprehensive microservices architecture implementation for a banking system built with Spring Boot and Spring Cloud.

## 📋 Table of Contents

- [Architecture Overview](#architecture-overview)
- [Microservices](#microservices)
- [Infrastructure Components](#infrastructure-components)
- [Getting Started](#getting-started)
- [Configuration](#configuration)
- [Observability](#observability)
- [Security](#security)
- [Development](#development)
- [Deployment](#deployment)

## 🏗️ Architecture Overview

This project implements a microservices architecture for a banking system with the following key components:

- **Business Microservices**: Accounts, Cards, Loans, Message
- **Infrastructure Services**: Config Server, Eureka Server, Gateway Server
- **Observability Stack**: Prometheus, Grafana, Loki, Tempo
- **Security**: Keycloak for authentication and authorization
- **Message Broker**: Apache Kafka
- **Containerization**: Docker with Jib plugin for image building

## 🚀 Microservices

### Core Business Services

#### 1. Accounts Service

- **Port**: 8080
- **Description**: Manages customer accounts and account-related operations
- **Technologies**: Spring Boot 3.3.0, Spring Data JPA, Spring Cloud

#### 2. Cards Service

- **Port**: 9000
- **Description**: Handles credit/debit card management and operations
- **Technologies**: Spring Boot 3.3.0, Spring Data JPA, Spring Cloud

#### 3. Loans Service

- **Port**: 8090
- **Description**: Manages loan applications and loan-related services
- **Technologies**: Spring Boot 3.3.0, Spring Data JPA, Spring Cloud

#### 4. Message Service

- **Description**: Handles asynchronous messaging and notifications
- **Technologies**: Spring Boot 3.3.0, Apache Kafka

### Infrastructure Services

#### 1. Config Server

- **Port**: 8071
- **Description**: Centralized configuration management for all microservices
- **Technology**: Spring Cloud Config Server

#### 2. Eureka Server

- **Port**: 8070
- **Description**: Service discovery and registration
- **Technology**: Spring Cloud Netflix Eureka

#### 3. Gateway Server

- **Port**: 8072
- **Description**: API Gateway for routing and cross-cutting concerns
- **Technology**: Spring Cloud Gateway

## 🛠️ Infrastructure Components

### Observability Stack

- **Prometheus**: Metrics collection and monitoring
- **Grafana**: Metrics visualization and dashboards
- **Loki**: Log aggregation and analysis
- **Tempo**: Distributed tracing
- **OpenTelemetry**: Instrumentation for observability

### Security

- **Keycloak**: Identity and access management
- **Port**: 7080
- **Default Admin**: admin/admin

### Message Broker

- **Apache Kafka**: Event streaming platform for asynchronous communication
- **Port**: 9092

## 🚀 Getting Started

### Prerequisites

- Java 17+
- Maven 3.6+
- Docker & Docker Compose
- Git

### Quick Start

1. **Clone the repository**

   ```bash
   git clone <repository-url>
   ```

2. **Build all services**

   ```bash
   mvn clean install
   ```

3. **Start infrastructure services**

   ```bash
   cd docker-compose/default
   docker-compose up -d
   ```

4. **Start microservices**
   ```bash
   # Start each service individually or use Docker Compose
   docker-compose -f docker-compose.yml up
   ```

## ⚙️ Configuration

### Environment Profiles

- **default**: Local development environment
- **qa**: Quality Assurance environment
- **prod**: Production environment

### Configuration Files

Located in the `config/` directory:

- `accounts.yml`, `accounts-qa.yml`, `accounts-prod.yml`
- `cards.yml`, `cards-qa.yml`, `cards-prod.yml`
- `loans.yml`, `loans-qa.yml`, `loans-prod.yml`

### Common Configuration

- **Memory Limit**: 700MB per service
- **OpenTelemetry**: Enabled for all services
- **Config Server**: http://configserver:8071/
- **Eureka Server**: http://eurekaserver:8070/eureka/

## 📊 Observability

### Monitoring URLs

- **Grafana Dashboard**: http://localhost:3000
- **Prometheus**: http://localhost:9090
- **Tempo**: http://localhost:3200

### Features

- Distributed tracing with OpenTelemetry
- Metrics collection with Prometheus
- Log aggregation with Loki
- Custom dashboards in Grafana
- Service health monitoring

## 🔐 Security

### Keycloak Configuration

- **URL**: http://localhost:7080
- **Admin Console**: http://localhost:7080/admin
- **Username**: admin
- **Password**: admin

### Security Features

- OAuth 2.0 / OpenID Connect
- JWT token-based authentication
- Role-based access control
- API Gateway security policies

## 👨‍💻 Development

### Building Services

```bash
# Build all services
mvn clean install

# Build specific service
cd accounts
mvn clean install
```

### Running Locally

```bash
# Start Config Server first
cd configserver
mvn spring-boot:run

# Start Eureka Server
cd eurekaserver
mvn spring-boot:run

# Start individual microservices
cd accounts
mvn spring-boot:run
```

### Docker Image Building

Uses Google Jib plugin for efficient Docker image creation:

```bash
mvn compile jib:dockerBuild
```

## 🚢 Deployment

### Docker Compose Environments

#### Default Environment

```bash
cd docker-compose/default
docker-compose up -d
```

#### QA Environment

```bash
cd docker-compose/qa
docker-compose up -d
```

#### Production Environment

```bash
cd docker-compose/prod
docker-compose up -d
```

### Service Ports

| Service        | Port |
| -------------- | ---- |
| Accounts       | 8080 |
| Cards          | 9000 |
| Loans          | 8090 |
| Config Server  | 8071 |
| Eureka Server  | 8070 |
| Gateway Server | 8072 |
| Keycloak       | 7080 |
| Kafka          | 9092 |
| Prometheus     | 9090 |
| Grafana        | 3000 |

## 📁 Project Structure

```
.
├── accounts/           # Accounts microservice
├── cards/             # Cards microservice
├── loans/             # Loans microservice
├── message/           # Message microservice
├── configserver/      # Configuration server
├── eurekaserver/      # Service discovery
├── gatewayserver/     # API gateway
├── config/            # Configuration files
└── docker-compose/    # Docker deployment configurations
    ├── default/       # Local development
    ├── qa/           # QA environment
    ├── prod/         # Production environment
    └── observability/ # Monitoring stack configs
```

## 🔧 Technologies Used

- **Framework**: Spring Boot 3.3.0
- **Cloud**: Spring Cloud 2023.0.1
- **Build Tool**: Maven
- **Containerization**: Docker, Jib
- **Service Discovery**: Eureka
- **API Gateway**: Spring Cloud Gateway
- **Configuration**: Spring Cloud Config
- **Monitoring**: Prometheus, Grafana
- **Tracing**: OpenTelemetry, Tempo
- **Logging**: Loki
- **Security**: Keycloak, OAuth 2.0
- **Message Broker**: Apache Kafka
- **Java Version**: 17

## Postman Collection
[EazyBank APIs](https://github.com/user-attachments/files/21329746/Microservices.postman_collection.json)
