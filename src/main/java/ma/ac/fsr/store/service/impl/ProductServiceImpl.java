package ma.ac.fsr.store.service.impl;

import ma.ac.fsr.store.dto.ProductDto;
import ma.ac.fsr.store.mapper.ProductMapper;
import ma.ac.fsr.store.model.Product;
import ma.ac.fsr.store.repository.ProductRepository;
import ma.ac.fsr.store.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service

public class ProductServiceImpl implements IProductService {

    @Autowired
    private ProductRepository repository;

    @Autowired
    private ProductMapper mapper;
    @Override
    public List<ProductDto> getAll() {
       return mapper.entityToDto( repository.findAll());
    }
}
