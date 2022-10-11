package com.example.DeliveryCenter.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "employees")
public class Employee extends Person{

    @OneToMany
    private List<Sale> sales = new ArrayList<>();
    @OneToMany
    private List<Commission> commissions = new ArrayList<>();

    public Employee() {
    }

    public Employee(String name, LocalDate birthDate, String email, String password) {
        super(name, birthDate, email, password);
    }

    public List<Sale> getSales() {
        return sales;
    }

    public void setSales(Sale sales) {
        this.sales.add(sales);
    }

    public List<Commission> getCommissions() {
        return commissions;
    }

    public void setCommissions(Commission commission) {
        commission.setEmployee(this);
        this.commissions.add(commission);
    }
}
