package com.example.hellospring.beans;

public class HelloWorld {
  private String message;
  public void setMessage(String message) {
    this.message = message;
  }
  public void getMessage() {
    System.out.println("message : " + message);
  }
}
