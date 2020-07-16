/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.thogakadefinal.dao.impl;

import java.io.Serializable;
import lk.edu.ijse.thogakadefinal.dao.OrdersDAO;
import lk.edu.ijse.thogakadefinal.entity.Orders;
import org.hibernate.Session;

/**
 *
 * @author Lenovo™
 */
public class OrdersDAOImpl implements OrdersDAO{
    private Session session;
    @Override
    public boolean addOrders(Orders orders) throws Exception {
         Serializable save=session.save(orders);
        if(save!=null){
            return true;
        }else{
            return false;
            
        }
    }

    @Override
    public void setSession(Session session) throws Exception {
        this.session=session;
    }
    
}
