package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

/**
 * Created by  on 2021/8/19
 */
public class HelloWorldBean {

    private String message;

    public HelloWorldBean(String message) {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
//        return "HelloWorldBean{" +
//                "message='" + message + '\'' +
//                '}';
        return String.format("HelloWorldBean [message=%s]", message);
    }
}
