import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LiczbyPodane {
	
	public List<Integer> LiczbyWybrane(int ilosciLiczb){
		
		List<Integer> liczbyPodanePrzezUzytkownika = new ArrayList<>();
		
		Scanner wczytaneLiczby = new Scanner(System.in);
		System.out.println("Podaj "+ilosciLiczb +" liczb " );
		while(liczbyPodanePrzezUzytkownika.size()<ilosciLiczb){
			
			int liczby = wczytaneLiczby.nextInt();
			liczbyPodanePrzezUzytkownika.add(liczby);
		}
		wczytaneLiczby.close();
		
		return liczbyPodanePrzezUzytkownika;
		
	}

}
