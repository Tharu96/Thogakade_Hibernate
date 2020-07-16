/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.thogakadefinal.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Lenovo™
 */
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cId;
    private String cName;
    private String contact;
    private double creditLimit;
    private int creditDays;

    public Customer() {
    }

    public Customer(int cId, String cName, String contact, double creditLimit, int creditDays) {
        this.cId = cId;
        this.cName = cName;
        this.contact = contact;
        this.creditLimit = creditLimit;
        this.creditDays = creditDays;
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public int getCreditDays() {
        return creditDays;
    }

    public void setCreditDays(int creditDays) {
        this.creditDays = creditDays;
    }

    @Override
    public String toString() {
        return "Customer{" + "cId=" + cId + ", cName=" + cName + ", contact=" + contact + ", creditLimit=" + creditLimit + ", creditDays=" + creditDays + '}';
    }

    
    
}
