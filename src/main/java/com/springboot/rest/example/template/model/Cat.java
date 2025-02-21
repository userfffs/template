package com.springboot.rest.example.template.model;
import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
public class Cat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String breed;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Employee owner;

}

