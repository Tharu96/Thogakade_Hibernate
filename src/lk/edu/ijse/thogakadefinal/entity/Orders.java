/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.thogakadefinal.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Lenovo™
 */
@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int oId;
    private String orderDate;
    @ManyToOne(cascade = CascadeType.ALL)
    private Customer customer;
    

    public Orders() {
    }

    public Orders( String orderDate, Customer customer) {
        
        this.orderDate = orderDate;
        this.customer = customer;
    }

    public Orders(int oId, String orderDate, Customer customer) {
        this.oId = oId;
        this.orderDate = orderDate;
        this.customer = customer;
    }
    

    /**
     * @return the oId
     */
    public int getoId() {
        return oId;
    }

    /**
     * @param oId the oId to set
     */
    public void setoId(int oId) {
        this.oId = oId;
    }

    /**
     * @return the orderDate
     */
    public String getOrderDate() {
        return orderDate;
    }

    /**
     * @param orderDate the orderDate to set
     */
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * @return the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Orders{" + "oId=" + oId + ", orderDate=" + orderDate + ", customer=" + customer + '}';
    }

   
   
}
