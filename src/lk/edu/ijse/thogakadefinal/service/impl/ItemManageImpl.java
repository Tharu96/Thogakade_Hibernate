/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.thogakadefinal.service.impl;

import java.util.ArrayList;
import lk.edu.ijse.thogakadefinal.dao.ItemDAO;
import lk.edu.ijse.thogakadefinal.dao.impl.ItemDAOImpl;
import lk.edu.ijse.thogakadefinal.dto.ItemDTO;
import lk.edu.ijse.thogakadefinal.entity.Item;
import lk.edu.ijse.thogakadefinal.service.ItemManage;
import lk.edu.ijse.thogakadefinal.util.SessionFactoryUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Lenovo™
 */
public class ItemManageImpl implements ItemManage{
    ItemDAO itemDAO=(ItemDAO)new ItemDAOImpl();
    @Override
    public boolean AddNewItem(ItemDTO itemDTO) throws Exception {
        SessionFactory sf = SessionFactoryUtil.getSessionFactory();
        Session customerSession = sf.openSession();
        Transaction tx = null;
         Item item=new Item();
         item.setDescription(itemDTO.getDescription());
         item.setQtyOnHand(itemDTO.getQtyOnHand());
         item.setUnitPrice(itemDTO.getUnitPrice());
         
         try {
            tx = customerSession.beginTransaction();
           
            
            itemDAO.setSession(customerSession);
            boolean result = itemDAO.addItem(item);
            if (result) {
                tx.commit();
                return true;

            } else {
                tx.rollback();
                return false;

            }

        } catch (HibernateException ex) {

            ex.printStackTrace();
            tx.rollback();
            return false;
        } finally {
            customerSession.close();
        }

        
    }

    @Override
    public ItemDTO getItemByName(String text) throws Exception{
        SessionFactory sf = SessionFactoryUtil.getSessionFactory();
        Session customerSession = sf.openSession();
        Transaction tx = null;
         
         
         try {
            tx = customerSession.beginTransaction();
           
            
            itemDAO.setSession(customerSession);
            Item item= itemDAO.getItemBYName(text);
            ItemDTO itemDTO=new ItemDTO();
            itemDTO.setiId(item.getiId());
            itemDTO.setDescription(item.getDescription());
            itemDTO.setQtyOnHand(item.getQtyOnHand());
            itemDTO.setUnitPrice(item.getUnitPrice());
            
                tx.commit();
                return itemDTO;

            

        } catch (HibernateException ex) {

            ex.printStackTrace();
            tx.rollback();
            return null;
        } finally {
            customerSession.close();
        }

        
    }

    @Override
    public boolean editItemDetail(ItemDTO updateItem)throws Exception{
         SessionFactory sf = SessionFactoryUtil.getSessionFactory();
        Session customerSession = sf.openSession();
        Transaction tx = null;
         Item item=new Item();
         item.setiId(updateItem.getiId());
         item.setDescription(updateItem.getDescription());
         item.setQtyOnHand(updateItem.getQtyOnHand());
         item.setUnitPrice(updateItem.getUnitPrice());
         
         
         
         
        try {
            tx = customerSession.beginTransaction();
           
            
            itemDAO.setSession(customerSession);
            itemDAO.updateItem(item);
            
                tx.commit();
                return true;

           

        } catch (HibernateException ex) {

            ex.printStackTrace();
            tx.rollback();
            return false;
        } finally {
            customerSession.close();
        }
    }

    @Override
    public boolean removeItem(ItemDTO deleteItem) throws Exception{
        SessionFactory sf = SessionFactoryUtil.getSessionFactory();
        Session customerSession = sf.openSession();
        Transaction tx = null;
         Item item=new Item();
         item.setiId(deleteItem.getiId());
         item.setDescription(deleteItem.getDescription());
         item.setQtyOnHand(deleteItem.getQtyOnHand());
         item.setUnitPrice(deleteItem.getUnitPrice());
         
         
         
         
        try {
            tx = customerSession.beginTransaction();
           
            
            itemDAO.setSession(customerSession);
            itemDAO.deleteItem(item);
            
                tx.commit();
                return true;

           

        } catch (HibernateException ex) {

            ex.printStackTrace();
            tx.rollback();
            return false;
        } finally {
            customerSession.close();
        }
    }

    @Override
    public ArrayList<ItemDTO> getAllItems() throws Exception {
        SessionFactory sf = SessionFactoryUtil.getSessionFactory();
        Session customerSession = sf.openSession();
        Transaction tx = null;
         
         
         try {
            tx = customerSession.beginTransaction();
           
            
            itemDAO.setSession(customerSession);
            ArrayList<Item> itemList= itemDAO.getAllItems();
            
            ArrayList<ItemDTO> itemDTOList=new ArrayList<>();
             for (Item item : itemList) {
                ItemDTO itemDTO=new ItemDTO();
                itemDTO.setiId(item.getiId());
                itemDTO.setDescription(item.getDescription());
                itemDTO.setQtyOnHand(item.getQtyOnHand());
                itemDTO.setUnitPrice(item.getUnitPrice());
                
                itemDTOList.add(itemDTO);
             }
            
            
                tx.commit();
                return itemDTOList;

            

        } catch (HibernateException ex) {

            ex.printStackTrace();
            tx.rollback();
            return null;
        } finally {
            customerSession.close();
        }

    }

    @Override
    public boolean editItemOty(ItemDTO item, int orderQty) throws Exception {
        SessionFactory sf = SessionFactoryUtil.getSessionFactory();
        Session customerSession = sf.openSession();
        Transaction tx = null;
         Item item1=new Item();
         item1.setiId(item.getiId());
         item1.setDescription(item.getDescription());
         item1.setQtyOnHand(item.getQtyOnHand()-orderQty);
         item1.setUnitPrice(item.getUnitPrice());
         
         try {
            tx = customerSession.beginTransaction();
            itemDAO.setSession(customerSession);
            itemDAO.updateItem(item1);
            
                tx.commit();
                return true;
         } catch (HibernateException ex) {

            ex.printStackTrace();
            tx.rollback();
            return false;
        } finally {
            customerSession.close();
        }
    }
    
}
