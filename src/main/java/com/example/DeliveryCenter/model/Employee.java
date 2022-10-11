package com.example.DeliveryCenter.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "employees")
public class Employee extends Person{

    @OneToMany
    private List<Sale> sales;
    @OneToMany
    private List<Commission> comissions;
}
