/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.thogakadefinal.dao.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lk.edu.ijse.thogakadefinal.dao.ItemDAO;
import lk.edu.ijse.thogakadefinal.entity.Item;
import org.hibernate.Session;

/**
 *
 * @author Lenovo™
 */
public class ItemDAOImpl implements ItemDAO{
    private Session session;
    @Override
    public boolean addItem(Item item) throws Exception {
        Serializable save=session.save(item);
        if(save!=null){
            return true;
        }else{
            return false;
            
        }
    }

    @Override
    public void setSession(Session session) throws Exception {
        this.session=session;
    }

    @Override
    public Item getItemBYName(String text) throws Exception {
         Item item= (Item) session.createQuery("from Item where description='"+text+"'").list().get(0);
         return item;
    }

    @Override
    public void deleteItem(Item deleteItem) throws Exception {
        session.delete(deleteItem);
    }

    @Override
    public void updateItem(Item updateItem) throws Exception {
        session.update(updateItem);
    }

    @Override
    public ArrayList<Item> getAllItems() throws Exception {
        List<Item> itemList=session.createQuery("from Item").list();
         return (ArrayList<Item>) itemList;
    }
    
}
