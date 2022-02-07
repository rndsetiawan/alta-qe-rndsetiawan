package N3_Kalkulator.app;

import N3_Kalkulator.data.DataCalc;

public class N3_KalkulatorApp {
    public static void main(String[] args) {
        DataCalc kalkulator = new DataCalc();

        kalkulator.penjumlahan(3, 4);
        kalkulator.pengurangan(15, 4);
        kalkulator.perkalian(10, 10);
        kalkulator.pembagian(12, 3);
    }
}
