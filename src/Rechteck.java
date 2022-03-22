public class Rechteck extends Form {
    public Rechteck(double pHPosition, double pVPosition, int pGroesse) {
        super(pHPosition,  pVPosition,  pGroesse);
    }
    public void zeichne() {
        hatStift.zeichneRechteck(zGroesse * 2, zGroesse);
    }
    public boolean istGetroffen(double pHPosition, double pVPosition) {
        if ((pHPosition >= this.hPosition()) & (pVPosition >= this.vPosition()) && (pHPosition <= this.hPosition() + this.zGroesse * 2) & (pVPosition <= this.vPosition() + this.zGroesse)) {
            return true;
        }
        else {
            return false;
        }
    }
}
