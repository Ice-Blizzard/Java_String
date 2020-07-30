package Lab9;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		char[] jeden = new char[5];
		jeden[0] = 'r';
		jeden[1] = 'a';
		jeden[2] = 'f';
		jeden[3] = 'a';
		jeden[4] = 'l';
		NapisTab jedynka = new NapisTab(jeden);
		
		jedynka.pokazNapis();
		System.out.println(jedynka.dlugosc());
		System.out.println(jedynka.dajZnak(4));
		jedynka.ustawZnak(0, 'R');
		jedynka.pokazNapis();
		
		char[] dwa = new char[14];
		dwa[0] = ' ';
		dwa[1] = 't';
		dwa[2] = 'o';
		dwa[3] = ' ';
		dwa[4] = 'f';
		dwa[5] = 'a';
		dwa[6] = 'j';
		dwa[7] = 'n';
		dwa[8] = 'y';
		dwa[9] = ' ';
		dwa[10] = 'g';
		dwa[11] = 'o';
		dwa[12] = 's';
		dwa[13] = 'c';
		NapisTab dwojka = new NapisTab(dwa);
		
		jedynka.dodajNapis(dwojka);
		jedynka.pokazNapis();
		
		System.out.println(" ");
		
		List<Character> trzy = new ArrayList<>();
		trzy.add('i');
		trzy.add('_');
		trzy.add('d');
		trzy.add('o');
		trzy.add('b');
		trzy.add('r');
		trzy.add('y');
		NapisLst trojka = new NapisLst(trzy);
		
		trojka.pokazNapis();
		System.out.println(trojka.dlugosc());
		System.out.println(trojka.dajZnak(5));
		trojka.ustawZnak(1, ' ');
		trojka.pokazNapis();
		
		List<Character> cztery = new ArrayList<>();
		cztery.add(' ');
		cztery.add('p');
		cztery.add('r');
		cztery.add('o');
		cztery.add('g');
		cztery.add('r');
		cztery.add('a');
		cztery.add('m');
		cztery.add('i');
		cztery.add('s');
		cztery.add('t');
		cztery.add('a');
		NapisLst czworka = new NapisLst(cztery);
		
		trojka.dodajNapis(czworka);
		trojka.pokazNapis();

	}

}
