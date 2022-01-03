package model;

public class Volleyball {
    
    int _nummer;
    String _zustand;
    int _maxPers;


    public Volleyball(int nummer, String zustand, int maxpers){
        setNummer(nummer);
        setZustand(zustand);
        setMaxPers(maxpers);
    }



    public void setMaxPers(int _maxPers) {
        this._maxPers = _maxPers;
    }
    public void setNummer(int _nummer) {
        this._nummer = _nummer;
    }
    public void setZustand(String _zustand) {
        this._zustand = _zustand;
    }
    public int getMaxPers() {
        return _maxPers;
    }
    public int getNummer() {
        return _nummer;
    }
    public String getZustand() {
        return _zustand;
    }

}
