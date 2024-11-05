package pl.biblioteka.ui;

import pl.biblioteka.serwis.Biblioteka;
import pl.biblioteka.model.Ksiazka;
import pl.biblioteka.model.Czytelnik;
import java.util.Scanner;

public class Ui {
    private BibliotekaSerwis bibliotekaSerwis;
    private Scanner scanner;

    public Ui() {
        bibliotekaSerwis = new BibliotekaSerwis();
        scanner = new Scanner(System.in);
    }

    public void start(){
        int opcja = 0;
        do{
            wyswietlMenu();
            opcja = scanner.nextInt();
            scanner.nextLine();
            switch(opcja){
                case 1:
                    dodajKsiazke();
                    break;
                case 2:
                    dodajEgzemplarz();
                    break;
                case 3:
                    dodajCzytelnika();
                    break;
                case 4:
                    wypozyczEgzemplarz();
                    break;
                case 5:
                    wyswietlKsiazki();
                    break;
                case 6:
                    wyswietlCzytelnikow();
                    break;
                case 7:
                    System.out.println("Koniec programu");
                    break;
                default:
                    System.out.println("Niepoprawna opcja");
            }
        }while(opcja != 7);
    }

    public void wyswietlMenu(){
        System.out.println("---Menu---");
        System.out.println("1. Dodaj ksiazke");
        System.out.println("2. Dodaj egzemplarz");
        System.out.println("3. Dodaj czytelnika");
        System.out.println("4. Wypozycz egzemplarz");
        System.out.println("5. Wyswietl ksiazki");
        System.out.println("6. Wyswietl czytelnikow");
        System.out.println("7. Wyjscie");
        System.out.println("Wybierz opcje: ");
    }

    public void dodajKsiazke(){
        System.out.println("Podaj tytul ksiazki: ");
        String tytul = scanner.nextLine();
        System.out.println("Podaj autora ksiazki: ");
        String autor = scanner.nextLine();
        bibliotekaSerwis.dodajKsiazke(tytul, autor);
    }

    public void dodajEgzemplarz(){
        System.out.println("Podaj tytul ksiazki: ");
        String tytul = scanner.nextLine();
        System.out.println("Podaj id egzemplarza: ");
        int id = scanner.nextInt();
        bibliotekaSerwis.dodajEgzemplarz(tytul, id);
    }

    public void dodajCzytelnika(){
        System.out.println("Podaj imie czytelnika: ");
        String imie = scanner.nextLine();
        System.out.println("Podaj nazwisko czytelnika: ");
        String nazwisko = scanner.nextLine();
        System.out.println("Podaj id czytelnika: ");
        int id = scanner.nextInt();
        bibliotekaSerwis.dodajCzytelnika(imie, nazwisko, id);
    }

    public void wypozyczEgzemplarz(){
        System.out.println("Podaj tytul ksiazki: ");
        String tytul = scanner.nextLine();
        System.out.println("Podaj id egzemplarza: ");
        int idEgzemplarza = scanner.nextInt();
        System.out.println("Podaj id czytelnika: ");
        int idCzytelnika = scanner.nextInt();
        bibliotekaSerwis.wypozyczEgzemplarz(tytul, idEgzemplarza, idCzytelnika);
    }

    public void wyswietlKsiazki(){
        for(Ksiazka ksiazka : bibliotekaSerwis.getAllKsiazki()){
            System.out.println(ksiazka.getTytul() + " " + ksiazka.getAutor());
        }
    }

    public void wyswietlCzytelnikow(){
        for(Czytelnik czytelnik : bibliotekaSerwis.getAllCzytelnicy()){
            System.out.println(czytelnik.getImie() + " " + czytelnik.getNazwisko());
        }
    }

    public static void main(String[] args){
        new Ui().start();
    }
