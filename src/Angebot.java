import java.time.LocalDate;
import java.time.Month;


public class Angebot {
    private LocalDate flugdatum;
    private double regulaererPreis;
    private String flugnummer;
    private Rabattstrategie rabattstrategie;
    private double reduzierterPreis;

    public Angebot(LocalDate flugdatum, double regulaererPreis, String flugnummer) {
        this.flugdatum = flugdatum;
        rabattstrategieWaehlen();

        this.regulaererPreis = regulaererPreis;
        this.flugnummer = flugnummer;
        this.reduzierterPreis= this.rabattstrategie.getReduzierterPreis(this.getRegulaererPreis());

    }

    public void rabattstrategieWaehlen() {


        if (flugdatum.getMonth()== Month.JANUARY || flugdatum.getMonth()== Month.APRIL || flugdatum.getMonth()== Month.OCTOBER) {

            rabattstrategie = new MaxiDiscount();
        } else if (flugdatum.getMonth()== Month.FEBRUARY || flugdatum.getMonth()== Month.MARCH) {
            rabattstrategie = new MidiDiscount();
        } else {
            rabattstrategie = new ZeroDiscount();
        }

    }

    public LocalDate getFlugdatum() {
        return flugdatum;
    }

    public void setFlugdatum(LocalDate flugdatum) {
        this.flugdatum = flugdatum;
    }

    public double getRegulaererPreis() {
        return regulaererPreis;
    }

    public void setRegulaererPreis(double regulaererPreis) {
        this.regulaererPreis = regulaererPreis;
    }

    public String getFlugnummer() {
        return flugnummer;
    }

    public void setFlugnummer(String flugnummer) {
        this.flugnummer = flugnummer;
    }
    public double getReduzierterPreis() {





        return reduzierterPreis;
    }



    @Override
    public String toString() {
        return "Angebot{" +
                "flugdatum=" + flugdatum +
                ", regulaererPreis=" + regulaererPreis +
                ", flugnummer='" + flugnummer + '\'' +
                ", rabattstrategie=" + rabattstrategie +
                '}';
    }
}
