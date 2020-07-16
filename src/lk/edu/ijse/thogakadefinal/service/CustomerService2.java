/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.thogakadefinal.service;

import java.util.ArrayList;
import lk.edu.ijse.thogakadefinal.dto.CustomerDTO;
import lk.edu.ijse.thogakadefinal.entity.Customer;
import org.hibernate.Session;

/**
 *
 * @author Lenovo™
 */
public interface CustomerService2 {
    public boolean saveCustomer(CustomerDTO customerDTO)throws Exception;

    public CustomerDTO getCustomerByName(String text)throws Exception;

    public boolean editCustomerDetail(CustomerDTO updateCus)throws Exception;

    public boolean removeCustomer(CustomerDTO deleteCus)throws Exception;

    public ArrayList<CustomerDTO> getAllCustomers()throws Exception;
    
   
}

