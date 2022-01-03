package controller;
import view.*;

public class MainController {
    
    BuchungController bc;
    GruppenController gc;
    VolleyballplatzController vc;
    Output output;

    public MainController(){
        setBc(new BuchungController(this));
        setGc(new GruppenController(this));
        setVc(new VolleyballplatzController(this));


        createDemoData();
        
    }

    public void createDemoData(){

        getGc().createDemoGroups();
        getVc().createVolleyballplatzData();
        //wenn man das zuvor schreiben würde hätte man eine null pointer exception, da man versucht auf etwas zuzugreifen was es noch garnicht gibt
        getBc().createDemoBuchungen();


    }

    public void printDemoData(){
        getGc().printGruppen();
        getVc().printPlaetze();
        getBc().printBuchungen();   
    }


    public Output getOutput() {
        return output;
    }
    public void setBc(BuchungController bc) {
        this.bc = bc;
    }
    public void setGc(GruppenController gc) {
        this.gc = gc;
    }
    public void setVc(VolleyballplatzController vc) {
        this.vc = vc;
    }
    public BuchungController getBc() {
        return bc;
    }
    public GruppenController getGc() {
        return gc;
    }
    public VolleyballplatzController getVc() {
        return vc;
    }

}
