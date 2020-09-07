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

    // foreign key
    @ManyToOne
    @JoinColumn(name = "custcode", nullable = false)
    private Customer custcode;

    private String orderdescription;

    // default constructor
    public Order()
    {
    }

    //constructor
    //(ordnum, ordamount, advanceamount, custcode, orderdescription)


    public Order(long ordnum, double ordamount, double advanceamount, Customer custcode, String orderdescription)
    {
        this.ordnum = ordnum;
        this.ordamount = ordamount;
        this.advanceamount = advanceamount;
        this.custcode = custcode;
        this.orderdescription = orderdescription;
    }

    //getters and setters
    public long getOrdnum()
    {
        return ordnum;
    }

    public void setOrdnum(long ordnum)
    {
        this.ordnum = ordnum;
    }

    public double getOrdamount()
    {
        return ordamount;
    }

    public void setOrdamount(double ordamount)
    {
        this.ordamount = ordamount;
    }

    public double getAdvanceamount()
    {
        return advanceamount;
    }

    public void setAdvanceamount(double advanceamount)
    {
        this.advanceamount = advanceamount;
    }

    public String getOrderdescription()
    {
        return orderdescription;
    }

    public void setOrderdescription(String orderdescription)
    {
        this.orderdescription = orderdescription;
    }

    public Customer getCustcode() {
        return custcode;
    }

    public void setCustcode(Customer custcode) {
        this.custcode = custcode;
    }
}
