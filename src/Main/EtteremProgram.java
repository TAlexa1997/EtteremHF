package Main;

import modell.Foetel;
import modell.Leves;
import modell.EtteremModel;
import view.EtteremView;
import controller.EtteremController;

public class EtteremProgram {

    private EtteremModel etteremModel;
    private EtteremView etteremView;
    private EtteremController etteremController;

    public static void main(String[] args) {
        EtteremProgram etteremProgram = new EtteremProgram();
    }

    public EtteremProgram() {
        etteremModel = new EtteremModel();
        etteremView = new EtteremView();
        etteremController = new EtteremController(etteremModel, etteremView);

        
        Leves csiposLeves = new Leves("Erős paprikakrémleves", 1200, true);
        etteremController.rendelEtel(csiposLeves);

        Foetel specialisFoetel = new Foetel("Különleges húsos tál", 2500, "gyömbér, fokhagyma");
        etteremController.rendelEtel(specialisFoetel);
    }
}
