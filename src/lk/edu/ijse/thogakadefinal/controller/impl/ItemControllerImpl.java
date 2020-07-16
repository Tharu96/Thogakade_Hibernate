/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.thogakadefinal.controller.impl;

import java.util.ArrayList;
import lk.edu.ijse.thogakadefinal.controlleer.ItemController;
import lk.edu.ijse.thogakadefinal.dto.ItemDTO;
import lk.edu.ijse.thogakadefinal.service.ItemManage;
import lk.edu.ijse.thogakadefinal.service.impl.ItemManageImpl;

/**
 *
 * @author Lenovo™
 */
public class ItemControllerImpl implements ItemController{
    ItemManage im=(ItemManage)new ItemManageImpl();
    @Override
    public boolean addNewItem(ItemDTO itemDTO) throws Exception {
        return im.AddNewItem(itemDTO);
    }

    @Override
    public ItemDTO getItemByName(String text) throws Exception {
        return im.getItemByName(text);
    }

    @Override
    public boolean updateItem(ItemDTO updateItem) throws Exception {
        return im.editItemDetail(updateItem);
    }

    @Override
    public boolean deleteItem(ItemDTO deleteItem) throws Exception {
        return im.removeItem(deleteItem);
    }

    @Override
    public ArrayList<ItemDTO> getAllItems() throws Exception {
        return im.getAllItems();
    }

    @Override
    public boolean updateItemQty(ItemDTO item, int orderQty) throws Exception {
        return im.editItemOty(item,orderQty);
    }
    
}
