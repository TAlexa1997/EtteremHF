package view;

import modell.Allapotok;
import modell.Desszert;
import modell.Etel;

public class EtteremView {
    public void megjelenitEtelInfo(Etel etel, Allapotok allapot) {
        System.out.println("Rendelt étel: " + etel.getNev());
        System.out.println("Ár: " + etel.getAr() + " Ft");
        System.out.println("Állapot: " + allapot.toString());
    }

    public void megjelenitDesszertInfo(Desszert desszert, Allapotok allapot) {
        System.out.println("Rendelt desszert: " + desszert.getNev());
        System.out.println("Ár: " + desszert.getAr() + " Ft");
        System.out.println("Állapot: " + allapot.toString());
    }
}

