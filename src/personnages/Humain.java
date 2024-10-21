package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;
	
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
	
	public void gagnerArgent(int gain) {
		assert gain > 0;
		argent = argent + gain;
	}
	
	public void perdreArgent(int perte) {
		assert perte > 0;
		argent = argent - perte;
	}
	
}
