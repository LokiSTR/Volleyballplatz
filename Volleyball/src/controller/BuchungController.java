package controller;

import java.util.ArrayList;
import model.Buchung;

public class BuchungController {
    
    MainController mc;
    ArrayList<Buchung> buchungen;

    public BuchungController(MainController mc){
        setMc(mc);
        buchungen = new ArrayList<Buchung>();
    }

    public void createDemoBuchungen(){
        //verweis auf den maincontroller, da dieser den verweis auf den VolleyballPlatzcontroller hat. dann holt man sich alle plaetze und sucht dann spezifisch sich den ersten indexplatz, also die erste gruppe raus. das gleiche für die gruppen
        getBuchungen().add(new Buchung(getMc().getVc().getVolleyballplaetze().get(0), getMc().getGc().getGruppen().get(0), "12:12"));
    }

    public void printBuchungen(){
        for(Buchung g : getBuchungen()){
            getMc().getOutput().printData(g.getGruppe() + " " + g.getPlatz() + " " + g.getZeit());
        }
    }


    public MainController getMc() {
        return mc;
    }
    public void setMc(MainController mc) {
        this.mc = mc;
    }

    public ArrayList<Buchung> getBuchungen() {
        return buchungen;
    }
    public void setBuchungen(ArrayList<Buchung> buchungen) {
        this.buchungen = buchungen;
    }

}