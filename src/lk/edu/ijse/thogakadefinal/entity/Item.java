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
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int iId;
    private String description;
    private int qtyOnHand;
    private double unitPrice;

    public Item() {
    }

    public Item(int iId, String description, int qtyOnHand, double unitPrice) {
        this.iId = iId;
        this.description = description;
        this.qtyOnHand = qtyOnHand;
        this.unitPrice = unitPrice;
    }

    /**
     * @return the iId
     */
    public int getiId() {
        return iId;
    }

    /**
     * @param iId the iId to set
     */
    public void setiId(int iId) {
        this.iId = iId;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the qtyOnHand
     */
    public int getQtyOnHand() {
        return qtyOnHand;
    }

    /**
     * @param qtyOnHand the qtyOnHand to set
     */
    public void setQtyOnHand(int qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }

    /**
     * @return the unitPrice
     */
    public double getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "Item{" + "iId=" + iId + ", description=" + description + ", qtyOnHand=" + qtyOnHand + ", unitPrice=" + unitPrice + '}';
    }
    
    
    
}
