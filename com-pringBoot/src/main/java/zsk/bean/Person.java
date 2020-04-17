package zsk.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;


public class Person {
    private String age;
    private String  name;

    public Person(String age, String name) {
        this.age = age;
        this.name = name;
    }

    public Person() {
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
