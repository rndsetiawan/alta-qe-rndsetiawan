package N2_VolumeBangunRuang.data;

public class Kubus {
    public float s;

    public float volumeKubus() {
        float volume;
        volume = s * s * s;
        return volume;
    }

    public void hitungVolume() {
        System.out.println("volume Kubus " + volumeKubus());
    }
}
