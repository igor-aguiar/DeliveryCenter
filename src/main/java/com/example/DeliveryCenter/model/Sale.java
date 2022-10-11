package com.example.DeliveryCenter.model;

import javax.persistence.*;

@Entity
@Table(name = "sales")
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @OneToOne
    private Client client;
    @OneToOne
    private Employee employee;
    @OneToOne
    private Order order;

    public Sale() {
    }

    public Sale(Client client, Employee employee, Order order) {
        this.client = client;
        this.employee = employee;
        this.order = order;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
