package personnages;

public class Ronin extends Humain {
	private int honneur = 1;
	
	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	
	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		int force = honneur*2;
		if (force >= adversaire.getReputation()) {
			parler("Je t'ai eu petit yakuza!");
			int gain = adversaire.perdre();
			gagnerArgent(gain);
			honneur++;
		} else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			int perte = getArgent();
			honneur--;
			perdreArgent(perte);
			adversaire.gagner(perte);
		}
	}
	
	public void donner(Commercant beneficiaire) {
		int argentDonne = getArgent() * 10 / 100;
		perdreArgent(argentDonne);
		parler(beneficiaire.getNom() + " prend ces " + argentDonne + " sous.");
		beneficiaire.recevoir(argentDonne);
	}
}
