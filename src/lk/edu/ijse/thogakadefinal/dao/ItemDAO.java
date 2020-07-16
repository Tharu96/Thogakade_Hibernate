/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.thogakadefinal.dao;

import java.util.ArrayList;
import lk.edu.ijse.thogakadefinal.entity.Item;
import org.hibernate.Session;

/**
 *
 * @author Lenovo™
 */
public interface ItemDAO {
    public boolean addItem(Item item)throws Exception;
    
    public void setSession(Session session)throws Exception;

    public Item getItemBYName(String text)throws Exception;

    public void deleteItem(Item deleteItem)throws Exception;

    public void updateItem(Item updateItem)throws Exception;

    public ArrayList<Item> getAllItems()throws Exception;
    
    
}
