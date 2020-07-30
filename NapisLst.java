package Lab9;

import java.util.*;

public class NapisLst extends NapisAbstr implements Napis {
	
	private List<Character> napis;
	
	public NapisLst (List<Character> lista) {
		this.napis = new ArrayList<>(); 
		for (int i = 0; i < lista.size(); i++) {
			this.napis.add(lista.get(i));
		}
	}
	
	public int dlugosc() {
		return this.napis.size();
	}

	public char dajZnak(int pozycja) {
		return this.napis.get(pozycja);
	}
	
	public void ustawZnak(int pozycja, char znak) {
		List<Character> wynik = new ArrayList<>();
		for (int i = 0; i < this.napis.size(); i++) {
			if (i != pozycja) {
				wynik.add(this.napis.get(i));
			}
			else {
				wynik.add(znak);
			}
		}
		this.napis = wynik;
	}
	
	public void dodajNapis(NapisLst dodatek) {
		for (int i = 0; i < dodatek.napis.size(); i++) {
			this.napis.add(dodatek.napis.get(i));
		}
	}
	
	public void pokazNapis() {
		for (int i = 0; i < this.napis.size(); i++) {
			if (i != (this.napis.size() - 1)) {
				System.out.print(this.napis.get(i));
			}
			else {
				System.out.println(this.napis.get(i));
			}
		}
	}
}

