package histoire;

import personnages.Humain;
import personnages.Commercant;
import personnages.Ronin;
import personnages.Yakuza;
import personnages.Samourai;

public class HistoireTP5 {

	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 20);
//		Commercant chonin = new Commercant("Chonin", 40);
//		Commercant kumi = new Commercant("Kumi", 10);
//		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
//		Ronin roro = new Ronin("Roro", "shochu", 60);
//		marco.faireConnaissanceAvec(roro);
//		marco.faireConnaissanceAvec(yaku);
//		marco.faireConnaissanceAvec(chonin);
//		marco.faireConnaissanceAvec(kumi);
//		marco.listerConnaissance();
//		roro.listerConnaissance();
//		yaku.listerConnaissance();
		Samourai akimoto = new Samourai("Miyamoto", "Akimoto", "sak�", 80);
		akimoto.faireConnaissanceAvec(marco);
		akimoto.listerConnaissance();
		akimoto.boire("th�");
	}

}
