package spring.cloud.eos.eureka.consume.main;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient
// springboot项目
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class EurekaConsumeApp {

    @Bean
    @LoadBalanced
//实现负载均衡
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        System.err.println("EurekaConsumeApp  Service Strat Success!");
        SpringApplication.run(EurekaConsumeApp.class, args);

    }
}
