package org.lessons.java.shop;

import java.math.BigDecimal;

public class Prodotto {
    private int code;
    private String name;
    private String brand;
    private BigDecimal price;
    private int iva;

    public Prodotto (int code, String name, String brand, BigDecimal price, int iva) { //Costruttore
        this.code = code;
        this.name=name;
        this.brand=brand;
        this.price=price;
        this.iva=iva;
    };

    //Gestiamo i getter e i setter

    public int getCode(){   
        return this.code;
    } //Per il codice c^é bisogno solo del metodo get in quanto vogliamo che sia accessibile solo in lettura

    public String getName(){
        return this.name;
    }

    public void setName (String name){
        this.name = name;
    }

    public String getBrand(){
        return this.brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public BigDecimal getPrice(){
        return this.price;
    }

    public void setPrice(BigDecimal price){
        this.price = price;
    }

    public int getIva(){
        return this.iva;
    }

    public void setIva (int iva){
        this.iva=iva;
    }

}






