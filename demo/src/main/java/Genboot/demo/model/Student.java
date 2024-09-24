package Genboot.demo.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name="Student")
public class Student extends BaseEntity {

    @Column(name = "marks")
    private int marks;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

//    @OneToOne
//    @JoinColumn(name ="cloud_vendor_id")
//    private CloudVendor cloudVendor;

}

