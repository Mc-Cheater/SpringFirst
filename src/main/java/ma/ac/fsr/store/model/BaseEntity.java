package ma.ac.fsr.store.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;

@MappedSuperclass
@Getter
public abstract class BaseEntity {

    @Id
    @GeneratedValue
    @Column(name="ID")
    protected Long id;
}
