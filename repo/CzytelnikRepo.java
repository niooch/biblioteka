package pl.biblioteka.repo;

import pl.biblioteka.model.Czytelnik;
import java.util.List;

public interface CzytelnikRepo {
    void dodaj(Czytelnik czytelnik);
    Czytelnik znajdz(int id);
    List<Czytelnik> getWszyscy();
}
