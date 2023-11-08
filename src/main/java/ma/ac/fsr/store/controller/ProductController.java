package ma.ac.fsr.store.controller;


import ma.ac.fsr.store.dto.ProductDto;
import ma.ac.fsr.store.model.Product;
import ma.ac.fsr.store.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

@RequestMapping("/Product")
public class ProductController {

    @Autowired
    private IProductService service;



    @GetMapping("/")
    public List<ProductDto> findAll(){
    return service.getAll();
}




}
