package N1_BangunDatar.data;

public class Segitiga {
    public float a, t, s1, s2;

    public float luas() {
        float luas = (a * t) / 2;
        System.out.println("Luas Segitiga: " + luas);
        return luas;
    }

    public float keliling() {
        float keliling = a + s1 + s2;
        System.out.println("Keliling Segitiga: " + keliling);
        return keliling;
    }
}
