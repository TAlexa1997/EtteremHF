package modell;

public abstract class Etel {
    private String nev;
    private double ar;

    public Etel(String nev, double ar) {
        this.nev = nev;
        this.ar = ar;
    }

    public void elkeszit() {
        System.out.println("A/Az " + nev + " elkészült!");
    }

    public abstract void fogyaszt();

    public String getNev() {
        return nev;
    }

    public double getAr() {
        return ar;
    }
}

