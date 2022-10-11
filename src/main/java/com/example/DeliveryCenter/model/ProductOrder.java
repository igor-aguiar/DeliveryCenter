package com.example.DeliveryCenter.model;

import javax.persistence.*;

@Entity
@Table(name = "products_ordered")
public class ProductOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @OneToOne
    private Order order;
    @OneToOne(cascade = CascadeType.ALL)
    private Product product;
    private Integer amount;

    public ProductOrder() {
    }

    public ProductOrder(Order order, Product product, Integer amount) {
        this.order = order;
        this.product = product;
        this.amount = amount;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
