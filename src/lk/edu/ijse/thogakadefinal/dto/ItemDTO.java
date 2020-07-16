/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.thogakadefinal.dto;

/**
 *
 * @author Lenovo™
 */
public class ItemDTO {
    private int iId;
    private String description;
    private int qtyOnHand;
    private double unitPrice;

    public ItemDTO() {
    }

    public ItemDTO( String description, int qtyOnHand, double unitPrice) {
        
        this.description = description;
        this.qtyOnHand = qtyOnHand;
        this.unitPrice = unitPrice;
    }

    public ItemDTO(int iId, String description, int qtyOnHand, double unitPrice) {
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
}
