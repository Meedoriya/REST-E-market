package com.alibi.springboot.productmanager.controller;

import com.alibi.springboot.productmanager.dto.ProductDTO;
import com.alibi.springboot.productmanager.service.ProductService;
import com.alibi.springboot.productmanager.entity.Product;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class ProductController {

    private final ProductService productService;

    @GetMapping("/product/category/{id}")
    public ResponseEntity<List<Product>> readByCategoryId(@PathVariable Long id) {
        return new ResponseEntity<>(productService.readByCategoryId(id), HttpStatus.OK);
    }

    @PostMapping("/product")
    public ResponseEntity<Product> create(@RequestBody ProductDTO dto) {
        return new ResponseEntity<>(productService.create(dto), HttpStatus.OK);
    }

    @GetMapping("/product")
    public ResponseEntity<List<Product>> readAll() {
        return new ResponseEntity<>(productService.readAll(), HttpStatus.OK);
    }

    @PutMapping("/product")
    public ResponseEntity<Product> update(@RequestBody Product product) {
        return new ResponseEntity<>(productService.update(product), HttpStatus.OK);
    }

    @DeleteMapping("/product/{id}")
    public HttpStatus delete(@PathVariable Long id) {
        productService.delete(id);
        return HttpStatus.OK;
    }

}
