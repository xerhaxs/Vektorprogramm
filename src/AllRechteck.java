public class AllRechteck extends Form {
    int zVGroesse;
    public AllRechteck(double pHPosition, double pVPosition, int pGroesse, int pVGroesse) {
        super(pHPosition,  pVPosition, pGroesse);
        zVGroesse = pVGroesse;
        this.zeichne();
    }
    public void zeichne() {
        hatStift.zeichneRechteck(zGroesse, zVGroesse);
    }
    public void setzeGroesse(int pGroesse, int pVGroesse) {
        zVGroesse = pVGroesse;
        this.zeichne();
    }
    public void vergroessere(int pGroesse) {
        super.loesche();
        zGroesse = zGroesse + pGroesse;
        zVGroesse = zVGroesse + pGroesse;
        this.zeichne();
    }
    public boolean istGetroffen(double pHPosition, double pVPosition) {
        if ((pHPosition >= this.hPosition()) & (pVPosition >= this.vPosition()) && (pHPosition <= this.hPosition() + this.zGroesse) & (pVPosition <= this.vPosition() + this.zVGroesse)) {
            return true;
        }
        else {
            return false;
        }
    }
}
