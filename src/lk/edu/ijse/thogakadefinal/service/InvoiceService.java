/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.thogakadefinal.service;

import java.util.ArrayList;
import lk.edu.ijse.thogakadefinal.dto.CustomerDTO;
import lk.edu.ijse.thogakadefinal.dto.ItemDTO;
import lk.edu.ijse.thogakadefinal.dto.OrderDetailDTO;
import lk.edu.ijse.thogakadefinal.dto.OrdersDTO;

/**
 *
 * @author Lenovo™
 */
public interface InvoiceService {
     public boolean PlaceOrder(String cName, String iteName, OrdersDTO orders, OrderDetailDTO od) throws Exception;

   

    public boolean PlaceOrder(CustomerDTO custDTO, ArrayList<ItemDTO> itemDTOList, OrdersDTO order, 
            ArrayList<OrderDetailDTO> odDTOList)throws Exception;
}
