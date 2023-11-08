package ma.ac.fsr.store.mapper;

import ma.ac.fsr.store.dto.ProductDto;
import ma.ac.fsr.store.model.Product;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {


    ProductDto entityToDto(Product entity);
    Product dtoToEntity(ProductDto dto);

    List<ProductDto> entityToDto(List<Product> entity);
    List<Product> dtoToEntity(List<ProductDto> dto);

}
