package modell;

public class Foetel extends Etel {
    private String fuszerezes;

    public Foetel(String nev, double ar, String fuszerezes) {
        super(nev, ar);
        this.fuszerezes = fuszerezes;
    }

    public void specialisFuszerezes() {
        System.out.println("A " + getNev() + " főétel különlegesen fűszerezett: " + fuszerezes);
    }

    @Override
    public void fogyaszt() {
        System.out.println("Jó étvágyat a főételhez!");
    }
}
