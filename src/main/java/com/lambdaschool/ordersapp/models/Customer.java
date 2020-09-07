package com.lambdaschool.ordersapp.models;

import javax.persistence.*;

@Entity
@Table(name = "cusotmers")
public class Customer
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long custcode;

    @Column(nullable = false)
    private String custname;
    private String custcity;
    private String workingarea;
    private String custcountry;
    private String grade;
    private double openingamt;
    private double receiveamt;
    private double paymentamt;
    private double outstandingamt;
    private String phone;


}
