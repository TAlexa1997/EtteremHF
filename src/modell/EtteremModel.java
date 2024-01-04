
package modell;

public class EtteremModel {
    private Etel rendeltEtel;

    public void rendelEtel(Etel etel) {
        rendeltEtel = etel;
        etel.elkeszit();
        etel.fogyaszt();
    }

    public Etel getRendeltEtel() {
        return rendeltEtel;
    }
}

