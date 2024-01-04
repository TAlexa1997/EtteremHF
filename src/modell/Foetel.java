package modell;

public class Foetel extends Etel {
    private String fuszerzes;

    public Foetel(String nev, double ar, String fuszerzes) {
        super(nev, ar);
        this.fuszerzes = fuszerzes;
    }

    public void specialisFuszerzes() {
        System.out.println("A " + getNev() + " főétel különlegesen fűszerezett: " + fuszerzes);
    }

    @Override
    public void fogyaszt() {
        System.out.println("Jó étvágyat a főételhez!");
    }
}
