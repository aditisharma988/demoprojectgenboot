package Genboot.demo.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;

@MappedSuperclass
public class BaseEntity  {

    @Id
    @GeneratedValue
    private Long id;

}
