package pl.biblioteka.model;

import java.util.ArrayList;
import java.util.List;

public class Czytelnik{
    private int id;
    private String imie;
    private String nazwisko;
    private List<Egzemplarz> wypozyczoneEgzemplarze = new ArrayList<Egzemplarz>();

    public Czytelnik(int id, String imie, String nazwisko){
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wypozyczoneEgzemplarze = new ArrayList<Egzemplarz>();
    }

    public void wypozyczEgzemplarz(Egzemplarz egzemplarz){
        wypozyczoneEgzemplarze.add(egzemplarz);
    }

    //gettery
    public int getId(){
        return id;
    }
    public String getImie(){
        return imie;
    }
    public String getNazwisko(){
        return nazwisko;
    }
    public List<Egzemplarz> getWypozyczoneEgzemplarze(){
        return wypozyczoneEgzemplarze;
    }
