package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        BigDecimal decimal = new BigDecimal(100).setScale(2, RoundingMode.FLOOR);
        Prodotto p = new Prodotto("Ciao", "Gucci",decimal, 15);
        System.out.println(p.getPrice());
        System.out.println(p.getCode());

        Smartphone apple= new Smartphone("Iphone 14", "Apple", decimal, 22, 64);
        System.out.println(apple);
    }
}
