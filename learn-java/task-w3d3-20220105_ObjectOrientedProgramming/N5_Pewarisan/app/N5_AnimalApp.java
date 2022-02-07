package N5_Pewarisan.app;

import N5_Pewarisan.data.Animal;
import N5_Pewarisan.data.Carnivor;
import N5_Pewarisan.data.Herbivor;
import N5_Pewarisan.data.Omnivor;

public class N5_AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Herbivor herbivor = new Herbivor();
        herbivor.namaBinatang = "Kambing";
        herbivor.jenisMakanan = "'tumbuhan'";
        herbivor.jenisGigi = "tumpul";

        Carnivor carnivor = new Carnivor();
        carnivor.namaBinatang = "Harimau";
        carnivor.jenisMakanan = "'daging'";
        carnivor.jenisGigi = "tajam";

        Omnivor omnivor = new Omnivor();
        omnivor.namaBinatang = "Ayam";
        omnivor.jenisMakanan = "'semua'";
        omnivor.jenisGigi = "tajam dan tumpul";

        animal.identity_myself();
        herbivor.identity_myself();
        carnivor.identity_myself();
        omnivor.identity_myself();
    }
}