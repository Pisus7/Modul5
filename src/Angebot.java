import java.time.LocalDate;
import java.time.Month;


public class Angebot {
    private LocalDate flugdatum;
    private double regulaererPreis;
    private String flugnummer;
    private Rabattstrategie rabattstrategie;

    public Angebot(LocalDate flugdatum, double regulaererPreis, String flugnummer) {
        this.flugdatum = flugdatum;
        this.regulaererPreis = regulaererPreis;
        this.flugnummer = flugnummer;


    }

    public void rabattstrategieErkennen() {


        if (flugdatum.getMonth()== Month.JANUARY || flugdatum.getMonth()== Month.APRIL || flugdatum.getMonth()== Month.OCTOBER) {


        }

    }

}
