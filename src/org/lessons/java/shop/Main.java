package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        BigDecimal decimal = new BigDecimal(100).setScale(2, RoundingMode.FLOOR);
        Prodotto p = new Prodotto("Ciao", "Gucci",decimal, 15);
        System.out.println(p.getPrice());
        System.out.println(p.getCode());

        //Prodotto smartphone
        Smartphone apple= new Smartphone("Iphone 14", "Apple", decimal, 22, 64);
        System.out.println("Nome prodotto:" + apple.getName());
        System.out.println("Brand:" + apple.getBrand());
        System.out.println("Codice prodotto:" + apple.getCode());
        System.out.println("Codice IMEI:" + apple.getCodeIMEI());
        System.out.println("Prezzo senza iva:" + apple.getPrice());
        System.out.println("Iva:" + apple.getIva()+"%");
        System.out.println("Prezzo con iva inclusa:" + apple.getPriceIva());
        System.out.println(apple.getMemory() + "GB di memoria");




    }
}
