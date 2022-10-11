package com.example.DeliveryCenter.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @OneToOne
    private Client client;
    private Double total;
    private LocalDateTime orderTime;
    private String status;
    private String paymentMethod;
    @OneToMany(cascade = CascadeType.ALL)
    private List<ProductOrder> productOrder = new ArrayList<>();

    public Order() {
    }

    public Order(Client client, Double total, LocalDateTime orderTime, String status, String paymenteMethod) {
        this.client = client;
        this.total = total;
        this.orderTime = orderTime;
        this.status = status;
        this.paymentMethod = paymenteMethod;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymenteMethod) {
        this.paymentMethod = paymenteMethod;
    }

    public List<ProductOrder> getProductOrder() {
        return productOrder;
    }

    public void setProductOrder(ProductOrder productOrder) {
        productOrder.setOrder(this);
        this.productOrder.add(productOrder);
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
