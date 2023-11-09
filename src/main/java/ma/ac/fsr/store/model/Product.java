package ma.ac.fsr.store.model;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Objects;


@Entity
@Table(name="PRODUCT")
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
public class Product extends BaseEntity implements Serializable  {

/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id) && Objects.equals(title, product.title) && Objects.equals(price, product.price) && Objects.equals(description, product.description) && Objects.equals(category, product.category) && Objects.equals(imageUrl, product.imageUrl) && Objects.equals(rating, product.rating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, price, description, category, imageUrl, rating);
    }
*/
    @Column(name = "TITLE")
    private String title;
    @Column(name = "PRICE")
    private Double price;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "CATEGORY")
    private String category;
    @Column(name = "IMAGE_URL")
    private String imageUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", rating=" + rating +
                '}';
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    @Column(name = "RATING")
    private Double rating;


    @ManyToOne
    @JoinColumn(name="category_id",foreignKey = @ForeignKey(name = "FK_PRODUCT_CATEGORY"))
    private  Category categoryObject;


}
