package modell;

public class Leves extends Etel {
    private boolean csipos;

    public Leves(String nev, double ar, boolean csipos) {
        super(nev, ar);
        this.csipos = csipos;
    }

    public void kavefoltElkerules() {
        System.out.println("A " + getNev() + " leves csipős, vigyázz, ne csöpögj a ruhádra!");
    }

    @Override
    public void fogyaszt() {
        System.out.println("Finom levest ettél!");
    }
}

