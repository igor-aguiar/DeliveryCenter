package com.example.DeliveryCenter.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "clients")
public class Client extends Person{
    @OneToMany(cascade = CascadeType.ALL)
    private List<Order> orders = new ArrayList<>();
    @OneToOne
    private LoyaltyCard loyaltyCard;

    public Client() {
    }

    public Client(String name, LocalDate birthDate, String email, String password, LoyaltyCard loyaltyCard) {
        super(name, birthDate, email, password);
        this.loyaltyCard = loyaltyCard;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(Order order) {
        order.setClient(this);
        this.orders.add(order);
    }

    public LoyaltyCard getLoyaltyCard() {
        return loyaltyCard;
    }

    public void setLoyaltyCard(LoyaltyCard loyaltyCard) {
        this.loyaltyCard = loyaltyCard;
    }
}
