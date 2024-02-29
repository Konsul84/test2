public class Elem {
    public int wert;
    public Elem rechts;
    public Elem unten;
    public Elem(int w, Elem r, Elem u) {
        this.wert = w;
        this.rechts = r;
        this.unten = u;
    }
    public Elem(int w) {
        this(w, null, null);
    }
}
