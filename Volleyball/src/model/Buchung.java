package model;

public class Buchung {
    
    Volleyball _platz;
    Gruppen _gruppe;
    String _zeit;

    public Buchung(Volleyball platz, Gruppen gruppe, String zeit){
        setPlatz(platz);
        setGruppe(gruppe);
        setZeit(zeit);
    }

    public void setZeit(String _zeit) {
        this._zeit = _zeit;
    }
    public void setGruppe(Gruppen _gruppe) {
        this._gruppe = _gruppe;
    }
    public void setPlatz(Volleyball _platz) {
        this._platz = _platz;
    }

    public Gruppen getGruppe() {
        return _gruppe;
    }
    public Volleyball getPlatz() {
        return _platz;
    }
    public String getZeit() {
        return _zeit;
    }

}
