import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LiczbyPodane extends WylosowaneLiczbyy {
	
	public List<Integer> LiczbyWybrane(int ilosciLiczb,int zakresLiczb){
		
		List<Integer> liczbyPodanePrzezUzytkownika = new ArrayList<>();
		
		Scanner wczytaneLiczby = new Scanner(System.in);
		System.out.println("Podaj "+ilosciLiczb +" liczby ale nie moga byc wieksze niz zakres  " + (zakresLiczb-1) );
		while(liczbyPodanePrzezUzytkownika.size()<ilosciLiczb){
			
			int liczby = wczytaneLiczby.nextInt();
			if(liczby > zakresLiczb){
				System.out.println("Liczba byla z poza zakresu wpisz ponownie");
				continue;
			}
			liczbyPodanePrzezUzytkownika.add(liczby);
		}
		wczytaneLiczby.close();
		
		return liczbyPodanePrzezUzytkownika;
		
	}

}
