package Tierhandlung;

public class Handlung {
    //private Tier[] tierListe; alte Version

    private ListenController tierListe;

    public Handlung() {
        this.tierListe = new ListenController();
        this.ladeDaten();
    }

    public void ladeDaten( ) {
		/* alte Version
		this.tierListe = new Tier[5]; //Länge von Arrays muss definiert werden - Java is nicht so dynamisch

		this.tierListe[0] = new Tier("Elefant", "Jumbo", (float)2.1);
		this.tierListe[1] = new Tier("Maus", "Jerry", (float)0.001);
		this.tierListe[2] = new Tier("Katze", "Tom", (float)1.1);
		this.tierListe[3] = new Tier("Katze", "Sylvester", (float)2.1);
		this.tierListe[4] = new Tier("Dinosaurier", "Thomas", (float)7.1);
		*/

        tierListe.add(new Tier("Elefant", "Jumbo", 2.1f));
        tierListe.add(new Tier("Maus", "Jerry", 0.001f));
        tierListe.add(new Tier("Katze", "Tom", 1.1f));
        tierListe.add(new Tier("Katze", "Sylvester", 2.1f));
        tierListe.add(new Tier("Dinosaurier", "Thomas", 7.1f));
    }

    public void addTierListe(Tier tierNeu) {
		/* alte Version
		Tier[] listeNeu = new Tier[this.tierListe.length + 1];

		for(int i=0; i<this.tierListe.length; i++) {
			listeNeu[i] = this.tierListe[i];
		}
		listeNeu[this.tierListe.length] = tierNeu;
		this.tierListe = listeNeu;
		*/
        tierListe.add(tierNeu);
    }

    public void zeigeTiere() {
		/* alte Version
		// gebe alle tiere der Tierhandlung aus (case 3)
		System.out.println("Folgende Tiere sind da:\n");
		for(int i=0; i<=this.tierListe.length - 1; i++) {
			System.out.println((i+1) + " " + this.tierListe[i].getTierart() + " namens " +
			this.tierListe[i].getTiername());
		}
		*/
        tierListe.printListe();
    }

    public boolean entferneTier(int index) {
		/* alte Version
		Tier[] listeNeu = new Tier[this.tierListe.length -1];
		int j = 0;
		for ( int i=0; i<= this.tierListe.length - 1; i++) {
			if ((number-1) == i) {
				System.out.println("Tschüss " + this.tierListe[i].getTiername());
			} else {
				listeNeu[j] = this.tierListe[i];
				j++;
			}
		}
		this.tierListe = listeNeu;
		 */
        return tierListe.delete(index);
    }
}