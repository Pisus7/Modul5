public class MaxiDiscount extends Rabattstrategie{
    @Override
    public double getReduzierterPreis(double regulaererPreis) {
        return 0;
    }

    @Override
    public double getPreis(double preisOhneNachlass) {
        return 0;
    }
}
