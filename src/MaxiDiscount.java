public class MaxiDiscount extends Rabattstrategie{
    @Override
    public double getReduzierterPreis(double regulaererPreis) {
        return regulaererPreis*0.7;
    }

    @Override
    public double getPreis(double preisOhneNachlass) {



        return preisOhneNachlass* 0.7;
    }
}
