public class MidiDiscount extends Rabattstrategie{
    @Override
    public double getReduzierterPreis(double regulaererPreis) {
        return regulaererPreis*0.85;
    }

    @Override
    public double getPreis(double preisOhneNachlass) {
        return preisOhneNachlass*0.85;
    }


}
