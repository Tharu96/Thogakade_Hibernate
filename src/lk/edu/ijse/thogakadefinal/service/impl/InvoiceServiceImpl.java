/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.thogakadefinal.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.edu.ijse.thogakadefinal.dao.CustomerDAO;
import lk.edu.ijse.thogakadefinal.dao.ItemDAO;
import lk.edu.ijse.thogakadefinal.dao.OrderDetailDAO;
import lk.edu.ijse.thogakadefinal.dao.OrdersDAO;
import lk.edu.ijse.thogakadefinal.dao.impl.CustomerDAOImpl;
import lk.edu.ijse.thogakadefinal.dao.impl.ItemDAOImpl;
import lk.edu.ijse.thogakadefinal.dao.impl.OrderDetailDAOImpl;
import lk.edu.ijse.thogakadefinal.dao.impl.OrdersDAOImpl;
import lk.edu.ijse.thogakadefinal.dto.CustomerDTO;
import lk.edu.ijse.thogakadefinal.dto.ItemDTO;
import lk.edu.ijse.thogakadefinal.dto.OrderDetailDTO;
import lk.edu.ijse.thogakadefinal.dto.OrdersDTO;
import lk.edu.ijse.thogakadefinal.entity.Customer;
import lk.edu.ijse.thogakadefinal.entity.Item;
import lk.edu.ijse.thogakadefinal.entity.OrderDetail;
import lk.edu.ijse.thogakadefinal.entity.OrderDetail_PK;
import lk.edu.ijse.thogakadefinal.entity.Orders;
import lk.edu.ijse.thogakadefinal.service.InvoiceService;
import lk.edu.ijse.thogakadefinal.ui.Invoice;
import lk.edu.ijse.thogakadefinal.util.SessionFactoryUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Lenovo™
 */
public class InvoiceServiceImpl implements InvoiceService {

