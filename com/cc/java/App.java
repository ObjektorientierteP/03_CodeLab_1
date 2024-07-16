package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        output("1. Schritt (Anfangbestand) ---------------");
       // 1- 3 Instanzen (Objekte) von Konto - konto1/konto2/konto3
        Konto konto1 = new Konto();
        Konto konto2 = new Konto();
        Konto konto3 = new Konto();

        output("Konto 1 Anfangbestand = " + konto1.kontostand);
        output("Konto 2 Anfangbestand = " + konto2.kontostand);
        output("Konto 3 Anfangbestand = " + konto3.kontostand);

        output("2. Schritt (Bestand Aenderung) -----------");
        //2- Ändernung den jeweiligen Kontostand
        konto1.kontostand = konto1.kontostand * 2;
        konto2.kontostand = konto2.kontostand * 3;
        konto3.kontostand = konto3.kontostand * 4;

        output("Konto 1 Aktuelle Kontobestand = " + konto1.kontostand);
        output("Konto 2 Aktuelle Kontobestand = " + konto2.kontostand);
        output("Konto 3 Aktuelle Kontobestand = " + konto3.kontostand);
        
    }


    private static void output(String outputStr) {
        System.out.println(outputStr);
    } 

}
