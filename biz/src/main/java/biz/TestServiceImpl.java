package biz;

import client.api.si.TestService;

public class TestServiceImpl implements TestService {  
    public String sayHello(String name) {  
        return "Hello " + name + "!";  
    }  
}  