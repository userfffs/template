package com.springboot.rest.example.template.service;

import com.springboot.rest.example.template.model.Cat;
import com.springboot.rest.example.template.repository.CatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CatService {

    private final CatRepository catRepository;

    public List<Cat> getAllCats() {
        return catRepository.findAll();
    }

    public Cat createCat(Cat cat) {
        return catRepository.save(cat);
    }

    public void deleteCat(Cat cat) {
        catRepository.delete(cat);
    }

}

