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
public class Consumers implements Serializable{
    private String firstName;
    private String lastName;
    private Integer money;

    public Consumers() {
        
    }

    public Consumers(String firstName, String lastName, Integer money) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.money = money;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Consumers{" 
                + "firstName=" + firstName 
                + ", lastName=" + lastName 
                + ", money=" + money 
                + '}';
    }
    
}
