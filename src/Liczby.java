import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public enum Liczby {
	
	liczbylos(new WylosowaneLiczbyy()),liczbyUzytkownik(new LiczbyPodane());
	
	private WylosowaneLiczbyy los;

	private Liczby(WylosowaneLiczbyy los) {
		this.los = los;
	}

	public WylosowaneLiczbyy getLos() {
		return los;
	}

	public void setLos(WylosowaneLiczbyy los) {
		this.los = los;
	}
	
	

}

class WylosowaneLiczbyy{
	
	public List<Integer> GenerujLiczby(int iloscLiczb, int zakresLiczb) {

		List<Integer> LiczbyWylosowane = new ArrayList<>();
		Random r = new Random();
		while (LiczbyWylosowane.size() < iloscLiczb) {

			int los = r.nextInt(zakresLiczb);
			LiczbyWylosowane.add(los);
		}
		return LiczbyWylosowane;
	}
}
