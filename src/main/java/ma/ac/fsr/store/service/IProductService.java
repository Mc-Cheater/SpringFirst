package ma.ac.fsr.store.service;
import ma.ac.fsr.store.dto.ProductDto;
import ma.ac.fsr.store.model.Product;

import java.util.List;

public interface IProductService {

    List<ProductDto> getAll();
}
