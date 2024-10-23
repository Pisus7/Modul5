import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Angebot angebot = new Angebot(LocalDate.of(2023,1,12),10000,"1");

        Angebot angebot1 = new Angebot(LocalDate.of(2023,2,12),10000,"1");

        Angebot angebot2 = new Angebot(LocalDate.of(2023,9,12),10000,"1");

        System.out.println(angebot.getReduzierterPreis());

        System.out.println(angebot1.getReduzierterPreis());

        System.out.println(angebot2.getReduzierterPreis());



    }
}