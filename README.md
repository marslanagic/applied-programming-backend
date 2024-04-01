## Dependencies

The following dependencies were added to the project:

1. Spring Web: This dependency is used for building RESTful APIs and includes the Tomcat embedded server, which pulls in all the necessary dependencies for web development.

2. Lombok: Lombok is a library that helps reduce boilerplate code by providing annotations to generate getter, setter, and other common methods.

## Features

Admins:
- Create a new admin.
- Update an existing admin.
- Delete an admin by ID.
- Delete all admins.
- Get a list of all admins.
- Get an admin by ID.

Articles:
- Create a new article.
- Update an existing article.
- Delete an article by ID.
- Delete all articles.
- Get a list of all articles.
- Get an article by ID.
- Get articles by category.
- Get articles by heading.
- Get a random trending article.

## Technologies Used

- Java
- Spring Boot
- Hibernate
- PostgreSQL (or your preferred database)
- Maven (or Gradle for build management)
- RESTful API

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed on your machine.
- PostgreSQL (or your preferred database) installed and running.
- Git installed on your machine.

API Endpoints

Admins
  POST /admins: Create a new admin.
  PUT /admins/{id}: Update an existing admin.
  DELETE /admins/{id}: Delete an admin by ID.
  DELETE /admins: Delete all admins.
  GET /admins: Get a list of all admins.
  GET /admins/{id}: Get an admin by ID.
Articles
  POST /articles: Create a new article.
  PUT /articles/{id}: Update an existing article.
  DELETE /articles/{id}: Delete an article by ID.
  DELETE /articles: Delete all articles.
  GET /articles: Get a list of all articles.
  GET /articles/{id}: Get an article by ID.
  GET /articles/category/{category}: Get articles by category.
  GET /articles/heading/{heading}: Get articles by heading.
  GET /articles/trending: Get a random trending article.

