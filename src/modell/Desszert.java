package modell;

public class Desszert extends Etel {

    public Desszert(String nev, double ar) {
        super(nev, ar);
    }

    @Override
    public void fogyaszt() {
        System.out.println("Jó étvágyat a desszerthez!");
    }
}
