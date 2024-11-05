package pl.biblioteka.repo;

import pl.biblioteka.model.Czytelnik;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArchiwumCzytelnikRepo implements CzytelnikRepo {
    private Map<Integer, Czytelnik> czytelnicy = new HashMap<>();

    @Override
    public void dodaj(Czytelnik czytelnik) {
        czytelnicy.put(czytelnik.getId(), czytelnik);
    }
    @Override
    public Czytelnik znajdz(int id) {
        return czytelnicy.get(id);
    }
    @Override
    public List<Czytelnik> znajdzWszystkich() {
        return new ArrayList<>(czytelnicy.values());
    }
}
