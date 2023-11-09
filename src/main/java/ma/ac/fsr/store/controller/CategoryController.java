package ma.ac.fsr.store.controller;

import ma.ac.fsr.store.dto.CategoryDto;
import ma.ac.fsr.store.dto.ProductDto;
import ma.ac.fsr.store.service.CategoryService;
import ma.ac.fsr.store.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

@RequestMapping("/api/Category")
public class CategoryController {


    @Autowired
    private CategoryService service;

    // again here we can inject service using constructor


    @GetMapping("/")
    public List<CategoryDto> findAll(){
        return service.getAll();
    }
}
