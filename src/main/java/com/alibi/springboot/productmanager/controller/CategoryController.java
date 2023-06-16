package com.alibi.springboot.productmanager.controller;

import com.alibi.springboot.productmanager.entity.Category;
import com.alibi.springboot.productmanager.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping("/category")
    public ResponseEntity<List<Category>> readAll() {
        return new ResponseEntity<>(categoryService.readAll(), HttpStatus.OK);
    }
}
