import java.util.Scanner;

public class KermisApp {
    Attractie[] attracties = {new Botsautos(), new Spin(),
            new Spiegelpaleis(), new Spookhuis(),
            new Hawaii(), new Ladderklimmen()};
    Scanner scanner = new Scanner(System.in);

    boolean inKermis = true;
    Kassa kassa = new Kassa(attracties);
    BelastingInspecteur BI = new BelastingInspecteur(attracties, kassa);

    public KermisApp() throws Exception {
        welkomBijDeKermis();
        while (inKermis) {
            int nummer = scanner.nextInt();
            if (nummer >= 7 ){
                inKermis = false;
            } else {
                attracties[nummer - 1].draaien();
            }
        }
        administratieOpvragen();
        Scanner scanner2 = new Scanner(System.in);
        String character = scanner2.nextLine();
        if (character.equals("o")) {
            omzetBekijken();
        } else if (character.equals("k")) {
            verkochteKaartjesBekijken();
        } else if (character.equals("b")) {
            BI.komBelastingInnen();
        } else {
            throw new Exception();
        }
    }

    private void verkochteKaartjesBekijken() {
        System.out.println("Totaal aantal kaartjes verkocht is " + kassa.kaartjesTotaal());
        for (Attractie a : attracties) {
            System.out.println("Kaartjes verkocht van de attractie " + a.naam + " is " + a.aantalKaartjes);
        }
    }

    private void administratieOpvragen() {
        System.out.println("Typ 'o' om omzet te kijken en typ 'k' om het aantal verkochte kaartjes te bekijken" +
                " en typ 'b' om belasting te innen");
    }

    private void omzetBekijken() {
        System.out.println("Totale omzet is " + kassa.totalOmzet());
        for (Attractie a : attracties) {
            System.out.println("Omzet van de attractie " + a.naam + " is " + a.omzet());
        }
    }

    private void welkomBijDeKermis() {
        System.out.println("Typ een nummer in om in de attractie te gaan:\n" +
                "1 voor botsauto's,\n" +
                "2 voor spin,\n" +
                "3 voor spiegelpaleis,\n" +
                "4 voor spookhuis,\n" +
                "5 voor hawaii,\n" +
                "6 voor ladderklimmen.\n" +
                "7 of hoger om de Kermis te verlaten");
    }


}
