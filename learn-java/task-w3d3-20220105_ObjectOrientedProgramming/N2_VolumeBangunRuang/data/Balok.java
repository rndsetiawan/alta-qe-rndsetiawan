package N2_VolumeBangunRuang.data;

public class Balok {
    public float p, l, t;

    public float volumeBalok() {
        float volume;
        volume = p * l * t;
        return volume;
    }

    public void hitungVolume() {
        System.out.println("volume Balok " + volumeBalok());
    }
}
