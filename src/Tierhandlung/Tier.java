package Tierhandlung;

public class Tier {
    private String tierart;
    private String tiername; // = "" //als Konstructor möglich;
    private boolean tierSatt;
    private float groesse;
    private Tier naechstes;

    public Tier() {
        super();
        this.tierart = "default";
        this.tiername = "default";
        this.tierSatt = false;
        this.groesse = (float) 0.0;
    }

    public Tier(String tierart, String tiername, float groesse) {
        super();
        this.tierart = tierart;
        this.tiername = tiername;
        this.tierSatt = false;
        this.groesse = groesse;
    }

    public String getTierart() {
        return tierart;
    }
    public String getTiername() {
        return tiername;
    }
    public boolean isTierSatt() {
        return tierSatt;
    }
    public float getGroesse() {
        return groesse;
    }

    public Tier getNaechstes() {
        return naechstes;
    }

    public void setTierart(String tierart) {
        this.tierart = tierart;
    }
    public void  setTiername(String tiername) {
        this.tiername = tiername;
    }
    public void setTierSatt(boolean tierSatt) {
        this.tierSatt = tierSatt;
    }
    public void setGroesse(float groesse) {
        this.groesse = groesse;
    }

    public void setNaechstes(Tier naechstes) {
        this.naechstes = naechstes;
    }

    public boolean fuettern() {
        if (tierSatt) {
            return false;
        } else {
            //Fütterungsprozedur einleiten aber hurtig!
            System.out.println("Bitte " + tierart + " namens " + tiername + "füttern aber ZACKZACK!");
            setTierSatt(true);
            return true;
        }
    }

}