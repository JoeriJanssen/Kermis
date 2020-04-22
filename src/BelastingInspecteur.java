import java.util.ArrayList;

public class BelastingInspecteur {
    ArrayList<GokAttractie> gokAttracties = new ArrayList<GokAttractie>();
    Kassa kassa;

    BelastingInspecteur(Attractie[] attracties, Kassa kassa) {
        for (Attractie a : attracties) {
            if (a instanceof GokAttractie) {
                this.gokAttracties.add((GokAttractie) a);
            }
        }
        this.kassa = kassa;
    }

    public void komBelastingInnen(){
        for(GokAttractie a : gokAttracties){
            a.kansSpelBelastingBetalen();
        }
        kassa.belastingInnerIsGeweest = true;
    }
}