    @Override
    public boolean PlaceOrder(String cName, String itemName, OrdersDTO orders, OrderDetailDTO od) throws Exception {

        CustomerDAO customerDAO = (CustomerDAO) new CustomerDAOImpl();
        ItemDAO itemDAO = (ItemDAO) new ItemDAOImpl();
        OrdersDAO ordersDAO = (OrdersDAO) new OrdersDAOImpl();
        OrderDetailDAO odDAO = (OrderDetailDAO) new OrderDetailDAOImpl();

        SessionFactory sf = SessionFactoryUtil.getSessionFactory();
        Session customerSession = sf.openSession();
        Transaction tx = null;
        try {
            tx = customerSession.beginTransaction();

            Customer customer = customerDAO.getCustomerBYName(cName);

            System.out.println("Customer is get");
            Item item = itemDAO.getItemBYName(itemName);

            Orders oEntity = new Orders();
            oEntity.setOrderDate(orders.getOrderDate());
            oEntity.setCustomer(customer);

            OrderDetail odEntity = new OrderDetail();
            odEntity.setItem(item);
            odEntity.setOrders(oEntity);
            odEntity.setOrderQuantity(od.getOrderQuantity());
            odEntity.setUnitPrice(od.getUnitPrice());
            odEntity.setOrderDetail_PK(new OrderDetail_PK(oEntity.getoId(), item.getiId()));

            odDAO.setSession(customerSession);
            ordersDAO.setSession(customerSession);
            boolean isOrderAdded = ordersDAO.addOrders(oEntity);
            boolean isOrderDetailadded = odDAO.addOrderDetail(odEntity);
            if (isOrderAdded && isOrderDetailadded) {
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
        } catch (NullPointerException e) {
            e.printStackTrace();
            tx.rollback();
            return false;

        } finally {
            customerSession.close();
        }

    }

    /*@Override
    public boolean PlaceOrder(CustomerDTO custDTO, ArrayList<ItemDTO> itemDTOList, OrdersDTO order,
            ArrayList<OrderDetailDTO> odDTOList) throws Exception {

        CustomerDAO customerDAO = (CustomerDAO) new CustomerDAOImpl();
        ItemDAO itemDAO = (ItemDAO) new ItemDAOImpl();
        OrdersDAO ordersDAO = (OrdersDAO) new OrdersDAOImpl();
        OrderDetailDAO odDAO = (OrderDetailDAO) new OrderDetailDAOImpl();

        SessionFactory sf = SessionFactoryUtil.getSessionFactory();
        Session customerSession = sf.openSession();
        Transaction tx = null;

        try {
            Customer customer = new Customer();
            customer.setcId(custDTO.getcId());
            customer.setcName(custDTO.getcName());
            customer.setContact(customer.getContact());
            customer.setCreditLimit(custDTO.getCreditLimit());
            customer.setCreditDays(custDTO.getCreditDays());

            Orders oEntity = new Orders();
            oEntity.setOrderDate(order.getOrderDate());
            oEntity.setCustomer(customer);
            ordersDAO.setSession(customerSession);
            boolean isOrderAdded = ordersDAO.addOrders(oEntity);

            int oDCount = 1;
            boolean isOrderdetailAdded = false;
            System.out.println(odDTOList.size());

            for (OrderDetailDTO orderDetailDTO : odDTOList) {

                OrderDetail odEntity = new OrderDetail();

                ItemDTO itemDTO = itemDTOList.get(oDCount - 1);

                Item item = new Item();
                item.setiId(itemDTO.getiId());
                item.setDescription(itemDTO.getDescription());
                item.setQtyOnHand(itemDTO.getQtyOnHand());
                item.setUnitPrice(itemDTO.getUnitPrice());
                odEntity.setItem(item);

                odEntity.setOrders(oEntity);
                odEntity.setOrderQuantity(orderDetailDTO.getOrderQuantity());
                odEntity.setUnitPrice(orderDetailDTO.getUnitPrice());
                odEntity.setOrderDetail_PK(new OrderDetail_PK(oEntity.getoId(), item.getiId()));
                odDAO.setSession(customerSession);
                isOrderdetailAdded = odDAO.addOrderDetail(odEntity);
                oDCount = +1;

            }
            tx=customerSession.beginTransaction();
            if (isOrderAdded && isOrderdetailAdded) {

                System.out.println("Data Pass");
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

        /*if (odDTOList.size() == oDCount) {
            return true;
        } else {
            return false;
        }*/

    
    
    @Override
    public boolean PlaceOrder(CustomerDTO custDTO, ArrayList<ItemDTO> itemDTOList, OrdersDTO order,
            ArrayList<OrderDetailDTO> odDTOList) throws Exception {
        
            CustomerDAO customerDAO = (CustomerDAO) new CustomerDAOImpl();
            ItemDAO itemDAO = (ItemDAO) new ItemDAOImpl();
            OrdersDAO ordersDAO = (OrdersDAO) new OrdersDAOImpl();
            OrderDetailDAO odDAO = (OrderDetailDAO) new OrderDetailDAOImpl();

            SessionFactory sf = SessionFactoryUtil.getSessionFactory();
            Session itemSession = sf.openSession();
            Transaction tx = null;
            System.out.println("In service near trans");

        try {
            System.out.println("In service near try");
            
//customer
            Customer customer = new Customer();
            customer.setcId(custDTO.getcId());
            customer.setcName(custDTO.getcName());
            customer.setContact(customer.getContact());
            customer.setCreditLimit(custDTO.getCreditLimit());
            customer.setCreditDays(custDTO.getCreditDays());

            System.out.println(customer.getcId());
            
//OrderEntity
            ordersDAO.setSession(itemSession);
            Orders ordersEntity = new Orders();
            ordersEntity.setCustomer(customer);
            ordersEntity.setOrderDate(order.getOrderDate());
            boolean isOrderAdded = ordersDAO.addOrders(ordersEntity);
            
//toFindItemByName
            
            itemDAO.setSession(itemSession);

            List<Item> itemEntityList = new ArrayList<>();
            for (ItemDTO itemDTO : itemDTOList) {
                Item itemEntity = new Item();
                itemEntity = itemDAO.getItemBYName(itemDTO.getDescription());
                itemEntityList.add(itemEntity);
            }
            
//setOrderDetailEntity
            OrderDetail orderDetailsEntity = new OrderDetail();
            boolean isOrderDetailAdded = false;

            

//setItemOneByOne & save orderDetailsEntity
    int i=0;
            odDAO.setSession(itemSession);
            orderDetailsEntity.setOrders(ordersEntity);
            for (Item items1 : itemEntityList) {
                //Items setItems=new Items();
                orderDetailsEntity.setItem(items1);
                orderDetailsEntity.setOrderDetail_PK(new OrderDetail_PK(ordersEntity.getoId(), items1.getiId()));
                orderDetailsEntity.setOrderQuantity(odDTOList.get(i).getOrderQuantity());
                orderDetailsEntity.setUnitPrice(odDTOList.get(i).getUnitPrice());
                System.out.println("itemonebyone---++++#@$" + ordersEntity.getoId() + " " + items1.getiId());
                isOrderDetailAdded = odDAO.addOrderDetail(orderDetailsEntity);
                i++;
            }

            
            
            System.out.println("In service");
            //System.out.println(customer.getCid() + " " + items.getIid() + " " + ordersEntity.getOid() + " " + orderDetailsEntity.getOrder_qty());

            tx = itemSession.beginTransaction();

            System.out.println(isOrderAdded + " " + isOrderDetailAdded);

            if (isOrderAdded && isOrderDetailAdded) {
                System.out.println("dataPassedTo DAO by service");
                tx.commit();
                return true;
            } else {
                tx.rollback();
                return false;
            }

        } catch (HibernateException e) {
            e.printStackTrace();
            tx.rollback();
            return false;
        } finally {
            itemSession.close();
        }
    }

}
