/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.thogakadefinal.controller.impl;

import java.util.ArrayList;
import lk.edu.ijse.thogakadefinal.controlleer.CustomerController;
import lk.edu.ijse.thogakadefinal.dto.CustomerDTO;
import lk.edu.ijse.thogakadefinal.entity.Customer;

import lk.edu.ijse.thogakadefinal.service.CustomerService2;
import lk.edu.ijse.thogakadefinal.service.impl.CustomerServiceImpl;

/**
 *
 * @author Lenovo™
 */
public class CustomerControllerImpl implements CustomerController{
    CustomerService2 cs=(CustomerService2)new CustomerServiceImpl();
    @Override
    public boolean addCustomer(CustomerDTO customerDTO) throws Exception {
        return cs.saveCustomer(customerDTO);
    }

    @Override
    public CustomerDTO getCustomerByName(String text) throws Exception {
        return cs.getCustomerByName(text);
    }

    @Override
    public boolean updateCustomer(CustomerDTO updateCus) throws Exception {
        return cs.editCustomerDetail(updateCus);
    }

    @Override
    public boolean deleteCustomer(CustomerDTO deleteCus) throws Exception {
        return cs.removeCustomer(deleteCus);
    }

    @Override
    public ArrayList<CustomerDTO> getAllCustomers() throws Exception {
        return cs.getAllCustomers();
    }
    
}
