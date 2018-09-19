package demoController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shenxiaobo on 2018/9/18.
 */
@SpringBootApplication
@RestController
public class Application {
    @RequestMapping("/")
    String home(){
        return "haha";
    }
    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
