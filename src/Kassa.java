import java.util.ArrayList;

public class Kassa {
    double omzet = 0.0;
    int kaartjesVerkocht = 0;
    Attractie[] attracties;
    boolean belastingInnerIsGeweest = false;
    Kassa (Attractie[] attracties){
        this.attracties = attracties;
    }

    public double totalOmzet(){
        for(Attractie a: attracties){
            omzet += a.omzet();
        }
        return omzet;
    }

    public int kaartjesTotaal(){
        for(Attractie a: attracties){
            kaartjesVerkocht += a.aantalKaartjes;
        }
        return kaartjesVerkocht;
    }





}
