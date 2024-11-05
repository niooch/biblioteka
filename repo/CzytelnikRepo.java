package pl.biblioteka.repo;

import pl.biblioteka.model.*;
import java.util.List;

public interface CzytelnikRepo {
    void dodajCzytelnika(Czytelnik czytelnik);
    Czytelnik znajdzCzytelnika(int id);
    List<Czytelnik> getAllCzytelnicy();
}
