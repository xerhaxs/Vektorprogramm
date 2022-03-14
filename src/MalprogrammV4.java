import sum.kern.Bildschirm;
import sum.kern.Buntstift;
import sum.kern.Maus;
import sum.kern.Tastatur;
import sum.kern.Zeichen;
import sum.kern.Muster;
import java.awt.Color;

public class MalprogrammV4 {

    public static void main(String[] args) {

        // Objekte deklarieren
        Bildschirm Hintergrund1;
        Buntstift Buntstift1;
        Buntstift Buntstift2;
        Buntstift Buntstift3;
        Maus Maus1;
        Tastatur Tastatur1;

        // Objekte erzeugen
        Hintergrund1 = new Bildschirm();
        Buntstift1 = new Buntstift();
        Buntstift2 = new Buntstift();
        Buntstift3 = new Buntstift();
        Maus1 = new Maus();
        Tastatur1 = new Tastatur();

        // Objekte einstellen
        Buntstift2.bewegeBis(100, 100);
        Buntstift2.setzeFarbe(Color.black);
        Buntstift2.setzeSchriftGroesse(30);

        //Buntstift3.
        Buntstift3.setzeLinienBreite(3);
        Buntstift3.bewegeBis(Hintergrund1.breite() * 0,Hintergrund1.hoehe() * 9 / 10);
        Buntstift3.runter();
        Buntstift3.bewegeBis(Hintergrund1.breite() * 1,Hintergrund1.hoehe() * 9 / 10);
        Buntstift3.hoch();


        // Interface Radieren / Normal
        Buntstift3.bewegeBis(Hintergrund1.breite() * 1 / 15, Hintergrund1.hoehe() * 37 / 40);
        Buntstift3.setzeFarbe(Color.black);
        Buntstift3.zeichneRechteck(60, 60);
        Buntstift3.bewegeBis(Hintergrund1.breite() * 1 / 15, Hintergrund1.hoehe() * 38 / 40);
        Buntstift3.schreibeText(" Radieren");
        Buntstift3.bewegeBis(Hintergrund1.breite() * 2 / 15, Hintergrund1.hoehe() * 37 / 40);
        Buntstift3.zeichneRechteck(60, 60);
        Buntstift3.bewegeBis(Hintergrund1.breite() * 2 / 15, Hintergrund1.hoehe() * 38 / 40);
        Buntstift3.schreibeText("  Normal");

        // Interface Farben
        Buntstift3.setzeFuellMuster(Muster.GEFUELLT);
        //Rot (y)
        Buntstift3.bewegeBis(Hintergrund1.breite() * 4 / 15, Hintergrund1.hoehe() * 19 / 20);
        Buntstift3.setzeFarbe(Color.red);
        Buntstift3.zeichneKreis(40);
        //Grün (x)
        Buntstift3.bewegeBis(Hintergrund1.breite() * 5 / 15, Hintergrund1.hoehe() * 19 / 20);
        Buntstift3.setzeFarbe(Color.green);
        Buntstift3.zeichneKreis(40);
        //Blau (c)
        Buntstift3.bewegeBis(Hintergrund1.breite() * 6 / 15, Hintergrund1.hoehe() * 19 / 20);
        Buntstift3.setzeFarbe(Color.blue);
        Buntstift3.zeichneKreis(40);
        //Gelb (v)
        Buntstift3.bewegeBis(Hintergrund1.breite() * 7 / 15, Hintergrund1.hoehe() * 19 / 20);
        Buntstift3.setzeFarbe(Color.yellow);
        Buntstift3.zeichneKreis(40);
        //Schwarz (b)
        Buntstift3.bewegeBis(Hintergrund1.breite() * 8 / 15, Hintergrund1.hoehe() * 19 / 20);
        Buntstift3.setzeFarbe(Color.black);
        Buntstift3.zeichneKreis(40);

        Buntstift3.setzeFuellMuster(Muster.DURCHSICHTIG);

        // Interface Stiftdicke
        // Stiftdicke 1 (1)
        Buntstift3.bewegeBis(Hintergrund1.breite() * 10 / 15, Hintergrund1.hoehe() * 19 / 20);
        Buntstift3.zeichneKreis(20);
        Buntstift3.bewegeBis(Hintergrund1.breite() * 10 / 15 - 3.5, Hintergrund1.hoehe() * 19 / 20 + 3.5);
        Buntstift3.schreibeText("1");
        // Stiftdicke 1 (2)
        Buntstift3.bewegeBis(Hintergrund1.breite() * 11 / 15, Hintergrund1.hoehe() * 19 / 20);
        Buntstift3.zeichneKreis(20);
        Buntstift3.bewegeBis(Hintergrund1.breite() * 11 / 15 - 3.5, Hintergrund1.hoehe() * 19 / 20 + 3.5);
        Buntstift3.schreibeText("2");
        // Stiftdicke 1 (3)
        Buntstift3.bewegeBis(Hintergrund1.breite() * 12 / 15, Hintergrund1.hoehe() * 19 / 20);
        Buntstift3.zeichneKreis(20);
        Buntstift3.bewegeBis(Hintergrund1.breite() * 12 / 15 - 3.5, Hintergrund1.hoehe() * 19 / 20 + 3.5);
        Buntstift3.schreibeText("3");
        // Stiftdicke 1 (4)
        Buntstift3.bewegeBis(Hintergrund1.breite() * 13 / 15, Hintergrund1.hoehe() * 19 / 20);
        Buntstift3.zeichneKreis(20);
        Buntstift3.bewegeBis(Hintergrund1.breite() * 13 / 15 - 3.5, Hintergrund1.hoehe() * 19 / 20 + 3.5);
        Buntstift3.schreibeText("4");
        // Stiftdicke 1 (5)
        Buntstift3.bewegeBis(Hintergrund1.breite() * 14 / 15, Hintergrund1.hoehe() * 19 / 20);
        Buntstift3.zeichneKreis(20);
        Buntstift3.bewegeBis(Hintergrund1.breite() * 14 / 15 - 3.5, Hintergrund1.hoehe() * 19 / 20 + 3.5);
        Buntstift3.schreibeText("5");

        // Int erzeugen
        int i = 1;
        int c = 0;

        // String erzeugen
        String farbe = null;
        farbe = "000000";

        // Char erzeugen
        char letter = ' ';
        char letter00 = '0';
        char letter01 = '0';
        char letter02 = '0';
        char letter03 = '0';
        char letter04 = '0';
        char letter05 = '0';


        // Buntstift
        while (i != 0) {
            while (c == 0) {
                // Programm beenden
                if (Tastatur1.wurdeGedrueckt()) {
                    if (Tastatur1.zeichen() == Zeichen.ESCAPE) {
                        i = 0;
                        Hintergrund1.gibFrei();
                        Buntstift1.gibFrei();
                        Buntstift2.gibFrei();
                        Maus1.gibFrei();
                        Tastatur1.gibFrei();
                        Tastatur1.weiter();
                    }
                }

                // Interface Bedienung
                if (Maus1.istGedrueckt() && Maus1.vPosition() >= Hintergrund1.hoehe() * 9 / 10) {
                    // Stiftart
                    if (Maus1.hPosition() >= Hintergrund1.breite() * 1 / 15 && Maus1.hPosition() <= Hintergrund1.breite() * 1 / 15 + 60) {
                        Buntstift1.radiere();
                    } else if (Maus1.hPosition() >= Hintergrund1.breite() * 2 / 15 && Maus1.hPosition() <= Hintergrund1.breite() * 2 / 15 + 60) {
                        Buntstift1.normal();
                        // Farben
                    } else if (Maus1.hPosition() >= Hintergrund1.breite() * 4 / 15 && Maus1.hPosition() <= Hintergrund1.breite() * 4 / 15 + 40) {
                        Buntstift1.setzeFarbe(Color.red);
                    } else if (Maus1.hPosition() >= Hintergrund1.breite() * 5 / 15 && Maus1.hPosition() <= Hintergrund1.breite() * 5 / 15 + 40) {
                        Buntstift1.setzeFarbe(Color.green);
                    } else if (Maus1.hPosition() >= Hintergrund1.breite() * 6 / 15 && Maus1.hPosition() <= Hintergrund1.breite() * 6 / 15 + 40) {
                        Buntstift1.setzeFarbe(Color.blue);
                    } else if (Maus1.hPosition() >= Hintergrund1.breite() * 7 / 15 && Maus1.hPosition() <= Hintergrund1.breite() * 7 / 15 + 40) {
                        Buntstift1.setzeFarbe(Color.yellow);
                    } else if (Maus1.hPosition() >= Hintergrund1.breite() * 8 / 15 && Maus1.hPosition() <= Hintergrund1.breite() * 8 / 15 + 40) {
                        Buntstift1.setzeFarbe(Color.black);
                        // Stiftdicke
                    } else if (Maus1.hPosition() >= Hintergrund1.breite() * 10 / 15 && Maus1.hPosition() <= Hintergrund1.breite() * 10 / 15 + 40) {
                        Buntstift1.setzeLinienBreite(1);
                    } else if (Maus1.hPosition() >= Hintergrund1.breite() * 11 / 15 && Maus1.hPosition() <= Hintergrund1.breite() * 11 / 15 + 40) {
                        Buntstift1.setzeLinienBreite(2);
                    } else if (Maus1.hPosition() >= Hintergrund1.breite() * 12 / 15 && Maus1.hPosition() <= Hintergrund1.breite() * 12 / 15 + 40) {
                        Buntstift1.setzeLinienBreite(3);
                    } else if (Maus1.hPosition() >= Hintergrund1.breite() * 13 / 15 && Maus1.hPosition() <= Hintergrund1.breite() * 13 / 15 + 40) {
                        Buntstift1.setzeLinienBreite(4);
                    } else if (Maus1.hPosition() >= Hintergrund1.breite() * 14 / 15 && Maus1.hPosition() <= Hintergrund1.breite() * 14 / 15 + 40) {
                        Buntstift1.setzeLinienBreite(5);
                    }
                }

                // Buntsitft folgt Maus
                if (Maus1.vPosition() != Buntstift1.vPosition() | Maus1.hPosition() != Buntstift1.hPosition()) {
                    Buntstift1.bewegeBis(Maus1.hPosition(), Maus1.vPosition());
                }

                // Buntstift runter bzw. hoch
                if (Maus1.istGedrueckt() && Maus1.vPosition() <= Hintergrund1.hoehe() * 9 / 10) {
                    Buntstift1.runter();
                } else {
                    Buntstift1.hoch();
                }

                // radieren - normal
                if (Tastatur1.wurdeGedrueckt()) {
                    if (Tastatur1.zeichen() == 'r') {
                        Buntstift1.radiere();
                        Tastatur1.weiter();
                    }
                }
                if (Tastatur1.wurdeGedrueckt()) {
                    if (Tastatur1.zeichen() == 'n') {
                        Buntstift1.normal();
                        Tastatur1.weiter();
                    }
                }
                // Stiftdicke
                if (Tastatur1.wurdeGedrueckt()) {
                    if (Tastatur1.zeichen() == '1') {
                        Buntstift1.setzeLinienBreite(1);
                        Tastatur1.weiter();
                    }
                }
                // Stiftdicke
                if (Tastatur1.wurdeGedrueckt()) {
                    if (Tastatur1.zeichen() == '2') {
                        Buntstift1.setzeLinienBreite(2);
                        Tastatur1.weiter();
                    }
                }
                // Stiftdicke
                if (Tastatur1.wurdeGedrueckt()) {
                    if (Tastatur1.zeichen() == '3') {
                        Buntstift1.setzeLinienBreite(3);
                        Tastatur1.weiter();
                    }
                }
                // Stiftdicke
                if (Tastatur1.wurdeGedrueckt()) {
                    if (Tastatur1.zeichen() == '4') {
                        Buntstift1.setzeLinienBreite(4);
                        Tastatur1.weiter();
                    }
                }
                // Stiftdicke
                if (Tastatur1.wurdeGedrueckt()) {
                    if (Tastatur1.zeichen() == '5') {
                        Buntstift1.setzeLinienBreite(5);
                        Tastatur1.weiter();
                    }
                }
                // Stiftfarbe
                if (Tastatur1.wurdeGedrueckt()) {
                    if (Tastatur1.zeichen() == 'y') {
                        Buntstift1.setzeFarbe(Color.RED);
                        Tastatur1.weiter();
                    }
                }
                // Stiftfarbe
                if (Tastatur1.wurdeGedrueckt()) {
                    if (Tastatur1.zeichen() == 'x') {
                        Buntstift1.setzeFarbe(Color.GREEN);
                        Tastatur1.weiter();
                    }
                }
                // Stiftfarbe
                if (Tastatur1.wurdeGedrueckt()) {
                    if (Tastatur1.zeichen() == 'c') {
                        Buntstift1.setzeFarbe(Color.BLUE);
                        Tastatur1.weiter();
                    }
                }
                // Stiftfarbe
                if (Tastatur1.wurdeGedrueckt()) {
                    if (Tastatur1.zeichen() == 'v') {
                        Buntstift1.setzeFarbe(Color.YELLOW);
                        Tastatur1.weiter();
                    }
                }
                // Stiftfarbe
                if (Tastatur1.wurdeGedrueckt()) {
                    if (Tastatur1.zeichen() == 'b') {
                        Buntstift1.setzeFarbe(Color.BLACK);
                        Tastatur1.weiter();
                    }
                }

                // Hex-Code eingabe beginnen
                if (Tastatur1.wurdeGedrueckt()) {
                    if (Tastatur1.zeichen() == Zeichen.EINGABE) {
                        Buntstift2.bewegeBis(100, 100);
                        Buntstift2.radiere();
                        Buntstift2.schreibeText(farbe);
                        Buntstift2.bewegeBis(100, 100);
                        Buntstift2.normal();
                        Buntstift2.schreibeText("#");
                        letter = ' ';
                        letter00 = ' ';
                        letter01 = ' ';
                        letter02 = ' ';
                        letter03 = ' ';
                        letter04 = ' ';
                        letter05 = ' ';
                        Tastatur1.weiter();
                        c = 1;
                    }
                }
            }

            // Farbeingabe in Hex
            while (c == 1) {
                // Programm beenden
                if (Tastatur1.wurdeGedrueckt()) {
                    if (Tastatur1.zeichen() == Zeichen.ESCAPE) {
                        i = 0;
                        Hintergrund1.gibFrei();
                        Buntstift1.gibFrei();
                        Buntstift2.gibFrei();
                        Maus1.gibFrei();
                        Tastatur1.gibFrei();
                        Tastatur1.weiter();
                    }
                }

                // Zurrück
                if (Tastatur1.wurdeGedrueckt()) {
                    if (Tastatur1.zeichen() == Zeichen.BACKSPACE) {
                        Buntstift2.bewegeBis(100, 100);
                        Tastatur1.weiter();
                        if (letter05 != ' ') {
                            Buntstift2.radiere();
                            Buntstift2.schreibeText(farbe);
                            Buntstift2.normal();
                            letter05 = ' ';
                            Buntstift2.bewegeBis(100, 100);
                            Buntstift2.schreibeText("#" + letter00 + letter01 + letter02 + letter03 + letter04);
                        } else if (letter04 != ' ') {
                            Buntstift2.radiere();
                            Buntstift2.schreibeText(farbe);
                            Buntstift2.normal();
                            letter04 = ' ';
                            Buntstift2.bewegeBis(100, 100);
                            Buntstift2.schreibeText("#" + letter00 + letter01 + letter02 + letter03);
                        } else if (letter03 != ' ') {
                            Buntstift2.radiere();
                            Buntstift2.schreibeText(farbe);
                            Buntstift2.normal();
                            letter03 = ' ';
                            Buntstift2.bewegeBis(100, 100);
                            Buntstift2.schreibeText("#" + letter00 + letter01 + letter02);
                        } else if (letter02 != ' ') {
                            Buntstift2.radiere();
                            Buntstift2.schreibeText(farbe);
                            Buntstift2.normal();
                            letter02 = ' ';
                            Buntstift2.bewegeBis(100, 100);
                            Buntstift2.schreibeText("#" + letter00 + letter01);
                        } else if (letter01 != ' ') {
                            Buntstift2.radiere();
                            Buntstift2.schreibeText(farbe);
                            Buntstift2.normal();
                            letter01 = ' ';
                            Buntstift2.bewegeBis(100, 100);
                            Buntstift2.schreibeText("#" + letter00);
                        } else if (letter00 != ' ') {
                            Buntstift2.radiere();
                            Buntstift2.schreibeText(farbe);
                            Buntstift2.normal();
                            letter00 = ' ';
                            Buntstift2.bewegeBis(100, 100);
                            Buntstift2.schreibeText("#");
                        }
                    }
                }

                // Farbeingabe
                if (Tastatur1.wurdeGedrueckt()) {
                    if (Tastatur1.zeichen() != Zeichen.EINGABE && Tastatur1.zeichen() != Zeichen.BACKSPACE) {
                        if (Tastatur1.zeichen() == '1' || Tastatur1.zeichen() == '2' || Tastatur1.zeichen() == '3' || Tastatur1.zeichen() == '4' || Tastatur1.zeichen() == '5' || Tastatur1.zeichen() == '6' || Tastatur1.zeichen() == '7' || Tastatur1.zeichen() == '8' || Tastatur1.zeichen() == '9' || Tastatur1.zeichen() == '0' || Tastatur1.zeichen() == 'a' || Tastatur1.zeichen() == 'b' || Tastatur1.zeichen() == 'c' || Tastatur1.zeichen() == 'd' || Tastatur1.zeichen() == 'e' || Tastatur1.zeichen() == 'f') {
                            letter = Tastatur1.zeichen();
                            if (letter00 == ' ') {
                                letter00 = letter;
                                Buntstift2.schreibeText(letter00);
                                farbe = "#" + letter00;
                            } else if (letter01 == ' ') {
                                letter01 = letter;
                                Buntstift2.schreibeText(letter01);
                                farbe = "#" + letter00 + letter01;
                            } else if (letter02 == ' ') {
                                letter02 = letter;
                                Buntstift2.schreibeText(letter02);
                                farbe = "#" + letter00 + letter01 + letter02;
                            } else if (letter03 == ' ') {
                                letter03 = letter;
                                Buntstift2.schreibeText(letter03);
                                farbe = "#" + letter00 + letter01 + letter02 + letter03;
                            } else if (letter04 == ' ') {
                                letter04 = letter;
                                Buntstift2.schreibeText(letter04);
                                farbe = "#" + letter00 + letter01 + letter02 + letter03 + letter04;
                            } else if (letter05 == ' ') {
                                letter05 = letter;
                                Buntstift2.schreibeText(letter05);
                                farbe = "#" + letter00 + letter01 + letter02 + letter03 + letter04 + letter05;
                            }
                        }
                        Tastatur1.weiter();
                    }
                }

                // Hex-Code bestätigen
                if (Tastatur1.wurdeGedrueckt()) {
                    if (Tastatur1.zeichen() == Zeichen.EINGABE) {
                        Buntstift1.setzeFarbe(Color.decode(farbe));
                        c = 0;
                        Tastatur1.weiter();
                    }
                }
            }
        }
    }
}
