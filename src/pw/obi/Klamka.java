package pw.obi;

public class Klamka { // deklaracja klasy typu klamka
	private boolean czyKluczyk = false; // deklaracja zmiennej logicznej ktora przechowuje informacje czy klamka posiada kluczyk

	public boolean isCzyKluczyk() { // funkcja zwraca informacje czy klamka jest z kluczykiem
		return czyKluczyk;
	}
	public void setCzyKluczyk(boolean czyKluczyk) { // funkcja okresla czy klamka jest z kluczykiem, parametr typu logicznego
		this.czyKluczyk = czyKluczyk;
	}
	public String stan() { // zwraca zmienna typu String ktora okresla czy klamka jest z kluczykiem czy bez
		return czyKluczyk ? "z kluczem": "bez klucza"; // instrukcja warunkowa w postai operatora trojargumentowego, jesli jest kluczyk zwraca string "z kluczem"
	}
}
