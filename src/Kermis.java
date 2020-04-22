import java.util.Scanner;
public class Kermis {
    public static void main(String[] args){
        try {
            KermisApp ka = new KermisApp();
        } catch (RisicovolleAttractiesMoetenGekeurdWorden e1 ){
            System.out.println("Er zijn doden gevallen, de attracties waren niet goed gekeurd. De kermis is per direct gesloten");
        } catch(Exception e2){
            System.out.println("Voer de juiste dingen in, run de applicatie opnieuw");
        }

    }
}
