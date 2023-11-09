package ma.ac.fsr.store.service;

import ma.ac.fsr.store.dto.CategoryDto;

import java.util.List;

public interface CategoryService {

    List<CategoryDto> getAll();
}
