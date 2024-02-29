public class VerketteteMatrix {
    private Elem linksOben; // Referenz auf das linke obere Element

    /**
     * Erzeugt ein VerketteteMatrix-Objekt, das der uebergebenen Matrix
     * entspricht
     *
     * @param matrix die Matrix, die in ein VerketteteMatrix-Objekt
     *               überführt werden soll; Voraussetzungen:
     *               matrix != null && matrix.length > 0 &&
     *               matrix[r].length > 0 fuer alle Reihen r
     */
    public VerketteteMatrix(int[][] matrix) {
        if(matrix !=null){
            for(int r=0;r<matrix.length;++r){
                for(int s=0;s<matrix[r].length;++s){
                    Elem elem=new Elem(matrix[r][s]);
                    if(r==0 && s==0){
                        linksOben=elem;
                    }
                    Elem links= getElem(r,s-1);

                    if(links!=null) {
                        links.rechts=elem;
                    }

                    Elem oben =getElem(r-1,s);
                    if(oben!=null) {
                        oben.unten=elem;
                    }
                }
            }
        }
    }
    private Elem getElem(int r,int s) {
        if (r < 0 || s < 0) {
            return null;
        }
        Elem elem = linksOben;
        if (elem == null) {
            return null;
        }
        while (r > 0) {
            elem = elem.unten;
            if (elem == null) {
                return null;
            }
            --r;
        }

        while (s > 0) {
            elem = elem.rechts;
            if (elem == null) {
                return null;
            }
            --s;
        }

        return elem;
    }


    public void print () {
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
