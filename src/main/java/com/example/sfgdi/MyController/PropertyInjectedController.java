package com.example.sfgdi.MyController;

import com.example.sfgdi.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
