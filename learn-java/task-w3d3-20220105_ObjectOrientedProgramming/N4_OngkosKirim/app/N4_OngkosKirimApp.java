package N4_OngkosKirim.app;

import N4_OngkosKirim.data.OngKir;
import N4_OngkosKirim.data.Barang;

public class N4_OngkosKirimApp {
    public static void main(String[] agrs) {
        Barang barang = new Barang();
        OngKir ongKir = new OngKir();

        barang.panjang = 5;
        barang.lebar = 2;
        barang.tinggi = 4;
        barang.berat = 1;

        OngKir.syarat(barang.volume(), barang.berat());
    }
}
