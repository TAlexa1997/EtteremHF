package modell;

public class Leves extends Etel {
    private boolean csipos;

    public Leves(String nev, double ar, boolean csipos) {
        super(nev, ar);
        this.csipos = csipos;
    }

       public void foltElkerules() {
        System.out.println("A " + getNev() + " leves csipős, vigyázz, ne csöpögjön a ruhádra!");
    }

    @Override
    public void fogyaszt() {
        System.out.println("Finom levest ettél!");
    }
}

