package controller;

import model.Gruppen;
import java.util.ArrayList;

public class GruppenController {
    
    MainController mc;
    ArrayList<Gruppen> gruppen;

    public GruppenController(MainController mc){
        setMc(mc);
        gruppen = new ArrayList<Gruppen>();
    }

    public void createDemoGroups(){
        getGruppen().add(new Gruppen(23, "Smolinski", "Lennard"));
        getGruppen().add(new Gruppen(24, "McLoughlin", "Alexander"));
    }

    public void printGruppen(){
        for(Gruppen g : getGruppen()){
            getMc().getOutput().printData(g.getGLNachname() + " " + g.getGLVBorname());
        }
    }

    public ArrayList<Gruppen> getGruppen() {
        return gruppen;
    }
    public void setGruppen(ArrayList<Gruppen> gruppen) {
        this.gruppen = gruppen;
    }
    public MainController getMc() {
        return mc;
    }

    public void setMc(MainController mc) {
        this.mc = mc;
    }
}
