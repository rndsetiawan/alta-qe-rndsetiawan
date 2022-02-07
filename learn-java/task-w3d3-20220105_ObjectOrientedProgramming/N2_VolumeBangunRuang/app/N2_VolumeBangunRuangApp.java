package N2_VolumeBangunRuang.app;

import N2_VolumeBangunRuang.data.Balok;
import N2_VolumeBangunRuang.data.Kubus;
import N2_VolumeBangunRuang.data.Tabung;

public class N2_VolumeBangunRuangApp {
    public static void main(String[] args) {
        Kubus kubus = new Kubus();
        Balok balok = new Balok();
        Tabung tabung = new Tabung();

        kubus.s = 10;
        balok.p = 3;
        balok.l = 6;
        balok.t = 10;
        tabung.r = 7;
        tabung.t = 10;

        kubus.hitungVolume();
        balok.hitungVolume();
        tabung.hitungVolume();
    }
}
