/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.thogakadefinal.dao;

import java.util.ArrayList;
import lk.edu.ijse.thogakadefinal.dto.CustomerDTO;
import lk.edu.ijse.thogakadefinal.entity.Customer;
import org.hibernate.Session;

/**
 *
 * @author Lenovo™
 */
public interface CustomerDAO {
    public boolean addCustomer(Customer customer)throws Exception;
    
    public void setSession(Session session)throws Exception;

    public Customer getCustomerBYName(String text)throws Exception;

    public void deleteCustomer(Customer deleteCus)throws Exception;

    public void updateCustomer(Customer updateCus)throws Exception;

    public ArrayList<Customer> getAllCustomers()throws Exception;
    
}
