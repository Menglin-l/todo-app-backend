package com.in28minutes.rest.webservices.restfulwebservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * 1.Retrieve all todos for a user
 *   GET /users/{user_name}/todos
 *
 * 2.Delete a todo of a user
 *   DELETE /users/{user_name}/todos/{id}
 *
 * 3.Edit / update a todo
 *   PUT /users/{user_name}/todos/{todo_id}
 *
 * 4.Create a new todo
 *   POST /users/{user_name}/todos/
 */

@SpringBootApplication
public class RestfulWebServicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestfulWebServicesApplication.class, args);
    }

}
