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
public class CustomerDTO {
    private int cId;
    private String cName;
    private String contact;
    private double creditLimit;
    private int creditDays;

    public CustomerDTO() {
    }

    public CustomerDTO( String cName, String contact, double creditLimit, int creditDays) {
        
        this.cName = cName;
        this.contact = contact;
        this.creditLimit = creditLimit;
        this.creditDays = creditDays;
    }

    public CustomerDTO(int cId, String cName, String contact, double creditLimit, int creditDays) {
        this.cId = cId;
        this.cName = cName;
        this.contact = contact;
        this.creditLimit = creditLimit;
        this.creditDays = creditDays;
    }

    /**
     * @return the cId
     */
    public int getcId() {
        return cId;
    }

    /**
     * @param cId the cId to set
     */
    public void setcId(int cId) {
        this.cId = cId;
    }

    /**
     * @return the cName
     */
    public String getcName() {
        return cName;
    }

    /**
     * @param cName the cName to set
     */
    public void setcName(String cName) {
        this.cName = cName;
    }

    /**
     * @return the contact
     */
    public String getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * @return the creditLimit
     */
    public double getCreditLimit() {
        return creditLimit;
    }

    /**
     * @param creditLimit the creditLimit to set
     */
    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    /**
     * @return the creditDays
     */
    public int getCreditDays() {
        return creditDays;
    }

    /**
     * @param creditDays the creditDays to set
     */
    public void setCreditDays(int creditDays) {
        this.creditDays = creditDays;
    }
    

    /**
     * @return the cId
     */
   

}
