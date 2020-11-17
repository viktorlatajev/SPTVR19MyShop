/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;

/**
 *
 * @author user
 */
public class Parniki implements Serializable {
    private String name;
    private String size;
    private Integer amount;
    private Integer price;
    
    public Parniki(){
        
    }
    public Parniki(String name, String size, Integer amount, Integer price) {
        this.name = name;
        this.size = size;
        this.amount = amount;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Parniki{" 
                + "name=" + name 
                + ", size=" + size 
                + ", amount=" + amount 
                + ", price=" + price 
                + '}';
    }
    
}
