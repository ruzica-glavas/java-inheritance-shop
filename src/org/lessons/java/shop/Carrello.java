package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Carrello  {

    public static void main(String[] args) {
        
        Prodotto[] products = new Prodotto[2];
        
        Scanner input = new Scanner(System.in);
       
        for(int i=0; i<products.length; i++){
        
        System.out.println("Nome prodotto (scegli tra Cuffie/Smartphone/Televisore)");
        String scanProductName = input.nextLine();

        System.out.println("Brand prodotto");
        String scanProductBrand = input.nextLine();

        System.out.println("Prezzo prodotto");
        BigDecimal scanProductPrice = input.nextBigDecimal();

        System.out.println("Iva prodotto");
        int scanProductIva = input.nextInt();
        input.nextLine();

       

        if (scanProductName.equalsIgnoreCase("Cuffie")){
            
            System.out.println("Colore prodotto");
            String scanCuffieColor = input.nextLine();

            System.out.println("Le cuffie sono wireless:");
            boolean scanIsWireless = input.nextBoolean();
            input.nextLine(); 

            Cuffie onhear = new Cuffie (scanProductName, scanProductBrand, scanProductPrice, scanProductIva, scanCuffieColor, scanIsWireless);

            products[i]=onhear;

        } else if(scanProductName.equalsIgnoreCase("Smartphone")){
            System.out.println("Codice IMEI prodotto");
            
            System.out.println("Memoria del dispositivo");
            int scanMemory = input.nextInt();
            input.nextLine(); 


            Smartphone iphone = new Smartphone (scanProductName, scanProductBrand, scanProductPrice, scanProductIva, scanMemory);

            products[i]=iphone;

        }else if(scanProductName.equalsIgnoreCase("Televisore")){
            System.out.println("Dimensione Televisore");
            int scanTVSize = input.nextInt();

            System.out.println("La televisione é smart:");
            boolean scanIsSmart = input.nextBoolean();

            input.nextLine(); 

            Televisore tv = new Televisore (scanProductName, scanProductBrand, scanProductPrice, scanProductIva, scanTVSize, scanIsSmart);
            
            products[i]=tv;
            
        };

        System.out.println("-------------------------");
    }
        input.close();

        System.out.println("Riepilogo carrello:");

        for (int i=0; i<products.length; i++){
            System.out.println(products[i]);
            System.out.println("-------------------------");
        }
       
    }

    
}
