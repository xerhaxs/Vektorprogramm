import sum.kern.*;

public class Grafik {
  public static void main(String[] args) {
    Bildschirm hatBildschirm = new Bildschirm();
    Tastatur hatTastatur = new Tastatur();
    Maus hatMaus = new Maus();
    Quadrat hatQuadrat = new Quadrat(100,100,50);
    Quadrat hatQuadrat2 = new Quadrat(500,500,20);
    Kreis hatKreis = new Kreis(200, 200, 60);
    Kreis hatKreis2 = new Kreis(600,600,30);
    Rechteck hatRechteck1 = new Rechteck(200, 500, 20);
    AllRechteck hatAllRechteck1 = new AllRechteck(300, 200, 100, 50);

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
        if (hatKreis2.istGetroffen(hatMaus.hPosition(), hatMaus.vPosition())) {
          hatKreis2.markiere();
        } else {
          hatKreis2.demarkiere();
        }
        if (hatRechteck1.istGetroffen(hatMaus.hPosition(), hatMaus.vPosition())) {
          hatRechteck1.markiere();
        } else {
          hatRechteck1.demarkiere();
        }
        if (hatAllRechteck1.istGetroffen(hatMaus.hPosition(), hatMaus.vPosition())) {
          hatAllRechteck1.markiere();
        } else {
          hatAllRechteck1.demarkiere();
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
        if (hatKreis2.istMarkiert()) {
          switch (hatTastatur.zeichen()) {
            case '+': hatKreis2.vergroessere(5); break;
            case '-': hatKreis2.vergroessere(-5); break;
            case Zeichen.PFEILLINKS: hatKreis2.bewegeUm(-5,0); break;
            case Zeichen.PFEILRECHTS: hatKreis2.bewegeUm(5, 0); break;
            case Zeichen.PFEILOBEN: hatKreis2.bewegeUm(0, -5); break;
            case Zeichen.PFEILUNTEN: hatKreis2.bewegeUm(0, 5); break;
          }
        }
        if (hatRechteck1.istMarkiert()) {
          switch (hatTastatur.zeichen()) {
            case '+': hatRechteck1.vergroessere(5); break;
            case '-': hatRechteck1.vergroessere(-5); break;
            case Zeichen.PFEILLINKS: hatRechteck1.bewegeUm(-5,0); break;
            case Zeichen.PFEILRECHTS: hatRechteck1.bewegeUm(5, 0); break;
            case Zeichen.PFEILOBEN: hatRechteck1.bewegeUm(0, -5); break;
            case Zeichen.PFEILUNTEN: hatRechteck1.bewegeUm(0, 5); break;
          }
        }
        if (hatAllRechteck1.istMarkiert()) {
          switch (hatTastatur.zeichen()) {
            case '+': hatAllRechteck1.vergroessere(5); break;
            case '-': hatAllRechteck1.vergroessere(-5); break;
            case Zeichen.PFEILLINKS: hatAllRechteck1.bewegeUm(-5,0); break;
            case Zeichen.PFEILRECHTS: hatAllRechteck1.bewegeUm(5, 0); break;
            case Zeichen.PFEILOBEN: hatAllRechteck1.bewegeUm(0, -5); break;
            case Zeichen.PFEILUNTEN: hatAllRechteck1.bewegeUm(0, 5); break;
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
