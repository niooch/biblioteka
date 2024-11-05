package pl.biblioteka.repo;

import pl.biblioteka.model.Ksiazka;
import java.util.List;

public interface KsiazkaRepo {
    List<Ksiazka> getWszystkie();
    Ksiazka znajdz(String tytul);
    void dodaj(Ksiazka ksiazka);
    void usun(int id);
}
