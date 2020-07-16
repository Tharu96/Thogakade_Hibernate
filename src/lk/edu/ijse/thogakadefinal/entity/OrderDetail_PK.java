/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.edu.ijse.thogakadefinal.entity;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author Lenovo™
 */
@Embeddable
public class OrderDetail_PK implements Serializable{
    int oId;
    int iId;

    public OrderDetail_PK() {
    }

    public OrderDetail_PK(int oId, int iId) {
        this.oId = oId;
        this.iId = iId;
    }
    
    
}
