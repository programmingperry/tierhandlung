package Tierhandlung;

import java.util.Scanner;

public class Start {

    public static void main(String[] args) {
        Handlung filiale = new Handlung();

        System.out.println("Willkommen zur Tierhandlung BFW!\n");
        Scanner sc = new Scanner(System.in);
        String eingabe = "x";
        while (!eingabe.equals("0")) {
            System.out.println("###############################\n"
                    + "# 1: neues Tier aufnehmen     #\n"
                    + "# 2: ein Tier verkaufen       #\n"
                    + "# 3: alle Tiere ansehen       #\n"
                    + "# 4: alle Tiere füttern       #\n"
                    + "# 0: Programm beenden         #\n"
                    + "###############################\n"
                    + "Bitte wählen Sie eine Option:\n"
                    + "> ");

            eingabe = sc.next();

            switch(eingabe) {
                case "1":
                    System.out.println("Sie wollen also ein neues Tier aufnehmen.\n");
                    filiale.addTierListe(inputTier(sc));
                    break;
                case "2":
                    System.out.println("Ein Tier soll verkauft werden.\n");
                    filiale.entferneTier(inputTiernummer(sc));
                    break;
                case "3":
                    System.out.println("Hier sind alle Tiere, die aktuell in der Tierhandlung sind.\n");
                    filiale.zeigeTiere();
                    break;
                case "4":
                    System.out.println("Alle hungrigen Tiere werden gefüttert.\n");
                    break;
                case "0":
                    break;
                default:
                    System.out.println("Hoppla. Die Eingabe war wohl nicht richtig. Bitte versuchen Sie es erneut.\n");
            }

        }
        System.out.println("Auf wiedersehen in der Tierhandlung.");
        sc.close();
    }


    public static Tier inputTier(Scanner sca) {
        //Scanner sca = new Scanner(System.in);
        String art;
        String name;
        float groesse;

        System.out.println("Bitte geben Sie die Tierart ein:");
        art = sca.next();
        System.out.println("Bitte geben Sie dem Tier einen Namen:");
        name = sca.next();
        System.out.println("Wie groß ist das Tier in Metern?:");
        //String groesseStr = sca.next();
        groesse = sca.nextFloat();

        Tier rueckgabeTier = new Tier(art, name, groesse);
        //sca.close();
        return rueckgabeTier;
    }

    public static int inputTiernummer(Scanner sca) {
        int number;
        System.out.println("Welches Tier soll verkauft werden? (Gib die Zahl an)");
        number = sca.nextInt();

        return number -1;
    }
}