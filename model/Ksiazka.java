package pl.biblioteka.model;

import java.util.ArrayList;
import java.util.List;

public class Ksiazka{
    private String tytul;
    private String autor;
    private List<Egzemplarz> egzemplarze;

    public Ksiazka(String tytul, String autor){
        this.tytul=tytul;
        this.autor=autor;
        this.egzemplarze=new ArrayList<>();
    }
    public String getTytul(){
        return tytul;
    }
    public String getAutor(){
        return autor;
    }
    public List<Egzemplarz> getEgzemplarze(){
        return egzemplarze;
    }

    public void dodajEgzemplarz(Egzemplarz egzemplarz){
        egzemplarze.add(egzemplarz);
    }
}
