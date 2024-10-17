public class MidiDiscount extends Rabattstrategie{
    @Override
    public double getReduzierterPreis(double regulaererPreis) {
        return 0;
    }

    @Override
    public double getPreis(double preisOhneNachlass) {
        return preisOhneNachlass*0.85;
    }


}
