package pl.biblioteka.repo;

import pl.biblioteka.model.*;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArchiwumCzytelnikRepo implements CzytelnikRepo {
    private Map<Integer, Czytelnik> czytelnicy = new HashMap<>();

    @Override
    public void dodajCzytelnika(Czytelnik czytelnik) {
        czytelnicy.put(czytelnik.getId(), czytelnik);
    }
    @Override
    public Czytelnik znajdzCzytelnika(int id) {
        return czytelnicy.get(id);
    }
    @Override
    public List<Czytelnik> getAllCzytelnicy() {
        return new ArrayList<>(czytelnicy.values());
    }
}
