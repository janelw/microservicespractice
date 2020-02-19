package com.infosys.demo.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.*;

@Entity
@Table
public class Product implements Serializable{

    @Id
    @Column 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int product_id;

    @Column
    private String product_name;

    @Column
    private double price;

    @Column 
    private double quantity; 

  



    public int getProduct_id() {
        return this.product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return this.product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Product)) {
            return false;
        }
        Product product = (Product) o;
        return product_id == product.product_id && Objects.equals(product_name, product.product_name) && price == product.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(product_id, product_name, price);
    }

    @Override
    public String toString() {
        return "{" +
            " product_id='" + getProduct_id() + "'" +
            ", product_name='" + getProduct_name() + "'" +
            ", price='" + getPrice() + "'" +
            "}";
    }

    public Product(int product_id, String product_name, double price) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.price = price;
    }

}