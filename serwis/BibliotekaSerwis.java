package pl.biblioteka.serwis;

import pl.biblioteka.model.*;
import pl.biblioteka.repo.*;
import java.util.List;

public class BibliotekSerwis {
    private final KsiazkaRepo ksiazkaRepo;
    private final CzytelnikRepo czytelnikRepo;

    public BibliotekSerwis() {
        this.ksiazkaRepo = new ArchiwumKsiazkaRepo();
        this.czytelnikRepo = new ArchiwumCzytelnikRepo();
    }

    public void dodajKsiazke(String tytul, String autor){
        Ksiazka ksiazka = new Ksiazka(tytul, autor);
        ksiazkaRepo.dodajKsiazke(ksiazka);
    }

    public void dodajCzytelnika(String imie, String nazwisko, int id){
        Czytelnik czytelnik = new Czytelnik(id, imie, nazwisko);
        czytelnikRepo.dodajCzytelnika(czytelnik);
    }

    public void dodajEgzemplarz(String tytul, int id){
        Ksiazka ksiazka = ksiazkaRepo.znajdzKsiazke(tytul);
        if(ksiazka != null){
            Egzemplarz egzemplarz = new Egzemplarz(id);
            ksiazka.dodajEgzemplarz(egzemplarz);
        }
        else{
            System.out.println("Nie ma takiej ksiazki");
        }
    }

    public void wypozyczEgzemplarz(String tytul, int idEgzemplarza, int idCzytelnika){
        Ksiazka ksiazka = ksiazkaRepo.znajdzKsiazke(tytul);
        Czytelnik czytelnik = czytelnikRepo.znajdzCzytelnika(idCzytelnika);

        if(ksiazka != null && czytelnik != null){
            for(Egzemplarz egzemplarz : ksiazka.getEgzemplarze()){
                if(egzemplarz.getId() == idEgzemplarza && !egzemplarz.isWypozyczony()){
                    egzemplarz.setWypozyczony(true);
                    egzemplarz.setAktualnyCzytelnik(czytelnik);
                    czytelnik.dodajWypozyczonaKsiazke(egzemplarz);
                    System.out.println("Wypozyczono egzemplarz");
                    return;
                }
                else{
                    System.out.println("Nie ma takiego egzemplarza");
                }
            }
            else{
                System.out.println("Ksiazka lub egzemplarz nie istnieje");
            }
        }
    }

    public List<Ksiazka> getAllKsiazki(){
        return ksiazkaRepo.getAllKsiazki();
    }

    public List<Czytelnik> getAllCzytelnicy(){
        return czytelnikRepo.getAllCzytelnicy();
    }
