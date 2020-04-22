class Attractie { ;
    String naam;
    double prijs;
    int aantalKaartjes;
    Attractie(String naam, double prijs, int aantalKaartjes){
        this.naam = naam;
        this.prijs = prijs;
        this.aantalKaartjes= aantalKaartjes;
    }

    public double omzet(){
        return aantalKaartjes*prijs;
    }
    public void draaien() throws RisicovolleAttractiesMoetenGekeurdWorden{
        System.out.println("de attractie " + naam + " draait" );
        aantalKaartjes++;

    }
}
