package com.etiya.ecommercedemo3.entities.concretes;

import lombok.*;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class CartDetailId {
    private static final long serialVersionUID = 1L;
    private Product product;
    private Cart cart;
}
