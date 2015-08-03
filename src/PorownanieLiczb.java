
import java.util.List;

public class PorownanieLiczb {

	public boolean Porownaj(List<Integer> liczbyWylosowane, List<Integer> liczbyPodane, int ilosciLiczb) {

		for (int i = 0; i < ilosciLiczb; i++) {

			if (liczbyWylosowane.get(i) != liczbyPodane.get(i))
				return false;
		}
		return true;
	}

}
