package N2_VolumeBangunRuang.data;

public class Tabung {
    public float r,t;

    public float volumeTabung(){
        float volume;
        volume = (22/7f) * r * r * t ;
        return volume;
    }

    public void hitungVolume() {
        System.out.println("volume Tabung " + volumeTabung());
    }
}
