package ma.ac.fsr.store.mapper;

import ma.ac.fsr.store.model.Category;
import ma.ac.fsr.store.dto.CategoryDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")

public interface CategoryMapper {

    CategoryDto entityToDto(Category entity);
    Category dtoToEntity(CategoryDto dto);

    List<CategoryDto> entityToDto(List<Category> entity);
    List<Category> dtoToEntity(List<CategoryDto> dto);

}
