import MojeKlasy.Klient;
import MojeKlasy.KlientFirma;
import MojeKlasy.KlientOsoba;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        KlientOsoba osoba1 = new KlientOsoba("Jan", "Kowalski",
                "123456789","Polska", 10000);

        KlientFirma firma1 = new KlientFirma("Sp. Zo.o.","Firma XYZ", "123456789",
                "Polska", 50000);

        List<Klient> klienci = new ArrayList<>();
        klienci.add(osoba1);
        klienci.add(firma1);

        for (Klient klient : klienci) {
            System.out.println(klient.toString());
            double kapitalPoRoku = klient.PoliczKapital();
            System.out.println("Kapitał po roku: " + kapitalPoRoku);

            double kapitalPoMiesiacach = klient.PoliczKapitalM(6);
            System.out.println("Kapitał po 6 miesiącach: " + kapitalPoMiesiacach);
        }
    }
}