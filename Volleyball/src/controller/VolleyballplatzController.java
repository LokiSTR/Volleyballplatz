package controller;

import model.Volleyball;
import java.util.ArrayList;

public class VolleyballplatzController {
    
    MainController mc;
    ArrayList<Volleyball> volleyballplaetze;

    public VolleyballplatzController(MainController mc){
        setMc(mc);
        volleyballplaetze = new ArrayList<Volleyball>();
    }

    public void createVolleyballplatzData(){
        getVolleyballplaetze().add(new Volleyball(12, "23", 10));
        getVolleyballplaetze().add(new Volleyball(5, "3", 12));
    }

    public void printPlaetze(){
        for(Volleyball g : getVolleyballplaetze()){
            getMc().getOutput().printData(g.getNummer() + " " + g.getMaxPers() + " " + g.getZustand());
        }
    }



    public MainController getMc() {
        return mc;
    }
    public void setMc(MainController mc) {
        this.mc = mc;
    }
    public ArrayList<Volleyball> getVolleyballplaetze() {
        return volleyballplaetze;
    }
    public void setVolleyballplaetze(ArrayList<Volleyball> volleyballplaetze) {
        this.volleyballplaetze = volleyballplaetze;
    }

}
