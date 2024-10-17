public abstract class Rabattstrategie {

    private String name;


    public abstract double getReduzierterPreis(double regulaererPreis);

    public abstract double getPreis(double preisOhneNachlass);




    public void berechnung(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
