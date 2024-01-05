package controller;

import modell.Allapotok;
import modell.Desszert;
import modell.Etel;
import modell.EtteremModel;
import view.EtteremView;

public class EtteremController {
    private EtteremModel etteremModel;
    private EtteremView etteremView;

    public EtteremController(EtteremModel model, EtteremView view) {
        this.etteremModel = model;
        this.etteremView = view;
    }

    public void rendelEtel(Etel etel) {
        etteremModel.rendelEtel(etel);
        etteremView.megjelenitEtelInfo(etel, etteremModel.getEtelAllapot());
    }

    public void rendelDesszert(Desszert desszert) {
        etteremModel.rendelDesszert(desszert);
        etteremView.megjelenitDesszertInfo(desszert, etteremModel.getDesszertAllapot());
    }
}
