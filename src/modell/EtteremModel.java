package modell;

public class EtteremModel {
    private Etel rendeltEtel;
    private Desszert rendeltDesszert;
    private Allapotok etelAllapot;
    private Allapotok desszertAllapot;

    public EtteremModel() {
        this.etelAllapot = Allapotok.FOGYASZTHATO;
        this.desszertAllapot = Allapotok.FOGYASZTHATO;
    }

    public void rendelEtel(Etel etel) {
        if (etelAllapot == Allapotok.FOGYASZTHATO) {
            rendeltEtel = etel;
            etel.elkeszit();
            etel.fogyaszt();
            etelAllapot = Allapotok.ELFOGYOTT;
        } else {
            System.out.println("Az étel jelenleg nem rendelhető.");
        }
    }

    public void rendelDesszert(Desszert desszert) {
        if (desszertAllapot == Allapotok.FOGYASZTHATO) {
            rendeltDesszert = desszert;
            desszert.elkeszit();
            desszert.fogyaszt();
            desszertAllapot = Allapotok.ELFOGYOTT;
        } else {
            System.out.println("A desszert jelenleg nem rendelhető.");
        }
    }

    public Etel getRendeltEtel() {
        return rendeltEtel;
    }

    public Desszert getRendeltDesszert() {
        return rendeltDesszert;
    }

    public Allapotok getEtelAllapot() {
        return etelAllapot;
    }

    public Allapotok getDesszertAllapot() {
        return desszertAllapot;
    }
}