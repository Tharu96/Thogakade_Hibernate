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
public class OrdersDTO {
    private int oId;
    private String orderDate;
    
    private CustomerDTO customerDTO;

    public OrdersDTO() {
    }

    public OrdersDTO( String orderDate, CustomerDTO customerDTO) {
        
        this.orderDate = orderDate;
        this.customerDTO = customerDTO;
    }

    public OrdersDTO(int oId, String orderDate, CustomerDTO customerDTO) {
        this.oId = oId;
        this.orderDate = orderDate;
        this.customerDTO = customerDTO;
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
     * @return the customerDTO
     */
    public CustomerDTO getCustomerDTO() {
        return customerDTO;
    }

    /**
     * @param customerDTO the customerDTO to set
     */
    public void setCustomerDTO(CustomerDTO customerDTO) {
        this.customerDTO = customerDTO;
    }
    

    
    
    
}
