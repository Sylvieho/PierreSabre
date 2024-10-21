package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime){
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là?");
		String nomVictime = victime.getNom();
		parler(nomVictime + ", si tu tiens à la vie donne moi ta bourse!");
		int argentExtorque = victime.seFaireExtorquer();
		gagnerArgent(argentExtorque);
		reputation++;
		parler("J'ai piqué les " + argentExtorque + " sous de " + nomVictime 
				+ ", ce qui me fait " + getArgent() + " sous dans ma poche. Hi! Hi!");
	}
}
