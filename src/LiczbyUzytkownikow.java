import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LiczbyUzytkownikow {

	private String imie;
	private String nazwisko;
	private int iloscLiczb;
	private int zakresmax;

	public LiczbyUzytkownikow(String imie, String nazwisko, int iloscLiczb, int zakresmax) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.iloscLiczb = iloscLiczb;
		this.zakresmax = zakresmax;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public int getIloscLiczb() {
		return iloscLiczb;
	}

	public void setIloscLiczb(int iloscLiczb) {
		this.iloscLiczb = iloscLiczb;
	}

	public int getZakresmax() {
		return zakresmax;
	}

	public void setZakresmax(int zakresmax) {
		this.zakresmax = zakresmax;
	}

	public List<Integer> LiczbyWybrane() {

		List<Integer> liczbyPodanePrzezUzytkownika = new ArrayList<>();

		Scanner wczytaneLiczby = new Scanner(System.in);
		System.out.println("Podaj " + iloscLiczb + " liczby ale nie moga byc wieksze niz zakres  " + (zakresmax - 1));
		while (liczbyPodanePrzezUzytkownika.size() < iloscLiczb) {

			int liczby = wczytaneLiczby.nextInt();
			if (liczby > zakresmax) {
				System.out.println("Liczba byla z poza zakresu wpisz ponownie");
				continue;
			}
			liczbyPodanePrzezUzytkownika.add(liczby);
		}
		wczytaneLiczby.close();

		return liczbyPodanePrzezUzytkownika;

	}

}
