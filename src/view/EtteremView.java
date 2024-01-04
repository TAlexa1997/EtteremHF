package view;

import modell.Etel;

public class EtteremView {
    public void megjelenitEtelInfo(Etel etel) {
        System.out.println("Rendelt étel: " + etel.getNev());
        System.out.println("Ár: " + etel.getAr() + " Ft");
    }
}
