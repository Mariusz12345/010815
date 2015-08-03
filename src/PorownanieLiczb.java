
import java.util.List;

public class PorownanieLiczb {

	public boolean Porownaj(List<Integer> liczbyWylosowane, List<Integer> liczbyPodane, int ilosciLiczb) {

		for (int i = 0; i < ilosciLiczb; i++) {

			if (liczbyWylosowane == liczbyPodane)
				continue;
			else
				return false;

		}

		return true;
	}

}
