/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dit126.group4.group4shop_admin.controller;

import dit126.group4.group4shop.core.OrderItem;
import dit126.group4.group4shop.core.PurchaseOrder;
import dit126.group4.group4shop.core.Users;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;

/**
 *
 * @author Christian
 */
@Named("purchase")
@SessionScoped
public class PurchaseBean implements Serializable{
    

    private Long id;
    private Users user;
    //private List<OrderItem> items;
    private Date date;
    
    @Inject
    private Provider<Group4ShopBean> group4shop;
    
    public List<PurchaseOrder> getNewPurchaseOrders(){
        return null;
    }
    
    public List<PurchaseOrder> getPurchaseOrders(String email){
        Users user = group4shop.get().getUserRegister().find(email);
        return group4shop.get().getOrderBook().getByUser(user);
    }
    
    public void selectedPurchase(Long id){
        PurchaseOrder po = group4shop.get().getOrderBook().find(id);
        this.id = po.getId();
        this.user = po.getUser();
        //this.items = po.getOrderItems();
        this.date = po.getDate();
    }
    
    public List<OrderItem> getPurchaseOrderItems(Long id){
        List<OrderItem> orderItemList = group4shop.get().getOrderItemCatalgoue().getForPurchaseOrder(id);
        return orderItemList;
    }
    
    public Long getId(){
        return this.id;
    }
    
    public String getUserName(){
        return this.user.getFirstName() + " " + this.user.getLastName();
    }
    
    /*public List<OrderItem> getOrderItems(){
        return this.items;
    }*/
    
    public String getDate(){
        return this.date.toString();
    }
}
