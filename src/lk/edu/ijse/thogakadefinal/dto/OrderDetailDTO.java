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
public class OrderDetailDTO {
    private int orderQuantity;
    private double unitPrice;
    
    private OrdersDTO ordersDTO;
    
    private ItemDTO itemDTO;
   
    private OrderDetail_PKDTO orderDetail_PKDTO;

    public OrderDetailDTO() {
    }

    public OrderDetailDTO(int oId,int iId,int orderQuantity, double unitPrice, OrdersDTO ordersDTO, ItemDTO itemDTO, OrderDetail_PKDTO orderDetail_PKDTO) {
        this.orderQuantity = orderQuantity;
        this.unitPrice = unitPrice;
        this.ordersDTO = ordersDTO;
        this.itemDTO = itemDTO;
        this.orderDetail_PKDTO = orderDetail_PKDTO;
    }

    /**
     * @return the orderQuantity
     */
    public int getOrderQuantity() {
        return orderQuantity;
    }

    /**
     * @param orderQuantity the orderQuantity to set
     */
    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
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

    /**
     * @return the ordersDTO
     */
    public OrdersDTO getOrdersDTO() {
        return ordersDTO;
    }

    /**
     * @param ordersDTO the ordersDTO to set
     */
    public void setOrdersDTO(OrdersDTO ordersDTO) {
        this.ordersDTO = ordersDTO;
    }

    /**
     * @return the itemDTO
     */
    public ItemDTO getItemDTO() {
        return itemDTO;
    }

    /**
     * @param itemDTO the itemDTO to set
     */
    public void setItemDTO(ItemDTO itemDTO) {
        this.itemDTO = itemDTO;
    }

    /**
     * @return the orderDetail_PKDTO
     */
    public OrderDetail_PKDTO getOrderDetail_PKDTO() {
        return orderDetail_PKDTO;
    }

    /**
     * @param orderDetail_PKDTO the orderDetail_PKDTO to set
     */
    public void setOrderDetail_PKDTO(OrderDetail_PKDTO orderDetail_PKDTO) {
        this.orderDetail_PKDTO = orderDetail_PKDTO;
    }

     
}
