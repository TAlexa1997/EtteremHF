package modell;

public enum Allapotok {
    FRISSENKESZUL,
    KESZ,
    ELFOGYOTT,
    FOGYASZTHATO;
    
    @Override
    public String toString() {
        return switch (this) {
            case FRISSENKESZUL -> "Frisssen készül";
            case KESZ -> "Kész";
            case ELFOGYOTT -> "Elfogyott";
            case FOGYASZTHATO -> "Fogyasztható";
        };
    }
}
