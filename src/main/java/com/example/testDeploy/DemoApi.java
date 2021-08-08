package com.example.testDeploy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class DemoApi {
  @Autowired
  private TestComponent logicObj;

    @GetMapping("/index")
    public String index() {
        return this.logicObj.say();
    }
}
