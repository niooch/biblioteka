package pl.biblioteka.model;

public class Egzemplarz{
    private int id;
    private boolean wypozyczony;
    private Czytelnik aktualnyCzytelnik;

    public Egzemplarz(int id){
        this.id = id;
        this.wypozyczony = false;
        this.aktualnyCzytelnik = null;
    }

    //gettery
    public int getId(){
        return this.id;
    }
    public boolean isWypozyczony(){
        return this.wypozyczony;
    }
    public Czytelnik getAktualnyCzytelnik(){
        return this.aktualnyCzytelnik;
    }
    public void setWypozyczony(boolean wypozyczony){
        this.wypozyczony = wypozyczony;
    }
    public void setAktualnyCzytelnik(Czytelnik aktualnyCzytelnik){
        this.aktualnyCzytelnik = aktualnyCzytelnik;
    }
}
