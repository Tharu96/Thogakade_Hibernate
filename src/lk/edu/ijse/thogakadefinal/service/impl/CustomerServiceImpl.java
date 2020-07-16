/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.thogakadefinal.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.edu.ijse.thogakadefinal.dao.CustomerDAO;
import lk.edu.ijse.thogakadefinal.dao.impl.CustomerDAOImpl;
import lk.edu.ijse.thogakadefinal.dto.CustomerDTO;
import lk.edu.ijse.thogakadefinal.entity.Customer;

import lk.edu.ijse.thogakadefinal.service.CustomerService2;
import lk.edu.ijse.thogakadefinal.util.SessionFactoryUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Lenovo™
 */
public class CustomerServiceImpl implements CustomerService2{
    private Session session;
    CustomerDAO customerDAO=(CustomerDAO)new CustomerDAOImpl();
    
    @Override
    public boolean saveCustomer(CustomerDTO customerDTO) throws Exception {
        SessionFactory sf = SessionFactoryUtil.getSessionFactory();
        Session customerSession = sf.openSession();
        Transaction tx = null;
         Customer customer=new Customer();
         customer.setcName(customerDTO.getcName());
         customer.setContact(customerDTO.getContact());
         customer.setCreditLimit(customerDTO.getCreditLimit());
         customer.setCreditDays(customerDTO.getCreditDays());
         
         
         
        try {
            tx = customerSession.beginTransaction();
           
            
            customerDAO.setSession(customerSession);
            boolean result = customerDAO.addCustomer(customer);
            if (result) {
                tx.commit();
                return true;

            } else {
                tx.rollback();
                return false;

            }

        } catch (HibernateException ex) {

            ex.printStackTrace();
            tx.rollback();
            return false;
        } finally {
            customerSession.close();
        }

    }

    @Override
    public CustomerDTO getCustomerByName(String text) {
        SessionFactory sf = SessionFactoryUtil.getSessionFactory();
        Session customerSession = sf.openSession();
        Transaction tx = null;
         
         
        try {
            tx = customerSession.beginTransaction();
           
            
            try {
                customerDAO.setSession(customerSession);
            } catch (Exception ex) {
                Logger.getLogger(CustomerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            Customer customer=customerDAO.getCustomerBYName(text);
            CustomerDTO cusDTO=new CustomerDTO(customer.getcId(),customer.getcName(),customer.getContact(),
                    customer.getCreditLimit(),customer.getCreditDays());
            tx.commit();
            return cusDTO;

            

        } catch (HibernateException ex) {

            ex.printStackTrace();
            tx.rollback();
            return null;
        } catch (Exception ex) {
            Logger.getLogger(CustomerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            customerSession.close();
        }
        return null;

    }

    @Override
    public boolean editCustomerDetail(CustomerDTO updateCus) {
        SessionFactory sf = SessionFactoryUtil.getSessionFactory();
        Session customerSession = sf.openSession();
        Transaction tx = null;
         Customer customer=new Customer();
         customer.setcId(updateCus.getcId());
         customer.setcName(updateCus.getcName());
         customer.setContact(updateCus.getContact());
         customer.setCreditLimit(updateCus.getCreditLimit());
         customer.setCreditDays(updateCus.getCreditDays());
         
         
        
        try {
            tx=customerSession.beginTransaction();
            try {
                customerDAO.setSession(customerSession);
                customerDAO.updateCustomer(customer);
            } catch (Exception ex) {
                Logger.getLogger(CustomerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            tx.commit();
            return true;
            
        } catch (HibernateException e) {
            if(tx!=null){
                tx.rollback();
            }
            e.printStackTrace();
            return false;
        }finally{
            customerSession.close();
        }
         
       
    }

    @Override
    public boolean removeCustomer(CustomerDTO deleteCus) {
        SessionFactory sf = SessionFactoryUtil.getSessionFactory();
        Session customerSession = sf.openSession();
        Transaction tx = null;
         Customer customer=new Customer();
         customer.setcId(deleteCus.getcId());
         customer.setcName(deleteCus.getcName());
         customer.setContact(deleteCus.getContact());
         customer.setCreditLimit(deleteCus.getCreditLimit());
         customer.setCreditDays(deleteCus.getCreditDays());
         
         
        
        try {
            tx=customerSession.beginTransaction();
            try {
                customerDAO.setSession(customerSession);
                customerDAO.deleteCustomer(customer);
            } catch (Exception ex) {
                Logger.getLogger(CustomerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            tx.commit();
            return true;
            
        } catch (HibernateException e) {
            if(tx!=null){
                tx.rollback();
            }
            e.printStackTrace();
            return false;
        }finally{
            customerSession.close();
        }
    }

    @Override
    public ArrayList<CustomerDTO> getAllCustomers() throws Exception {
         SessionFactory sf = SessionFactoryUtil.getSessionFactory();
        Session customerSession = sf.openSession();
        Transaction tx = null;
         
         
         try {
            tx = customerSession.beginTransaction();
           
            
            customerDAO.setSession(customerSession);
            ArrayList<Customer> custList= customerDAO.getAllCustomers();
            
            ArrayList<CustomerDTO> custDTOList=new ArrayList<>();
             for (Customer customer : custList) {
                CustomerDTO customerDTO=new CustomerDTO();
                customerDTO.setcId(customer.getcId());
                customerDTO.setcName(customer.getcName());
                customerDTO.setContact(customer.getContact());
                customerDTO.setCreditLimit(customer.getCreditLimit());
                customerDTO.setCreditDays(customer.getCreditDays());
                custDTOList.add(customerDTO);
             }
            
            
                tx.commit();
                return custDTOList;

            

        } catch (HibernateException ex) {

            ex.printStackTrace();
            tx.rollback();
            return null;
        } finally {
            customerSession.close();
        }

        
    }
            
    

    
    
}
