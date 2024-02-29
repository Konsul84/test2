/*public class Aufgabe {
}
class Elem {
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
public class VerketteteMatrix {
    private Elem linksOben; // Referenz auf das linke obere Element
    /**
     * Erzeugt ein VerketteteMatrix-Objekt, das der uebergebenen Matrix
     * entspricht
     *
     * @param matrix
     * die Matrix, die in ein VerketteteMatrix-Objekt
     * überführt werden soll; Voraussetzungen:
     * matrix != null && matrix.length > 0 &&
     * matrix[r].length > 0 fuer alle Reihen r

    public VerketteteMatrix(int[][] matrix) { }
    /**
     * Liefert den Wert des Elementes in der angegebenen Reihe und Spalte
     *
     * @param reihe
     * Reihe des Elementes
     * @param spalte
     * Spalte des Elementes
     * @return Wert des Elementes in der angegebenen Reihe und Spalte

    public int getWert(int reihe, int spalte) { }
     * Aendert den Wert des Elementes in der angegebenen Reihe und
     * Spalte. Bei "Luecken" in der Matrix werden diese mit Nullen
     * aufgefuellt!
     *
     * @param wert
     * neuer Wert des Elementes
     * @param reihe
     * Reihe des Elementes
     * @param spalte
     * Spalte des Elementes

    public void setWert(int wert, int reihe, int spalte) {
        // Implementierung nicht von Ihnen gefordert
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
    // vorgegebenes Testprogramm
    public static void main(String[] args) {
        int[][] m = { { 2, 4, 5, 8 },
                { 1, 6 },
                { 3, 4, 5, 6, 9 },
                { 4, 1, 7, 7 }
        };
        VerketteteMatrix matrix = new VerketteteMatrix(m);
        matrix.print();
    }
}
*/