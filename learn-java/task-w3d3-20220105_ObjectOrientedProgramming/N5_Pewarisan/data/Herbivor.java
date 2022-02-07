package N5_Pewarisan.data;

public class Herbivor {
    public String namaBinatang;
    public String jenisMakanan;
    public String jenisGigi;

    public void identity_myself() {
        System.out.println
                ("Hi i'm Herbivor, my name is " + this.namaBinatang + ", my food is " + this.jenisMakanan + ", I have " + this.jenisGigi + " teeth");
    }
}
