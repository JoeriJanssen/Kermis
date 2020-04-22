public class Spin extends RisicoRijkeAttractie {
    int aantalRondjes = 0;

    Spin(){
        super("Spin",2.25,0,5);

    }

    @Override
    public double omzet() {
        return aantalKaartjes*prijs;
    }

    @Override
    public void draaien() throws RisicovolleAttractiesMoetenGekeurdWorden {
        if (aantalRondjes == draaiLimiet ){
            throw new RisicovolleAttractiesMoetenGekeurdWorden();
        } else {
            System.out.println("de attractie " + naam + " draait");
            aantalRondjes++;
            aantalKaartjes++;
        }
    }

    @Override
    public void onderhoudsBeurt() {
        aantalRondjes = 0;
    }

    @Override
    public void opstellingsKeuring() {
        System.out.println("de opstelling voor attractie " + naam + " wordt gekeurd");
    }
}
