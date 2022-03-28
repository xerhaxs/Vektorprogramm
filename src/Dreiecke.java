public class Dreiecke extends Form {
    public Dreiecke(double pHPosition, double pVPosition, int pGroesse) {
        super(pHPosition,  pVPosition, pGroesse);
        this.zeichne();
    }
    public void zeichne() {
        hatStift.runter();
        hatStift.bewegeUm(zGroesse);
        hatStift.dreheUm(90);
        hatStift.bewegeUm(zGroesse);
        hatStift.bewegeUm((Math.sqrt(Math.pow(zGroesse, 2) + Math.pow(zGroesse, 2))));
    }
    public boolean istGetroffen(double pHPosition, double pVPosition) {
        return (Math.pow(pHPosition - hPosition(),2) + Math.pow(pVPosition - vPosition(),2) <= Math.pow(zGroesse,2));
    }
}
