public class Ladderklimmen extends Attractie implements GokAttractie {
    Ladderklimmen(){
        super("Ladderklimmen",5.00,0);
    }

    @Override
    public double kansSpelBelastingBetalen() {
        return 0.3*aantalKaartjes*prijs;

    }

    @Override
    public double omzet() {
        return 0.7*aantalKaartjes*prijs;
    }
}
