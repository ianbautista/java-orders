package com.lambdaschool.ordersapp.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="orders")
public class Order
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long ordnum;

    @Column(nullable = false)
    private double ordamount;
    private double advanceamount;
    private String orderdescription;

    // foreign key
    @ManyToOne
    @JoinColumn(name = "custcode", nullable = false)
    private Customer customer;

    // default constructor
    public Order()
    {
    }
    //constructor
    public Order(double ordamount, double advanceamount, String orderdescription, Customer customer) {
        this.ordamount = ordamount;
        this.advanceamount = advanceamount;
        this.orderdescription = orderdescription;
        this.customer = customer;
    }

    //getters and setters
    public long getOrdnum() {
        return ordnum;
    }

    public void setOrdnum(long ordnum) {
        this.ordnum = ordnum;
    }

    public double getOrdamount() {
        return ordamount;
    }

    public void setOrdamount(double ordamount) {
        this.ordamount = ordamount;
    }

    public double getAdvanceamount() {
        return advanceamount;
    }

    public void setAdvanceamount(double advanceamount) {
        this.advanceamount = advanceamount;
    }

    public String getOrderdescription() {
        return orderdescription;
    }

    public void setOrderdescription(String orderdescription) {
        this.orderdescription = orderdescription;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
