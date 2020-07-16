/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.thogakadefinal.controlleer;

import java.util.ArrayList;
import lk.edu.ijse.thogakadefinal.dto.CustomerDTO;
import lk.edu.ijse.thogakadefinal.entity.Customer;

/**
 *
 * @author Lenovo™
 */
public interface CustomerController {
    public boolean addCustomer(CustomerDTO customerDTO)throws Exception;

    public CustomerDTO getCustomerByName(String text)throws Exception;

    public boolean updateCustomer(CustomerDTO updateCus)throws Exception;

    public boolean deleteCustomer(CustomerDTO deleteCus)throws Exception;

    public ArrayList<CustomerDTO> getAllCustomers()throws Exception;
    
}
