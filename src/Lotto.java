import java.util.ArrayList;

import java.util.List;

public class Lotto {

	public static void main(String[] args) {

		int ilosciLiczb = 3;
		int zakresWylosowanychLiczb = 5;
		boolean wynik;

		//LiczbyWylosowane liczbywylosowane = new LiczbyWylosowane();
		LiczbyPodane liczbyWybrane = new LiczbyPodane();
		PorownanieLiczb porownywanieliczb = new PorownanieLiczb();
		Loteriada  loteriada = new Loteriada(Liczby.liczbylos);
		
		

		List<Integer> listaWygenerowanychLiczb = new ArrayList<>();
		List<Integer> listaLiczbWybranychPrzezUzytkownika = new ArrayList<>();
		
		listaWygenerowanychLiczb= loteriada.getTypliczb().liczbylos.getLos().GenerujLiczby(ilosciLiczb, zakresWylosowanychLiczb);

	//	listaWygenerowanychLiczb = liczbywylosowane.GenerujLiczby(ilosciLiczb, zakresWylosowanychLiczb);
		listaLiczbWybranychPrzezUzytkownika = liczbyWybrane.LiczbyWybrane(ilosciLiczb,zakresWylosowanychLiczb);
		wynik = porownywanieliczb.Porownaj(listaWygenerowanychLiczb, listaLiczbWybranychPrzezUzytkownika, ilosciLiczb);

		System.out.println("Liczby wylosowane" + listaWygenerowanychLiczb);
		System.out.println("Liczby wybrane" + listaLiczbWybranychPrzezUzytkownika);

		if (wynik == true)

			System.out.println("Gratulacje wygrales");
		else
			System.out.println("Sproboj ponownie");

	}

}
