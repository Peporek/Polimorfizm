package MojeKlasy;

public class KlientOsoba extends Klient {
    private String imie;
    private String nazwisko;


    public KlientOsoba(String imie, String nazwisko, String nrTelefonu, String kraj, double kapital) {
        super("Osoba Prawna", nrTelefonu, kraj, kapital);
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public double PoliczKapital(){
        return (kapital*Math.pow(1.02,12));
    }

    @Override
    public double PoliczKapitalM(int liczbaMiesiecy){
        return (kapital*Math.pow(1.02, liczbaMiesiecy));
    }

    @Override
    public String toString() {
        return "KlientOsoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", nazwa='" + nazwa + '\'' +
                ", nrTelefonu='" + nrTelefonu + '\'' +
                ", kraj='" + kraj + '\'' +
                ", kapital=" + kapital +
                '}';
    }


}