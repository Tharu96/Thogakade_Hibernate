/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.thogakadefinal.dao.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lk.edu.ijse.thogakadefinal.dao.CustomerDAO;
import lk.edu.ijse.thogakadefinal.entity.Customer;
import org.hibernate.Session;

/**
 *
 * @author Lenovo™
 */
public class CustomerDAOImpl implements CustomerDAO{
    private Session session;
    @Override
    public boolean addCustomer(Customer customer) throws Exception {
         Serializable save=session.save(customer);
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

    @Override
    public Customer getCustomerBYName(String text)throws Exception{
         Customer customer= (Customer) session.createQuery("from Customer where cName='"+text+"'").list().get(0);
         return customer;
    }

    @Override
    public void deleteCustomer(Customer deleteCus)throws Exception{
        session.delete(deleteCus);
        
    }

    @Override
    public void updateCustomer(Customer updateCus)throws Exception {
         session.update(updateCus);
        
    }

    @Override
    public ArrayList<Customer> getAllCustomers()throws Exception {
         List<Customer> custList=session.createQuery("from Customer").list();
         return (ArrayList<Customer>) custList;
    }
    
}
