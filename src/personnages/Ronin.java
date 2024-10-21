package personnages;

public class Ronin extends Humain {
	private int honneur = 1;
	
	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int argentDonne = getArgent() * 10 / 100;
		perdreArgent(argentDonne);
		parler(beneficiaire.getNom() + " prend ces " + argentDonne + " sous.");
		beneficiaire.recevoir(argentDonne);
	}
}
