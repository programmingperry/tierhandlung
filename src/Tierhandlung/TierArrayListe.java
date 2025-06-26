package Tierhandlung;


public class TierArrayListe implements TierListenInterface {
    private Tier[] liste;

    public TierArrayListe() {
        this.liste = new Tier[0];
    }

    public TierArrayListe(Tier tier) {
        this.liste = new Tier[1];
        this.liste[0] = tier;
    }

    @Override
    public String getTier(String name) {
        return "";
    }

    @Override
    public int getTier(int index) {
        return 0;
    }

    public void add(Tier tierNeu) {
        Tier[] listeNeu = new Tier[this.liste.length +1];

        for (int i = 0; i<this.liste.length; i++ ) {
            listeNeu[i] = this.liste[i];
        }
        listeNeu[this.liste.length] = tierNeu;
        this.liste = listeNeu;
    }

    public boolean delete(int index) {
        Tier[] listeNeu = new Tier[this.liste.length -1];
        if (index >= this.liste.length || index < 0) {
            return false;
        }
        int j = 0;
        for (int i = 0; i<this.liste.length; i++) {
            if (i == index) {

            } else {
                listeNeu[j] = this.liste[i];
                j++;
            }
        }
        this.liste = listeNeu;
        return true;
    }

    public boolean delete(String name) {
        Tier[] listeNeu = new Tier[this.liste.length -1];

        boolean deleted = false;
        int j = 0;
        for (int i = 0; i<this.liste.length; i++) {
            if (liste[i].getTiername().equals(name)) {
                deleted = true;
            } else {
                listeNeu[j] = this.liste[i];
                j++;
            }
        }

        if (deleted) {
            this.liste = listeNeu;
            return true;
        }
        return false;
    }

    public void sort() {
        System.out.println("Funktion noch zu impemenieren");
    }

    @Override
    public void count() {

    }

}
