package pl.biblioteka.repo;

import pl.biblioteka.model.Ksiazka;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArchiwumKsiazkaRepo implements KsiazkaRepo {

    private Map<String, Ksiazka> ksiazki = new HashMap<>();

    @Override
    public void dodaj(Ksiazka ksiazka) {
        ksiazki.put(ksiazka.getId(), ksiazka);
    }
    @Override
    public List<Ksiazka> getWszystkie() {
        return new ArrayList<>(ksiazki.values());
    }
    @Override
    public Ksiazka znajdz(String tytul) {
        return ksiazki.get(tytul);
    }
}
