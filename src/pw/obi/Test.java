package pw.obi;

package homework.zad2; // deklaracja pakietu

public class Test { // deklaracja klasy typu Test
	public static void main(String[] args) { // funkcja startowa apalikacji, tutaj program rozpoczyna dzialanie
		Okno okno1 = new Okno(); // utworzenie nowego obiektu klasy Okno, konstruktor bezparametrowy
		Okno okno2 = new Okno(1800,1800,3);  // utworzenie nowego obiektu klasy Okno z przekazaniem parametrow, konstruktor z trzema parametrami
		
		okno1.otworz(); // ustawia wszystkie skrzydla otwarte dla okna
		okno2.otworz(0); // ustawia pierwsze skrzydlo otwarte dla okna
		okno2.otworz(2); // ustawia trzecie skrzydlo otwarte dla okna
		
		okno1.wypiszStan(); // wypisanie w konsoli stanu obiektu typu Okno, otwarte lub zamkniete
		okno2.wypiszStan(); // wypisanie w konsoli stanu obiektu typu Okno, otwarte lub zamkniete
		
		okno1.zamknij(); // ustawienie stanu logicznego okna na zamkniete
		okno2.setDlugosc(2100); // ustawienie dlugosci okna
		okno2.zamknij(0); // ustawienie stanu logicznego okna na zamkniete
		Klamka kl = new Klamka(); // utworzenie nowego obiektu klasy Klamka
		kl.setCzyKluczyk(true); // ustawia klamke z kluczykiem jesli true lub bez jesli false
		okno2.getSkrzydla()[1].setKlamka(kl); // ustawia klamke z kluczykiem dla okreslonego skrzydla
		okno2.getSkrzydla()[2].setKlamka(null); // ustawia klamke z kluczykiem dla okreslonego skrzydla, przekazanie null jako parametru zamiast obiektu typu Klamka
		
		okno1.wypiszStan(); // wypisanie w konsoli stanu obiektu typu Okno, otwarte lub zamkniete
		okno2.wypiszStan(); // wypisanie w konsoli stanu obiektu typu Okno, otwarte lub zamkniete
		
	}
}