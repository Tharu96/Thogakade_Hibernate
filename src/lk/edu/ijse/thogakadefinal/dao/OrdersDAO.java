/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.thogakadefinal.dao;

import lk.edu.ijse.thogakadefinal.entity.Orders;
import org.hibernate.Session;

/**
 *
 * @author Lenovo™
 */
public interface OrdersDAO {
     public boolean addOrders(Orders orders) throws Exception;
     
     public void setSession(Session session) throws Exception;
        
    
}
