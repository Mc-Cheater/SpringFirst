package ma.ac.fsr.store.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ProductDto {


    // Identity most use case , auto will sometimes uses sequences which if not defined it may lead to issues

    private Long id;

    private String title;

    private Double price;

    private String description;

    private String category;

    private String imageUrl;

    private Double rating;

}
