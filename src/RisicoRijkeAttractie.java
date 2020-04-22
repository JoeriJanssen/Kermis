import com.sun.xml.internal.ws.util.HandlerAnnotationInfo;

public abstract class RisicoRijkeAttractie extends Attractie {
    int draaiLimiet;
    RisicoRijkeAttractie(String naam, double prijs, int aantalKaartjes,int draaiLimiet){
        super(naam,prijs,aantalKaartjes);
        this.draaiLimiet = draaiLimiet;
    }
    abstract void onderhoudsBeurt();
    abstract void opstellingsKeuring();


}
