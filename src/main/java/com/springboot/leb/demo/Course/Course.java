package com.springboot.leb.demo.Course;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
@Entity
public class Course {

    @Id
    private String id;
    private String name;
    private String description;

}
