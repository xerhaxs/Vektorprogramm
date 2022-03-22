public class Kreis extends Form {
    public Kreis(double pHPosition, double pVPosition, int pGroesse) {
        super(pHPosition,  pVPosition,  pGroesse);
        this.zeichne();
    }

    public void zeichne() {
        hatStift.zeichneKreis(zGroesse);
    }

    public boolean istGetroffen(double pHPosition, double pVPosition) {
        return (Math.pow(pHPosition - hPosition(),2) + Math.pow(pVPosition - vPosition(),2) <= Math.pow(zGroesse,2));
    }
}
