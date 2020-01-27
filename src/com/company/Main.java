package com.company;

public class Main {

    public static void main(String[] args) {
        jakasStatyczna();

        Main mojObiekt = new Main();
        mojObiekt.jakasMetoda();

        Main.jakasStatyczna();

        jakasPrywatnaStatyczna();
        //-------------------------
        JakasKlasa5b.jakasMetodaStatycznaZKlasy();
        JakasKlasa5b mojObiekcikKlasy = new JakasKlasa5b();
        mojObiekcikKlasy.jakasMetodaBoolean(); // zwraca boolean i ignoruje wynik
        mojObiekcikKlasy.jakasMetodaZKlasy(); // nic nie zwraca - void - nie ma wyniku
        int mojaNumerycznaWartosc = 5;
        boolean wynik1 = mojObiekcikKlasy.jakasMetodaBoolean(); //zwraca boolean i mamy go w zmiennej
        System.out.println(wynik1); // oba takie same
        System.out.println(mojObiekcikKlasy.jakasMetodaBoolean()); // oba takie same


    }

    public void jakasMetoda(){
        // nie musze miec return, nic nie musze ewentualnie moge
    }

    public static void jakasStatyczna(){
    }

    private static void jakasPrywatnaStatyczna(){
    }
}
