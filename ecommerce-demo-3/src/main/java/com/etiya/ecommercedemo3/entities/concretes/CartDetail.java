package com.etiya.ecommercedemo3.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="cart_details")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@IdClass(CartDetailId.class)
public class CartDetail implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "product_id",insertable = false, updatable = false)
    private int productId;
    @ManyToOne
    @JoinColumn(name = "product_id",insertable = false, updatable = false)
    private Product product;
    @Id
    @Column(name="cart_id",insertable = false, updatable = false)
    private int cartId;
    @ManyToOne
    @JoinColumn(name = "cart_id",insertable = false, updatable = false)
    private Cart cart;
}
