package pw.obi;

public class Okno { // deklaracja klasy typu Okno
	private int dlugosc; // deklaracja zmiennej (referencji) typu calkowitego przechowujacej informacje o dlugosci okna
	private int wysokosc; // deklaracja zmiennej (referencji) typu calkowitego przechowujacej informacje o wysokosci okna
	private int liczbaSkrzydel; // tylko do odczytu, deklaracja zmiennej (referencji) typu calkowitego przechowujacej informacje o liczbie skrzydel w oknie
	private Skrzydlo[] skrzydla; // deklaracja tablicy przechowujacej zmienne typu Skrzydlo
	
	public Okno(int d, int w, int lSkrzydel){ // konstruktor klasy Okno z trzema parametrami, trzy typy calkowite
		dlugosc = d; // przypisanie parametru d do zmiennej dlugosc
		wysokosc = w; // przypisanie parametru w do zmiennej wysokosc
		liczbaSkrzydel = lSkrzydel; // przypisanie parametru lSkrzydel do zmiennej liczbaSkrzydel
		skrzydla = new Skrzydlo[lSkrzydel]; // zainicjowanie tablicy skrzydla z okreslona iloscia skrzydel 
		for(int i=0;i<lSkrzydel;i++){ // petla for dla utworzenia obiektow typu Skrzydlo
			skrzydla[i] = new Skrzydlo(d/lSkrzydel,w, new Klamka()); // utworzenie w petli obiektow typu Skrzydla dla kazdego okna
		}
	}
	public Okno(int d, int w, Skrzydlo[] sk){  // konstruktor klasy Okno z trzema parametrami, dwa typy calkowite i jeden tablicowy
		dlugosc = d; // przypisanie parametru d do zmiennej dlugosc
		wysokosc = w; / przypisanie parametru w do zmiennej wysokosc
		liczbaSkrzydel = sk.length; // przypisanie dlugosci tablicy Skrzydlo do zmiennej liczbaSkrzydel
		skrzydla = sk;
	}		
	public Okno(int d, int w){  // konstruktor klasy Okno z dwoma parametrami, dwa typy calkowite
		this(d,w,1); // wywolanie innego konstruktora klasy Okno z trzema parametrami
	}	
	public Okno(){  // konstruktor klasy Okno bez parametrow
		this(1200,1500,1); // wywolanie innego konstruktora klasy Okno z trzema parametrami
	}
	
	public int getDlugosc() { // funkcja zwraca dlugosc okna
		return dlugosc;
	}
	public void setDlugosc(int dlugosc) { // funkcja ustawia dlugosc okna
		this.dlugosc = dlugosc;
		for(int i=0;i<liczbaSkrzydel;i++){
			skrzydla[i].setDlugosc(dlugosc/liczbaSkrzydel); // ustawienie w petli dlugosci wszystkich skrzydel w oknie
		}
	}
	
	public int getWysokosc() { // funkcja zwraca wysokosc okna
		return wysokosc;
	}
	public void setWysokosc(int wysokosc) { // funkcja ustawia wysokosc okna
		this.wysokosc = wysokosc; // przypisanie parametru wysokosc do zmiennej wysokosc
		for(int i=0;i<liczbaSkrzydel;i++){
			skrzydla[i].setWysokosc(wysokosc); // ustawienie w petli wysokosci wszystkich skrzydel dla danego okna
		}
	}
	
	public int getLiczbaSkrzydel() { // funkcja zwraca liczbe skrzydel w oknie
		return liczbaSkrzydel;
	}
	public Skrzydlo[] getSkrzydla() { // funkcja zwraca tablice skrzydel
		return skrzydla;
	}

	public void otworz(){ //  funkcja otwiera wszystkie skrzydla
		for(int i=0;i<liczbaSkrzydel;i++){
			skrzydla[i].setOtwarte(true); // ustawienie w petli wszystkich skrzydel danego okna na true (otwarte)
		}
	}
	public void otworz(int nrSkrzydla){ // funkcja otwiera okreslone skrzydlo na podstawie jego numeru 
		if(nrSkrzydla > skrzydla.length) return; // jesli przekazany argument przekracza ilosc skrzydel zamknij program
		
		skrzydla[nrSkrzydla].setOtwarte(true); // ustaw stan logiczny otwarcia okreslonego skrzydla okna na true (otwarte)
		
	}
	public void zamknij(){ // funkcja zamyka wszystkie skrzydla
		for(int i=0;i<liczbaSkrzydel;i++){
			skrzydla[i].setOtwarte(false); // ustaw w petli stan skrzydel na zamkniety dla wszystkich skrzydel
		}
	}
	public void zamknij(int nrSkrzydla){ // funkcja zamyka konkretne skrzydlo
		if(nrSkrzydla > skrzydla.length) return; // jesli przekazany argument przekracza ilosc skrzydel zamknij aplikacje
		
		skrzydla[nrSkrzydla].setOtwarte(false); // ustaw stan otwarcia skrzydla na false dla okreslonego numeru skrzydla
		
	}
	public void wypiszStan() { // wypisuje stan poszczegolnych skrzydel okna, otwarte czy zamkniete
		String tekst = "";
		for(int i=0;i<liczbaSkrzydel;i++){
			tekst += "["+skrzydla[i].stan()+"]"; // sklejenie stringu przechowujacego informacje o ilosci skrzydel w petli 
		}
		System.out.println(tekst); // wypisanie tekstu okreslajacego stan skrzydla w konsoli
		
	}
	
}
