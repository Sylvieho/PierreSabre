package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;
	protected int nbConnaissance = 0;
	private int max = 3;
	private Humain[] memoire = new Humain[max];
	
	public Humain(String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
	}
	
	public String getNom() {
		return nom;
	}
	public int getArgent() {
		return argent;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "(" + nom + ") - ";
	}
	
	public void direBonjour() {
		parler("Bonjour! Je m'appelle " + nom + " et j'aime boidre du " + boissonFavorite);
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFavorite + "! GLOUPS!");
	}
	
	public void acheter(String bien, int prix){
		assert prix > 0;
		if (argent>prix) {
			parler("J'ai " + argent + " sous de poche. "
					+ "Je vais pouvoir m'offir " + bien + " à " + prix + " sous ");
			argent = argent - prix;
		} else {
			parler("Je n'ai plus que " + argent + "sous en poche. "
					+ "Je ne peux même pas m'offir " + bien + " à " + prix + " sous ");
		}
	}
	
	protected void gagnerArgent(int gain) {
		assert gain > 0;
		argent = argent + gain;
	}
	
	protected void perdreArgent(int perte) {
		assert perte > 0;
		argent = argent - perte;
	}
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		repondre(autreHumain);
		memoriser(autreHumain);
		autreHumain.memoriser(this);
	}
	
	private void memoriser(Humain humain) {
		if(nbConnaissance == max) {
			for (int i=0; i<max-1; i++) {
				memoire[i] = memoire[i+1];
			}
			nbConnaissance--;
		}
		memoire[nbConnaissance] = humain;
		nbConnaissance++;
	}
	
	private void repondre(Humain humain) {
		humain.direBonjour();
	}
	
	public void listerConnaissance() {
		if (nbConnaissance == 0) parler("Je ne connais personne");
		else {
			String texte = "Je connais beaucoup de monde dont : ";
			texte += (memoire[0].getNom());
			for(int i=1; i<nbConnaissance; i++) {
				texte += ", ";
				texte += (memoire[i].getNom());
			}
			parler (texte);
		}
	}
	
}
