package MojeKlasy;

public class KlientFirma extends Klient {
    private String formaPrawna;

    public KlientFirma(String formaPrawna, String nazwa, String nrTelefonu, String kraj, double kapital) {
        super(nazwa, nrTelefonu, kraj, kapital);
        this.formaPrawna = formaPrawna;
    }

    @Override
    public String toString() {
        return "KlientFirma{" +
                "formaPrawna='" + formaPrawna + '\'' +
                ", nazwa='" + nazwa + '\'' +
                ", nrTelefonu='" + nrTelefonu + '\'' +
                ", kraj='" + kraj + '\'' +
                ", kapital=" + kapital +
                '}';
    }
}
