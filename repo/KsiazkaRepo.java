package pl.biblioteka.repo;

import pl.biblioteka.model.*;
import java.util.List;

public interface KsiazkaRepo {
    List<Ksiazka> getAllKsiazki();
    Ksiazka znajdzKsiazke(String tytul);
    void dodajKsiazke(String tytul, Ksiazka ksiazka);
}
