public class Quadrat extends Form {
  public Quadrat(double pHPosition, double pVPosition, int pGroesse) {
    super(pHPosition,  pVPosition,  pGroesse);
  }
  public void zeichne() {
    hatStift.zeichneRechteck(zGroesse, zGroesse);
  }
  public boolean istGetroffen(double pHPosition, double pVPosition) {
    if ((pHPosition >= this.hPosition()) & (pVPosition >= this.vPosition()) && (pHPosition <= this.hPosition() + this.zGroesse) & (pVPosition <= this.vPosition() + this.zGroesse)) { // das waren erst zwei Ränder
      return true;
    }
    else {
      return false;
    }
  }
} 
