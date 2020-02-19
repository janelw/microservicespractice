package com.infosys.demo.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;
import java.util.Set;

import javax.persistence.*;



@Entity
@Table
public class CustOrder implements Serializable{

    @Id
    @Column 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int order_id;

    @Column
    private double total_price;

    @Column 
    private int product_quantity; 

    @Column
    private Timestamp date;

    @ManyToOne
    @JoinColumn(nullable = false)
    private User customer;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(nullable = false)
    private Set<Product> product_type; 
    
 

    public int getOrder_id() {
        return this.order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public double getTotal_price() {
        return this.total_price;
    }

    public void setTotal_price(double total_price) {
        this.total_price = total_price;
    }

    public int getProduct_quantity() {
        return this.product_quantity;
    }

    public void setProduct_quantity(int product_quantity) {
        this.product_quantity = product_quantity;
    }

    public Timestamp getDate() {
        return this.date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public User getCustomer() {
        return this.customer;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }

    public Set<Product> getProduct_type() {
        return this.product_type;
    }

    public void setProduct_type(Set<Product> product_type) {
        this.product_type = product_type;
    }

    @Override
    public String toString() {
        return "{" +
            " order_id='" + getOrder_id() + "'" +
            ", total_price='" + getTotal_price() + "'" +
            ", product_quantity='" + getProduct_quantity() + "'" +
            ", date='" + getDate() + "'" +
            ", customer='" + getCustomer() + "'" +
            ", product_type='" + getProduct_type() + "'" +
            "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CustOrder)) {
            return false;
        }
        CustOrder custOrder = (CustOrder) o;
        return order_id == custOrder.order_id && total_price == custOrder.total_price && product_quantity == custOrder.product_quantity && Objects.equals(date, custOrder.date) && Objects.equals(customer, custOrder.customer) && Objects.equals(product_type, custOrder.product_type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(order_id, total_price, product_quantity, date, customer, product_type);
    }

    public CustOrder(int order_id, double total_price, int product_quantity, Timestamp date, User customer, Set<Product> product_type) {
        this.order_id = order_id;
        this.total_price = total_price;
        this.product_quantity = product_quantity;
        this.date = date;
        this.customer = customer;
        this.product_type = product_type;
    }


}