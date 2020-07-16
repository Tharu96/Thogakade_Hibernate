/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.thogakadefinal.entity;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Lenovo™
 */
@Entity
public class OrderDetail implements Serializable{
    private int orderQuantity;
    private double unitPrice;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="oId",referencedColumnName = "oId",insertable = false,updatable = false)
    private Orders orders;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="iId",referencedColumnName = "iId",insertable = false,updatable = false)
    private Item item;
    
    @EmbeddedId
    private OrderDetail_PK orderDetail_PK;

    public OrderDetail() {
    }

    public OrderDetail(int oId,int iId,int orderQuantity, double unitPrice, Orders orders, Item item, OrderDetail_PK orderDetail_PK) {
        this.orderQuantity = orderQuantity;
        this.unitPrice = unitPrice;
        this.orders = orders;
        this.item = item;
        this.orderDetail_PK = orderDetail_PK;
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
     * @return the orders
     */
    public Orders getOrders() {
        return orders;
    }

    /**
     * @param orders the orders to set
     */
    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    /**
     * @return the item
     */
    public Item getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(Item item) {
        this.item = item;
    }

    /**
     * @return the orderDetail_PK
     */
    public OrderDetail_PK getOrderDetail_PK() {
        return orderDetail_PK;
    }

    /**
     * @param orderDetail_PK the orderDetail_PK to set
     */
    public void setOrderDetail_PK(OrderDetail_PK orderDetail_PK) {
        this.orderDetail_PK = orderDetail_PK;
    }

    @Override
    public String toString() {
        return "OrderDetail{" + "orderQuantity=" + orderQuantity + ", unitPrice=" + unitPrice + ", orders=" + orders + ", item=" + item + ", orderDetail_PK=" + orderDetail_PK + '}';
    }
     
    
}
