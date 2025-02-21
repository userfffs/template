package com.springboot.rest.example.template.repository;

import com.springboot.rest.example.template.model.Cat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatRepository extends JpaRepository<Cat, Long> {
}
