package com.trawell.backend.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name="product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="product_id")
    public long product_id;

    @Column(name="product_name")
    public String product_name;

    @Column(name="product_img")
    public String product_img;

    @Column(name="product_desc")
    public String product_desc;

    @Column(name="location")
    public String location;

    @Column(name="product_price")
    public int product_price;
}
