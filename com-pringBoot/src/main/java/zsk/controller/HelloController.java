package zsk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zsk.bean.Person;
import zsk.config.PersonConfig;

@RestController
public class HelloController {
//    @Value("${Person.age}")
//    private Integer age;
//    @Value("${Person.name}")
//    private String name;
    @Autowired
    private PersonConfig p;
    @RequestMapping("/hello")
    public Person hello(){


        return new Person(p.getAge(),p.getName());
    }
}
