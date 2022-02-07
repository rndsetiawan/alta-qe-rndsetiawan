package N5_Pewarisan.data;

public class Omnivor {
    public String namaBinatang;
    public String jenisMakanan;
    public String jenisGigi;

    public void identity_myself() {
        System.out.println
                ("Hi i'm Omnivor, my name is " + this.namaBinatang + ", my food is " + this.jenisMakanan + ", I have " + this.jenisGigi + " teeth");
    }
}
