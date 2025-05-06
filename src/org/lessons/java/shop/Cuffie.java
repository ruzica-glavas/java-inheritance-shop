package org.lessons.java.shop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto {
    private String color;
    private boolean isWireless;

    public Cuffie(String name, String brand, BigDecimal price, int iva, String color, boolean isWireless){
        super(name, brand, price, iva);
        this.color=color;
        this.isWireless=isWireless;
        
    }

    //gestione dei getter e setter
    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color=color;
    }

    public boolean getIsWireless(){
        return this.isWireless;
    }

    public void setIsWireless(boolean isWireless){
        this.isWireless=isWireless;
    }
}
