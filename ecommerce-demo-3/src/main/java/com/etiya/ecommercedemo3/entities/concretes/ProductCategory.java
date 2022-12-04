package com.etiya.ecommercedemo3.entities.concretes;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "product_categories")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@IdClass(ProductCategoryId.class)
public class ProductCategory implements Serializable{
    private static final long serialVersionUID = 1L;
    @ManyToOne
    @JoinColumn(name = "product_id",insertable = false, updatable = false)
    private Product product;

    @ManyToOne
    @JoinColumn(name = "category_id",insertable = false, updatable = false)
    private Category category;

    @Id
    @Column(name="category_id")
    private int categoryId;

    @Id
    @Column(name="product_id")
    private int productId;
}
