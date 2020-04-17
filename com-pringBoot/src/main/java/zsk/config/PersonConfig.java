package zsk.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 配置类
 */
@ConfigurationProperties(prefix="person")
public class PersonConfig {

    private String age;
    private String  name;

    public PersonConfig(String age, String name) {
        this.age = age;
        this.name = name;
    }

    public PersonConfig() {
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
