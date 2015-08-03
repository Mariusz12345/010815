import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LiczbyPodane {
	
	public List<Integer> LiczbyWybrane(int ilosciLiczb,int zakresLiczb){
		
		List<Integer> liczbyPodanePrzezUzytkownika = new ArrayList<>();
		
		Scanner wczytaneLiczby = new Scanner(System.in);
		System.out.println("Podaj "+ilosciLiczb +" liczb ale nie moga byc wieksze niz zakres  " + zakresLiczb  );
		while(liczbyPodanePrzezUzytkownika.size()<ilosciLiczb){
			
			int liczby = wczytaneLiczby.nextInt();
			if(liczby > zakresLiczb){
				System.out.println("Liczba byla z poza zakresu");
				
			}
			liczbyPodanePrzezUzytkownika.add(liczby);
		}
		wczytaneLiczby.close();
		
		return liczbyPodanePrzezUzytkownika;
		
	}

}
