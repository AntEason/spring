package spring.cloud.eos.eureka.consume.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import spring.cloud.eos.eureka.api.main.entity.Student;

@Controller
@Configuration//说明当前这是个配置类  如果不写下面restTemplate调用的时候会告诉你找不到指定的服务的
public class StudentController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/query/{id}")
    @ResponseBody
    public Student add(@PathVariable("id") Integer id) {
        return restTemplate.getForEntity("http://spring-eos-eureka-provide/query/{id}", Student.class, id).getBody();
    }

    @GetMapping(value = "/del/{id}")
    @ResponseBody
    public String del(@PathVariable("id") Integer id) {
        return restTemplate.getForEntity("http://spring-eos-eureka-provide/del/{id}", String.class, id).getBody();
    }

    @GetMapping(value = "/save/{id}/{name}")
    @ResponseBody
    public String save(@PathVariable("id") Integer id, @PathVariable("name") String name) {
        return restTemplate
                .getForEntity("http://spring-eos-eureka-provide/save/{id}/{name}", String.class, id, name)
                .getBody();
    }

}
