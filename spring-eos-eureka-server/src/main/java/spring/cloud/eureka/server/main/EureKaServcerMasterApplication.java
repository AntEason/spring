package spring.cloud.eureka.server.main;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
//标明当前是 注册中
@EnableEurekaServer
// 标明是springboot项目
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class EureKaServcerMasterApplication {
    public static void main(String[] args) {
        System.err.println("spring.cloud.eureka.server.main.EureKaServcerMasterApplication Service Strat Success!");
        SpringApplication.run(EureKaServcerMasterApplication.class, args);
    }
}
