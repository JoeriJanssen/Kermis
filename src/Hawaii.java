import java.sql.SQLOutput;

public class Hawaii extends RisicoRijkeAttractie {
    int aantalRondjes = 0;

    Hawaii(){
        super("Hawaii",2.90, 0, 10);
        this.opstellingsKeuring();
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
