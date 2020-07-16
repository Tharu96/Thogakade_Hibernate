/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.thogakadefinal.dao;

import lk.edu.ijse.thogakadefinal.entity.OrderDetail;
import org.hibernate.Session;

/**
 *
 * @author Lenovo™
 */
public interface OrderDetailDAO {
    public boolean addOrderDetail(OrderDetail od)throws Exception;
    
     public void setSession(Session session) throws Exception;
        
    
}
