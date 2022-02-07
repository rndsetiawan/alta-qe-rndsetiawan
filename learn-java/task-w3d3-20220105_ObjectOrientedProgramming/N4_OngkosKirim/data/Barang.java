package N4_OngkosKirim.data;

public class Barang {
    public float panjang,lebar,tinggi,berat;

    public float volume() {
        float volume = panjang * lebar * tinggi;
        System.out.println(volume + " cm3");
        return volume;
    }

    public float berat() {
        System.out.println(Math.ceil(berat) + " kg");
        return berat;
    }
}
