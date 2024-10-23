public class ZeroDiscount extends Rabattstrategie{
    @Override
    public double getReduzierterPreis(double regulaererPreis) {
        return regulaererPreis;
    }

    @Override
    public double getPreis(double preisOhneNachlass) {
        return 0;
    }
}
