package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@ToString
public class Greeting{

  public String frase;
  public String name;

  public Greeting(String frase, String name) 
  {
    this.frase = frase;
    this.name = name;
  }
}