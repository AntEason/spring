package spring.cloud.eos.eureka.provide.main.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${spring.datasource.url}")  // 从对应的配置中心找到文件并把属性注入到value值中
    private String value;
    @RequestMapping(value = "/aa")
    public String aa() {
        System.out.println(12312);
        return "aa";
    }
    @RequestMapping("/hello")
    public String hello() {
        return "hello" + value;
    }
}


