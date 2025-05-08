package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Random;

public class Smartphone extends Prodotto{
    
    private int codeIMEI;
    private int memory;

    public Smartphone(String name, String brand, BigDecimal price, int iva, int memory){
        super(name, brand, price, iva);

        Random random=new Random();
        this.codeIMEI = random.nextInt(1000000000);
        this.memory=memory;
    }

    //gestione dei getter e setter
    public int getCodeIMEI(){
        return this.codeIMEI;
    }

    public int getMemory(){
        return this.memory;
    }

    public void setMemory(int memory){
        this.memory=memory;
    }

    @Override
    public String toString(){
        return super.toString() + "\nCodice IMEI:" + getCodeIMEI() + "\n Giga di memoria:" + getMemory() ;
   };

}
