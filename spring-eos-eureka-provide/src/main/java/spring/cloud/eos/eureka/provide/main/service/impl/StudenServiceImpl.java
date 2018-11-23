package spring.cloud.eos.eureka.provide.main.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.cloud.eos.eureka.api.main.entity.Student;
import spring.cloud.eos.eureka.provide.main.mapper.StudentMapper;
import spring.cloud.eos.eureka.provide.main.service.StudentService;
@Service
public class StudenServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;

    @Override
    public Student findStudent(Integer id) {
        return this.studentMapper.findStudent(id);
    }

    @Override
    public int saveStudent(Student user) {
        return this.studentMapper.saveStudent(user);
    }
    @Override
    public int deleteStudent(Integer id) {
        this.studentMapper.deleteStudent(id);
        return 1;
    }
}
