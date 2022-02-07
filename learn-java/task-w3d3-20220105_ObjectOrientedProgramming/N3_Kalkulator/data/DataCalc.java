package N3_Kalkulator.data;

public class DataCalc {
    public double hasil;

    public void penjumlahan(double bil1, double bil2){
        hasil = bil1 + bil2;
        System.out.println(bil1 + " + " + bil2 + " = " + (hasil));
    }

    public void pengurangan(double bil1, double bil2){
        hasil = bil1 - bil2;
        System.out.println(bil1 + " - " + bil2 + " = " + (hasil));
    }

    public void perkalian(double bil1, double bil2){
        hasil = bil1 * bil2;
        System.out.println(bil1 + " * " + bil2 + " = " + (hasil));
    }

    public void pembagian(double bil1, double bil2) {
        hasil = bil1 / bil2;
        System.out.println(bil1 + " / " + bil2 + " = " + (hasil));
    }
}
