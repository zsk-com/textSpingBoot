package zsk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import zsk.bean.Person;
import zsk.config.PersonConfig;

/**
 * 自动引入配置文件
 */
@SpringBootApplication
@EnableConfigurationProperties({PersonConfig.class})
public class Application {

    public static void main(String[] args) {
        //程序入口
        SpringApplication.run(Application.class,args);
    }
}
