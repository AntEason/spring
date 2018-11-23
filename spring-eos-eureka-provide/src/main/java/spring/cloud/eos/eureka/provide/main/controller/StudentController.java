package spring.cloud.eos.eureka.provide.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.cloud.eos.eureka.api.main.entity.Student;
import spring.cloud.eos.eureka.provide.main.service.StudentService;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/query/{id}")
    public Student findByIdUser(@PathVariable("id") Integer id) {
        Student us = studentService.findStudent(id);
        return us;
    }

    @RequestMapping(value = "/del/{id}")
    public String delUser(@PathVariable("id") Integer id) {
        int num = studentService.deleteStudent(id);
        return num == 1 ? "succ" : "err";
    }

    @RequestMapping(value = "/save/{id}/{name}")
    public String delUser(@PathVariable("id") Integer id, @PathVariable("name") String name) {
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        int num = studentService.saveStudent(student);
        return num == 1 ? "succ" : "err";
    }
}
