/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.thogakadefinal.service;

import lk.edu.ijse.thogakadefinal.entity.Orders;
import lk.edu.ijse.thogakadefinal.util.SessionFactoryUtil;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Lenovo™
 */
public class OrderService {
     public static SessionFactory sessionFactory=SessionFactoryUtil.getSessionFactory();
    
    public static boolean addOrders(Orders order){
        Session session=sessionFactory.openSession();
        Transaction tx=null;
        try {
            tx=session.beginTransaction();
            session.save(order);
            tx.commit();
            return true;
            
        } catch (HibernateException e) {
            if(tx!=null){
                tx.rollback();
            }
            e.printStackTrace();
            return false;
        }finally{
            session.close();
        }
    }
    
}
