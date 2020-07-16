/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.thogakadefinal.dao.impl;

import java.io.Serializable;
import lk.edu.ijse.thogakadefinal.dao.OrderDetailDAO;
import lk.edu.ijse.thogakadefinal.entity.OrderDetail;
import org.hibernate.Session;

/**
 *
 * @author Lenovo™
 */
public class OrderDetailDAOImpl implements OrderDetailDAO{
    private Session session;
    @Override
    public boolean addOrderDetail(OrderDetail od) throws Exception {
        Serializable save=(Serializable) session.merge(od);
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
