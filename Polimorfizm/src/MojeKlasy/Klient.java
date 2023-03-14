package MojeKlasy;
import java.lang.Math;



public class Klient {
    String nazwa;
    String nrTelefonu;
    String kraj;
    Double kapital;

    public Klient(String nazwa, String nrTelefonu, String kraj, Double kapital) {
        this.nazwa = nazwa;
        this.nrTelefonu = nrTelefonu;
        this.kraj = kraj;
        this.kapital = kapital;
    }
    public double PoliczKapital(){
        return (kapital*Math.pow(1.03,12));
    }

    public double PoliczKapitalM(int liczbaMiesiecy){
        return (kapital*Math.pow(1.03, liczbaMiesiecy));
    }

    @Override
    public String toString() {
        return "Klient{" +
                "nazwa='" + nazwa + '\'' +
                ", nrTelefonu='" + nrTelefonu + '\'' +
                ", kraj='" + kraj + '\'' +
                ", kapital=" + kapital +
                '}';
    }
}
