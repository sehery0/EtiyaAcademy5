package com.etiya.ecommercedemo3.entities.concretes;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class ProductCategoryId implements Serializable{
    private static final long serialVersionUID = 1L;
    private Product product;
    private Category category;
}
