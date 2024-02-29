/*class Elem {
	int wert;
	Elem rechts;
	Elem unten;

	Elem(int w, Elem r, Elem u) {
		this.wert = w;
		this.rechts = r;
		this.unten = u;
	}

	Elem(int w) {
		this(w, null, null);
	}
}

class VerketteteMatrix {

	private Elem linksOben;

	/**
	 * Erzeugt ein VerketteteMatrix-Objekt, das der uebergebenen Matrix
	 * entspricht
	 * 
	 * @param matrix
	 *            die Matrix, die in ein VerketteteMatrix-Objekt �berf�hrt
	 *            werden soll; Voraussetzungen: matrix != null && matrix.length
	 *            != 0 && matrix[r] != 0 fuer alle Reihen r

	public VerketteteMatrix(int[][] matrix) {
		for (int r = 0; r < matrix.length; r++) {
			for (int s = 0; s < matrix[r].length; s++) {
				Elem elem = new Elem(matrix[r][s]);
				if (r == 0 && s == 0) {
					linksOben = elem;
				}
				Elem links = getElem(r, s - 1);
				if (links != null) {
					links.rechts = elem;
				}
				Elem oben = getElem(r - 1, s);
				if (oben != null) {
					oben.unten = elem;
				}
			}
		}
	}

	// Hilfsmethode zur Ermittlung des Elementes in der angegebenen Reihe und
	// Spalte
	private Elem getElem(int reihe, int spalte) {
		if (reihe < 0 || spalte < 0) {
			return null;
		}
		Elem elem = linksOben;
		if (elem == null) {
			return null;
		}
		while (reihe > 0) {
			elem = elem.unten;
			if (elem == null) {
				return null;
			}
			reihe--;
		}
		while (spalte > 0) {
			elem = elem.rechts;
			if (elem == null) {
				return null;
			}
			spalte--;
		}
		return elem;
	}

	/**
	 * Liefert den Wert des Elementes in der angegebenen Reihe und Spalte
	 * 
	 * @param reihe
	 *            Reihe des Elementes
	 * @param spalte
	 *            Spalte des Elementes
	 * @return Wert des Elementes in der angegeben Reihe und Spalte

	public int getWert(int reihe, int spalte) {
		Elem elem = linksOben;

		while (reihe > 0) {
			elem = elem.unten;
			reihe--;
		}
		while (spalte > 0) {
			elem = elem.rechts;
			spalte--;
		}
		return elem.wert;
	}

	// nicht gefordert
	/**
	 * Aendert den Wert des Elementes in der angegebenen Reihe und Spalte. Bei
	 * "Luecken" in der Matrix werden diese mit Nullen aufgefuellt!
	 * 
	 * @param wert
	 *            neuer Wert des Elementes
	 * @param reihe
	 *            Reihe des Elementes
	 * @param spalte
	 *            Spalte des Elementes

	public void setWert(int wert, int reihe, int spalte) {
	}

	// vorgegeben
	public void print() {
		Elem elemReihe = linksOben;
		while (elemReihe != null) {
			Elem elemSpalte = elemReihe;
			while (elemSpalte != null) {
				System.out.print(elemSpalte.wert + " ");
				elemSpalte = elemSpalte.rechts;
			}
			System.out.println();
			elemReihe = elemReihe.unten;
		}
	}
}

public class UE13Aufgabe10 {
	// vorgegeben
	public static void main(String[] args) {
		int[][] m = { { 2, 4, 5, 8 }, { 1, 6 }, { 3, 4, 5, 6, 9 },
				{ 4, 1, 7, 7 } };
		VerketteteMatrix matrix = new VerketteteMatrix(m);
		matrix.print();
	}

}
*/