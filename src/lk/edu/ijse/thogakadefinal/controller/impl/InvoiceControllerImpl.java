/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.thogakadefinal.controller.impl;

import java.util.ArrayList;
import lk.edu.ijse.thogakadefinal.controlleer.InvoiceController;
import lk.edu.ijse.thogakadefinal.dto.CustomerDTO;
import lk.edu.ijse.thogakadefinal.dto.ItemDTO;
import lk.edu.ijse.thogakadefinal.dto.OrderDetailDTO;
import lk.edu.ijse.thogakadefinal.dto.OrdersDTO;
import lk.edu.ijse.thogakadefinal.service.InvoiceService;
import lk.edu.ijse.thogakadefinal.service.impl.InvoiceServiceImpl;

/**
 *
 * @author Lenovo™
 */
public class InvoiceControllerImpl implements InvoiceController{
    InvoiceService iv=(InvoiceService)new InvoiceServiceImpl();
    @Override
    public boolean saveOrderDetails(String cName, String iteName, OrdersDTO orders, OrderDetailDTO od) throws Exception {
        return iv.PlaceOrder(cName, iteName, orders, od);
    }

    @Override
    public boolean saveOrderDetails(CustomerDTO custDTO, ArrayList<ItemDTO> itemDTOList,
            OrdersDTO order, ArrayList<OrderDetailDTO> odDTOList) throws Exception {
        return iv.PlaceOrder(custDTO, itemDTOList, order, odDTOList);
    }
    
}
