package spring.cloud.eos.eureka.consume.main.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
@Configuration
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/aa")
    @ResponseBody
    public String add() {
        return restTemplate.getForEntity("http://spring-eos-eureka-provide/aa/", String.class).getBody();
    }
}

