package com.etiya.ecommercedemo3.entities.concretes;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "customers")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Inheritance(strategy = InheritanceType.JOINED)
public class Customer {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    @Column(name = "customer_no")
    private int customerNumber;

    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;
}
