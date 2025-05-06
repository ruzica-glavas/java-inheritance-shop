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

        //Prodotto televisore
        Televisore samsung= new Televisore("Smart TV", "Samsung", decimal, 22, 100, true);

        System.out.println("Il nome del prodotto:" + samsung.getName());
        System.out.println("Il nome del brand:" + samsung.getBrand());
        System.out.println("Il codice del prodotto:" + samsung.getCode());
        System.out.println("Il prezzo del prodotto:" + samsung.getPrice());
        System.out.println("L'iva:" + samsung.getIva());
        System.out.println("Il prezzo con iva inclusa:" + samsung.getPriceIva());
        System.out.println("Le dimensioni sono:" + samsung.getSize() + " " + "pollici");
        System.out.println("È una smart tv:" + samsung.getIsSmart());




    }
}
