package com.example.DeliveryCenter.model;

import javax.persistence.*;
import java.sql.Array;
import java.time.LocalDate;
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
    private String paymenteMethod;
    @OneToMany
    private List<ProductOrder> productOrder = new ArrayList<>();


    public void setClient(Client client) {
        this.client = client;
    }
}
