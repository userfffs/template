package com.springboot.rest.example.template.controller;

import com.springboot.rest.example.template.model.Cat;
import com.springboot.rest.example.template.service.CatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cats")
@RequiredArgsConstructor
public class CatController {

    private final CatService catService;

    @GetMapping
    public List<Cat> getAllCats() {
        return catService.getAllCats();
    }

    @PostMapping
    public Cat createCat(@RequestBody Cat cat) {
        return catService.createCat(cat);
    }


}

