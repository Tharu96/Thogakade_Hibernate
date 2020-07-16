/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.thogakadefinal.controlleer;

import java.util.ArrayList;
import lk.edu.ijse.thogakadefinal.dto.CustomerDTO;
import lk.edu.ijse.thogakadefinal.dto.ItemDTO;
import lk.edu.ijse.thogakadefinal.dto.OrderDetailDTO;
import lk.edu.ijse.thogakadefinal.dto.OrdersDTO;

/**
 *
 * @author Lenovo™
 */
public interface InvoiceController {
    public boolean saveOrderDetails(String cName,String iteName,OrdersDTO orders,OrderDetailDTO od)throws Exception;

    public boolean saveOrderDetails(CustomerDTO custDTO, ArrayList<ItemDTO> itemDTOList ,
            OrdersDTO order, ArrayList<OrderDetailDTO> odDTOList)throws Exception;
    
}
