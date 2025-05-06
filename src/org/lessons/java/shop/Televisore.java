package org.lessons.java.shop;

import java.math.BigDecimal;

public class Televisore extends Prodotto{
    private int size;
    private boolean isSmart;

    public Televisore(String name, String brand, BigDecimal price, int iva, int size, boolean isSmart){
        super(name, brand, price, iva);
        this.size=size;
        this.isSmart=isSmart;
        
    }

    //gestione dei getter e setter
    public int getSize(){
        return this.size;
    }

    public void setSize(int size){
        this.size=size;
    }

    public boolean getIsSmart(){
        return this.isSmart;
    }

    public void setIsSmart(boolean isSmart){
        this.isSmart=isSmart;
    }
}
