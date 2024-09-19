package Genboot.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Data
@Table(name="Student")
public class Student {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "marks")
    private int marks;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;



}

