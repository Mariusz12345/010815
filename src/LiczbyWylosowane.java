import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LiczbyWylosowane {

	
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
