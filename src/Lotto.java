import java.util.ArrayList;

import java.util.List;

public class Lotto {

	public static void main(String[] args) {

		int ilosciLiczb = 3;
		int zakresWylosowanychLiczb = 5;
		boolean wynik;

		LiczbyWylosowane liczbywylosowane = new LiczbyWylosowane();
		LiczbyUzytkownikow klientA = new LiczbyUzytkownikow("Jan", "Kowalski", 3, 5);
		PorownanieLiczb porownywanieliczb = new PorownanieLiczb();

		List<Integer> listaWygenerowanychLiczb = new ArrayList<>();
		List<Integer> listaLiczbWybranychPrzezUzytkownika = new ArrayList<>();

		listaWygenerowanychLiczb = liczbywylosowane.GenerujLiczby(ilosciLiczb, zakresWylosowanychLiczb);
		listaLiczbWybranychPrzezUzytkownika = klientA.LiczbyWybrane();
		wynik = porownywanieliczb.Porownaj(listaWygenerowanychLiczb, listaLiczbWybranychPrzezUzytkownika, ilosciLiczb);

		System.out.println("Liczby wylosowane" + listaWygenerowanychLiczb);
		System.out.println("Liczby wybrane" + listaLiczbWybranychPrzezUzytkownika);

		if (wynik == true)

			System.out.println(klientA.getImie() + " Gratulacje wygrales");
		else
			System.out.println(klientA.getImie() + " Sproboj ponownie");

	}

}
