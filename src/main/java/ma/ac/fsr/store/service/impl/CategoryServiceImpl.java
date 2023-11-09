package ma.ac.fsr.store.service.impl;


import ma.ac.fsr.store.dto.CategoryDto;
import ma.ac.fsr.store.dto.ProductDto;
import ma.ac.fsr.store.mapper.CategoryMapper;
import ma.ac.fsr.store.repository.CategoryRepository;
import ma.ac.fsr.store.service.CategoryService;
import ma.ac.fsr.store.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {


    @Autowired
    private CategoryRepository repository;

    @Autowired
    CategoryMapper mapper;


    @Override
    public List<CategoryDto> getAll() {

     return mapper.entityToDto(repository.findAll());

    }
}
