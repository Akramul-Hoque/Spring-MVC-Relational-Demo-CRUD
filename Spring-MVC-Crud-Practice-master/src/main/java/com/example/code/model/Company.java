package com.example.code.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String companyName;
    private String address;
    private String dealerName;
    private String dealerNumber;
    private String companyMail;

    @OneToMany(mappedBy = "company")
    private List<Product> products;

    public Company(){

    }

    public Company(String companyName, String address, String dealerName, String dealerNumber, String companyMail) {
        this.companyName = companyName;
        this.address = address;
        this.dealerName = dealerName;
        this.dealerNumber = dealerNumber;
        this.companyMail = companyMail;
    }

    public Company(int id, String companyName, String address, String dealerName, String dealerNumber, String companyMail) {
        this.id = id;
        this.companyName = companyName;
        this.address = address;
        this.dealerName = dealerName;
        this.dealerNumber = dealerNumber;
        this.companyMail = companyMail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public String getDealerNumber() {
        return dealerNumber;
    }

    public void setDealerNumber(String dealerNumber) {
        this.dealerNumber = dealerNumber;
    }

    public String getCompanyMail() {
        return companyMail;
    }

    public void setCompanyMail(String companyMail) {
        this.companyMail = companyMail;
    }
}
