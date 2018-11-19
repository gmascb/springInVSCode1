package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class GreetingService{

  public Greeting helloGreeting(String name){
    Greeting g = new Greeting("Hello", name);
    return g;
  }

  public Greeting helloGreetingFull(String phrase, String name){
    Greeting g = new Greeting(phrase, name);
    return g;
  }
}