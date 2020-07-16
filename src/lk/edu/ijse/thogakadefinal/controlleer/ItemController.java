/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.thogakadefinal.controlleer;

import java.util.ArrayList;
import lk.edu.ijse.thogakadefinal.dto.ItemDTO;

/**
 *
 * @author Lenovo™
 */
public interface ItemController {
     public boolean addNewItem(ItemDTO itemDTO)throws Exception;

    public ItemDTO getItemByName(String text)throws Exception;

    public boolean updateItem(ItemDTO updateItem)throws Exception;

    public boolean deleteItem(ItemDTO deleteItem)throws Exception;

    public ArrayList<ItemDTO> getAllItems()throws Exception;

    public boolean updateItemQty(ItemDTO item, int orderQty)throws Exception;
    
}
