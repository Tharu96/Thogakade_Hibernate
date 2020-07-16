/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.thogakadefinal.dto;

import java.io.Serializable;

/**
 *
 * @author Lenovo™
 */
public class OrderDetail_PKDTO implements Serializable{
    int oId;
    int iId;

    public OrderDetail_PKDTO() {
    }

    public OrderDetail_PKDTO(int oId, int iId) {
        this.oId = oId;
        this.iId = iId;
    }
    

    
}
