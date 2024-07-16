package com.cc.java;

public class App {
    
    public static void main(String[] args) {

    // 1- 3 Instanzen (Objekte) von Konto - konto1/konto2/konto3
        System.out.println("1. Schritt (Anfangbestand) ---------------");
        Konto konto1 = new Konto(10000);
        Konto konto2 = new Konto(10000);
        Konto konto3 = new Konto(10000);

        output(1, konto1.getKontostand());
        output(2, konto2.getKontostand());
        output(3, konto3.getKontostand());
    
        System.out.println("2. Schritt (Bestand Aenderung) -----------");
        //2- Ändernung den jeweiligen Kontostand
        konto1.setKontostand(konto1.getKontostand() * 2);
        konto2.setKontostand(konto2.getKontostand() * 3);
        konto3.setKontostand(konto3.getKontostand() * 4);

        output(1, konto1.getKontostand());
        output(2, konto2.getKontostand());
        output(3, konto3.getKontostand());

    }

    public static void output(int kontoNr, int outputInt) {
        System.out.println("Konto " + kontoNr + " Aktuelle Kontobestand = " + outputInt);
    } 

}
