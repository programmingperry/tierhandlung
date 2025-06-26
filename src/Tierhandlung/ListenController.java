package Tierhandlung;

public class ListenController implements TierListenInterface {

    private Tier anfangListe;

    public Tier getAnfangListe() {
        return anfangListe;
    }

    @Override
    public String getTier(String name) {
        Tier aktuell = anfangListe;
        while (aktuell != null) {
            if (aktuell.getTiername().equals(name)) {
                return "Gefunden " + aktuell.getTierart() + " namens " + aktuell.getTiername();
            }
            aktuell = aktuell.getNaechstes();
        }
        return "Tier nicht gefunden: " + name;
    }

    @Override
    public int getTier(int index) {
        Tier aktuell = anfangListe;
        int i = 0;
        while (aktuell != null) {
            if (i == index) {
                System.out.println("Gefunden: " + aktuell.getTierart() + " namens " + aktuell.getTiername());
                return 1;
            }
            aktuell = aktuell.getNaechstes();
            i++;
        }

        return -1;
    }

    @Override
    public void add(Tier tierNeu) {
        if (anfangListe == null) {
            anfangListe = tierNeu;
        } else {
            Tier aktuell = anfangListe;
            while (aktuell.getNaechstes() != null) {
                aktuell = aktuell.getNaechstes();
            }
            aktuell.setNaechstes(tierNeu);
        }
    }

    @Override
    public boolean delete(String name) {
        if (anfangListe == null) return false;

        if (anfangListe.getTiername().equals(name)) {
            anfangListe = anfangListe.getNaechstes();
            return true;
        }

        Tier vorher = anfangListe;
        Tier aktuell = anfangListe.getNaechstes();

        while (aktuell != null) {
            if (aktuell.getTiername().equals(name)) {
                vorher.setNaechstes(aktuell.getNaechstes()); // vorher (🐭).naechstes → aktuell (🐘).naechstes → 🐶

                return true;
            }
            vorher = aktuell;
            aktuell = aktuell.getNaechstes();
        }
        return false;
    }

    @Override
    public boolean delete(int index) {
        if (anfangListe == null) return false;

        if (index == 0) {
            anfangListe = anfangListe.getNaechstes();
            return true;
        }

        Tier vorher = anfangListe;
        Tier aktuell = anfangListe.getNaechstes();
        int i = 1;

        while (aktuell != null) {
            if (i == index) {
                vorher.setNaechstes(aktuell.getNaechstes());
                return true;
            }
            vorher = aktuell;
            aktuell = aktuell.getNaechstes();
            i++;
        }

        return false;
    }

    public void printListe() {
        Tier aktuell = anfangListe;
        int i = 1;
        while (aktuell != null) {
            System.out.println(i +  ": " + aktuell.getTierart() + " namens " + aktuell.getTiername());
            aktuell = aktuell.getNaechstes();
            i++;
        }
    }



    @Override
    public void sort() {
        // TODO Auto-generated method stub

    }

    @Override
    public void count() {
        // TODO
    }

}