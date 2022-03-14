import sum.kern.*;
import java.awt.*;

public class Grafik {
  public static void main(String[] args) {
    Bildschirm hatBildschirm;
    Tastatur hatTastatur;
    Maus hatMaus;
    Quadrat hatQuadrat;
    Quadrat hatQuadrat2;
    Kreis hatKreis;

    hatBildschirm = new Bildschirm();
    hatTastatur= new Tastatur();
    hatMaus = new Maus();
    hatQuadrat = new Quadrat(100,100,50);
    hatQuadrat2 = new Quadrat(500,500,20);
    hatKreis = new Kreis(200, 200, 60);

    do {
      if (hatMaus.istGedrueckt()) {
        if (hatQuadrat.istGetroffen(hatMaus.hPosition(), hatMaus.vPosition())) {
          hatQuadrat.markiere();
        } else {
          hatQuadrat.demarkiere();
        }
        if (hatQuadrat2.istGetroffen(hatMaus.hPosition(), hatMaus.vPosition())) {
          hatQuadrat2.markiere();
        } else {
          hatQuadrat2.demarkiere();
        }
                if (hatKreis.istGetroffen(hatMaus.hPosition(), hatMaus.vPosition())) {
          hatKreis.markiere();
        } else {
          hatKreis.demarkiere();
        }
      }

      if ((hatTastatur.wurdeGedrueckt())) {
        if (hatQuadrat.istMarkiert()) {
          switch (hatTastatur.zeichen()) {
            case '+': hatQuadrat.vergroessere(5); break;
            case '-': hatQuadrat.vergroessere(-5); break;
            case Zeichen.PFEILLINKS: hatQuadrat.bewegeUm(-5,0); break;
            case Zeichen.PFEILRECHTS: hatQuadrat.bewegeUm(5, 0); break;
            case Zeichen.PFEILOBEN: hatQuadrat.bewegeUm(0, -5); break;
            case Zeichen.PFEILUNTEN: hatQuadrat.bewegeUm(0, 5); break;
          }
        }
        if (hatQuadrat2.istMarkiert()) {
          switch (hatTastatur.zeichen()) {
            case '+': hatQuadrat2.vergroessere(5); break;
            case '-': hatQuadrat2.vergroessere(-5); break;
            case Zeichen.PFEILLINKS: hatQuadrat2.bewegeUm(-5,0); break;
            case Zeichen.PFEILRECHTS: hatQuadrat2.bewegeUm(5, 0); break;
            case Zeichen.PFEILOBEN: hatQuadrat2.bewegeUm(0, -5); break;
            case Zeichen.PFEILUNTEN: hatQuadrat2.bewegeUm(0, 5); break;
          }
        }
        if (hatKreis.istMarkiert()) {
          switch (hatTastatur.zeichen()) {
            case '+': hatKreis.vergroessere(5); break;
            case '-': hatKreis.vergroessere(-5); break;
            case Zeichen.PFEILLINKS: hatKreis.bewegeUm(-5,0); break;
            case Zeichen.PFEILRECHTS: hatKreis.bewegeUm(5, 0); break;
            case Zeichen.PFEILOBEN: hatKreis.bewegeUm(0, -5); break;
            case Zeichen.PFEILUNTEN: hatKreis.bewegeUm(0, 5); break;
          }
        }
        hatTastatur.weiter();
      }
    } while (! hatMaus.doppelKlick() );
    hatQuadrat.gibFrei();
    hatKreis.gibFrei();
    hatMaus.gibFrei();
    hatTastatur.gibFrei();
    hatBildschirm.gibFrei();
  }
}
