package com.springboot.rest.example.template.model;

import lombok.Data;
import jakarta.persistence.*;
import java.util.List;

@Data
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String position;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Cat> cats;
}
