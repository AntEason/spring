package spring.cloud.eos.eureka.provide.main.service;


import org.springframework.cloud.netflix.feign.FeignClient;
import spring.cloud.eos.eureka.api.main.entity.Student;

@FeignClient
public interface StudentService {
    Student findStudent(Integer id);
    int saveStudent(Student user);
    int deleteStudent(Integer id);
}
