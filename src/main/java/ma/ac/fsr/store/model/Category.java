package ma.ac.fsr.store.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)

public class Category extends BaseEntity {

    @Column(name="LABEL")
    private String label;
}
