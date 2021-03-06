package pw.obi;

public class Skrzydlo { / deklaracja klasy typu Skrzydlo
	private int dlugosc; // deklaracja zmiennej (referencji) typu calkowitego przechowujacej informacje o dlugosci skrzydla
	private int wysokosc; // deklaracja zmiennej (referencji) typu calkowitego przechowujacej informacje o wysokosci skrzydla
	private Klamka klamka; // deklaracja zmiennej (referencji) na obiekt typu Klamka
	private boolean otwarte = false; // deklaracja zmiennej typu logicznego (prawda lub falsz)

	public Skrzydlo(int dlugosc, int wysokosc) { // konstruktor klasy Skrzydlo z dwoma parametrami, dwa typy calkowite
		this.dlugosc = dlugosc; // przypisanie parametru dlugosc do zmiennej dlugosc
		this.wysokosc = wysokosc; // przypisanie parametru dlugosc do zmiennej dlugosc
	}
	public Skrzydlo(int dlugosc, int wysokosc, Klamka klamka) { // konstruktor klasy Skrzydlo z trzema parametrami, dwa typy calkowite, jeden typu Klamka
		this(dlugosc,wysokosc); // wywolanie innego konstruktora
		this.klamka = klamka; // przypisanie wartosci parametru do obiektu typu Klamka
	}

	public int getDlugosc() { // funkcja zwraca dlugosc skrzydla
		return dlugosc; // zwrocenie wartosci zmiennej
	}
	public void setDlugosc(int dlugosc) { // funkcja ustawia dlugosc skrzydla
		this.dlugosc = dlugosc; // przypisanie wartosci parametru do zmiennej
	}
	public int getWysokosc() { // funkcja zwraca wysokosc skrzydla
		return wysokosc; // zwrocenie wartosci zmiennej
	}
	public void setWysokosc(int wysokosc) { // funkcja ustawia wysokosc skrzydla, prametr typu calkowitego
		this.wysokosc = wysokosc; // przypisanie wartosci parametru do zmiennej
	}
	public Klamka getKlamka() { // funkcja zwraca obiekt klasy Klamka
		return klamka; //zwrocenie obiektu typu Klamka
	}
	public void setKlamka(Klamka klamka) { // funkcja ustawia obiekt klasy Klamka
		this.klamka = klamka; // przypisanie wartosci parametru do obiektu typu Klamka
	}
	public boolean isOtwarte() { // funkcja zwraca stan logiczny skrzydla drzwi, otwarte lub zamkniete
		return otwarte; //zwrocenie wartosci zmiennej
	}
	public void setOtwarte(boolean otwarte) { // funkcja ustawia stan logiczny skrzydla drzwi, parametr typu logicznego
		this.otwarte = otwarte; // przypisanie wartosci parametru do zmiennej
	}
	public String stan() { // funkcja zwraca stan skrzydla drzwi w postaci zmiennej typu String sklejonej z kilku innych zmiennych typu String
		String wymiary = dlugosc+"x"+wysokosc; // dodanie do stringa danych o dlugosci i wysokosci skrzydla
		String otwarcie = otwarte ? "otwarte" : "zamkniete"; // wyrazenie warunkowe jesli zmienna typu boolean rowna sie false to wtedy dopisywane jest slowo "zamkniete" do stringa
		String stanKlamki = klamka!= null ? klamka.stan() : "bez klamki"; // wyrazenie warunkowe, operator trojargumentowy, jesli klamka rowna sie null to wtedy dopisywane do stringa jest slowo "bez klamki"
		return wymiary  +" "+ otwarcie +" "+ stanKlamki; // sklejenie stringa ktory ma zostac zwrocony z kilku innych stringow 
	}
}
