package com.company;

public class JakasKlasa5b {
    private int szczesliwyNumerek = 0;

    public void jakasMetodaZKlasy() {
        if(szczesliwyNumerek > 100) {
            return;
        }
        jakasMetodaPrywatnaStatycznaZKlasy();
        szczesliwyNumerek *= 2;
    }

    public static void jakasMetodaStatycznaZKlasy(){
        return;//bez lizcby
    }

    private static void jakasMetodaPrywatnaStatycznaZKlasy(){
    }

    public boolean jakasMetodaBoolean(){
        return true;
        // return 1 == 1;
        // return cos co jest true albo false
    }

    public static int jakascostamtego(){
        return 6;
        // return jakas liczba
    }

    public JakasKlasa5b metodaKtoraZwracaNowyObiektKlasy(){

        return new JakasKlasa5b();
    }
}

//modyfikator [static] co_zwraca nazwa( [parametry] ){
//
//        }
//
//        co_zwraca -
//        1. Nic -> void
//        2. Cos -> Typ, na przyklad int, boolean, string, char, JakasKlasa5b, Main,