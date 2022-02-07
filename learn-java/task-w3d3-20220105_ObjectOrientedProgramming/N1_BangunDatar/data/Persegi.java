package N1_BangunDatar.data;

public class Persegi {
    public float s;

    public float luas() {
        float luas = s * s;
        System.out.println("Luas Persegi: " + luas);
        return luas;
    }

    public float keliling() {
        float keliling = 4 * s;
        System.out.println("Keliling Persegi: " + keliling);
        return keliling;
    }
}
