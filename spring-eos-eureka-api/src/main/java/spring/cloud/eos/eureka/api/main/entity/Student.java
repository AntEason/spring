package spring.cloud.eos.eureka.api.main.entity;

import java.io.Serializable;

public class Student implements Serializable {
    Integer id;
    String name;
    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
