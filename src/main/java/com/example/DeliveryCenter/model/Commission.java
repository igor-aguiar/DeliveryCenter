package com.example.DeliveryCenter.model;

import javax.persistence.*;

@Entity
@Table(name = "commissions")
public class Commission {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Double value;
    @OneToOne
    private Employee employee;

    public Commission(Double value, Employee employee) {
        this.value = value;
        this.employee = employee;
    }

    public Commission() {
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
