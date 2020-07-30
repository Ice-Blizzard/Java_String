package Lab9;

public class NapisTab extends NapisAbstr implements Napis {
	
	private char[] napis;
	
	public NapisTab (char[] tablica) {
		this.napis = new char[tablica.length];
		for (int i = 0; i < tablica.length; i++) {
			napis[i] = tablica[i];
		}
	}
	
	public int dlugosc() {
		return this.napis.length;
	}

	public char dajZnak(int pozycja) {
		return this.napis[pozycja];
	}
	
	public void ustawZnak(int pozycja, char znak) {
		this.napis[pozycja]  = znak;
	}
	
	public void dodajNapis(NapisTab dodatek) {
		char[] wynik = new char[this.napis.length + dodatek.napis.length];
		for (int i = 0; i < this.napis.length; i++) {
			wynik[i] = this.napis[i];
		}
		for (int i = this.napis.length; i < this.napis.length + dodatek.napis.length; i++) {
			wynik[i] = dodatek.napis[i - this.napis.length];
		}
		this.napis = wynik;
	}
	
	public void pokazNapis() {
		for (int i = 0; i < this.napis.length; i++) {
			if (i != (this.napis.length - 1)) {
				System.out.print(this.napis[i]);
			}
			else {
				System.out.println(this.napis[i]);
			}
		}
	}
}
