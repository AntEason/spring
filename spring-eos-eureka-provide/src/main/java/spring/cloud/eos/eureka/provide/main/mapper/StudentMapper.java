package spring.cloud.eos.eureka.provide.main.mapper;

import org.apache.ibatis.annotations.Mapper;
import spring.cloud.eos.eureka.api.main.entity.Student;

@Mapper
public interface StudentMapper {
    Student findStudent(Integer id);
    int saveStudent(Student user);
    int deleteStudent(Integer id);
}
