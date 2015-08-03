import java.util.ArrayList;

import java.util.List;

public class Lotto {

	public static void main(String[] args) {

		int ilosciLiczb = 6;
		int zakresWylosowanychLiczb = 30;
		boolean wynik;

		LiczbyWylosowane liczbywylosowane = new LiczbyWylosowane();
		LiczbyPodane liczbyWybrane = new LiczbyPodane();
		PorownanieLiczb porownywanieliczb = new PorownanieLiczb();

		List<Integer> listaWygenerowanychLiczb = new ArrayList<>();
		List<Integer> listaLiczbWybranychPrzezUzytkownika = new ArrayList<>();

		listaWygenerowanychLiczb = liczbywylosowane.GenerujLiczby(ilosciLiczb, zakresWylosowanychLiczb);
		listaLiczbWybranychPrzezUzytkownika = liczbyWybrane.LiczbyWybrane(ilosciLiczb);

		wynik = porownywanieliczb.Porownaj(listaWygenerowanychLiczb, listaLiczbWybranychPrzezUzytkownika, ilosciLiczb);

		System.out.println("Liczby wylosowane" + listaWygenerowanychLiczb);
		System.out.println("Liczby wybrane" + listaLiczbWybranychPrzezUzytkownika);

		if (wynik == true)

			System.out.println("Gratulacje wygrales");
		else
			System.out.println("Sproboj ponownie");

	}

}
