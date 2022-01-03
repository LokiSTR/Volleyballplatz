package model;

public class Gruppen {
    int _anzahl;
    String _GLNachname;
    String _GLVBorname;

    public Gruppen(int anzahl, String nachname, String vorname){
        setAnzahl(anzahl);
        setGLNachname(nachname);
        setGLVBorname(vorname);
    }
    
    
    public void setGLNachname(String _GLNachname) {
        this._GLNachname = _GLNachname;
    }
    public void setGLVBorname(String _GLVBorname) {
        this._GLVBorname = _GLVBorname;
    }
    public void setAnzahl(int _anzahl) {
        this._anzahl = _anzahl;
    }
    public String getGLNachname() {
        return _GLNachname;
    }
    public String getGLVBorname() {
        return _GLVBorname;
    }
    public int getAnzahl() {
        return _anzahl;
    }

}
