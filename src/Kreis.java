import sum.kern.*;
import java.awt.*;

public class Kreis {

    Buntstift hatStift;
    boolean zIstMarkiert;
    int zGroesse;

    public Kreis(double pHPosition, double pVPosition, int pGroesse) {
        hatStift = new Buntstift();
        zGroesse = pGroesse;
        hatStift.bewegeBis(pHPosition, pVPosition);
        this.zeichne();
        zIstMarkiert = true;

    }

    public void zeichne(){
        hatStift.zeichneKreis(zGroesse);
    }

    public void loesche() {
        hatStift.radiere();
        this.zeichne();
        hatStift.normal();
    }

    public void setzeFarbe(Color pFarbe) {
        this.loesche();
        hatStift.setzeFarbe(pFarbe);
        this.zeichne();
    }

    public void bewegeBis(double pHPosition, double pVPosition){
        this.loesche();
        hatStift.bewegeBis(pHPosition, pVPosition);
        this.zeichne();
    }

    public void bewegeUm(double pHDistanz, double pVDistanz){
        this.loesche();
        hatStift.bewegeBis(this.hPosition() + pHDistanz,this.vPosition() + pVDistanz);
        this.zeichne();
    }

    public void markiere(){
        this.loesche();
        hatStift.setzeLinienBreite(3);
        zIstMarkiert = true;
        this.zeichne();
    }

    public void demarkiere(){
        this.loesche();
        hatStift.setzeLinienBreite(1);
        zIstMarkiert = false;
        this.zeichne();
    }

    public void setzeGroesse(int pGroesse) {
        this.loesche();
        zGroesse = pGroesse;
        this.zeichne();
    }

    public void vergroessere(int pGroesse) {
        this.loesche();
        zGroesse = zGroesse + pGroesse;
        this.zeichne();
    }

    public void gibFrei(){
        this.loesche();
        hatStift.gibFrei();
    }

    public boolean istMarkiert(){
        return zIstMarkiert;
    }

    public double hPosition(){
        return hatStift.hPosition();
    }

    public double vPosition(){
        return hatStift.vPosition();
    }

    public double groesse(){
        return zGroesse;
    }

    public boolean istGetroffen(double pHPosition, double pVPosition) {
        return (Math.pow(pHPosition - hPosition(),2) + Math.pow(pVPosition - vPosition(),2) <= Math.pow(zGroesse,2));
    }
}
