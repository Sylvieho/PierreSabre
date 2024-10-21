package histoire;

import personnages.Humain;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain("Prof", "Kombucha", 54);
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 40);
	}

}
