package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController{

  @Autowired
  private GreetingService gService;

  @GetMapping("/helloWorld")
  @ResponseBody
  public Greeting helloWorld()
  {
    return gService.helloGreeting("World!");
  }

  @GetMapping("/hello")
  @ResponseBody
  public Greeting hello(@RequestParam String name)
  {
    return gService.helloGreeting(name);
  }

  @GetMapping("/helloFull")
  @ResponseBody
  public Greeting helloFull(@RequestParam String phrase, @RequestParam String name)
  {
    return gService.helloGreetingFull(phrase,name);
  }
}