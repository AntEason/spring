package spring.cloud.eos.eureka.provide.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//标明是服务提供者
//@EnableEurekaClient
@EnableDiscoveryClient
// springboot项目
@SpringBootApplication
public class EurekaProvideApp {
    public static void main(String[] args) {
        System.err.println("EurekaProvideApp  Service Strat Success!");
        SpringApplication.run(EurekaProvideApp.class, args);
    }
}
